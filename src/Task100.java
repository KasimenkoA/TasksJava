import java.io.IOException;

public class Task100
    {
        public static void main( String[] args ) throws IOException
            {
                String command = "C:\\Program Files (x86)\\Winamp\\winamp.exe";
                String playlist = "E:\\My music\\Playlist\\ЎахматыЅлицЅыстрые.m3u";
                ProcessBuilder pb = new ProcessBuilder(command , playlist);
                pb.start();

                command = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe";
                String address = "https://lichess.org";
                pb = new ProcessBuilder(command, "-url", address);
                pb.start();
            }
    }
