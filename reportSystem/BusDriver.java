public class BusDriver extends User {
    private String driverLicenseNumber = "";
    private boolean isAuthenticated = true; // Placeholder

    public BusDriver(String driverLicenseNumber) {
        this.driverLicenseNumber = driverLicenseNumber;
    }

    public void startReportingProcess(TouchScreenVoiceUI ui) {
        if (isAuthenticated(driverLicenseNumber)){
            ui.initialiseReport("Voice");
        }
    }

    public boolean isAuthenticated(String driverLicenseNumber) {
        return isAuthenticated;
    }
}
