package study_2;

public class study84 {
    public static class Dog {
        private String name;
        private int age;
        private String breed;

        public Dog(String name, int age, String breed) {
            this.name = name;
            this.age = age;
            this.breed = breed;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getBreed() {
            return breed;
        }

        public void bark() {
            System.out.println(name + "가(이) 짖습니다.");
        }

        public void run() {
            System.out.println(name + "가(이) 뛰어갑니다");
        }

        public static void main(String[] args) {
            Dog dog = new Dog("만두", 2, "아키타");

            System.out.println("이름: " + dog.getName());
            System.out.println("나이: " + dog.getAge());
            System.out.println("종류: " + dog.getBreed());

            dog.bark();
            dog.run();
        }
    }
}
