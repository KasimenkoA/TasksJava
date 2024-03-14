package Tasks.Tasks300;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task287
    {
        public static void main( String[] args )
            {
                Map<String,Character> map = new HashMap<>();

                Character[] cc = {'à', 'á', 'â', 'ã', 'ä', 'å', '¸', 'æ', 'ç', 'è', 'é', 'ê', 'ë', 'ì', 'í', 'î',
                        'ï', 'ð', 'ñ', 'ò', 'ó', 'ô', 'õ', 'ö', '÷', 'ø', 'ù', 'ú', 'û', 'ü', 'ý', 'þ', 'ÿ', ' '};

                String curSS = "";
                int startIndex;
                for (int i = 0; i < cc.length; i++)
                    {
                        curSS = "0" + Integer.toString( i );
                        startIndex = curSS.length() - 2;
                        curSS = curSS.substring( startIndex );
                        map.put( curSS, cc[i] );
                    }

                Scanner scanner = new Scanner(System.in);
                System.out.print("Input string: ");
                String ss = scanner.nextLine().toLowerCase();

                String new_ss = "";

                int ii = 1;
                while (ii <= ss.length())
                    {
                        curSS = ss.substring( ii-1,ii+1 );
                        new_ss = new_ss + map.get( curSS ).toString();

                        ii += 2;
                    }

                System.out.println(new_ss);
            }
    }
