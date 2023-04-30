import MyMethods.MyCollections;
import School.PencilBox;

public class Task65
    {
        public static void main( String[] args )
            {
                String[] items = MyCollections.getPencilBoxItems();

                for (String ss : items)
                    {
                        System.out.println(ss);
                    }
            }
    }
