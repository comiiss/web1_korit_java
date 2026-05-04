package _12_Static;

public class Ticket {
    public static int nextNumber = 1;
    private int number;

    //new 할 때마다 번호표가 1씩 증가된 상태로 생성되게
    //생성자를 만들어 주세요

    public Ticket (int number) {
        this.number = nextNumber++;
    }

    public static void main(String[] args) {
        Ticket nt1 = new Ticket(1);
        System.out.println(Ticket.nextNumber);
        Ticket nt2 = new Ticket(2);
        System.out.println(Ticket.nextNumber);
        Ticket nt3 = new Ticket(3);
        System.out.println(Ticket.nextNumber);

    }

}
