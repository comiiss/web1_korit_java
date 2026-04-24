package _09_Method;

import java.util.Scanner;

public class Return {
    //리턴할 데이터가 존재하면, void 대신
    //해당 데이터의 자료형을 적어준다
    public static int addNum(int n1, int n2) {
        int sum = n1 + n2;
        return sum;

    }

    //1. 정수를 매개 변수로 전달 받아
    //짝수면 true, 홀수면 false 리턴


    public static boolean isEven(int n) {
        //리턴 - 데이터 전달, 메서드 즉시 종료
        if (n % 2 == 0) {
            return true;
        } else {
            return false;

        }

    }

    //2. 이름을 매개 변수로 전달 받아
    //이름 끝에 "님" 붙여서 리턴 (ex) 홍길동 - 홍길동님

    public static String client(String name) {
        System.out.println(name + " 님");
        return name;
    }

    public static  Scanner makeScanner() {
        return  new Scanner(System.in);
    }


    public static void main(String[] args) {
        //매개 변수: main -> 메서드 데이터 전송
        //리턴: 메서드 -> main 데이터를 전송

        //리턴이 있으면, 결과를 사용할 수 있다
        int result1 = addNum(10, 20); //자동 30으로 계산
        System.out.println(addNum(1, 2) + 1); //자동 3으로 계산

        //f(g()) - g()로부터 먼저 호출 - f() 호출
        addNum(addNum(10, 20), 10);

        if(isEven(10)) {
            System.out.println("짝수");
        }

        String result2 = client("신효진");

        if(client("홍길동").startsWith("홍")) {
            System.out.println("홍 씨입니다");
        }

        Scanner scanner = makeScanner();
        makeScanner().nextLine();

        //리턴 데이터가 값이면 값처럼, 객체면 객체처럼 다룰 수 있다
        //makeScanner().nextLine().contains()


    }

}

