package Tasks.Tasks100;

import MyMethods.MyCollections;
import School.PencilBox;

public class Task66
    {
        public static void main( String[] args )
            {
                String[] items = MyCollections.getRandomPencilBoxItems();
                for (String ss : items)
                    {
                        System.out.println(ss);
                    }
            }
    }
