package study_2;

public class study85 {
    public static class student {
        private String name;
        private int age;
        private int studentId;
        private int credit;

        public student(String name, int age, int studentId) {
            this.name = name;
            this.age = age;
            this.studentId = studentId;
            this.credit = 3;
        }

        public int getCredit() {
            return credit;
        }

        public void setCredit(int credit) {
            this.credit = credit;
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

        public void attendClass() {
            if (Math.random() < 0.5) {
                System.out.println(name + "가(이) 수업에 참여합니다");
                upCredIt();
            } else {
                System.out.println(name + "가(이) 수업에 미참여합니다");
                downCredIt();
            }
        }

        public void upCredIt() {
            credit += 1;
            System.out.println(name + "의 학점이 1점 증가되어 " + credit + "점");
        }

        public void downCredIt() {
            credit -= 1;
            System.out.println(name + "의 학점이 1점 감소되어 " + credit + "점");
        }

        public static void main(String[] args) {
            student student = new student("김용수", 20, 20230309);

            System.out.println("이름: " + student.getName());
            System.out.println("나이: " + student.getAge());
            System.out.println("학번: " + student.getStudentId());

            student.attendClass();
            System.out.println("최종학점: " + student.getCredit());
        }
    }
}

