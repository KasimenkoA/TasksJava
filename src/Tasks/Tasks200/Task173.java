package Tasks.Tasks200;

public class Task173
    {
        public static void main( String[] args )
            {
                int nn;
                for (int i = 0; i < 10; i++)
                    {
                        nn = (int) (Math.random()*100);
                        if (nn > 50) continue;

                        System.out.println(nn);
                    }
            }
    }
