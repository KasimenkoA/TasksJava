package Tasks.Tasks250;

public class Task208
    {
        public static void main( String[] args )
            {
                double a = 5.2;
                double b = 12.8;
                double c = 2.7;

                double d = aver(a,b,c);
                System.out.println(d);
            }

        private static double aver( double a, double b, double c )
            {
                return ((a + b + c)/3);
            }
    }
