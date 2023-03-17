package study_4;

public class study100 {
    static class Worker {
        public void work() {
            System.out.println("일을 합니다.");
        }
    }

    static class Programmer extends Worker {
        @Override
        public void work() {
            System.out.println("프로그래밍을 합니다.");
        }
    }

    static class Designer extends Worker {
        @Override
        public void work() {
            System.out.println("디자인을 합니다.");
        }
    }

    static class Cleaner extends Worker {
        @Override
        public void work() {
            System.out.println("청소를 합니다.");
        }
    }

    public static void main(String[] args) {
        Worker worker = new Worker();
        Worker programmer = new Programmer();
        Worker designer = new Designer();
        Worker cleaner = new Cleaner();

        worker.work();
        programmer.work();
        designer.work();
        cleaner.work();
    }
}
