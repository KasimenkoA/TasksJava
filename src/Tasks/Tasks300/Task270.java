package Tasks.Tasks300;

import java.util.ArrayList;
import java.util.Scanner;

public class Task270
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner(System.in);

                int count = 0;
                Double sumTime = 0.0;
                Double curTime = 0.0;
                while (true)
                    {
                        System.out.print("Input waiting time: ");
                        curTime = scanner.nextDouble();

                        if (curTime < 0.0) break;

                        sumTime += curTime;
                        count++;
                    }

                Double average = sumTime/count;
                System.out.println("Average: " + average);
            }
    }
