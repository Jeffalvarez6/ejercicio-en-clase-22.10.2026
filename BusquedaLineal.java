public class BusquedaLineal {

    static class Ticket {
        int id;
        boolean critico;

        Ticket(int id, boolean critico) {
            this.id = id;
            this.critico = critico;
        }

        @Override
        public String toString() {
            return "Ticket{id=" + id + ", critico=" + critico + "}";
        }
    }

    public static Ticket primerTicketCritico(Ticket[] tickets) {
        for (Ticket ticket : tickets) {
            if (ticket.critico) {
                return ticket;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Ticket[] tickets = {
            new Ticket(1, false),
            new Ticket(2, true),
            new Ticket(3, true)
        };

        System.out.println("Primer ticket crítico: "
                + primerTicketCritico(tickets));

        System.out.println("Lista vacía: "
                + primerTicketCritico(new Ticket[0]));

        Ticket[] sinCriticos = {
            new Ticket(4, false),
            new Ticket(5, false)
        };

        System.out.println("Sin tickets críticos: "
                + primerTicketCritico(sinCriticos));
    }
}