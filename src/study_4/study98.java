package study_4;

public class study98 {
    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void introduce() {
            System.out.println("안녕하세요, 저는 " + name + "이고, 나이는 " + age + "살입니다.");
        }
    }

    static class Student extends Person {
        private String school;

        public Student(String name, int age, String school) {
            super(name, age);
            this.school = school;
        }

        public String getSchool() {
            return school;
        }

        @Override
        public void introduce() {
            super.introduce();
            System.out.println("저는 " + school + " 학교에 다니고 있습니다.");
        }
    }

    public static void main(String[] args) {
        Person person = new Person("김용수", 32);
        Student student = new Student("김철수", 18, "서울고등학교");

        person.introduce();
        student.introduce();
    }
}

