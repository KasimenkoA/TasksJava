package Tasks.Tasks100;

import MyMethods.MyCollections;

public class Task69
    {
        public static void main( String[] args )
            {
                String[] items = MyCollections.getRandomTextbooks();
                for (String ss : items)
                    {
                        System.out.println(ss);
                    }
            }
    }
