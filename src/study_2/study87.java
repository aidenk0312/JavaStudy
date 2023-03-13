package study_2;

public class study87 {
    public static class Rectangle {
        private double width;
        private double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double calculateArea() { // 면적
            return width * height;
        }

        public double calculatePerimeter() {
            return 2 * (width + height); // 둘레
        }

        public static void main(String[] args) {
            Rectangle rectangle = new Rectangle(5, 10);

            System.out.println("가로길이: " + rectangle.getWidth());
            System.out.println("세로길이: " + rectangle.getHeight());

            System.out.println("면적 : " + rectangle.calculateArea());
            System.out.println("둘레 : " + rectangle.calculatePerimeter());
        }
    }
}
