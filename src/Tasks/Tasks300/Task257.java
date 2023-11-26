package Tasks.Tasks300;

import java.util.Random;

class Train257
    {
        private int speed;

        public Train257()
            {
                this.speed = 0;
            }

        public int getSpeed()
            {
                return speed;
            }

        public void addSpeed(int sp)
            {
                this.speed += sp;
            }
    }

public class Task257
    {
        public static void main( String[] args )
            {
                Train257 train1 = new Train257();
                Train257 train2 = new Train257();

                Random random = new Random();
                int nn;

                while (true)
                    {
                        nn = random.nextInt(10);
                        train1.addSpeed( nn );
                        System.out.println(nn);

                        nn = random.nextInt(10);
                        train2.addSpeed( nn );
                        System.out.println(nn);

                        System.out.println();

                        if (train1.getSpeed() >= 200 || train2.getSpeed() >= 200) break;
                    }

                System.out.println("Train 1: " + train1.getSpeed());
                System.out.println("Train 2: " + train2.getSpeed());

                if (train1.getSpeed() > train2.getSpeed() )
                    {
                        System.out.println("The first train won!");
                    }
                else if (train1.getSpeed() < train2.getSpeed() )
                    {
                        System.out.println("The second train won!");
                    }
                else
                    {
                        System.out.println("Draw!");
                    }
            }
    }
