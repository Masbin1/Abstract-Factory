public class MeetAndGreetTicketFactory extends TicketFactory {
    @Override
    public Ticket createTicket() {
        return new MeetAndGreetTicket();
    }
}
