package Tasks.Tasks250;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Task229
    {
        public static void main( String[] args )
            {
                SortedMap<String,Integer> sortedMap = new TreeMap();

                sortedMap.put( "Liza", 140 );
                sortedMap.put( "Alisa", 150 );
                sortedMap.put( "Yakov", 145 );
                sortedMap.put( "Vlad", 141 );
                sortedMap.put( "Bob", 149 );

                for (Map.Entry<String, Integer> stringIntegerEntry : sortedMap.entrySet())
                    {
                        System.out.println(stringIntegerEntry.getKey() + " " + stringIntegerEntry.getValue());
                    }
            }
    }
