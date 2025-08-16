package DayFourteen;

public class test1 {
    public static void main(String[] args) {
        one s1 = new one();
        System.out.println(s1);
        s1.printThis();
        System.out.println("------------");
        one s2 = new one();
        System.out.println(s2);
        s2.printThis();

        one s3 = new one();
        s3.score = 325;
        s3.printPass(250);

    }


}
