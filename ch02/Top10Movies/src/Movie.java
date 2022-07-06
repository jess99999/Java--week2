public class Movie{
    private int movieRank;
    private String title;
    private String director;
    private int rottenTomatoesScore;
    
    public Movie(int movieRank, String title, String director, int rottenTomatoesScore) {
        this.movieRank = movieRank;
        this.title = title;
        this.director = director;
        this.rottenTomatoesScore = rottenTomatoesScore;
    }

    public int getMovieRank() {
        return movieRank;
    }

    public void setMovieRank(int movieRank) {
        this.movieRank = movieRank;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getRottenTomatoesScore() {
        return rottenTomatoesScore;
    }

    public void setRottenTomatoesScore(int rottenTomatoesScore) {
        this.rottenTomatoesScore = rottenTomatoesScore;
    }

    @Override
    public String toString() {
        return "Movie [director=" + director + ", movieRank=" + movieRank + ", rottenTomatoesScore="
                + rottenTomatoesScore + ", title=" + title + "]";
    }

    
}