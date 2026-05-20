public class GPSService {

    //start of loop
    public Location getCurrentLocation() {
        return new Location(37.8136, 144.9631); //dummy coordinate data
    }
}

class Location {
    private double latitude;
    private double longitude;

    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}