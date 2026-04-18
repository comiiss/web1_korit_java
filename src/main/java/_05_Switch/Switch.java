package _05_Switch;


import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        //switch - case문: 값에 따라 코드를 분기시키는 문법
        //코드 진행을 이동시키는 문법

        int rank = 2;
        if (rank == 1) {
            System.out.println("금메달");
        } else if (rank == 2) {
            System.out.println("은메달");
        } else if (rank == 3) {
            System.out.println("동메달");
        }

        switch (rank) {
            case 1:
                System.out.println("금메달");
                break; //가장 가까운 switch 중괄호 탈출
            case 2:
                System.out.println("은메달");
            case 3:
                System.out.println("동메달");
        }

        //원시 자료형은 == 비교
        //참조 자료형은 equals를 사용해서 알아서 비교

        String medal = "GOLD";

        switch (medal) {
            case "GOLD":
                System.out.println("금메달 주세요");
                break;
            case "SILVER":
                System.out.println("은메달 주세요");
                break;
            case "BRONZE":
                System.out.println("동메달 주세요");
                break;
            default: //else
                System.out.println("메달권이 아닙니다");

        }
        medal = "BRONZE";
        int prize;

        switch (medal) {
            case "GOLD":
                prize = 10000;
                break;
            case "SILVER":
                prize = 7000;
                break;
            case "BRONZE":
            case "NORMAL":
                prize = 2000;
                break;

            //BRONZE && NORMAL (X)
            //case문은 연산이 올 수 없다 값만 올 수 있다


            //스캐너 생성

            Scanner scanner = new Scanner(System.in);
            int price = 10000;

            //월~일 요일을 입력 받아 주세요
            //요일별 할인율 적용하여
            //월 - 10%, 화수목 - 5%, 금토일 - 20%
            //이상한 값 - 0%
            //최종 가격을 출력해 주세요


            System.out.println("요일을 입력해 주세요:");

            String day = scanner.nextLine();
            day = day.contains("요일") ? day : day + "요일";

            double discountRate;
            switch (day) {
                case "월요일":
                    discountRate = 0.10;
                    break;
                case "화요일":
                case "수요일":
                case "목요일":
                    discountRate = 0.05;
                    break;
                case "금요일":
                case "토요일":
                case "일요일":
                    discountRate = 0.20;
                default:
                    discountRate = 0.0;
                    System.out.println("올바른 요일이 아닙니다");

                    double discountPrice = price * discountRate;
                    double finalPrice = price - discountPrice;
                    System.out.println("최종 가격: " + finalPrice);



            }
        }


    }
}
}
