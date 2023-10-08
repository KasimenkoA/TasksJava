package Tasks.Tasks250;

import java.util.ArrayList;
import java.util.List;

public class Task223
    {
        public static void main( String[] args )
            {
                List<String> colors = new ArrayList<>();

                colors.add("Red");
                colors.add("Orange");
                colors.add("Yellow");
                colors.add("Green");
                colors.add("Blue");
                colors.add("Indigo");
                colors.add("Violet");

                for (int i = 0; i < colors.size(); i++)
                    {
                        System.out.println("Color: " + colors.get( i ));
                    }
            }
    }
