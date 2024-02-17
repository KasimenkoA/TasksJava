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

                int ww_count = 0;
                int bb_count = 0;
                Double ww_sum = 0.0;
                Double bb_sum = 0.0;

                for (Pearl pearl : list)
                    {
                        if (pearl.getColor().equals( "white" ))
                            {
                                ww_count++;
                                ww_sum += pearl.getWeight();
                            }
                        else
                            {
                                bb_count++;
                                bb_sum += pearl.getWeight();
                            }
                    }

                long ww_avg = Math.round( ww_sum/ww_count );
                long bb_avg = Math.round( bb_sum/ww_count );

                System.out.println("White sum: " + ww_sum);
                System.out.println("Black sum: " + bb_sum);
                System.out.println("White avg: " + ww_avg);
                System.out.println("Black avg: " + bb_avg);
            }
    }
