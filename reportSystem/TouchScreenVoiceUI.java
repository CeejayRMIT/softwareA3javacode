public class TouchScreenVoiceUI {
    private String parsedText = ""; //placeholder
    private String reportType = "Hazard"; //placeholder

    //called by by bus driver 
    public void initialiseReport() {
        //"Touch" or "Voice" as input
        String reportMethod = "Voice";

        //first alt operator
        if (reportMethod.equals("Voice")) {
            //called on itself
            listenForSpeech();

            //called on Guidance controller
            GuidanceController.processSpeechToText("Dummy string");

            //return arrow from Guidance Controller
            displayParsedText(parsedText);
        }

        //second part of alt operator
        else {
            //called on Touch Screen & Voice UI
            selectReportType();
            
            //called on Guidance Controller
            GuidanceController.submitManualReport();
        }
    }

    //first alt operator
    public void listenForSpeech() {}

    public void selectReportType() {}

    public void displayParsedText(String text) {
        System.out.println("Parsed Text: " + text);
    }

    //third alt operator
    public void displaySuccessNotification() {
        audibleConfirmation("Report Sent Successfully");
    }

    public void displayRetryNotification() {
        audibleRetryAlert("Report Failed, please try again.");
    }

    public void audibleConfirmation(String message) {
        //Voice confirmation
    }

    public void audibleRetryAlert(String message) {
        //Voice rejection
    }
}
