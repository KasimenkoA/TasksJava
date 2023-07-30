package Tasks.Tasks100;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task61
    {
        public static void main( String[] args ) throws FileNotFoundException
            {
                File file = new File( "Test1.txt" );

                Scanner scanner = new Scanner(file);
                while (scanner.hasNext())
                    {
                        System.out.println(scanner.nextLine());
                    }
                scanner.close();

            }
    }
