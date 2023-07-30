package Tasks.Tasks150;

public class Task132
    {
        public static void main( String[] args )
            {
                Spaceship spaceship1 = new Spaceship( "Apollo",new Astronaut( "Don" ),new Astronaut( "Boris" ) );
                Spaceship spaceship2 = new Spaceship( "Jupiter",new Astronaut( "Tom" ),new Astronaut( "Henk" ) );

                spaceship1.showInfo();
                spaceship2.showInfo();
            }
    }

class Astronaut
    {
        private String name;

        public Astronaut( String name )
            {
                this.name = name;
            }

        public String getName()
            {
                return name;
            }
    }

class Spaceship
    {
        private String name;
        private Astronaut astronaut1;
        private Astronaut astronaut2;

        public Spaceship( String name, Astronaut astronaut1, Astronaut astronaut2 )
            {
                this.name = name;
                this.astronaut1 = astronaut1;
                this.astronaut2 = astronaut2;
            }

        public void showInfo()
            {
                System.out.println("Tasks.Tasks150.Spaceship: " + name + ". Astonaut: " + astronaut1.getName() + ". Astonaut: " + astronaut2.getName() + ".");
            }
    }
