public class Task137
    {
        public static void main( String[] args )
            {
                MiniCar miniCar = new MiniCar( "Citroen" );
                miniCar.drive();
            }
    }

class MiniCar
    {
        private String make;

        public MiniCar( String make )
            {
                this.make = make;
            }

        public void drive()
        {
            System.out.println("I'm driving a " + make + ".");
        }
    }
