package _14_Inheritance;

public class CarMain {
    //다형성: 코드는 동일, 동작은 상이
    public static void makeDrive(Car[] cars) {
        for(Car car: cars) {
            car.drive();
        }

    }
    public static void main(String[] args) {
        ElectricCar eCar = new ElectricCar();
        GasCar gCar = new GasCar();

        eCar.move(); //부모의 move()
        gCar.move(); //오버라이딩된 자식의 move()

        //둘 다 오버라이딩된 자식의 메서드 호출 중
        eCar.drive();
        gCar.drive();
        //다형성 - 동일한 메서드를 호출하는데, 동작이 다른 것
        //어떻게 하면 다형성을 안전하게 구현할 수 있을까?
        //부모 클래스에서 오버라이딩을 강제하면 되지 않을까?
        //상속받은 클래스에서는 강제로 같은 시그니처의 메서드를 가지게 됨
        //강제한 메서드는 호출이 안전하게 보장 받는다



        //캐스팅 - (상속) 자료형 변경
        //1. 업캐스팅: 자식 클래스 객체를 부모 클래스 타입으로 보는 것(축소)
        //2. 다운캐스팅: 부모 클래스 객체를 자식 클래스 타입으로 보는 것
        //2번은 말이 안 돼서 업캐스팅되었던 객체를 다시 원복한다라고 봐야 한다
        //3 만큼의 공간이 2로 축소되는 게 맞지, 늘리는 건 에러가 터질 수밖에 없다
        //메모리가 더 있는지 어떻게 알아?

        ElectricCar eCar2 = new ElectricCar(); //ElectricCar를
        //가르키는 객체인 eCar2 생성(참조변수)
        Car car1 = (Car)eCar2; //업캐스팅
        //car1.charge(); 전기차만의 메서드를 사용할 수 없다
        car1.drive(); //super의 drive? (x) Electric car의 drive
        //오버라이딩된 자식의 메서드가 호출
        //메서드가 호출되는 2가지 방식
        //1. 컴파일 시점에 결정
        //2. 런타임 시점에 결정 - 오버라이딩 메서드는 런타임에 결정됨
        // -> new 해서 실제 생성된 객체 기준으로 호출됨

        //생성(new)은 자식 객체, 변수 타입은 부모 타입
        Car car2 = new GasCar(); //업캐스팅

        GasCar gCar2 = (GasCar) car2;
//        GasCar gCar3 = (GasCar) car1; 전기차 객체를 잘못 다운캐스팅

        //instanceof 연산자
        //객체 instanceof 클래스
        //왼쪽 객체가 오른쪽 타입 정보를 갖고 있는가?
        System.out.println(car1 instanceof ElectricCar);
        System.out.println(car1 instanceof Car);
        System.out.println(car1 instanceof GasCar);

        //조건문을 통해 안전하게 다운캐스팅
        if(car1 instanceof ElectricCar) {
            ElectricCar electricCar = (ElectricCar) car1;
        } else if(car1 instanceof GasCar) {
            GasCar gasCar = (GasCar) car1;
        }

        Car[] cars = {car1, car2}; //서로 다른 자식 객체들이
        //업캐스팅되어서 배열로 관리됨
        makeDrive(cars);
    }
}
