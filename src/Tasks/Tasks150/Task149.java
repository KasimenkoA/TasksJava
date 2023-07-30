package Tasks.Tasks150;

public class Task149
    {
        public static void main( String[] args )
            {
                int i = 1;
                while (++i<=20)
                    {
                        if (i%2==1) continue;

                        System.out.println(i);
                    }
            }
    }
