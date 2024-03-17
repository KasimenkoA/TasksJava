package Tasks.Tasks300;

import javax.swing.*;

public class Task288
    {
        public static void main( String[] args )
            {
                String name = JOptionPane.showInputDialog( "What is your name?" );
                System.out.println(name);

                int age = Integer.parseInt( JOptionPane.showInputDialog( "How old are you?" ) );
                System.out.println(age);

                double height = Double.parseDouble( JOptionPane.showInputDialog( "What is your height?" ) );
                System.out.println(height);

                System.exit( 0 );
            }
    }
