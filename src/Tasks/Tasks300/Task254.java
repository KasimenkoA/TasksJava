package Tasks.Tasks300;

import java.util.ArrayList;
import java.util.Random;

class Gamer254
    {
        private String name;

        public Gamer254( String name )
            {
                this.name = name;
            }

        public String getName()
            {
                return name;
            }

        public String getThing()
            {
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add( "stone" );
                arrayList.add( "scissors" );
                arrayList.add( "paper" );

                int nn;
                Random random = new Random();
                nn = random.nextInt(3);

                return arrayList.get( nn );
            }
    }

public class Task254
    {
        public static void main( String[] args )
            {
                Gamer254 gamer1 = new Gamer254( "Tom" );
                Gamer254 gamer2 = new Gamer254( "Bob" );

                System.out.println(gamer1.getName() + " - " + gamer1.getThing());
                System.out.println(gamer2.getName() + " - " + gamer2.getThing());
            }
    }
