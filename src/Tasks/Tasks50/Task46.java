package Tasks.Tasks50;

import MyMethods.MyCollections;

import java.util.ArrayList;

public class Task46
    {
        public static void main( String[] args )
            {
                int[] mas = MyCollections.getMasRandomInteger( 50, 100 );

                ArrayList<Integer> arrayList = new ArrayList<>();
                for (int i = 0; i < mas.length; i++)
                    {
                        arrayList.add( mas[i] );
                    }

                for (Integer integer : arrayList)
                    {
                        System.out.println(integer);
                    }
            }
    }
