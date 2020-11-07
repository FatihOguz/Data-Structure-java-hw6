public class LocationStatus {
    private String location;
    private String status;


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocationStatus(String location) {
        this.location = location;
    }

    public LocationStatus(String status,String location ) {
        this.location = location;
        this.status = status;
    }

    @Override
    public String toString() {
        return "LocationStatus{" +
                "location='" + location + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
