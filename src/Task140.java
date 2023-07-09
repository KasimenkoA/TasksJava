public class Task140
    {
        public static void main( String[] args )
            {
                MathOperations math1 = new MathOperations( 20, 8 );
                System.out.println(math1.add());
                System.out.println(math1.subtract());
                System.out.println("_____________________________________________");

                MathOperations math2 = new MathOperations( 16, 2 );
                System.out.println(math2.add());
                System.out.println(math2.subtract());
            }
    }

class MathOperations
    {
        private int num1;
        private int num2;

        public MathOperations( int num1, int num2 )
            {
                this.num1 = num1;
                this.num2 = num2;
            }

        public int add()
            {
                return num1 + num2;
            }

        public int subtract()
            {
                return num1 - num2;
            }
    }
