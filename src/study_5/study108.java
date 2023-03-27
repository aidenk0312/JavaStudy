package study_5;

public class study108 {
    public abstract static class HomeAppliance {
        public double price;

        public HomeAppliance(double price) {
            this.price = price;
        }

        public abstract double getPrice();
    }

    public static class Television extends HomeAppliance {
        public Television(double price) {
            super(price);
        }

        @Override
        public double getPrice() {
            return price * 0.9; // 10% 할인
        }
    }

    public static class Refrigerator extends HomeAppliance {
        public Refrigerator(double price) {
            super(price);
        }

        @Override
        public double getPrice() {
            return price * 0.95; // 5% 할인
        }
    }

    public static void main(String[] args) {
        Television tv = new Television(200000);
        Refrigerator fridge = new Refrigerator(150000);

        System.out.println("TV 가격 (10% 할인): " + tv.getPrice() + "원");
        System.out.println("냉장고 가격 (5% 할인): " + fridge.getPrice() + "원");
    }
}