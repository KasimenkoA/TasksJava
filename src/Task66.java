import MyMethods.MyCollections;
import School.PencilBox;

public class Task66
    {
        public static void main( String[] args )
            {
                PencilBox[] pencilBoxes = MyCollections.getRandomPencilBoxItems();
                for (PencilBox pencilBox : pencilBoxes)
                    {
                        pencilBox.getInfo();
                    }
            }
    }
