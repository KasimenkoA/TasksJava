package Tasks.Tasks200;

import java.util.Random;
import java.util.Scanner;

public class Task168
    {
        public static void main( String[] args )
            {
                int nn;
                Random random = new Random();

                Scanner scanner = new Scanner( System.in );
                String ss;

                while (true)
                    {
                        nn = random.nextInt( 100 );
                        System.out.println( nn );

                        System.out.println( "Продолжить?" );
                        ss = scanner.nextLine().toLowerCase();
                        if (ss.equals( "нет" ))
                            {
                                break;
                            }
                    }
            }
    }
