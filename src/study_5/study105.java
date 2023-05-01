package study_5;

public class study105 {
    static class Person {
        protected int appleCnt;
        protected int balance;

        public Person(int appleCnt, int balance) {
            this.appleCnt = appleCnt;
            this.balance = balance;
        }

        public void printStatus(String role) {
            System.out.println("[" + role + "] 사과 개수: " + appleCnt);
            System.out.println("[" + role + "] 현재 잔액: " + balance);
        }
    }

    static class Seller extends Person {
        private int profit;
        private int applePrice;

        public Seller(int appleCnt, int profit, int applePrice) {
            super(appleCnt, 0);
            this.profit = profit;
            this.applePrice = applePrice;
        }

        public void sellApple(int sellAppleCnt) {
            if (this.appleCnt < sellAppleCnt) {
                System.out.println("!!!!!!사과 재고 없음!!!!!!!");
            } else {
                this.appleCnt -= sellAppleCnt;
                this.profit += sellAppleCnt * applePrice;
            }
        }

        @Override
        public void printStatus(String role) {
            System.out.println("[" + role + "] 사과 개수: " + appleCnt);
            System.out.println("[" + role + "] 판매수익: " + profit);
        }
    }

    static class Buyer extends Person {
        public Buyer(int appleCnt, int balance) {
            super(appleCnt, balance);
        }

        public void buyApple(Seller seller, int buyAppleCnt) {
            int total = buyAppleCnt * seller.applePrice;
            if (this.balance < total) {
                System.out.println("!!!!!!!!!잔액 부족!!!!!!!!!!!");
            } else {
                this.appleCnt += buyAppleCnt;
                this.balance -= buyAppleCnt * seller.applePrice;
                seller.sellApple(buyAppleCnt);
            }
        }
    }

    public static void main(String[] args) {
        Seller seller = new Seller(0, 0, 1000);
        Buyer buyer = new Buyer(0, 5000);

        System.out.println("구매행위가 일어나기 전의 상태");
        seller.printStatus("판매자");
        buyer.printStatus("구매자");

        buyer.buyApple(seller, 0);

        System.out.println("구매행위가 일어난 후의 상태");
        seller.printStatus("판매자");
        buyer.printStatus("구매자");
    }
}