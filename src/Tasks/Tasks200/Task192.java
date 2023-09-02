package Tasks.Tasks200;

import java.util.ArrayList;
import java.util.Scanner;

public class Task192
    {
        public static void main( String[] args )
            {
                ArrayList<Character> array1 = new ArrayList<>();
                ArrayList<Character> array2  = new ArrayList<>();

                String ss;
                char ch;

                Scanner scanner = new Scanner(System.in);

                for (int i = 0; i < 10; i++)
                    {
                        System.out.print("Введите символ: ");
                        ss = scanner.nextLine();
                        ch = ss.charAt( 0 );

                        if (Character.isLetter( ch ))
                            {
                                array1.add( ch );
                            }
                        else if (Character.isDigit( ch ))
                            {
                                array2.add( ch );
                            }
                    }

                System.out.println("Letters:");
                for (Character character : array1)
                    {
                        System.out.println(character);
                    }
                System.out.println();

                System.out.println("Digits:");
                for (Character character : array2)
                    {
                        System.out.println(character);
                    }
            }
    }
