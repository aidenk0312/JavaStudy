package study_3;

public class study95 {
    public static class Point3D extends Point {
        private int z;

        public Point3D(int x, int y, int z) {
            super(x, y);
            this.z = z;
        }

        public void setZ(int z) {
            this.z = z;
        }

        public int getZ() {
            return z;
        }

        public void move(int x, int y, int z) {
            super.setXY(x, y);
            this.z = z;
        }

        public void moveUp() {
            z++;
        }

        public void moveDown() {
            z--;
        }

        public String toString() {
            return "(" + super.getX() + "," + super.getY() + "," + z + ")의 점";
        }

        public static void main(String[] args) {
            Point3D p = new Point3D(1, 2, 3);
            System.out.println(p.toString() + "입니다.");

            p.moveUp();
            System.out.println(p.toString() + "입니다.");

            p.moveDown();
            p.move(10, 10, p.getZ());
            System.out.println(p.toString() + "입니다.");

            p.move(100, 200, 300);
            System.out.println(p.toString() + "입니다.");
        }
    }
}
