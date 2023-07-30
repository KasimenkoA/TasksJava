package Tasks.Tasks200;

public class Task155
    {
        public static void main( String[] args )
            {
                int a1 = 0;
                int a2 = 1;
                int ff;

                for (int i = 0; i < 30; i++)
                    {
                        ff = a1 + a2;
                        System.out.println(ff);
                        a1 = a2;
                        a2 = ff;
                    }
            }
    }
