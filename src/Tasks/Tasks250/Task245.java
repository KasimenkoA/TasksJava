package Tasks.Tasks250;

class Cart
    {
        private int wheels;

        void showInfo()
            {
                System.out.println("Cart with " + wheels + " wheels.");
            }

        public int getWheels()
            {
                return wheels;
            }

        public void setWheels( int wheels )
            {
                this.wheels = wheels;
            }
    }

class BigCart extends Cart
    {
        @Override
        void showInfo()
            {
                System.out.println("Cart with " + super.getWheels() + " wheels and a roof.");
            }
    }

public class Task245
    {
        public static void main( String[] args )
            {
                Cart cart = new Cart();
                cart.setWheels( 4 );
                cart.showInfo();

                System.out.println();

                BigCart bigCart = new BigCart();
                bigCart.setWheels( 6 );
                bigCart.showInfo();

            }
    }
