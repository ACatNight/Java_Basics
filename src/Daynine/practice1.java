package Daynine;


public class practice1 {
    public static void main(String[] args) {
        double price= data(543,11,"头等舱");
        System.out.println("优惠价为:" + price);


    }

    public static double data(double price, int mouth, String type) {
        if (mouth >= 5 && mouth <= 10) {
            switch (type) {
                case "经济舱":
                    price = price * 0.85;
                    break;
                case "头等舱":
                    price = price * 0.9;
                    break;
            }

        } else
            switch (type) {
                case "经济舱":
                    price = price * 0.65;
                    break;
                case "头等舱":
                    price = price * 0.7;
                    break;
            }
        return price;
    }
}
