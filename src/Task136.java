public class Task136
    {
        public static void main( String[] args )
            {
                Cat cat = new Cat( "Barsic",4 );

                System.out.println(cat.getAge());

                cat.isSleeping = true;
                cat.showInfo();

                cat.isSleeping = false;
                cat.showInfo();
            }
    }

class Cat
    {
        private String name;
        private int age;
        public boolean isSleeping;

        public Cat( String name, int age )
            {
                this.name = name;
                this.age = age;
                this.isSleeping = false;
            }

        public int getAge()
            {
                return age;
            }

        public void setAge( int age )
            {
                this.age = age;
            }

        public void showInfo()
            {
                System.out.println("Cat: " + name + ", age: " + age + ", is sleeping: " + isSleeping);
            }
    }
