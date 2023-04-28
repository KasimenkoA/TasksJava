import MyMethods.MyCollections;
import School.Pupil;

import java.util.Random;

public class Task47
    {
        public static void main( String[] args )
            {
                int nn;
                Random random = new Random();

                Pupil pupil = new Pupil();
                String[] names = MyCollections.getPupilsNames();

                nn = random.nextInt(names.length);
                pupil.name = names[nn];
                pupil.age = MyCollections.getRandomFromTo( 8,15 );

                System.out.println("Ученик " + pupil.name + ", возраст " + pupil.age + " лет.");
            }
    }
