import MyMethods.MyCollections;

public class Task68
    {
        public static void main( String[] args )
            {
                String[] textBooks = MyCollections.getTextbooks();
                for (String textBook : textBooks)
                    {
                        System.out.println(textBook);
                    }
            }
    }
