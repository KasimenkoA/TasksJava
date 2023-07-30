package Tasks.Tasks100;

import School.Pupil;

import java.util.Scanner;

public class Task53
    {
        public static void main( String[] args )
            {
                Pupil pupil = new Pupil();

                Scanner scanner = new Scanner( System.in );

                System.out.print("¬ведите им€ ученика: ");
                pupil.name = scanner.nextLine();

                System.out.print("¬ведите возраст ученика: ");
                pupil.age = scanner.nextInt();

                pupil.getInfo();
            }
    }


