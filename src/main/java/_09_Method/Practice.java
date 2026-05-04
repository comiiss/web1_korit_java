package _09_Method;

public class Practice {

    //등급을 구하는 메서드
    //평균을 매개 변수로 전달 받아, 학점을 리턴
    //90점 이상 A, 80점 이상 90점 미안 B, 70점 이상 80점 미만 C, 나머지 D

    public static String getGrade(double avg) {
        String grade = "";


        if (avg >= 90) {
            grade = "A";
        } else if (avg >= 80) {
            grade = "B";
        } else if (avg >= 70) {
            grade = "C";
        } else {
            return "D";
        }

        return grade;
    }

    public static void printStudentInfo
            (String name, int[] scores) {


        //총점
        double scoreSum = 0.0;
        for (int score : scores) {
            scoreSum += score;
        }

        //평균
        double average = scoreSum / scores.length;

        //등급
        String grade = getGrade(average);

        System.out.println("이름: " + name );
        System.out.println("총점: " + scoreSum);
        System.out.println("평균: " + average);
        System.out.println("등급: " + grade);
    }

    public static void main(String[] args) {
      int[] scores = {80, 90, 70};
        printStudentInfo("홍길동", scores);
        //학생 이름, 국, 영, 수 점수를 배열로 매개 변수로 넘기면
        //총점, 평균, 등급을 출력하는 메서드



    }
}
