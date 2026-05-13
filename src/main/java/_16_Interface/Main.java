package _16_Interface;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Duck duck = new Duck();
       // Animal ani = new Animal()


        Manager manager = new Manager();

        //duck의 현재 타입: Duck
        //makeFly는 매개 변수로 Flyable 타입을 받음
        //자동으로 캐스팅돼서 전달된다
        manager.makeFly(duck);
        manager.makeSound(dog);
        manager.makeSound(duck);
    }
}
