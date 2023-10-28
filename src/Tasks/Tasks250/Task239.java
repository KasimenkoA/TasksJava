package Tasks.Tasks250;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Task239
    {
        public static void main( String[] args ) throws IOException, ClassNotFoundException
            {
                ArrayList<String> arrayList = new ArrayList<>();

                FileInputStream file = new FileInputStream( "Fruits.fos" );
                ObjectInputStream object = new ObjectInputStream( file );

                arrayList = (ArrayList<String>) object.readObject();

                for (String s : arrayList)
                    {
                        System.out.println(s);
                    }
            }
    }
