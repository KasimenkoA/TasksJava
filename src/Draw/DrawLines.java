package Draw;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DrawLines extends JFrame
    {
        int startX;
        int startY;
        int endX;
        int endY;

        public DrawLines()
            {
                setTitle( "Draw lines" );
                setSize( 600, 500 );
                setLocationRelativeTo( null );
                setDefaultCloseOperation( EXIT_ON_CLOSE );

                JPanel panel = new JPanel()
                    {
                        @Override
                        protected void paintComponent( Graphics g )
                            {
                                super.paintComponent( g );

                                g.setColor( Color.blue );
                                g.drawLine( startX, startY, endX, endY );
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
