package Tasks.Tasks50;

import MyMethods.MyCollections;

public class Task37
    {
        public static void main( String[] args )
            {
                int[] mas = MyCollections.getMasRandomInteger(100, 100);

                for (int i = 0; i < mas.length; i++)
                    {
                        System.out.println(mas[i]);
                    }
            }
    }
