package _11_Access;

public class AccessMain {
    public static void main(String[] args) {
        Access ac = new Access(5, 6);


        //private로 직접 참조 막혀 있음
        //ac.x (X)
        //ac.y (X)
        ac.getX();
        ac.setX(8);

        int x = ac.getX(); //간접 조회
        System.out.println(x);
        ac.setX(8); //간접 변경
        x = ac.getX();
        System.out.println(x);

        Bottle b = new Bottle();
        b.drink(200);
        b.printCurrentWater();
        b.fill(10000);
        b.printCurrentWater();
        b.fill(500);
        b.printCurrentWater();

    }
}
