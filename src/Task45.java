import MyMethods.MyCollections;

import java.util.ArrayList;

public class Task45
    {
        public static void main( String[] args )
            {
                ArrayList<String> arrayList = new ArrayList<>();

                String[] mas = MyCollections.getPupilsNames();
                for (int i = 0; i < mas.length; i++)
                    {
                        arrayList.add( mas[i] );
                    }

                for (String s : arrayList)
                    {
                        System.out.println(s);
                    }
            }
    }
