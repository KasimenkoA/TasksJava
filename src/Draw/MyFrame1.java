package Draw;

import javax.swing.*;
import java.awt.*;

class MyPanel extends JPanel
    {
        @Override
        protected void paintComponent( Graphics g )
            {
                super.paintComponent( g );
                g.drawOval( 100,100,80,80 );
            }
    }

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

                MyPanel myPanel = new MyPanel();
                myFrame.add( myPanel );

                myFrame.setVisible( true );
            }
    }
