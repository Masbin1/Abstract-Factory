public class VipTicket implements Ticket {
    @Override
    public String getType() {
        return "VIP";
    }

    @Override
    public double getPrice() {
        return 150.0;
    }
}
