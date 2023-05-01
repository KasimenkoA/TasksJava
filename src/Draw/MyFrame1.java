package Draw;

import javax.swing.*;

public class MyFrame1 extends JFrame
    {
        public MyFrame1()
            {
                setSize( 600,300 );
                setLocationRelativeTo( null );
                setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
                setTitle( "My frame" );
            }

        public static void main( String[] args )
            {
                MyFrame1 myFrame = new MyFrame1();
                myFrame.setVisible( true );
            }
    }
