package Tasks.Tasks200;

import java.util.Scanner;

public class Task172
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner(System.in);
                String ss;

                for (int i = 0; i < 5; i++)
                    {
                        System.out.print("������� �������� �����: ");
                        ss = scanner.nextLine();
                        if (ss.startsWith( "�" )) continue;

                        System.out.println("����� " + ss + ".");
                    }
            }
    }
