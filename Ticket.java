package src;

import java.util.ArrayList;

public class Ticket {

    static int count = 0;

    TicketData[] ticketData;


    public static void main(String[] args) {
        TicketData t = new TicketData(7, "A", "S", "G", "male", "10/15/19", "Moscow",
                "Linyi", 55);
        Ticket ticket = new Ticket();
        ticket.ticketData = ticket.addTicketData(t);
        ticket.ticketData = ticket.addTicketData(ticket.ticketData, new TicketData(
                8, "A", "S", "G", "male", "10/15/19", "Moscow",
                "Linyi", 45
        ));

        for (int i = 0; i < ticket.ticketData.length; i++) {
            System.out.println(ticket.ticketData[i]);
        }

        ticket.ticketData = ticket.removeTicketData(ticket.ticketData, t);

        for (int i = 0; i < ticket.ticketData.length; i++) {
            System.out.println(ticket.ticketData[i]);
        }
    }

    private TicketData[] addTicketData(TicketData t) {
        TicketData[] td = new TicketData[++count];
        td[count - 1] = t;
        return td;
    }

    private TicketData[] addTicketData(TicketData[] ta, TicketData t) {
        TicketData[] td = new TicketData[++count];
        for (int i = 0; i < ta.length; i++) {
            td[i] = ta[i];
        }
        td[count - 1] = t;
        return td;
    }

    private TicketData[] removeTicketData(TicketData[] ta, TicketData t) {
        TicketData[] td = new TicketData[--count];
        int gap = 0;
        for (int i = 0; i < ta.length; i++) {
            if (ta[i].equals(t)) {
                gap++;
                continue;
            }
            td[i - gap] = ta[i];
        }
        return td;
    }


    }

