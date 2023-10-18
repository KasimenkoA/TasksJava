package Tasks.Tasks250;

import java.util.ArrayList;

public class Task230
    {
        public static void main( String[] args )
            {
                ArrayList<String> arrayList = new ArrayList<>();

                arrayList.add( "A" );
                arrayList.add( "B" );
                arrayList.add( "C" );
                arrayList.add( "D" );
                arrayList.add( "F" );
                arrayList.add( "G" );

                arrayList.remove("B" );
                arrayList.remove("D" );

                for (String character : arrayList)
                    {
                        System.out.println(character);
                    }
            }
    }
