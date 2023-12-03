package Tasks.Tasks300;

import java.util.ArrayList;

public class Task261
    {
        public static void main( String[] args )
            {
                int n1 = 123;
                int n2 = 50_365;
                int n3 = 3_150_000;
                int n4 = 100_005;

                ArrayList<Integer> arrayList = new ArrayList<>();
                arrayList.add( n1 );
                arrayList.add( n2 );
                arrayList.add( n3 );
                arrayList.add( n4 );

                int max_n = Integer.MIN_VALUE;
                for (Integer integer : arrayList)
                    {
                        if (integer > max_n) max_n = integer;
                    }

                System.out.println("Max: " + max_n);
            }
    }
