public class Database {
    private static String status = "Success"; //dummy status

    //arrow from Guidance Controller
    public static String submitReport(Report report) {
        // Returns status back to Guidance Controller
        return status;
    }
}

    abstract class Report {
    protected Location coordinates;
    protected String timeStamp;

    public Report(Location coordinates, String timeStamp) {
        this.coordinates = coordinates;
        this.timeStamp = timeStamp;
    }
}

class HazardReport extends Report {
    public HazardReport(Location coordinates, String timeStamp) {
        super(coordinates, timeStamp);
    }
}

class DelayReport extends Report {
    public DelayReport(Location coordinates, String timeStamp) {
        super(coordinates, timeStamp);
    }
}
