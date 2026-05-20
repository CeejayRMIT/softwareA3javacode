import java.util.ArrayList;

public class RouteService {
    private Database database = new Database();

    public Route getAssignedRoute() {
        return database.fetchRouteData();
    }

    public boolean compareRoute(Location coordinates) {
        // Compare current location against planned route
        // Returns true if deviation detected
        return false;
    }

    public void saveUpdatedRoute(Route detourRoute) {
        database.saveRoute(detourRoute);
    }
}

class Route {
    private String routeID;
    private ArrayList<Location> stops = new ArrayList<>();

    public Route(String routeID) {
        this.routeID = routeID;
    }

    public String getRouteID() {
        return routeID;
    }
}