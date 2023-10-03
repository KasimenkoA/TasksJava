package Tasks.Tasks250;

class Boy
    {
        String name;

        public Boy( String name )
            {
                this.name = name;
            }

        public void showInfo()
        {
            System.out.println(this.name + " - boy.");
        }
    }

class SuperBoy extends Boy
    {
        public SuperBoy( String name )
            {
                super( name );
            }

        @Override
        public void showInfo()
            {
                super.showInfo();
                System.out.println("Это super boy!");
            }
    }

public class Task219
    {
        public static void main( String[] args )
            {
                Boy boy1 = new Boy( "Nicolas" );
                boy1.showInfo();

                System.out.println();
                SuperBoy superBoy1 = new SuperBoy( "Piter" );
                superBoy1.showInfo();
            }
    }
