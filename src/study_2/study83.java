package study_2;
// account를 대상으로 클래스 만들어보기(메소드: 입금, 출금, 계좌정보 조회, 계좌이체, 입출금내역)

import java.util.ArrayList;
import java.util.List;

public class study83 {
    public static class Account {
        private String accountNumber;
        private String owner;
        private int balance;
        private List<String> history;

        public Account(String accountNumber, String owner, int balance) {
            this.accountNumber = accountNumber;
            this.owner = owner;
            this.balance = balance;
            this.history = new ArrayList<>();
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        public String getOwner() {
            return owner;
        }

        public void setOwner(String owner) {
            this.owner = owner;
        }

        public int getBalance() {
            return balance;
        }

        public void setBalance(int balance) {
            this.balance = balance;
        }

        private void addHistory(String type, Object value) {
            history.add("(" + type + ")" + value);
        }

        public void deposit(int amount) { // 입금
            balance += amount;
            addHistory("입금", amount);
            System.out.println(owner + "입금 완료");
        }

        public void withdraw(int amount) { // 출금
            if (balance >= amount) {
                balance -= amount;
                addHistory("출금", amount);
                System.out.println(owner + "출금 완료");
            } else {
                System.out.println("잔액 보다 출금하려는 금액이 큽니다.");
            }
        }

        public void checkBalance() {   // 조회
            System.out.println(owner + "의" + " " + accountNumber + " " + "계좌의 잔액은" + " " + balance + "입니다.");
        }

        public void transfer(Account receive, int amount) { // 이체
            if (balance >= amount) {
                balance -= amount;
                receive.deposit(amount);
                addHistory("계좌이체", amount + "(" + receive.getAccountNumber() + ")");
                System.out.println(amount + "원이" + " " + receive.getOwner() + "의 계좌에 이체 되었습니다.");
            } else {
                System.out.println("잔액이 부족합니다.");
            }
        }

        public void history() {  // 입출금 내역
            for (String list : history) {
                System.out.println(list + "\n");
            }
        }
    }
    public static void main(String[] args) {
        Account account1 = new study83.Account("123-456-789", "Kim", 10000);
        Account account2 = new study83.Account("789-456-123", "Park", 5000);

        account1.deposit(5000);
        account1.withdraw(3000);
        account1.transfer(account2, 4000);
        System.out.println("====" + account1.getOwner() + "의 내역" + "====");
        account1.history();
        account1.checkBalance();
        System.out.println("====" + account2.getOwner() + "의 내역" + "====");
        account2.history();
        account2.checkBalance();
    }
}

