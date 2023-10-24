package Tasks.Tasks250;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Task235
    {
        public static void main( String[] args )
            {
                Set<String > set = new HashSet<>();
                set.add( "white" );
                set.add( "blue" );
                set.add( "red" );

                Iterator iterator = set.iterator();

                while (iterator.hasNext())
                    {
                        System.out.println(iterator.next());
                    }
            }
    }
