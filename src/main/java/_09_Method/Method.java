package _09_Method;

public class Method {
    //메서드 정의
    //public(접근 제한자): 타 클래스에서 호출 가능
    //static: 객체 생성 없이 호출 가능
    //void: 리턴 데이터가 없다

    //void hi() {}
    //[리턴할 데이터의 자료형] [메서드 이름](매개 변수..) {}

    public static void hi() {
        System.out.println("안녕하세요!");
        System.out.println("안녕하세요");


    }



    //매개 변수: 코드를 재사용할 때, 외부로부터 전달 받을 데이터
    //메서드 이름(String name1, String name2...)

    public static void hello(String name) {
        //name 매개 변수에 대입 연산(=)이 일어남
        //String name = "손흥민";
        System.out.println("안녕하세요 " + name + " 님");

    }

    //1. 숫자 두 개를 매개 변수로 받아서 합을 출력하는 메서드
    //2. 점수 3개를 받아서, 평균을 출력하는 메서드

    public static void number(int num, int num2) {
        System.out.println(num + num2);

    }


    public static void score(int score1, int score2, int score3) {
        int sum = score1 + score2 + score3;
        double avg = sum / 3.0;
        System.out.println(avg);
    }

    public static void changeNum(int num) {
        System.out.println("changeNum 호출됨");
        num += 3;


    }

    public static void changeArr(int[] nums) {
        System.out.println("changeArr 호출됨");
        nums[0] = 999;
    }
    public static void main(String[] args) {
        //변수: 데이터를 재사용하기 위해
        //메서드: 코드 덩어리를 재사용하기 위해

        System.out.println("hi 호출 전");
        hi();
        System.out.println("hi 호출 후");
        String myName = "신효진";
        hello(myName);

        number(1, 2);
        score(90, 100, 340);

        int num = 10;
        int[] nums = {1, 2, 3};

        changeNum(num);
        System.out.println(num); //10

        changeArr(nums);
        System.out.println(nums[0]);
        //heap 메모리의 특징
        //모든 stack 공간은 주소만 알면 heap에 접근할 수 있다



    }
}
