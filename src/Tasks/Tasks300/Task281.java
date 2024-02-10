package Tasks.Tasks300;

import java.util.Scanner;

public class Task281
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Input cost of the card: ");
                int nn = scanner.nextInt();

                String card;
                switch (nn) {
                    case 6: card = "Six"; break;
                    case 7: card = "Seven"; break;
                    case 8: card = "Eight"; break;
                    case 9: card = "Nine"; break;
                    case 10: card = "Ten"; break;
                    case 2: card = "Jack"; break;
                    case 3: card = "Queen"; break;
                    case 4: card = "King"; break;
                    case 11: card = "Ace"; break;
                    default: card = "Undefined";
                }

                System.out.println(card);
            }
    }