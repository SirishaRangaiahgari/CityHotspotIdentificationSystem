package model;

public class Location {
  private double latitude;
  private double longitude;
  private int crowdCount;
  public Location(double latitude, double longitude, int crowdCount) {
	  this.latitude = latitude;
	  this.longitude = longitude;
	  this.crowdCount = crowdCount;
  }
  public double getlatitude() {
	  return latitude;
  }
  public double getlongitude() {
	  return longitude;
  }
  public int getcrowdCount() {
	  return crowdCount;
  }
}
