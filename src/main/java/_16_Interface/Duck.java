package _16_Interface;

//인터페이스는 다중 이식이 가능
//상속은 다중 상속이 불가능하다
public class Duck implements Animal, Flyable {
    @Override
    public void sound() {
        System.out.println("꽈아아악");

    }

    @Override
    public void move() {
        System.out.println("뒤뚱뒤뚱");

    }

    @Override
    public void fly() {
        System.out.println("파닥파닥");

    }
}
