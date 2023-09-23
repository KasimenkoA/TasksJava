package Tasks.Tasks250;

import java.io.File;

public class Task213
    {
        public static void main( String[] args )
            {
                File file = new File( "C:\\" );
                String[] mas = file.list();

                for (String mm: mas)
                    {
                        System.out.println(mm);
                    }
            }
    }
