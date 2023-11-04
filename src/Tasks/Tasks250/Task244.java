package Tasks.Tasks250;

class Caterpillar
    {
        void showInfo()
            {
                System.out.println("Caterpillar is crawling.");
            }
    }

class SuperÑaterpillar extends Caterpillar
    {
        void showColor()
            {
                System.out.println("Caterpillar is green.");
            }
    }

public class Task244
    {
        public static void main( String[] args )
            {
                Caterpillar caterpillar = new Caterpillar();
                caterpillar.showInfo();

                SuperÑaterpillar superÑaterpillar = new SuperÑaterpillar();
                superÑaterpillar.showInfo();
                superÑaterpillar.showColor();
            }
    }
