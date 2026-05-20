public class GuidanceController {
    private static TouchScreenVoiceUI ui = new TouchScreenVoiceUI();
    private static Report activeReport;

    public static String processSpeechToText() {
        String parsedText = "";
        return parsedText;
    }

    public static void submitManualReport(String reportType) {
        Location coordinates = LocationService.getCurrentLocation();
        String timeStamp = LocationService.getCurrentTime();

        if (reportType.equals("Hazard")) {
            activeReport = new HazardReport(coordinates, timeStamp);
        } else {
            activeReport = new DelayReport(coordinates, timeStamp);
        }
        
        String databaseStatus = Database.submitReport(activeReport);
        DispatchSystem.escalateReport(activeReport);
        PublicTransportAPI.publishIncidentToAPI(activeReport);

        
        if (databaseStatus.equals("Success")) {
            ui.displaySuccessNotification();
        } else {
            ui.displayRetryNotification();
        }
    }
}