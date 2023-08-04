public class RegularTicket implements Ticket {
    @Override
    public String getType() {
        return "Regular";
    }

    @Override
    public double getPrice() {
        return 100.0;
    }
}
