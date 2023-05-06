package Draw;

import javax.swing.*;
import java.awt.*;

class MyPanel4 extends JPanel
    {
        @Override
        protected void paintComponent( Graphics g )
            {
                super.paintComponent( g );

                int[] x1 = {300,100,300};
                int[] y1 = {50,150,150};
                g.setColor( Color.yellow );
                //g.drawPolygon( x1,y1,3 );
                g.fillPolygon( x1,y1,3 );

                int[] x2 = {300,100,300};
                int[] y2 = {200,300,300};
                g.setColor( Color.green );
                //g.drawPolygon( x2,y2,3 );
                g.fillPolygon( x2,y2,3 );

                int[] x3 = {400,400,500};
                int[] y3 = {50,300,50};
                g.setColor( Color.red );
                //g.drawPolygon( x3,y3,3 );
                g.fillPolygon( x3,y3,3 );
            }
    }

public class MyFrame4 extends JFrame
    {
        public MyFrame4()
            {
                setSize( 600,400 );
                setLocationRelativeTo( null );
                setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
                setTitle( "My frame" );
            }

        public static void main( String[] args )
            {
                MyFrame4 myFrame = new MyFrame4();

                MyPanel4 myPanel = new MyPanel4();
                myFrame.add( myPanel );

                myFrame.setVisible( true );
            }
    }
