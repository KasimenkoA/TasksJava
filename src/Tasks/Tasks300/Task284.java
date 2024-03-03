package Tasks.Tasks300;

import java.util.HashMap;
import java.util.Map;

public class Task284
    {
        public static void main( String[] args )
            {
                Map<Character,Integer> map = new HashMap<>();

                Character[] cc = {'à', 'á', 'â', 'ã', 'ä', 'å', '¸', 'æ', 'ç', 'è', 'é', 'ê', 'ë', 'ì', 'í', 'î',
                                  'ï', 'ð', 'ñ', 'ò', 'ó', 'ô', 'õ', 'ö', '÷', 'ø', 'ù', 'ú', 'û', 'ü', 'ý', 'þ', 'ÿ'};
                for (int i = 0; i < cc.length; i++)
                    {
                        map.put( cc[i], i );
                    }

                for (Map.Entry<Character, Integer> entry : map.entrySet())
                    {
                        System.out.println("" + entry.getKey() + " - " + entry.getValue());
                    }
            }
    }
