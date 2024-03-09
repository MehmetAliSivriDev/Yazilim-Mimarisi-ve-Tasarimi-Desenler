//PRODUCT (Ürün): Ticker Sınıfı

public class Ticket {
    private String passengerName;
    private String departureLocation;
    private String destination;
    private String date;
    private String seatNumber;

    public Ticket(){

    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String toString(){
        return "Passenger Name: " + passengerName + "\nDeparture Location: " + departureLocation +
                "\nDestination: " + destination + "\nDate: " + date + "\nSeat Number: " + seatNumber;
    }

}
