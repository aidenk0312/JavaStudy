package study_2;

public class study88 {
    static class Bicycle {
        private int speed;
        private int gear;
        private static final int MAX_SPEED = 30;
        private static final int MIN_SPEED = 1;
        private static final int MAX_GEAR = 10;
        private static final int MIN_GEAR = 1;

        public Bicycle() {
            this.speed = 20;
            this.gear = 3;
        }

        public void increaseSpeed() {
            speed++;
            if (speed > MAX_SPEED) {
                speed = MAX_SPEED;
                System.out.println("최대속도 넘음, 최대속도 " + MAX_SPEED);
            }
        }

        public void decreaseSpeed() {
            speed--;
            if (speed < MIN_SPEED) {
                speed = MIN_SPEED;
                System.out.println("최소속도 미달, 최소속도 " + MIN_SPEED);
            }
        }

        public void changeGear(int newGear) {
            if (newGear >= MIN_GEAR && newGear <= MAX_GEAR) {
                gear = newGear;
            } else {
                System.out.println("기어 변경 불가, 최소 기어 " + MIN_GEAR + ", 최대 기어 " + MAX_GEAR);
            }
        }

        public void printStatus() {
            System.out.println("===현재 속도, 기어===");
            System.out.println("속도: " + speed);
            System.out.println("기어: " + gear);
        }
    }

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.printStatus();

        bicycle.increaseSpeed();
        bicycle.increaseSpeed();
        bicycle.changeGear(5);
        bicycle.printStatus();
    }
}
