public class Task130
    {
        public static void main( String[] args )
            {
                Rectangle[] mas = new Rectangle[3];

                mas[0] = new Rectangle( 10,30 );
                mas[1] = new Rectangle( 31,14 );
                mas[2] = new Rectangle( 43,17 );

                for (int i = 0; i < mas.length; i++)
                    {
                        mas[i].getInfo();
                    }
            }
    }

class Rectangle
    {
        int length;
        int width;

        public Rectangle( int length, int width )
            {
                this.length = length;
                this.width = width;
            }

        private int getSquare()
        {
            return this.length * this.width;
        }

        public void getInfo()
            {
                System.out.println("Square: " + getSquare());
            }
    }
