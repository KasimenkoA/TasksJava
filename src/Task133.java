public class Task133
    {
        public static void main( String[] args )
            {
                Movie movie1 = new Movie( "Undefeated", "drama", 113);
                Movie movie2 = new Movie( "Hobbit","fantasy", 209 );

                movie1.showInfo();
                movie2.showInfo();
            }
    }

class Movie
    {
        private String title;
        private String genre;
        private int length;

        public Movie( String title, String genre, int length )
            {
                this.title = title;
                this.genre = genre;
                this.length = length;
            }

        public String getTitle()
            {
                return title;
            }

        public String getGenre()
            {
                return genre;
            }

        public int getLength()
            {
                return length;
            }

        public String getLengthHour()
            {
                int hour = getLength()/60;
                int min = getLength() - hour*60;
                String ss = "" + hour + " hours, " + min + " min.";
                return ss;
            }

        public void showInfo()
            {
                System.out.println("Film: " + getTitle() + ", genre: " + getGenre() + ", length: " + getLengthHour());
            }
    }
