package Tasks.Tasks200;

import java.util.Scanner;

public class Task182
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Какой у вас рост в сантиметрах? ");
                int nn = scanner.nextInt();

                String ss = (nn>175)? "У вас высокий рост!" : "У вас не высокий рост.";
                System.out.println(ss);
            }
    }
