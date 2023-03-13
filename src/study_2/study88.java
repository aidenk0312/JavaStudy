package study_2;

public class study88 {
    public static class Bicycle {
        private int gear;
        private int speed;

        public Bicycle(int gear, int speed) {
            this.gear = gear;
            this.speed = speed;
        }

        public int getGear() {
            return gear;
        }

        public void setGear(int gear) {
            this.gear = gear;
        }

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public void speedUp(int increment) {
            speed += increment;
        }

        public void applyBrake(int decrement) {
            speed -= decrement;
        }

        public void changeGear(int newGear) {
            gear = newGear;
        }
        public static void main(String[] args) {
            Bicycle bicycle = new Bicycle(3, 20);

            System.out.println("기어: " + bicycle.getGear());  // 기어 3
            System.out.println("속도: " + bicycle.getSpeed()); // 속도 20

            bicycle.speedUp(10); // 속도를 10 증가 > 30
            bicycle.applyBrake(5); // 속도를 5 감소 > 25
            bicycle.changeGear(4); // 기어를 4로 변경 > 4

            System.out.println("======기어, 속도 변경======");

            System.out.println("기어: " + bicycle.getGear()); // 4 출력
            System.out.println("속도: " + bicycle.getSpeed()); // 25 출력
        }
    }
}
