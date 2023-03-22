package study_3;

public class study89 {
    static class TV {
        private int size;

        public TV(int size) {
            this.size = size;
        }

        protected int getSize() {
            return size;
        }

        public void printProperty() {
            System.out.print(getSize() + "인치 ");
        }
    }

    static class ColorTV extends TV {
        private int color;

        public ColorTV(int size, int color) {
            super(size);
            this.color = color;
        }
        @Override
        public void printProperty() {
            super.printProperty();
            System.out.print(color + "컬러");
        }
    }

    public static void main(String[] args) {
        TV myTV1 = new TV(32);
        myTV1.printProperty();
        System.out.println();

        ColorTV myTV = new ColorTV(32, 1024);
        myTV.printProperty();
    }
}
