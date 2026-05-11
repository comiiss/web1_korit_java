package _14_Inheritance;

//extends (상속받을클래스이름)
public class ElectricCar extends Car {
    //brand, year 필드를 가지고 있게 됨
    private int battery;

    //자식의 기본 생성자
    //부모의 필드를 항상 먼저 초기화한다!
    //super()는 생략 가능! 부모의 기본 생성자는 생략 가능
    //this != this() 다른 문법
    public ElectricCar() {
        //System.out.println("출력할 수 없다");
        super(); //부모 기본 생성자 호출, 제일 첫줄에 있어야 한다
        this.battery = 100;
    }

    //super - 부모의 메서드나 부모의 필드 접근을 하겠다
    //필드 - this는 super를 포함
    //메서드 - 부모 클래스 기준에서 호출하겠다 (this는 부모 클래스 포함
    // 자식 클래스에'만' 있는 것,
    //super는 부모 클래스에만 있는 것, heap에 구분되어 저장된다)

    public ElectricCar(String brand, int year) {
        super(brand, year); //얜 생략 불가능
        this.battery = 100;

    }

    public void moveWithInfo() {
        super.move(); //부모의 move를 명시적으로 호출
        System.out.println("배터리 잔량: " + battery);
        this.battery -= 10;
    }

    public void charge() {
        System.out.println("배터리 완충할게요");
        this.battery = 100;
    }

    @Override
    public void drive() {
        System.out.println("전기차로 드라이브 중");
    }
}
