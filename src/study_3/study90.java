package study_3;

public class study90 {
    static class TV {
        private int size;

        public TV(int size) {
            this.size = size;
        }

        protected int getSize() {
            return size;
        }
    }

    static class ColorTV extends TV {
        protected int color;

        public ColorTV(int size, int color) {
            super(size);
            this.color = color;
        }

        public void printProperty() {
            System.out.println(getSize() + "인치 " + color + "컬러");
        }

        protected int getColor() {
            return color;
        }
    }

    static class IPTV extends ColorTV {
        private String ipAddress;

        public IPTV(String ipAddress, int size, int color) {
            super(size, color);
            this.ipAddress = ipAddress;
        }

        public void printProperty() {
            System.out.println("나의 IPTV는 " + ipAddress + " 주소의 " + getSize() + "인치 " + getColor() + "컬러");
        }
    }

    public static void main(String[] args) {
        IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
        iptv.printProperty();
    }
}
