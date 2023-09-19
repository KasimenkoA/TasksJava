package Tasks.Tasks250;

import java.util.Random;

public class Task209
    {
        public static void main( String[] args )
            {
                Random random = new Random();
                double aa = random.nextDouble(10);
                double bb = random.nextDouble(10);

                System.out.println(aa);
                System.out.println(bb);
                System.out.println();

                double cc;

                if (aa>bb)
                    {
                        cc = Math.pow( aa,bb );
                    }
                else
                    {
                        cc = Math.pow( bb,aa );
                    }
                System.out.println(cc);
            }
    }
