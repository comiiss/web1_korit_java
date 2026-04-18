package _01_Print;

public class DataType {
    public static void main(String[] args) {
        //자료형(타입) 그리고 변수
        //변수를 사용하는 이유: 데이터 재사용
        //자료형 변수명 - (ex) String greeting; - greeting이란 빈 박스 생성
        //변수 초기화(최초 대입)
        //자바에선 '='가 같다는 의미가 아니다
        //우변의 데이터를 좌변의 변수에 저장하겠다
        //greeting = "hello";

        //변수 선언 및 초기화 가능
        String academy = "Korea IT";
        //변수를 읽을 수 있음
        System.out.println(academy);
        //재대입(덮어쓰기)
        academy = "IT Korea";
        System.out.println(academy);

        String ex1 = "abc";
        String ex2 = "def";
        System.out.println(ex1); //변수 사용 - 읽어와라
        System.out.println(ex2);

        // 대입(=)이 있을 땐 우변 먼저 실행하고, 대입한다
        ex2 = ex1; //ex1을 읽고, ex2에 대입
        System.out.println(ex2); //ex1과 같아짐

        /*
            자바 명명법
            1. 필수 규칙(문법)
                String 1name - 숫자로 시작할 수 없다!
                String my name - 공백을 포함할 수 없다!
                String class
                String if - 자바 예약어는 사용할 수 없다!

            2. 관례
                파스칼 표기법 - MyName - 클래스명, 파일명
                카멜 표기법 - myName - 변수명, 메서드명

         */

        /* 1. 정수타입
            1111 0111 - 8bit - 1바이트
            byte byteNum = 127; - 1바이트
            short shortNum = 32000; - 2바이트
            int intNum = 21; - 4바이트 (-21~억~21억)
            long longNum = 3_000_000_000L; - 8바이트

            2. 실수(소수점) 타입
                float smallBox = 3.14f; - 4바이트
                double bigBox = 3.14; - 8바이트 (소수점 15자리)

            3. 문자 타입 - 글자 1개
            char char1 = 'A';
            char char2 = 65 + 1; - 문자는 숫자와 1:1 대응
            char2를 출력하면 B가 나온다. A는 65다.

            4. 문자열
            String str = "안녕하세요";

            5. 논리형 - true/false만 저장
                의문형으로 변수명 작성해야 한다(관례)
                boolean isEmpty = true;
                boolean isLogin = false;
                boolean hasMoney = false;


         */

    }
}
