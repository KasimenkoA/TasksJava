package Tasks.Tasks300;

import java.util.HashMap;
import java.util.Map;

public class Task284
    {
        public static void main( String[] args )
            {
                Map<Character,Integer> map = new HashMap<>();

                Character[] cc = {'�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�',
                                  '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�'};
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
