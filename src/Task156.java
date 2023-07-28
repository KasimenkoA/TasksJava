public class Task156
    {
        public static void main( String[] args )
            {
                int[] mas = new int[10];
                for (int i = 0; i < mas.length; i++)
                    {
                        mas[i] = i + 1;
                    }

                for (int ii: mas)
                    {
                        System.out.println(ii);
                    }
            }
    }
