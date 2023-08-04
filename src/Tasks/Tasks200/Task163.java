package Tasks.Tasks200;

import java.util.ArrayList;
import java.util.Scanner;

public class Task163
    {
        public static void main( String[] args )
            {
                ArrayList<Integer> arrayList = new ArrayList<>();
                
                Scanner scanner = new Scanner(System.in);
                
                int ii;
                do {
                    System.out.print("¬ведите число: ");
                    ii = scanner.nextInt();
                    
                    if (ii>=0) arrayList.add( ii );                    
                } while (ii>=0);

                Integer ss = 0;
                for (Integer integer : arrayList)
                    {
                        ss += integer;
                    }
                System.out.println("—умма: " + ss);
            }
    }
