public class Main {
    public static void main(String[] args) {
        TicketFactory vipTicketFactory = new VipTicketFactory();
        TicketFactory regularTicketFactory = new RegularTicketFactory();
        TicketFactory earlyBirdTicketFactory = new EarlyBirdTicketFactory();
        TicketFactory meetAndGreetTicketFactory = new MeetAndGreetTicketFactory();

        TicketOrder order1 = new TicketOrder(vipTicketFactory);
        TicketOrder order2 = new TicketOrder(regularTicketFactory);
        TicketOrder order3 = new TicketOrder(earlyBirdTicketFactory);
        TicketOrder order4 = new TicketOrder(meetAndGreetTicketFactory);

        Ticket ticket1 = order1.orderTicket();
        Ticket ticket2 = order2.orderTicket();
        Ticket ticket3 = order3.orderTicket();
        Ticket ticket4 = order4.orderTicket();

        System.out.println("Order 1: " + ticket1.getType() + ", Price: $" + ticket1.getPrice());
        System.out.println("Order 2: " + ticket2.getType() + ", Price: $" + ticket2.getPrice());
        System.out.println("Order 3: " + ticket3.getType() + ", Price: $" + ticket3.getPrice());
        System.out.println("Order 4: " + ticket4.getType() + ", Price: $" + ticket4.getPrice());
    }
}
