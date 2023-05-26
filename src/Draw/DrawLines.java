package Draw;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class DrawLines extends JFrame
    {
        int startX;
        int startY;
        int endX;
        int endY;

        ArrayList<MyLine> myLines;

        private class MyLine
            {
                int startX;
                int startY;
                int endX;
                int endY;

                public MyLine( int startX, int startY, int endX, int endY )
                    {
                        this.startX = startX;
                        this.startY = startY;
                        this.endX = endX;
                        this.endY = endY;
                    }
            }

        public DrawLines()
            {
                setTitle( "Draw lines" );
                setSize( 600, 500 );
                setLocationRelativeTo( null );
                setDefaultCloseOperation( EXIT_ON_CLOSE );

                myLines = new ArrayList<>();

                JPanel panel = new JPanel()
                    {
                        @Override
                        protected void paintComponent( Graphics g )
                            {
                                super.paintComponent( g );

                                g.setColor( Color.blue );
                                g.drawLine( startX, startY, endX, endY );

                                for (MyLine myLine : myLines)
                                    {
                                        g.drawLine( myLine.startX, myLine.startY, myLine.endX, myLine.endY );
                                    }
                            }
                    };

                MouseListener mouseListener = new MouseAdapter()
                    {
                        @Override
                        public void mousePressed( MouseEvent e )
                            {
                                startX = e.getX();
                                startY = e.getY();
                                endX = startX;
                                endY = startY;
                            }

                        @Override
                        public void mouseReleased( MouseEvent e )
                            {
                                endX = e.getX();
                                endY = e.getY();

                                myLines.add( new MyLine( startX,startY,endX,endY ) );
                                panel.repaint();
                            }

                    };

                MouseMotionListener mouseMotionListener = new MouseMotionAdapter()
                    {
                        @Override
                        public void mouseDragged( MouseEvent e )
                            {
                                super.mouseDragged( e );
                                endX = e.getX();
                                endY = e.getY();
                                panel.repaint();
                            }
                    };

                panel.addMouseListener( mouseListener );
                panel.addMouseMotionListener( mouseMotionListener );

                add( panel );
            }


        public static void main( String[] args )
            {
                DrawLines frame = new DrawLines();
                frame.setVisible( true );
            }
    }
