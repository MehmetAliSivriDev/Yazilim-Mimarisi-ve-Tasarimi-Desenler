public class HGSPassage {
    private String date;
    private String route;
    private double fee = 100;

    public HGSPassage(String date, String route) {
        this.date = date;
        this.route = route;
    }

    public String getDate() {
        return date;
    }

    public String getRoute() {
        return route;
    }

    public double getFee() {
        return fee;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}
