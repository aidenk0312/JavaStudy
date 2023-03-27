package study_5;

public class study109 {
    public abstract static class GameCharacter {
        public abstract void draw();
    }

    public static class Hobbit extends GameCharacter {
        @Override
        public void draw() {
            System.out.println("호빗을 그립니다.");
        }
    }

    public static class Sorcerer extends GameCharacter {
        @Override
        public void draw() {
            System.out.println("주술사를 그립니다.");
        }
    }

    public static void main(String[] args) {
        GameCharacter[] characters = new GameCharacter[3];

        characters[0] = new Hobbit();
        characters[1] = new Sorcerer();
        characters[2] = new Hobbit();

        for (GameCharacter character : characters) {
            character.draw();
        }
    }
}

