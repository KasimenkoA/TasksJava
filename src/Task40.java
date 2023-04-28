import MyMethods.MyCollections;

import java.util.Random;

public class Task40
    {
        public static void main( String[] args )
            {
                String[] mas = MyCollections.getPupilsNames();

                Random random = new Random();
                int nn = random.nextInt(20);

                String name = mas[nn];
                int age = random.nextInt(6) + 10;

                System.out.println("Ученик " + name + ". Ему " + age + " лет.");
            }
    }
