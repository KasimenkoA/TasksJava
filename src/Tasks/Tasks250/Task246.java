package Tasks.Tasks250;

class Airplane
    {
        void showSpeed()
            {
                System.out.println("Airplane. Speed is 800 km per hour.");
            }
    }

class OrbitalPlane extends Airplane
    {
        @Override
        void showSpeed()
            {
                System.out.println("Orbital plane. Speed is 20 000 km per hour.");
            }
    }

class Spaceship extends OrbitalPlane
    {
        @Override
        void showSpeed()
            {
                System.out.println("Spaceship. Speed is 30 000 km per hour.");
            }
    }

public class Task246
    {
        public static void main( String[] args )
            {
                Airplane airplane = new Airplane();
                airplane.showSpeed();

                OrbitalPlane orbitalPlane = new OrbitalPlane();
                orbitalPlane.showSpeed();

                Spaceship spaceship = new Spaceship();
                spaceship.showSpeed();
            }
    }
