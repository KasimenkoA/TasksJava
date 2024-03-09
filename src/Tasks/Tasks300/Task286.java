package Tasks.Tasks300;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task286
    {
        public static void main( String[] args )
            {
                Map<Character,String> map = new HashMap<>();

                Character[] cc = {'à', 'á', 'â', 'ã', 'ä', 'å', '¸', 'æ', 'ç', 'è', 'é', 'ê', 'ë', 'ì', 'í', 'î',
                        'ï', 'ð', 'ñ', 'ò', 'ó', 'ô', 'õ', 'ö', '÷', 'ø', 'ù', 'ú', 'û', 'ü', 'ý', 'þ', 'ÿ', ' '};

                String curSS = "";
                int startIndex;
                for (int i = 0; i < cc.length; i++)
                    {
                        curSS = "0" + Integer.toString( i );
                        startIndex = curSS.length() - 2;
                        curSS = curSS.substring( startIndex );
                        map.put( cc[i], curSS );
                    }

                Scanner scanner = new Scanner(System.in);
                System.out.print("Input string: ");
                String ss = scanner.nextLine().toLowerCase();

                String new_ss = "";
                Character cur_ch;

                for (int i = 0; i < ss.length(); i++)
                    {
                        cur_ch = ss.charAt( i );
                        new_ss = new_ss + map.get( cur_ch );
                    }

                System.out.println(new_ss);
            }
    }
