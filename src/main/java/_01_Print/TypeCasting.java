package _01_Print;

import java.awt.*;

public class TypeCasting {
    public static void main(String[] args) {
        //(자료)형 변환: 데이터 타입을 다른 타입으로 변경

        //큰 - 작은: 넘칠 수 있음 - 데이터 유실 가능성(명시적 형 변환)
        //작은 - 큰: 데이터 유실 가능성 X (자동 형변환)

        //작은 - 큰

        int intNum = 10; //4바이트
        long longNum = 10L; //8바이트
        double doubleNum; //8바이트

        longNum = intNum; //10L로 자동 변환됨
        doubleNum = intNum; //10.0으로 자동 변환됨

        //큰 - 작은(오버 플로우)
        long maxIntNum = 2_147_483_647L; //int 최댓값
        long overIntNum = maxIntNum + 1;
        int intNum2 = (int) overIntNum; //자료가 커서 오류가 나는 게 아니라
        //자료형이 달라서임
        System.out.println(intNum2); //int -21억~21억

        //숫자 - 문자열
        String numberStr1 = "" + 12;
        String numberStr2 = Integer.toString(12);

        //문자열 - 숫자
        int number = Integer.parseInt("12");
        double d = Double.parseDouble("12");


        int intNum3 = 129;
        byte byteNum2 = (byte)intNum3;
        short shortNum2 = (short)intNum3;



    }
}
