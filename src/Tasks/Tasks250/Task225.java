package Tasks.Tasks250;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Task225
    {
        public static void main( String[] args )
            {
                SortedSet<String> sortedSet = new TreeSet<>();

                Scanner scanner = new Scanner(System.in);
                String ss;

                for (int i = 0; i < 5; i++)
                    {
                        System.out.print("¬ведите им€: ");
                        ss = scanner.nextLine();

                        sortedSet.add( ss );
                    }

                for (String s : sortedSet)
                    {
                        System.out.println(s);
                    }
            }
    }
