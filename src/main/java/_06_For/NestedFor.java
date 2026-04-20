package _06_For;

public class NestedFor {
    public static void main(String[] args) {
        //2문 for문

        for (int day = 1; day <= 7; day++) {
            System.out.println(day + "일 살았습니다");
        }

        //한 달
        //바깥 반복이 한 번 돌 때, 안쪽 반복은 전체 반복
        for (int week = 1; week <= 4; week++) {
            System.out.println(week + "주 시작");
            for (int day = 1; day <= 7; day++) {
                System.out.println("   " + day + "일 살았습니다");
            }
            //7일(1주일) 살기
            System.out.println(week + "주 끝");
        }

        //구구단

        /*
            2단 시작

            2단 끝
         *

         */
        System.out.println("2단 시작");
        for (int j = 1; j <= 9; j++) {
            System.out.println("    " + 2 + "X" + j + "=" + 2 * j);
        }
        System.out.println("2단 끝");


        //9단까지
        for (int i = 2; i <= 9; i++) {
            System.out.println(i + "단 시작");
            for (int j = 1; j <= 9; j++) {
                System.out.println("    " + i + "x" + j + "=" + i * j);
            }

                System.out.println(i + "단 끝");
            }

        }

    }
