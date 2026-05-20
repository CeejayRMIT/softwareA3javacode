public class TouchScreenVoiceUI {
    private String parsedText = ""; // Placeholder
    private String reportType = "Hazard"; // Placeholder

    //"Touch" or "Voice" as input
    public void initialiseReport(String reportMethod) {
        if (reportMethod.equals("Voice")) {
            listenForSpeech();

            parsedText = GuidanceController.processSpeechToText();

            displayParsedText(parsedText);
        }
        else {
            reportType = selectReportType();
            
            GuidanceController.submitManualReport(reportType);
        }
    }

    public void listenForSpeech() {
        // Listen for speech into audio
    }

    public String selectReportType() {
        String reportType = "Hazard"; // Placeholder
        return reportType;
    }

    public void displayParsedText(String text) {
        System.out.println("Parsed Text: " + text); // Placeholder
    }

    public void displaySuccessNotification() {
        audibleConfirmation("Report Sent Successfully"); // Placeholder
    }

    public void displayRetryNotification() {
        audibleRetryAlert("Report Failed, please try again."); // Placeholder
    }

    public void audibleConfirmation(String message) {
        // Voice confirmation
    }

    public void audibleRetryAlert(String message) {
        // Voice rejection
    }
}
