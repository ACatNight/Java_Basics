package DayFourteen;

public class one {
    double score;

    public void  printThis(){
        System.out.println(this);

    }
    public void printPass(double score){
        if (this.score > score){
            System.out.println("恭喜您成功执行成功");

        }else {
            System.out.println("落选了");
        }

    }

    }

