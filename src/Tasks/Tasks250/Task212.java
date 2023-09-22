package Tasks.Tasks250;

import java.io.FileReader;
import java.io.IOException;

public class Task212
    {
        public static void main( String[] args ) throws IOException
            {
                FileReader fr = new FileReader( "test211.txt" );
                int ii;

                while ((ii = fr.read()) != -1)
                {
                    System.out.println(ii);
                }

                fr.close();
            }
    }
