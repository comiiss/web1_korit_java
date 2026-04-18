package _02_Operator;

public class Op2 {
    public static void main(String[] args) {
        //5. 논리연산자 - boolean 타입끼리 연산
        //연산 결과도 boolean 타입

        boolean hasLicense = true;
        int age = 21;
        //&&(and 연산자): 둘 다 true일 때 true
        boolean canDrive = hasLicense && age > 18;

        // ||(or 연산자): 둘 중 하나라도 true면 true
        boolean isWeekend = false;
        boolean isHoliday = true;
        boolean isRestDay = isWeekend || isHoliday;


        // !(not 연산자): boolean 값을 반전시킨다
        boolean isLogin = true;
        boolean isLogoff = !isLogin;

        int a = 5;
        boolean sample = 0 > a && a < 10;

        //6. 삼항연산자
        //boolean 데이터 ? true일 때의 값 : false일 때의 값
        int x = 100;
        int y = 10;

        int max = x > y ? x : y;
        System.out.println(max);

        // ? 이후의 데이터 타입이 동일해야 한다
        boolean isSame = x == y ? true : false;
        String sameStr = x == y ? "같아요" : "달라요";

        //실습 1) height이 restrict 이상이면
        // "탑승 가능" 아니라면 "탑승 불가능"

        int height = 120;
        int restrict = 150;

        String isHigh = height >= restrict
                ? "탑승 가능"
                : "탑승 불가능";

        System.out.println(isHigh);

        //실습 2) 5만 원 이상이면 10퍼 할인 가격, 아니라면 원래 가격
        //출력

        double price = 60000.0;
        double discountRate = 0.1;

        double IsHowMuch = price >= 50000
                ? price - price * discountRate
                : price;
        System.out.println(IsHowMuch);

        //항상 수정될 수 있는 가능성을 감안하고 코딩하기
        //price * 0.9보다 나음
        //아니면 할인율을 아예 변수로 선언해서 곱해 주는 방법도 있다

        //중첩 가능 = 삼항'연산자' - 결과가 값이라는 말임

        age = 17;
        String ticketName = age >= 20 ? "성인 요금"
                : age >= 14 ? "청소년 요금"
                : "어린이 요금";

        //false일 때 다시 연산을 하는 것이다


        boolean IsFamily = true;
        int fam = 4;

        boolean IsRight = IsFamily && fam == 4;
    }


}



