package _13_Final;

public class FinalMain {
    public static void main(String[] args) {
        //변수에 final 지정 가능
        //1회만 초기화할 수 있음
        final int data = 10;
        //data1 = 20;

        final int data2;
        data2 = 20;
        //data2 = 30;

        //객체를 담은 변수에 final 선언
        final FinalStudent st1
                = new FinalStudent
                ("김자바", 001, 20);

        st1.setAge(21);
        st1.printInfo("김자바");
        //왜 final인데, 객체의 상태가 변경될 수 있을까?
        //결론: final 스택의 값을 변경하지 못하게 막는 것
        //st1이 다른 객체로 바뀌는 것만 금지, 객체 내용은 변경 O

        //final로 재대입을 막고 있는데, 막는 것은 컴파일러다


        //매직 넘버, 매직스트링: 하드코딩되어 있는 숫자, 문자열
        //이 숫자(문자열)이 뭘 의미하는가? 궁금해지면 매직넘버
        //우선 변수로 빼 주고, 파일도 분리해질 것이다
        //웬만하면 바뀌지 않는 게 매직넘버
        System.out.println("게임 이름: " + Constant.GAME_NAME);
        System.out.println("게임 모드: " + Constant.GAME_MODE);
        System.out.println("플레이어의 수: " + Constant.MAX_PLAYER_COUNT);

        int playerLevel = 18; //외부 입력 값

        if(playerLevel + 1 > Constant.MAX_LEVEL) {
            System.out.println("이미 최대 레벌에 도달했습니다");
        } else {
            playerLevel++;
        }

        //물건 구입
        int price = 100000; //외부 입력 값
        double discountprice;

        //5만 원이 넘어가면 10프로 할인된 가격을 출력
        //상수를 사용해서 5만 원(기준), 10프로(할인율)

        if(price > Constant.STANDARD_PRICE) {
            double discountAmount = price * Constant.DISCOUNT_RATE;
            discountprice = price - discountAmount;
        } else {
            discountprice = price;
        }

        System.out.println(discountprice);
    }
}
