package study_5;

public class Customer107 extends Person106 {
    private int id;
    private int mileage;

    public Customer107() {
    }

    public Customer107(int id, int mileage) {
        this.id = id;
        this.mileage = mileage;
    }

    public Customer107(String name, String address, String phoneNumber, int id, int mileage) {
        super(name, address, phoneNumber);
        this.id = id;
        this.mileage = mileage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("ID: " + getId());
        System.out.println("마일리지: " + getMileage());
    }

    public static void main(String[] args) {
        Person106 person = new Person106("김용수", "서울시 강남구", "010-1234-56789");
        Customer107 customer = new Customer107("박지원", "경기도 하남시", "010-9876-54321", 1001, 300);

        System.out.println("====person=====");
        person.printInfo();

        System.out.println("====customer=====");
        customer.printInfo();

    }
}

