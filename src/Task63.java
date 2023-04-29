import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Task63
    {
        public static void main( String[] args ) throws IOException
            {
                FileWriter fw = new FileWriter( "Out1.txt" );
                BufferedWriter bw = new BufferedWriter( fw );

                bw.write( "apple\n" );
                bw.write( "pear" );

                bw.close();
            }
    }
