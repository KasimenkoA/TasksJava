package Tasks.Tasks300;

import java.util.HashMap;
import java.util.Map;

public class Task285
    {
        public static void main( String[] args )
            {
                Map<Character,String> map = new HashMap<>();

                Character[] cc = {'à', 'á', 'â', 'ã', 'ä', 'å', '¸', 'æ', 'ç', 'è', 'é', 'ê', 'ë', 'ì', 'í', 'î',
                        'ï', 'ð', 'ñ', 'ò', 'ó', 'ô', 'õ', 'ö', '÷', 'ø', 'ù', 'ú', 'û', 'ü', 'ý', 'þ', 'ÿ'};

                String curSS = "";
                int startIndex;
                for (int i = 0; i < cc.length; i++)
                    {
                        curSS = "0" + Integer.toString( i );
                        startIndex = curSS.length() - 2;
                        curSS = curSS.substring( startIndex );
                        map.put( cc[i], curSS );
                    }

                for (Map.Entry<Character, String> entry : map.entrySet())
                    {
                        System.out.println("" + entry.getKey() + " - " + entry.getValue());
                    }
            }
    }
