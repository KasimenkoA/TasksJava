import MyMethods.MyCollections;
import School.PencilBox;

public class Task65
    {
        public static void main( String[] args )
            {
                PencilBox[] pencilBoxes = MyCollections.getPencilBoxItems();

                for (PencilBox pencilBox : pencilBoxes)
                    {
                        pencilBox.getInfo();
                    }
            }
    }
