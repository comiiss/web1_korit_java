package _16_Interface;

public class Manager {

    //의존성과 결합도
    //Dog 클래스는 Manager를 의존하는가? X
    //Manager 클래스는 Dog를 의존하는가? X
    //Dog(구현체)는 Animal(추상체) 의존 중
    //Manager(구현체)도 Animal(추상체) 의존 중
    //구체적인 클래스끼리 의존하는 게 아니라 인터페이스를 통해 작동
    // --> 결합도가 낮은 구조

    //객체 지향의 5원칙 - S O L I D
    // DIP - 의존성 역전의 원칙


    //구현제 반댓말은 추상체(객체로 만들지 못하는, Character 추상 클래스
    //혹은 interface)
    //인터페이스를 이식 받은 구현체(실제 객체)를 업캐스팅해서 전달 받음
    public void makeSound(Animal animal) {
        animal.sound();
    }

    public void makeFly(Flyable flyable) {
        flyable.fly();
    }


}