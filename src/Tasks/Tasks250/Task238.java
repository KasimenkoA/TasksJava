package Tasks.Tasks250;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Task238
    {
        public static void main( String[] args ) throws IOException
            {
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add("apple");
                arrayList.add("banana");
                arrayList.add("orange");
                arrayList.add("kiwi");
                arrayList.add("mango");

                FileOutputStream file = new FileOutputStream( "Fruits.fos" );
                ObjectOutputStream object = new ObjectOutputStream( file );
                object.writeObject( arrayList );
                object.close();
            }
    }
