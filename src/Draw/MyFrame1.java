package Draw;

import javax.swing.*;
import java.awt.*;


class MyPanel extends JPanel
    {
        @Override
        protected void paintComponent( Graphics g )
            {
                super.paintComponent( g );
                //g.drawOval( 100,100,80,80 );

//                g.drawLine( 100,300,200,100 );
//                g.drawLine( 200,100,300,300 );
//                g.drawLine( 300,300,100,150 );
//                g.drawLine( 100,150,300,150 );
//                g.drawLine( 300,150,100,300 );

                for (int y = 50; y < 250; y += 100)
                    {
                        for (int x = 50; x < 400; x += 150)
                            {
                                g.drawRect( x,y,150,100 );
                            }
                    }

            }
    }
public class MyFrame1 extends JFrame
    {
        public MyFrame1()
            {
                setSize( 600,400 );
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
