package Tasks.Tasks250;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task228
    {
        public static void main( String[] args )
            {
                Map<String,String > map = new HashMap<>();

                map.put( "Vova", "Moscow" );
                map.put( "Piter", "Tver" );
                map.put( "Sveta", "Kazan" );
                map.put( "Slava", "Novosibirsk" );
                map.put( "Ulia", "Khabarovsk" );

                Set<Map.Entry<String,String>> set = map.entrySet();

                for (Map.Entry<String, String> entry : set)
                    {
                        System.out.println(entry.getKey() + " - " + entry.getValue());
                    }
            }
    }
