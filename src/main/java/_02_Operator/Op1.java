package _02_Operator;

public class Op1 {
    public static void main(String[] args) {


             /* 연산자: 계산을 수핼하는 기호 (+, -)
             3 + 4 - '+' 연산자
             3, 4 - 피연산자
             a + b - 변수들도 피연산자
              */

             //1. 산술연산자
             int num1 = 3;
             int num2 = 2;

             System.out.println(num1 + num2);
             System.out.println(num1 - num2);
             System.out.println(num1 * num2);

             System.out.println(num1 / num2); //의 결과는 1이다
             //원래는 1.5인데 int끼리 연산 결과는 소수점을 버리기 때문이다

             //2. 비교 연산자
                System.out.println(num1 == num2);
                System.out.println(num1 != num2);

                boolean isSame = num1 == num2;

                System.out.println(num1 > 0);
                System.out.println(num1 >= 0);
                System.out.println(num1 < 0);
                System.out.println(num1 <= 0);

                //0 < num1 < 10 표현은 자바에 불가능하다

        //짝수 판단
        System.out.println(num1 % 2 == 0);
        //홀수 판단
        System.out.println(num1 % 2 != 0);

        //22시에서 50시간을 더한 시각을 코드로 구현해 주세요
        int now = 22;
        int target = 50;

        int result = (now + target) % 24;

        System.out.println("결과: " + result + "시");

        //단항연산자 - 피연산자가 두 개면 이항연산자라고 한다?

        int a = 1;

        //후위 증감
        int b = a++;
        System.out.println(b);

        a = 1;
        //전위 증감
        b = ++a;
        System.out.println(b);

        a = 1;

        //후위 감소
        b = a--;
        System.out.println(b); //1

        a = 1;

        //전위 감소
        b = --a;
        System.out.println(b);
        System.out.println(a);

        //단독 사용시 전위/후위 결과 동일

        a++;  ++a;

        //4. 대입연산자

        a = 5; //메모리(ram) 어딘가에 데이터를 복사하는 연산

        a = a + 3; //대입 연산은 제일 마지막 순위
       //복합대입연산자
        a += 3; //a = a + 3;
        a -= 3; // a = a - 3;
        a *= 3; // a = a * 3;
        a /= 3; // a = a / 3;
        a %= 3; // a = a % 3;




    }
}
