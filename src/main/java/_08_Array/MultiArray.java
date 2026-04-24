package _08_Array;

import java.util.Arrays;

public class MultiArray {
    public static void main(String[] args) {
        //다중 배열 - 배열 안에 배열이 있는 구조

        //영화관 좌석
        String[] seatA = {"A1", "A2", "A3", "A4", "A5"};
        String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
        String[] seatC = {"C1", "C2", "C3", "C4", "C5"};

        //seats는 뭘 저장하는 건가? String[]의 주소값들을 저장
        String[][] seats = {seatA, seatB, seatC};
        String A2 = seats[0][1];
        System.out.println(A2);

        String[] aSeat = seats[0];
        String A3 = aSeat[1];
        A3 = seats[0][1];

        String[][] seats2 = {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        //실습 A4/C5를 seats2로 접근하여 출력해 주세요
        //B3를 B-THREE로 변경

        System.out.println(seats2[0][3]);
        System.out.println(seats2[2][4]);

       String change = "B-THREE";
       seats2[1][2] = change;
       System.out.println(seats2[1][2]);

       //Arrays.toString()은 주소가 있으면, 한 번만 찾아가서 확인

        System.out.println(Arrays.toString(seats2));
        //Arrays.toString은 주소로 찾아가서 주소들만 보여 준다

        //실제 값이 나올 때까지 찾아가서 확인해 온다
        System.out.println(Arrays.deepToString(seats2));

    }
}
