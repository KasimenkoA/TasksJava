package Tasks.Tasks200;

import java.util.Scanner;

public class Task194
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner(System.in);
                System.out.print("� ����� ������ �� ������? ");
                String ss = scanner.nextLine();

                char ch;

                for (int i = 0; i < ss.length(); i++)
                    {
                        ch = ss.charAt( i );
                        if (Character.isUpperCase( ch ))
                            {
                                System.out.println("�� ������ � ������ " + ss.substring( i ) + ".");
                                break;
                            }
                    }
            }
    }
