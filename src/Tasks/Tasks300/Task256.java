package Tasks.Tasks300;

import java.util.Random;

class Gamer256
    {
        private String name;
        private int totalScore;

        public Gamer256( String name )
            {
                this.name = name;
                this.totalScore = 0;
            }

        public String getName()
            {
                return name;
            }

        public int getTotalScore()
            {
                return totalScore;
            }

        public void addPoint()
            {
                this.totalScore = this.totalScore + 1;
            }

        public int getRandomNumber()
            {
                Random random = new Random();
                return random.nextInt(10);
            }
    }

public class Task256
    {
        public static void main( String[] args )
            {
                Gamer256 gamer1 = new Gamer256( "Zachar" );
                Gamer256 gamer2 = new Gamer256( "Vlad" );

                int nn1;
                int nn2;
                for (int i = 0; i < 10; i++)
                    {
                        nn1 = gamer1.getRandomNumber();
                        System.out.println("" + gamer1.getName() + " " + nn1);
                        nn2 = gamer2.getRandomNumber();
                        System.out.println("" + gamer2.getName() + " " + nn2);

                        if (nn1 > nn2)
                            {
                                gamer1.addPoint();
                                System.out.println("The gamer " + gamer1.getName() + " got a point.");
                            }
                        else if (nn1 < nn2)
                            {
                                gamer2.addPoint();
                                System.out.println("The gamer " + gamer2.getName() + " got a point.");
                            }
                        else
                            {
                                System.out.println("Draw.");
                            }
                        System.out.println();
                    }

                System.out.println("Gamer " + gamer1.getName() + " - " + gamer1.getTotalScore());
                System.out.println("Gamer " + gamer2.getName() + " - " + gamer2.getTotalScore());

                if (gamer1.getTotalScore() > gamer2.getTotalScore())
                    {
                        System.out.println("Gamer " + gamer1.getName() + " won!");
                    }
                else if (gamer1.getTotalScore() < gamer2.getTotalScore())
                    {
                        System.out.println("Gamer " + gamer2.getName() + " won!");
                    }
                else
                    {
                        System.out.println("Draw!");
                    }

            }
    }
