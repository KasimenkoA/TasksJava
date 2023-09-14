package Tasks.Tasks250;

public class Task204
    {
        public static void main( String[] args )
            {
                int[] mas = new int[10];

                for (int i = 0; i < mas.length; i++)
                    {
                        mas[i] = (int) (Math.random()*100);
                        System.out.println(mas[i]);
                    }

                int min = Integer.MAX_VALUE;
                for (int ma : mas)
                    {
                        if (min > ma) min = ma;
                    }
                System.out.println("----");
                System.out.println("Min: " + min);
            }
    }
