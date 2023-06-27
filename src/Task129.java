public class Task129
    {
        public static void main( String[] args )
            {
                User user1 = new User( "Vova", 10, "Beiker street, 7-1" );
                User user2 = new User( "Oleg", 12, "Central, 5-13" );
                User user3 = new User( "Tania", 8, "Progressive, 4-20" );

                user1.showInfo();
                user2.showInfo();
                user3.showInfo();
            }
    }

class User
    {
        private String name;
        private int age;
        private String adress;

        public User( String name, int age, String adress )
            {
                this.name = name;
                this.age = age;
                this.adress = adress;
            }

        public String getName()
            {
                return name;
            }

        public int getAge()
            {
                return age;
            }

        public String getAdress()
            {
                return adress;
            }

        public void showInfo()
        {
            System.out.println("Name: " + getName() + ", age: " + getAge() + ", adress: " + getAdress() + ".");
        }
    }
