package study_3;

public class study90 {
    static class TV {
        private int size;

        public TV(int size) {
            this.size = size;
        }

        public int getSize() {
            return size;
        }

        public void printProperty() {
            System.out.print(getSize() + "인치 ");
        }
    }

    static class ColorTV extends study90.TV {
        private int color;

        public ColorTV(int size, int color) {
            super(size);
            this.color = color;
        }

        public void printProperty() {
            super.printProperty();
            System.out.print(color + "컬러");
        }
    }

    static class IPTV extends ColorTV {
        private String ipAddress;

        public IPTV(String ipAddress, int size, int color) {
            super(size, color);
            this.ipAddress = ipAddress;
        }

        @Override
        public void printProperty() {
            System.out.print("나의 IPTV는 " + ipAddress + " 주소의 ");
            super.printProperty();
        }
    }

    public static void main(String[] args) {
        IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
        iptv.printProperty();
    }
}
