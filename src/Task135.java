public class Task135
    {
        public static void main( String[] args )
            {
                Tank tank1 = new Tank( "T-34", 30, 4 );
                Tank tank2 = new Tank( "Panther", 44, 5 );
                Tank tank3 = new Tank( "Tiger", 57, 5 );

                tank1.showInfo();
                tank2.showInfo();
                tank3.showInfo();
            }
    }

class Tank
    {
        private String name;
        private int weight;
        private int crew;

        public Tank( String name, int weight, int crew )
            {
                this.name = name;
                this.weight = weight;
                this.crew = crew;
            }

        public void showInfo()
        {
            System.out.println("Tank: " + name + ", weight: " + weight + ", crew: " + crew + ".");
        }
    }
