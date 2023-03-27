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
}