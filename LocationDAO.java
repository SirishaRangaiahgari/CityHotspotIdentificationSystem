package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Location;

public class LocationDAO {
 public void saveLocation(Location loc) {
	 try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/hotspot_db","root","root")){
		 String query = "Insert into locations values(?,?,?)";
		 PreparedStatement ps = con.prepareStatement(query);
		 ps.setDouble(1, loc.getlatitude());
		 ps.setDouble(2,loc.getlongitude());
		 ps.setInt(3,loc.getcrowdCount());
		 System.out.println("DAO Layer");
	 } catch (SQLException e) {
		e.printStackTrace();
	}
 }
}
