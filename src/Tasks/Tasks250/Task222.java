package Tasks.Tasks250;

interface Sportsman
    {
        void go();
        void run();
    }

class FootballPlayer implements Sportsman
    {
        @Override
        public void go()
            {
                System.out.println("Football player is coming.");
            }

        @Override
        public void run()
            {
                System.out.println("Football player is runs.");
            }
    }

class HockeyPlayer implements Sportsman
    {
        @Override
        public void go()
            {
                System.out.println("Hockey player is coming.");
            }

        @Override
        public void run()
            {
                System.out.println("Hockey player is runs.");
            }
    }

public class Task222
    {
        public static void main( String[] args )
            {
                FootballPlayer footballPlayer = new FootballPlayer();
                footballPlayer.go();
                footballPlayer.run();

                HockeyPlayer hockeyPlayer = new HockeyPlayer();
                hockeyPlayer.go();
                hockeyPlayer.run();
            }
    }
