package Tasks.Tasks250;

import java.io.FileWriter;
import java.io.IOException;

public class Task211
    {
        public static void main( String[] args ) throws IOException
            {
                FileWriter fw = new FileWriter( "test211.txt" );

                String ss;

                for (int i = 1; i <= 10; i++)
                    {
                        ss = Integer.toString( i );
                        fw.write( ss );
                        fw.write( "\n" );
                    }

                fw.close();
            }
    }
