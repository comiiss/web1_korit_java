package _11_Access;

public class Bottle {
    private int currentWater; //현재 물의 양
    private int max = 1000; //총량

    public Bottle() {
        this.currentWater = 100; //초기값 지정 가능
    } //유연성을 위해 따로 생성자로 지정한 거임


    //fill(int amount)
    //currentWater를 amount 만큼 증가시키는 메서드
    //amount 음수면 X,

    //drink(int amount)
    //currentWater를 amount 만큼 감소시키는
    //amount 음수면 X, currentWater는 음수가 될 수 없다

    private boolean isNegative(int amount) {
        if (amount < 0) {
            System.out.println("물은 음수일 수 없습니다");
            return true;
        }
        return false;
    }

    public void fill(int amount) {
        if (this.isNegative(amount)) return;
        if (this.currentWater + amount > max) {
            System.out.println("물이 넘쳐요");
            return;
        }

        this.currentWater += amount;


    }

    public void drink(int amount) {
        if(isNegative(amount)) return;
        if(this.currentWater < amount) {
            System.out.println("현재 양보다 더 마실 수 없습니다");
            return;
        }

        this.currentWater -= amount;
    }

    public void printCurrentWater() {
        System.out.println("현재 물의 양: " + this.currentWater);
    }


}



