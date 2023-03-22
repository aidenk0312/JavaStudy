package study_5;

public class study103 {
    static class Triangle {
        private int base;
        private int height;

        public Triangle(int base, int height) {
            this.base = base;
            this.height = height;
        }

        public int area() {
            return (base * height) / 2;
        }
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(10, 5);
        int width = triangle.area();
        System.out.println("넓이는: " + width);
    }
}
