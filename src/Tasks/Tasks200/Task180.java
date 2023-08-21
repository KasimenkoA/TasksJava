package Tasks.Tasks200;

import java.util.Scanner;

public class Task180
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner(System.in);
                System.out.print("¬ведите мес€ц рождени€: ");
                String ss = scanner.nextLine().toLowerCase();

                switch (ss)
                    {
                        case "декабрь":
                        case "€нварь":
                        case "февраль":
                            System.out.println("«има");
                            break;
                        case "март":
                        case "апрель":
                        case "май":
                            System.out.println("¬есна");
                            break;
                        case "июнь":
                        case "июль":
                        case "август":
                            System.out.println("Ћето");
                            break;
                        case "сент€брь":
                        case "окт€брь":
                        case "но€брь":
                            System.out.println("ќсень");
                            break;
                        default:
                            System.out.println("Ќе определено");
                    }
            }
    }
