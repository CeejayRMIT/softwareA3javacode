import java.util.ArrayList;

public class LocationService {
    private static ArrayList<Location> locations;

    public LocationService() {
        locations = new ArrayList<>();
        locations.add(new Location(37.8136, 144.9631, 0.0)); // Placeholder
    }

    public static Location getCurrentLocation() {
        return locations.get(locations.size() - 1);
    }

    public static String getCurrentTime() {
        return "2026-05-20 10:30:00"; // Placeholder
    }
}