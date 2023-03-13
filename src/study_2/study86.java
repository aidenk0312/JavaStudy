package study_2;

public class study86 {
    public static class Movie {
        private String title;
        private String director;
        private int releaseYear;
        private String genre;

    public Movie(String title, String director, int releaseYear, String genre){
            this.title = title;
            this.director = director;
            this.releaseYear = releaseYear;
            this.genre = genre;
        }

        public String getTitle () {
            return title;
        }

        public void setTitle (String title){
            this.title = title;
        }

        public String getDirector () {
            return director;
        }

        public void setDirector (String director){
            this.director = director;
        }

        public int getReleaseYear () {
            return releaseYear;
        }

        public void setReleaseYear ( int releaseYear){
            this.releaseYear = releaseYear;
        }

        public String getGenre () {
            return genre;
        }

        public void setGenre (String genre){
            this.genre = genre;
        }

        public void play() {
            System.out.println(title + " 영화를 재생합니다");
        }

        public void stop() {
            System.out.println(title + " 영화를 중지합니다");
        }

        public static void main(String[] args) {
            Movie movie = new Movie("하치이야기", "라세 할스트롬", 2010, "드라마");

            System.out.println("제목: " + movie.getTitle());
            System.out.println("감독: " + movie.getDirector());
            System.out.println("개봉년도: " + movie.getReleaseYear());
            System.out.println("장르: " + movie.getGenre());

            movie.play();
            movie.stop();
        }
    }
}
