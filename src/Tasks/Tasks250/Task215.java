package Tasks.Tasks250;

class Monkey
    {
        String name;

        public Monkey( String name )
            {
                this.name = name;
            }
    }

public class Task215
    {
        public static void main( String[] args )
            {
                Monkey monkey1 = new Monkey( "Chi-Chi" );
                Monkey monkey2 = new Monkey( "Saya" );
                Monkey monkey3 = new Monkey( "Taya" );

                System.out.println(monkey1.name);
                System.out.println(monkey2.name);
                System.out.println(monkey3.name);
            }
    }
