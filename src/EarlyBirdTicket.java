public class EarlyBirdTicket implements Ticket {
    @Override
    public String getType() {
        return "Early Bird";
    }

    @Override
    public double getPrice() {
        return 80.0;
    }
}
