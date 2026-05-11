package _14_Inheritance;
//상속
//1. 코드 압축
//2. 다형성 구현 - 캐스팅
public class Car { //클래스
    //공통 필드, 공통 메서드 추려낸 부모 클래스 - 추상화

    protected int year;
    protected String brand;

    public Car() { //생성자
        System.out.println("부모의 기본 생성자 호출");
        this.brand = "기본 브랜드";
    }

    public Car(String brand, int year) { //생성자
        this.year = year;
        this.brand = brand;

    }
    //공통 메서드
    public void move() {
        System.out.println("기본 자동차가 이동하고 있습니다");
    }

    public void showInfo() {
        System.out.println("기본 자동차의 정보 출력");
        System.out.println("브랜드: " + brand);
        System.out.println("생산 연도: " + year);
    }

    //year로 쓰는 것과 this.year로 쓰는 것의 차이
    //year은 가까운 year를 찾고
    //year는 현재 객체의 필드 year를 찾는다
    //지역 변수랑 이름이 겹치지 않으면 자동적으로 year == this.year

    public void drive() {
        //빈껍질
    }

}
