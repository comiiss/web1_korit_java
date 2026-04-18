package _04_If;

public class StackHeap {
    public static void main(String[] args) {
        //.java(영어) - .class(숫자): 컴파일러가 함
        //.class 파일을 읽고 실행하는 주체: JVM
        //JVM이 OS(window or macos)에게 명령 전달
        //JVM 메모리 구조(stack + heap + a...)

        /*
            자료형 분류
            1. 첫 글자가 소문자: 기본(원시)자료형
            - int, double, char, boolean...

            2. 첫 글자가 대문자: 참조자료형
            - String, Scanner, ...클래스
            원시 자료형들의 조합으로 이루어져 있고
            참조(.)가 가능하다

            1. stack 메모리
            - 기본 자료형들의 실제 값이 저장됨
            - 참조 자료형들의 heap 주소값이 저장된다

            2. Heap 메모리
            - 참조 자료형들의 실제 값이 저장됨




         */

        int num1 = 10;
        int num2 = 20;

        /*
            stack(main)--
            num1 : 10
            num2 : 20

         */

        String str1 = "홍길동";
        String str2 = new String("홍길동");

        /*
            stack(main)--
            num1: 10
            num2 : 20
            str1 : 0x1000
            str2: 0x2000

            ---
            heap--
            0x1000: "홍길동"
            0x2000: "홍길동"
         */

        num2 = 10;
        System.out.println(num1 == num2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1 == str2); //false

        // == 연산은 stack에 저장된 값을 비교하는 것이다
        //저장된 주소가 다르다
        //문자열은 문자열.equals()를 사용해야 한다 (Heap)
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals("홍길동"));
        System.out.println(str2.equals(str1));

        str2 = str1; //str2에 str1의 heap 주소를 대입
        System.out.println(str1 == str2); //주소가 같아짐. true.

    }
}
