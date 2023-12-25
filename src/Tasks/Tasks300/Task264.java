package Tasks.Tasks300;

import java.util.ArrayList;
import java.util.Random;

class Plane264
    {
        private String name;
        private int speed;

        public Plane264( int name, int speed )
            {
                this.name = "Plane" + name;
                this.speed = speed;
            }

        public String getName()
            {
                return name;
            }

        public int getSpeed()
            {
                return speed;
            }
    }

public class Task264
    {
        public static void main( String[] args )
            {
                ArrayList<Plane264> arrayList = new ArrayList<>();
                Random random = new Random();

                for (int i = 1; i < 11; i++)
                    {
                        arrayList.add( new Plane264( i, random.nextInt(8000) ) );
                    }

                for (Plane264 plane264 : arrayList)
                    {
                        System.out.println("" + plane264.getName() + ", speed: " + plane264.getSpeed());
                    }
            }
    }
