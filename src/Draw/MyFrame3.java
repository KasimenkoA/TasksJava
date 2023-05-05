package Draw;

import javax.swing.*;
import java.awt.*;

class MyPanel3 extends JPanel
    {
        @Override
        protected void paintComponent( Graphics g )
            {
                super.paintComponent( g );

                int[] masx = new int[3];
                masx[0] = 100;
                masx[1] = 250;
                masx[2] = 400;

                int[] masy = new int[3];
                masy[0] = 300;
                masy[1] = 100;
                masy[2] = 300;

                Polygon pol = new Polygon(masx,masy,3);

                g.setColor( Color.green );
                g.drawPolygon( pol );
            }
    }

public class MyFrame3 extends JFrame
    {
        public MyFrame3()
            {
                setSize( 600,400 );
                setLocationRelativeTo( null );
                setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
                setTitle( "My frame" );
            }

        public static void main( String[] args )
            {
                MyFrame3 myFrame = new MyFrame3();

                MyPanel3 myPanel = new MyPanel3();
                myFrame.add( myPanel );

                myFrame.setVisible( true );

            }
    }
