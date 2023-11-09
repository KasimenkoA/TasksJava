package Tasks.Tasks250;

import java.util.Random;

class Cube248
    {
        private int square;

        public int getSquare()
            {
                return square;
            }

        public void setSquare( int square )
            {
                this.square = square;
            }
    }

public class Task248
    {
        public static void main( String[] args )
            {
                int nn;
                Random random = new Random();

                nn = random.nextInt(100);
                Cube248 cube1 = new Cube248();
                cube1.setSquare( nn );
                System.out.println(cube1.getSquare());

                nn = random.nextInt(100);
                Cube248 cube2 = new Cube248();
                cube2.setSquare( nn );
                System.out.println(cube2.getSquare());

                nn = random.nextInt(100);
                Cube248 cube3 = new Cube248();
                cube3.setSquare( nn );
                System.out.println(cube3.getSquare());

                System.out.println();

                int av = (cube1.getSquare() + cube2.getSquare() + cube3.getSquare())/3;
                System.out.println("Average: " + av);
            }
    }
