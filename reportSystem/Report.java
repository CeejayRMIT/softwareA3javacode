abstract class Report {
    protected Location coordinates;
    protected String timeStamp;

    public Report(Location coordinates, String timeStamp) {
        this.coordinates = coordinates;
        this.timeStamp = timeStamp;
    }
}