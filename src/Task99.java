import java.io.IOException;

public class Task99
    {
        public static void main( String[] args ) throws IOException
            {
                ProcessBuilder pb = new ProcessBuilder( "notepad.exe" );
                pb.start();

                String command = "C:\\Program Files\\Mozilla Firefox\\firefox.exe";
                String address = "https://lichess.org";
                pb = new ProcessBuilder(command, "-url", address);
                pb.start();

            }
    }
