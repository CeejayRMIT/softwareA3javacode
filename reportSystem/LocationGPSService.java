public class LocationGPSService {

    //arrow from Guidance Controller
    public static Location getCurrentLocation() {
        //Returns coordinates
        return new Location(37.8136, 144.9631, 0.0); //Dummy Coordinates
    }

    //arrow from Guidance Controller
    public static String getCurrentTime() {
        return "2026-05-20 10:30:00"; //Dummy time
    }
}

//class to store those locations
class Location {
    private double latitude;
    private double longitude;
    private double currentBusSpeed;

    public Location(double latitude, double longitude, double speed) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.currentBusSpeed = speed;
    }

    public double getLatitude() { return latitude; }
    public double getLongitude() { return longitude; }
    public double getSpeed() { return currentBusSpeed; }
}