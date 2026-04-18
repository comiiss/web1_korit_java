package _01_Print;

public class PersonInfo {
    public static void main(String[] args) {

        /*
            아래의 데이터를 적절한 자료형과 변수명으로 저장하고
            각 변수들을 출력해 주세요
            1. 이름 2. 출생년도 3. 키(소숫점) 4. 혈액형 5. 학생 여부(T/F)

         */

        String myName = "신효진";
        int birthYear = 2000;
        double height = 155.99;
        char bloodType = 'A';
        boolean hasStudent = true;

        System.out.println("이름: " + myName);
        System.out.println("출생년도: " + birthYear);
        System.out.println("키: " + height);
        System.out.println("혈액형: " + bloodType);
        System.out.println("학생 여부: " + hasStudent);

        //ctrl + D 하면 한 줄 복사 가능
    }
}
