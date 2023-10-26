package Tasks.Tasks250;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Task237
    {
        public static void main( String[] args )
            {
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add("United States");
                arrayList.add("Canada");
                arrayList.add("United Kingdom");
                arrayList.add("Australia");
                arrayList.add("Japan");

                ListIterator listIterator = arrayList.listIterator( arrayList.size() );

                while (listIterator.hasPrevious())
                    {
                        System.out.println( listIterator.previous() );
                    }
            }
    }
