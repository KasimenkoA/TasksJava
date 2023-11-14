package Tasks.Tasks250;

import java.util.ArrayList;
import java.util.Random;

class Flag251
    {
        private String color1;
        private String color2;
        private String color3;

        public Flag251( String color1, String color2, String color3 )
            {
                this.color1 = color1;
                this.color2 = color2;
                this.color3 = color3;
            }

        public String getColor1()
            {
                return color1;
            }

        public String getColor2()
            {
                return color2;
            }

        public String getColor3()
            {
                return color3;
            }
    }

public class Task251
    {
        public static void main( String[] args )
            {
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add("White");
                arrayList.add("Black");
                arrayList.add("Red");
                arrayList.add("Green");
                arrayList.add("Blue");
                arrayList.add("Yellow");
                arrayList.add("Purple");
                arrayList.add("Pink");
                arrayList.add("Orange");
                arrayList.add("Gray");

                Random random = new Random();

                ArrayList<Flag251> flags = new ArrayList<>();
                for (int i = 0; i < 10; i++)
                    {
                        flags.add( new Flag251( arrayList.get( random.nextInt(10) ),arrayList.get( random.nextInt(10) ),arrayList.get( random.nextInt(10) ) ) );
                    }

                for (Flag251 flag : flags)
                    {
                        System.out.println("" + flag.getColor1() + ", " + flag.getColor2() + ", " + flag.getColor3());
                        System.out.println();
                    }
            }
    }
