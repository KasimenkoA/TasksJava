package Tasks.Tasks250;

class Fox
    {
        String name;

        public Fox( String name )
            {
                this.name = name;
            }

        public void showInfo()
            {
                System.out.println("Fox - " + name);
            }
    }

public class Task217
    {
        public static void main( String[] args )
            {
                Fox fox1 = new Fox( "Alice" );
                Fox fox2 = new Fox( "Vera" );
                Fox fox3 = new Fox( "Dora" );

                fox1.showInfo();
                fox2.showInfo();
                fox3.showInfo();
            }
    }
