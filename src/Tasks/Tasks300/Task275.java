package Tasks.Tasks300;

import java.util.HashMap;
import java.util.Map;

public class Task275
    {
        public static void main( String[] args )
            {
                Map<Double,Double> map = new HashMap<>();
                map.put( 1000.0, 0.01 );
                map.put( 500.0,  0.02 );
                map.put( 200.0,  0.05 );

                Double mm = 0.0;
                for (Map.Entry<Double, Double> entry : map.entrySet())
                    {
                        mm += entry.getKey() * entry.getValue();
                    }

                System.out.println("Mathematical expectation: " + mm);
            }
    }
