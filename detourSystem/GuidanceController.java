public class GuidanceController {
    private BusConsoleUI ui = new BusConsoleUI();
    private GPSService gpsService = new GPSService();
    private RouteService routeService = new RouteService();
    private boolean tripActive;
    private Database db;

    public void initialiseNavigation() {
        // Arrow points straight to Database
        Route assignedRoute = db.fetchRouteData();
        this.tripActive = true; // Placeholder

        while (tripActive) {
            Location coordinates = gpsService.getCurrentLocation();
            boolean deviationStatus = routeService.compareRoute(coordinates);

            // Alt: [no route deviation] / [route deviation]
            if (!deviationStatus) { 
                ui.displayContinueNavigation(); // Arrow points from Controller to UI
            }
            else { 
                // Guard: [route deviation]
                this.notifyDeviation(); 
            }

            //Loop break
            tripActive = false;
        }
    }

    public void notifyDeviation() {
    Route assignedRoute = db.fetchRouteData();
        // Arrow points from Controller back to UI
        ui.displayDetourGuidance(assignedRoute);
    }

    // Arrow points from BusConsoleUI into GuidanceController
    public void updateNavigation(Route detourRoute) {
        routeService.saveUpdatedRoute(detourRoute);
        ui.resumeGuidance();
    }
}