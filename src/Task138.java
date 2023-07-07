public class Task138
    {
        public static void main( String[] args )
            {
                PetAnimal petAnimal = new PetAnimal( "Cow" );
                petAnimal.makeSound();
            }
    }

class PetAnimal
    {
        private String name;

        public PetAnimal( String name )
            {
                this.name = name;
            }

        public void makeSound()
            {
                System.out.println("The " + name + " makes a sound");
            }
    }
