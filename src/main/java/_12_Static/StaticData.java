package _12_Static;

//static: 정적(고정)
public class StaticData {
    //id, count - 인스턴스(객체) 필드
    private int id;
    public int count;

    //클래스에 저장되는 필드(heap에 없음)
    public static int staticCount = 0;

    public StaticData(int id) {
        this.id = id;
        staticCount++;
        count++;
    }

    //스태틱 메서드
    // -> 유틸성이 좋다
    public static void a() {
        //스태틱은 스태틱만 사용 가능하다
        staticCount++;
        //this.count(x) new 되기 전에 정의될 것들만 호출 가능하니까
    }

    public void b() {
        staticCount++; //이미 메모리에 있으니까 호출 가능
        this.count++; //new 이후 시점
    }

    //스태틱 필드 - final과 함께 상수를 정의할 때 사용
    //스태특 메서드 - 유틸리티 메서드를 쓸 때
}
