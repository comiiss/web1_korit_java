package _15_Abstract;

//1. 오버라이딩할 부모의 메서드는 다형성 관점에서 구현이 필요 없음
//2. 상속했을 때, 오버라이딩을 강제해야 한다

//추상 클래스: 추상 메서드를 하나 이상 포함하는 클래스
//추상 메서듸 메서드 시그너치만 정의, 구현(body) 생략
public abstract class Character {
    protected String name;
    protected int HP;
    protected int attackDMG;

    public Character(String name, int HP, int attackDMG) {
        this.name = name;
        this.HP = HP;
        this.attackDMG = attackDMG;
    }

    //공통 메서드
    public void receiveDMG(int DMG) {
        this.HP -= DMG;
        if (this.HP <= 0) {
            this.HP = 0;
            System.out.println(this.name + "이 쓰러졌습니다.");
        }
    }

    //Character는 기본 틀
    //attack은 구현부가 필요 없음. 어차피 오버라이딩을 할 거라서.
    //abstract를 작성하면 메서드 구현부가 없어짐. 시그니처만 존재.
        public abstract void attack (Character target);

    public String getName() {
        return name;
    }
}

