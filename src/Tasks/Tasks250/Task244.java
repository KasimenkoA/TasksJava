package Tasks.Tasks250;

class Caterpillar
    {
        void showInfo()
            {
                System.out.println("Caterpillar is crawling.");
            }
    }

class SuperŅaterpillar extends Caterpillar
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

                SuperŅaterpillar superŅaterpillar = new SuperŅaterpillar();
                superŅaterpillar.showInfo();
                superŅaterpillar.showColor();
            }
    }
