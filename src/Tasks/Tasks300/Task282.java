package Tasks.Tasks300;

import java.util.ArrayList;
import java.util.Random;

class Pearl
    {
        private String color;
        private Double weight;

        public Pearl( String color, Double weight )
            {
                this.color = color;
                this.weight = weight;
            }

        public String getColor()
            {
                return color;
            }

        public Double getWeight()
            {
                return weight;
            }
    }

public class Task282
    {
        public static void main( String[] args )
            {
                ArrayList<Pearl> list = new ArrayList<>();

                int cc;
                String cc_str;
                Random random_color = new Random();

                Double ww;
                Random random_weight = new Random();

                for (int i = 0; i < 100; i++)
                    {
                        cc_str = "black";
                        cc = random_color.nextInt(2);
                        if (cc == 1) cc_str = "white";

                        ww = random_weight.nextDouble(200.0);

                        System.out.println("Color: " + cc_str + ", Weight: " + ww);
                        list.add( new Pearl( cc_str,ww ) );
                    }
            }
    }
