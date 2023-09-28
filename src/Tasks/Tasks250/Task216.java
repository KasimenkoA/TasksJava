package Tasks.Tasks250;

import java.util.ArrayList;
import java.util.Random;

class Mouse
    {
        public int age;
    }

public class Task216
    {
        public static void main( String[] args )
            {
                ArrayList<Mouse> mouses = new ArrayList<>();

                Random random = new Random();

                Mouse mouse1 = new Mouse();
                mouse1.age = 10;

                Mouse mouse2 = new Mouse();
                mouse2.age = 20;

                Mouse mouse3 = new Mouse();
                mouse3.age = 30;

                mouses.add( mouse1 );
                mouses.add( mouse2 );
                mouses.add( mouse3 );

                int sum = 0;

                for (Mouse mouse : mouses)
                    {
                        sum += mouse.age;
                    }

                System.out.println(sum);
            }
    }
