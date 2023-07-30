package Tasks.Tasks50;

public class Task34
    {
        public static void main( String[] args )
            {
                Animal animal1 = new Animal();
                animal1.name = "dog";
                animal1.age = 3;

                Animal animal2 = new Animal();
                animal2.name = "cat";
                animal2.age = 1;

                System.out.println("" + animal1.name + " and " + animal2.name);
            }
    }

class Animal
    {
        String name;
        int age;
    }
