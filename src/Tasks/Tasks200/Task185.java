package Tasks.Tasks200;

import java.util.Scanner;

public class Task185
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Введите ваше имя: ");
                String ss = scanner.nextLine();

                String aa = (ss.startsWith( "А" ))?"Ваше имя начинается на букву А" : "Ваше имя не начинается на букву А";
                System.out.println(aa);
            }
    }
