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
        static int getWinNumber( String tt1, String tt2 )
            {
                if ( tt1.equals( "stone" ) )
                    {
                        if ( tt2.equals( "scissors" ) ) return 1;
                        if ( tt2.equals( "paper" ) ) return 2;
                    }
                else if ( tt1.equals( "scissors" ) )
                    {
                        if ( tt2.equals( "stone" ) ) return 2;
                        if ( tt2.equals( "paper" ) ) return 1;
                    }
                else // "paper"
                    {
                        if ( tt2.equals( "stone" ) ) return 1;
                        if ( tt2.equals( "scissors" ) ) return 2;
                    }

                return 0; // tt1.equals( tt2 )
            }

        public static void main( String[] args )
            {
                Gamer254 gamer1 = new Gamer254( "Tom" );
                Gamer254 gamer2 = new Gamer254( "Bob" );

                String tt1 = gamer1.getThing();
                String tt2 = gamer2.getThing();

                System.out.println(gamer1.getName() + " - " + tt1);
                System.out.println(gamer2.getName() + " - " + tt2);

                int winNumber = getWinNumber(tt1, tt2);

                if (winNumber == 1)
                    {
                        System.out.println("Gamer " + gamer1.getName() + " won!");
                    }
                else if (winNumber == 2)
                    {
                        System.out.println("Gamer " + gamer2.getName() + " won!");
                    }
                else
                    {
                        System.out.println("Draw!");
                    }
            }
    }
