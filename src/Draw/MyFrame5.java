package Draw;

import javax.swing.*;
import java.awt.*;

class MyPanel5 extends JPanel
    {
        @Override
        protected void paintComponent( Graphics g )
            {
                super.paintComponent( g );

                g.setColor( Color.blue );
                g.drawString( "My string", 50,100 );
            }
    }

public class MyFrame5 extends JFrame
    {
        public MyFrame5()
            {
                setSize( 600,400 );
                setLocationRelativeTo( null );
                setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
                setTitle( "My frame" );
            }

        public static void main( String[] args )
            {
                MyFrame5 myFrame = new MyFrame5();

                MyPanel5 myPanel = new MyPanel5();
                myFrame.add( myPanel );

                myFrame.setVisible( true );

            }
    }
