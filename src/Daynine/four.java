package Daynine;

public class four {
    public static void main(String[] args) {
        //目标掌握方法重载的应用场景
        fire();
        fire("美丽国");
        fire("岛国",13);


    }
    public static void fire(){
        System.out.println("默认给岛国一枚导弹");
    }
    public static void fire(String country){
        System.out.println("发射了一枚武器给" + country);
    }
    public static void fire(String country , int number){
        System.out.println("发射了" + number + "枚武器给" + country);
    }
}
