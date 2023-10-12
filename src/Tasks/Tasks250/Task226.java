package Tasks.Tasks250;

import java.util.HashMap;
import java.util.Map;

public class Task226
    {
        public static void main( String[] args )
            {
                Map<Integer,String> map = new HashMap<>();

                map.put( 1, "Red" );
                map.put( 2, "Orange" );
                map.put( 3, "Yellow" );
                map.put( 4, "Green" );
                map.put( 5, "Blue" );
                map.put(6, "Indigo");
                map.put(7, "Violet");

                System.out.println(map.get( 4 ));
            }
    }
