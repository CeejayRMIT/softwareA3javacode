import java.util.ArrayList;

public class RouteService {
    private Database database = new Database();

    public Route getAssignedRoute() {
        return database.fetchRouteData();
    }

    public boolean compareRoute(Location coordinates) {
        // TODO: compare current location against planned route
        // returns true if deviation detected
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