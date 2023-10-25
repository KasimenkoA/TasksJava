package Tasks.Tasks250;

import java.util.ArrayList;
import java.util.Iterator;

public class Task236
    {
        public static void main( String[] args )
            {
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add( "Tokyo" );
                arrayList.add( "Moscow" );
                arrayList.add( "Paris" );
                arrayList.add( "Beijing" );
                arrayList.add( "Brasilia" );

                Iterator iterator = arrayList.iterator();

                while (iterator.hasNext())
                    {
                        System.out.println(iterator.next());
                    }
            }
    }
