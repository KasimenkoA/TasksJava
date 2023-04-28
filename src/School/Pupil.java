package School;

import MyMethods.MyCollections;

import java.util.Random;

public class Pupil
    {
        public String name;
        public int age;
        public Bag bag;

        public Pupil()
            {
                String[] names = MyCollections.getPupilsNames();
                int nn;
                Random random = new Random();
                nn = random.nextInt(names.length);

                this.name = names[nn];
                this.age = MyCollections.getRandomFromTo( 8,14 );
                this.bag = MyCollections.getRandomBag();
            }
        public Pupil(String name, int age)
            {
                this.name = name;
                this.age = age;
            }

        public void getInfo()
            {
                System.out.println("Ученик " + this.name + ", возраст " + this.age + " лет.");
                this.bag.getInfo();
            }
    }
