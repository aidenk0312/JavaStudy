package study_3;

public class study94 {
    public static class ColorPoint extends Point {
        private String color;

        public ColorPoint() {
            super(0, 0);
            this.color = "BLACK";
        }

        public ColorPoint(int x, int y) {
            super(x, y);
            this.color = "BLACK";
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public String toString() {
            return getColor() + "색의 " + super.toString() + " 점";
        }

        public static void main(String[] args) {
            ColorPoint zeroPoint = new ColorPoint();
            System.out.println(zeroPoint.toString() + "입니다.");

            ColorPoint cp = new ColorPoint(10, 10);
            cp.setXY(5, 5);
            cp.setColor("RED");
            System.out.println(cp.toString() + "입니다.");
        }
    }
}
