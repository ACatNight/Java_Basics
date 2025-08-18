package Dayfiveteen;

public class one {
    public Object name;
    public int score;

    //无参数构造器
    public one(){
        System.out.println("无参数构造器被执行了");

    }
    //有参数构造器
    public one(String name,double score){
        System.out.println("有参数构造器被执行了");
        this.name = name;
        this.score = (int) score;
    }

}
