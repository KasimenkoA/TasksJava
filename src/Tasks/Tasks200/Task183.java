package Tasks.Tasks200;

import java.util.Scanner;

public class Task183
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Сколько вам лет?");
                int nn = scanner.nextInt();

                String ss = (nn<18)? "Вам еще рано работать." : "Можно начать работать!";
                System.out.println(ss);
            }
    }
