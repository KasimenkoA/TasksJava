package Tasks.Tasks250;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task240
    {
        public static void main( String[] args ) throws IOException, ClassNotFoundException
            {
                Map<Integer,String> map = new HashMap<>();
                map.put(1, "Mercury");
                map.put(2, "Venus");
                map.put(3, "Earth");
                map.put(4, "Mars");
                map.put(5, "Jupiter");

                FileOutputStream file = new FileOutputStream( "Planets.fos" );
                ObjectOutputStream object = new ObjectOutputStream( file );
                object.writeObject( map );
                object.close();

                Map<Integer,String> map2 = new HashMap<>();

                FileInputStream file2 = new FileInputStream( "Planets.fos" );
                ObjectInputStream object2 = new ObjectInputStream( file2 );

                map2 = (Map<Integer, String>) object2.readObject();
                for (String value : map2.values())
                    {
                        System.out.println(value);
                    }
            }
    }
