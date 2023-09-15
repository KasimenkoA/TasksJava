package Tasks.Tasks250;

public class Task205
    {
        public static void main( String[] args )
            {
                int[] mas = new int[10];

                for (int i = 0; i < mas.length; i++)
                    {
                        mas[i] = (int) (Math.random()*100);

                        if (i%2 == 1) System.out.println("Index: " + i + ", element: " + mas[i]);
                    }
            }
    }
