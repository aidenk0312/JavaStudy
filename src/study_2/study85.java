package study_2;

public class study85 {
    public static class student {
        private String name;
        private int age;
        private int studentId;

        public student(String name, int age, int studentId) {
            this.name = name;
            this.age = age;
            this.studentId = studentId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getStudentId() {
            return studentId;
        }

        public void setStudentId(int studentId) {
            this.studentId = studentId;
        }

        public void study() {
            System.out.println(name + "가(이) 공부합니다");
        }

        public void attendClass() {
            System.out.println(name + "가(이) 수업에 참여합니다");
        }

        public static void main(String[] args) {
            student student = new student("김용수", 20, 20230309);

            System.out.println("이름: " + student.getName());
            System.out.println("나이: " + student.getAge());
            System.out.println("학번: " + student.getStudentId());

            student.study();
            student.attendClass();
        }
    }
}

