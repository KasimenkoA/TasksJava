package Tasks.Tasks250;

import java.util.Date;
import java.util.Scanner;

public class Task206
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner(System.in);
                String ss;
                Date date = new Date();

                while (true)
                    {
                        System.out.print("¬ведите строку: ");
                        ss = scanner.nextLine();

                        if (ss.equals( "дата" ))
                            {
                                System.out.println(date);
                            }

                        if (ss.equals( "выход" ))
                            {
                                break;
                            }
                    }
            }
    }
