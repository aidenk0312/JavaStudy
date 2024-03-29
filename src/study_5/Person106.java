package study_5;

public class Person106 {
    private String name;
    private String address;
    private String phoneNumber;

    public Person106() {
    }

    public Person106(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void printInfo() {
        System.out.println("이름: " + getName());
        System.out.println("주소: " + getAddress());
        System.out.println("전화번호: " + getPhoneNumber());
    }
}