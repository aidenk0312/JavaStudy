package study_4;

public class study99 {
    interface Runner {
        void run();
        void Hard();
    }

    static class Athlete implements Runner {
        private String name;

        public Athlete(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println(name + "이(가) 빠르게 달린다.");
        }

        @Override
        public void Hard() {
            System.out.println(name + "이(가) 힘들다");
        }

    }

    public static void main(String[] args) {
        Runner athlete = new Athlete("김용수");
        athlete.run();

        Runner athlete1 = new Athlete("김용수");
        athlete1.Hard();
    }
}
