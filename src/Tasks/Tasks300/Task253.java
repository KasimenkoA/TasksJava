package Tasks.Tasks300;

abstract class Car253
    {
        abstract public int getMaxSpeed();
        abstract public int getEnginePower();
    }

class NissanDualis extends Car253
    {
        @Override
        public int getMaxSpeed()
            {
                return 185;
            }

        @Override
        public int getEnginePower()
            {
                return 137;
            }
    }

class FordExplorer extends Car253
    {
        @Override
        public int getMaxSpeed()
            {
                return 229;
            }

        @Override
        public int getEnginePower()
            {
                return 400;
            }
    }

class ToyotaSupra extends Car253
    {
        @Override
        public int getMaxSpeed()
            {
                return 266;
            }

        @Override
        public int getEnginePower()
            {
                return 387;
            }
    }

public class Task253
    {
        public static void main( String[] args )
            {
                NissanDualis nissanDualis = new NissanDualis();
                FordExplorer fordExplorer = new FordExplorer();
                ToyotaSupra toyotaSupra = new ToyotaSupra();

                System.out.println("NissanDualis. Speed: " + nissanDualis.getMaxSpeed() + ". Power: " + nissanDualis.getEnginePower());
                System.out.println("FordExplorer. Speed: " + fordExplorer.getMaxSpeed() + ". Power: " + fordExplorer.getEnginePower());
                System.out.println("ToyotaSupra. Speed: " + toyotaSupra.getMaxSpeed() + ". Power: " + toyotaSupra.getEnginePower());
            }
    }
