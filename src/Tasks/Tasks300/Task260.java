package Tasks.Tasks300;

import java.util.ArrayList;

class Figure260
    {
        private String name;
        private int power;

        public Figure260( String name, int power )
            {
                this.name = name;
                this.power = power;
            }

        public String getName()
            {
                return name;
            }

        public int getPower()
            {
                return power;
            }
    }

public class Task260
    {
        public static void main( String[] args )
            {
                ArrayList<Figure260> arrayList = new ArrayList<>();

                arrayList.add( new Figure260( "pawn", 1 ) );
                arrayList.add( new Figure260( "knight", 3 ) );
                arrayList.add( new Figure260( "rook", 5 ) );

                for (Figure260 figure260 : arrayList)
                    {
                        System.out.println("Figure: " + figure260.getName() + ", power: " + figure260.getPower());
                    }
            }
    }
