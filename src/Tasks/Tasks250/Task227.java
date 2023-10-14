package Tasks.Tasks250;

import java.util.HashMap;
import java.util.Map;

public class Task227
    {
        public static void main( String[] args )
            {
                Map<String,Integer> map = new HashMap<>();

                map.put( "China", 1_410_000_000 );
                map.put( "India", 1_380_000_000 );
                map.put( "UnitedStates", 330_000_000 );
                map.put( "Indonesia", 270_000_000 );
                map.put( "Pakistan", 220_000_000 );

                System.out.println("India: " + map.get( "India" ));
            }
    }
