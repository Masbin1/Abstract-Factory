public class VipTicketFactory extends TicketFactory {
    @Override
    public Ticket createTicket() {
        return new VipTicket();
    }
}
