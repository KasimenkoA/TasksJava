public class Task128
    {
        public static void main( String[] args )
            {
                Car car1 = new Car( "Toyota",1991,"gray" );
                Car car2 = new Car( "Nissan",2004,"black" );
                Car car3 = new Car( "Mercedes",2050,"coral" );

                car1.showInfo();
                car2.showInfo();
                car3.showInfo();
            }
    }

class Car
    {
        private String make;
        private int year;
        private String color;

        public Car( String make, int year, String color )
            {
                this.make = make;
                this.year = year;
                this.color = color;
            }

        public String getMake()
            {
                return make;
            }

        public int getYear()
            {
                return year;
            }

        public String getColor()
            {
                return color;
            }

        public void showInfo()
            {
                System.out.println("Car: " + getMake() + ". Year: " + getYear() + ". Color: " + getColor());
            }
    }
