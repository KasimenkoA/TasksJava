package Tasks.Tasks250;

class Caterpillar
    {
        void showInfo()
            {
                System.out.println("Caterpillar is crawling.");
            }
    }

class Super�aterpillar extends Caterpillar
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

                Super�aterpillar super�aterpillar = new Super�aterpillar();
                super�aterpillar.showInfo();
                super�aterpillar.showColor();
            }
    }
