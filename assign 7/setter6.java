class MovieRating{
    private String movieName;
    private String genre;
    private int rating;

    public void setMovieName(String movieName){
      this.movieName = movieName;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public void setRating(int rating){
        this.rating = rating;
    } 
    public void display(){
        System.out.println(" movieName"+ movieName);
    
        System.out.println("genre   "+ genre);
        System.out.println("rating   " + rating);
    }
    
    public void isHit(){
        if(rating >8 )
    System.out.println(" movie rating  : is hit ");

    }
}
class TestMain{
    public static void main(String[] args){
        MovieRating movieRating = new MovieRating();
        movieRating.setMovieName("Raid");
    
        movieRating.setGenre("biography");

        movieRating.setRating(5);
        movieRating.display();
        movieRating.isHit();
    }    
}