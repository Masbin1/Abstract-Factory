public class MeetAndGreetTicket implements Ticket {
    @Override
    public String getType() {
        return "Meet and Greet";
    }

    @Override
    public double getPrice() {
        return 50.0;
    }
}
