package Tasks.Tasks150;

public class Task131
    {
        public static void main( String[] args )
            {
                Dog dog1 = new Dog( "Bobic","boxer",7 );
                Dog dog2 = new Dog( "Tarzan","setter",37 );
                Dog dog3 = new Dog( "Mavr","diver",28 );

                dog1.showInfo();
                dog2.showInfo();
                dog3.showInfo();
            }
    }

class Dog
    {
        String name;
        String breed;
        int age;

        public Dog( String name, String breed, int age )
            {
                this.name = name;
                this.breed = breed;
                this.age = age;
            }

        public boolean isPuppy()
            {
                return (this.age<12);
            }

        public void showInfo()
            {
                System.out.println("Tasks.Tasks150.Dog: " + name + ", breed: " + breed + ", age: " + age + ".");
                if (isPuppy())
                    {
                        System.out.println("It is puppy.");
                    }
                else
                    {
                        System.out.println("It's not a putty.");
                    }
            }
    }
