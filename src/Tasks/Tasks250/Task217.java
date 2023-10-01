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

class SuperFox extends Fox
    {
        public SuperFox( String name )
            {
                super( name );
            }

        @Override
        public void showInfo()
            {
                super.showInfo();
                System.out.println("I am super Fox!");
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

                System.out.println();
                SuperFox sfox1 = new SuperFox( "Elza" );
                SuperFox sfox2 = new SuperFox( "Nata" );
                SuperFox sfox3 = new SuperFox( "Mura" );

                sfox1.showInfo();
                sfox2.showInfo();
                sfox3.showInfo();
            }
    }
