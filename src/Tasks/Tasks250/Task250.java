package Tasks.Tasks250;

import java.util.ArrayList;
import java.util.Random;

class Infantry
    {
        private int attack;

        public Infantry( int attack )
            {
                this.attack = attack;
            }

        public int getAttack()
            {
                return attack;
            }
    }

public class Task250
    {
        public static void main( String[] args )
            {
                ArrayList<Infantry> squad1 = new ArrayList<>();
                ArrayList<Infantry> squad2 = new ArrayList<>();

                int nn;
                Random random = new Random();

                for (int i = 0; i < 10; i++)
                    {
                        squad1.add( new Infantry( random.nextInt(100) ) );
                        squad2.add( new Infantry( random.nextInt(100) ) );
                    }

                int attackSum1 = 0;
                for (Infantry infantry : squad1)
                    {
                        System.out.println(infantry.getAttack());
                        attackSum1 += infantry.getAttack();
                    }
                System.out.println("Attack sum = " + attackSum1);
                System.out.println();

                int attackSum2 = 0;
                for (Infantry infantry : squad2)
                    {
                        System.out.println(infantry.getAttack());
                        attackSum2 += infantry.getAttack();
                    }
                System.out.println("Attack sum = " + attackSum2);
                System.out.println();

                if (attackSum1 > attackSum2)
                    {
                        System.out.println("The first infantry squad is stronger.");
                    }
                else
                    {
                        System.out.println("The second infantry squad is stronger.");
                    }
            }
    }
