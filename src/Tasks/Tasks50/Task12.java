package Tasks.Tasks50;

public class Task12
    {
        public static void main( String[] args )
            {
                int[] mas = new int[3];

                mas[0] = 2;
                mas[1] = 0;
                mas[2] = 1;

                for (int i = 0; i < mas.length; i++)
                    {
                        if (mas[i] == 0) System.out.println("Белый");
                        else if (mas[i] == 1) System.out.println("Синий");
                        else if (mas[i] == 2) System.out.println("Красный");
                    }
            }
    }
