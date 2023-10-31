package Tasks.Tasks250;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Task242
    {
        public static void main( String[] args ) throws IOException
            {
                URL url = new URL( "https://www.google.com" );
                URLConnection urlConnection = url.openConnection();

                BufferedReader in = new BufferedReader( new InputStreamReader( urlConnection.getInputStream() ) );

                String str;
                while ((str = in.readLine()) != null)
                    {
                        System.out.println(str);
                    }
            }
    }
