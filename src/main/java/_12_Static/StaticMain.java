package _12_Static;

public class StaticMain {
    public static void main(String[] args) {

        StaticData sd1 = new StaticData(1);
        System.out.println(sd1.count);
        System.out.println(sd1.staticCount);
        StaticData sd2 = new StaticData(2);
        System.out.println(sd2.count);
        System.out.println(sd2.staticCount);
        StaticData sd3 = new StaticData(3);
        System.out.println(sd3.count);
        System.out.println(sd3.staticCount);

        //왜 1이 나오는지 설명하자면, id가 1인 방이 있다고 치면
        //count라는 공간도 같이 있는 건데 방마다 1씩 count되는 것이다
        //별도의 메모리 공간에 존재(메서드 영역 - method area)

        //stack에 main과 메서드
        //heap엔 객체 덩어리
        //메서드 영역이라는 건 메서드와 static 정보가 들어 있는 클래스가 저장됨
        //클래스로부터 만들어진 모든 객체들은 해당 정보를 공유한다

        System.out.println(StaticData.staticCount); //권장


    }
}
