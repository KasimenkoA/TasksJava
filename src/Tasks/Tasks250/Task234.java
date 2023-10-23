package Tasks.Tasks250;

import java.util.ArrayList;
import java.util.Collections;

public class Task234
    {
        public static void main( String[] args )
            {
                ArrayList<String> ss = new ArrayList<>();
                ss.add("red");
                ss.add("orange");
                ss.add("yellow");
                ss.add("green");
                ss.add("blue");
                ss.add("indigo");
                ss.add("violet");

                Collections.shuffle( ss );
                for (String s : ss)
                    {
                        System.out.println(s);
                    }
            }
    }
