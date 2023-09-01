package Tasks.Tasks200;

import java.util.Scanner;

public class Task191
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner(System.in);
                String ss;
                char ch;
                int nn;

                while (true)
                    {
                        System.out.print("Введите цифру: ");
                        ss = scanner.nextLine();

                        ch = ss.charAt( 0 );
                        if (Character.isLetter( ch ))
                            {
                                System.out.println("Это не цифра!");
                                break;
                            }

                        nn = Character.getNumericValue( ch );
                        nn *= nn;
                        System.out.println(nn);
                    }
            }
    }
