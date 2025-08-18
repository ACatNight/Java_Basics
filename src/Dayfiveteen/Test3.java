package Dayfiveteen;

public class Test3 {
    public static void main(String[] args) {
        four s1 = new four();
        s1.setName("波妞");
        s1.setScore(100);
        System.out.println(s1.getName());
        System.out.println(s1.getScore());

        StudentOperator operator = new StudentOperator(s1);
        operator.printPass();
    }
}
