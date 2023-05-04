package Draw;

import javax.swing.*;
import java.awt.*;

class MyPanel2 extends JPanel
    {
        @Override
        protected void paintComponent( Graphics g )
            {
                super.paintComponent( g );

                int[] masx = new int[5];
                int[] masy = new int[5];

                masx[0] = 100;
                masx[1] = 250;
                masx[2] = 400;
                masx[3] = 100;
                masx[4] = 400;

                masy[0] = 300;
                masy[1] = 100;
                masy[2] = 300;
                masy[3] = 150;
                masy[4] = 150;

                Polygon pol = new Polygon(masx,masy,5);

                g.drawPolygon( pol );
            }
    }

public class MyFrame2 extends JFrame
    {
        public MyFrame2()
            {
                setSize( 600,400 );
                setLocationRelativeTo( null );
                setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
                setTitle( "My frame" );
            }

        public static void main( String[] args )
            {
                MyFrame2 myFrame = new MyFrame2();

                MyPanel2 myPanel = new MyPanel2();
                myFrame.add( myPanel );

                myFrame.setVisible( true );
            }
    }
