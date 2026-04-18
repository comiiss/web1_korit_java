package _01_Print;

//주석: 인간이 읽으라고 적는 것
//자바는 객체 지향 언어 - 모든 문법이 class 위주
// .java 파일(인간의 언어, 영어) - .class 파일(숫자) - 실행
//이때 숫자로 바꾸는 과정을 '컴파일'이라고 함
//{ }: 코드 구역
public class HelloJava { // HelloJava 시작
    public static void main(String[] args) { //메인 메서드 시작
        //자바는 언제나 main을 기점으로 동작한다
        System.out.println("Hello Java!");

        //아래의 문자열을 출력해 주세요!
        //이름: 홍길동
        //나이: 25
        //주소: 부산시 해운대

        System.out.println("이름: 홍길동" + " 나이 25" + " 부산시 해운대");

        String myName = "홍길동";
        String myAge = "27";
        String myAddress = "부산시 해운대구";

        System.out.println();

        System.out.println("이름: " + myName);
        System.out.println("나이: " + myAge);
        System.out.println("주소: " + myAddress);

    } //메인 메서드 끝
} //HelloJava 끝
