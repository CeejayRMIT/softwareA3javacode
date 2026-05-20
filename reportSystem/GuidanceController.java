public class GuidanceController {
    //return objects for third alt operator
    private static TouchScreenVoiceUI ui = new TouchScreenVoiceUI();
    private static Report activeReport;

    //first alt operator first block
    //arrow from TouchScreen & Voice UI
    public static void processSpeechToText(String audio) {
    }

    //first alt operator second block
    //arrow from TouchScreen & Voice UI
    public static void submitManualReport() {
        Location coordinates = LocationGPSService.getCurrentLocation();
        String timeStamp = LocationGPSService.getCurrentTime();

        //second alt operator
        String reportType = "Hazard"; //Dummy

        if (reportType.equals("Hazard")) {
            activeReport = new HazardReport(coordinates, timeStamp);
        } else {
            activeReport = new DelayReport(coordinates, timeStamp);
        }
        
        //arrow from database
        String databaseStatus = Database.submitReport(activeReport);
        
        //third alt operator
        if (databaseStatus.equals("Success")) {
            ui.displaySuccessNotification();
        } else {
            ui.displayRetryNotification();
        }
    }
}