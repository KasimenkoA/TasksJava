package Tasks.Tasks100;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task62
    {
        public static void main( String[] args ) throws FileNotFoundException
            {
                JFileChooser jFileChooser = new JFileChooser();
                jFileChooser.showOpenDialog( null );

                File file = jFileChooser.getSelectedFile();
                Scanner scanner = new Scanner(file);
                while (scanner.hasNext())
                    {
                        System.out.println(scanner.nextLine());
                    }
                scanner.close();
            }
    }
