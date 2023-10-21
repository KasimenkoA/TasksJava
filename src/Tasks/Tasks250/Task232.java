package Tasks.Tasks250;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task232
    {
        public static void main( String[] args )
            {
                ArrayList<Integer> arrayList = new ArrayList<>();

                int nn;
                Random random = new Random();

                for (int i = 0; i < 10; i++)
                    {
                        nn = random.nextInt(10);
                        arrayList.add( nn );
                    }

                for (Integer integer : arrayList)
                    {
                        System.out.println(integer);
                    }

                System.out.println();
                System.out.println("Max: " + Collections.max( arrayList ) );
                System.out.println("Min: " + Collections.min( arrayList ) );
            }
    }
