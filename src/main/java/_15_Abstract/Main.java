package _15_Abstract;

public class Main {
    public static void main(String[] args) {
        //Character ch = new Character();
        //추상 클래스는 직접 객체를 생성할 수 없음

        //업캐스딩된 상태로 생성
        //변수 타입은 부모 타입, 실제 객체는 자식 객체
        Character warrior1 = new Warrior("전사1");
        Character warrior2 = new Warrior("전사2");
        warrior1.attack(warrior2);

        //실습 Character를 상속 받는
        //1. Mage class를 정의해 주세요 - 체력 80, 공격력 30
        //attack - 마법 미사일
        //2. Archer class를 정의해 주세요 - 체력 100, 공격력 20
        //attack - 다중 화살

        Character mage = new Mage("짱법사");
        Character archer = new Archer("궁수맨");

        //실제 객체는 다른데 업캐스팅된 상태로 다 묶을 수 있다
        Character[] party = {warrior1, warrior2, mage, archer};

        for(Character member : party) {
            //attack() 메서드가 항상 존재하도록 설계
            //why? 오버라이딩이 강제되었으니까
            member.attack(warrior2);
            //추상 클래스를 상속한다 - attack()를 오버라이딩 강제
            //다형성이 보장
        }
    }
}
