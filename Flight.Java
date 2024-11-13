public class Flight {

    private String departure;
    private String arrival;
    private double price;
    private int time;

    /* 
     * constructor, initializing each Flight object with txt file attributes
     */
    public Flight(String departure, String arrival, double price, int time) {
        this.departure = departure;
        this.arrival = arrival;
        this.price = price;
        this.time = time;
    }

    /*
     * getter
     */
    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public double getPrice() {
        return price;
    }

    public int getTime() {
        return time;
    }

    // prints all flights
    public String toString() {
        return "Flight " + departure + " to " + arrival + " - $" + price + ", takes " + time + " minutes";
    }
}