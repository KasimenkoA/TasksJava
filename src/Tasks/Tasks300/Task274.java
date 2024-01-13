package Tasks.Tasks300;

import java.util.Scanner;

public class Task274
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Input number: ");
                int nn = scanner.nextInt();

                String ss;
                switch (nn)
                    {
                        case 1: ss = "diadem";
                        break;
                        case 2: ss = "mirror";
                        break;
                        default: ss = "flower";
                    }

                System.out.println(ss);
            }
    }
