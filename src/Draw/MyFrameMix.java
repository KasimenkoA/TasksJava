package Draw;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;

public class MyFrameMix extends JFrame
    {
        PanelDraw panelDraw;
        JButton button1;
        Shape tempShape;
        ArrayList<Shape> shapes = new ArrayList<>();
        int startX;
        int startY;
        int endX;
        int endY;

        public MyFrameMix()
            {
                setTitle( "My frame Mix" );
                setSize( 600, 500 );
                setLocationRelativeTo( null );
                setDefaultCloseOperation( EXIT_ON_CLOSE );

                JPanel panelButton = new JPanel();
                panelButton.setLayout( new GridLayout( 2, 4 ) );

                panelDraw = new PanelDraw();
                panelDraw.setPreferredSize( new Dimension( 600, 400 ) );
                panelDraw.addMouseListener( new MyMouseAdapter() );
                panelDraw.addMouseMotionListener( new MyMouseMotionListener() );

                button1 = new JButton( "Button 1" );
                button1.addActionListener( new MyActionListener() );
                panelButton.add( button1 );

                add( panelButton, BorderLayout.NORTH );
                add( panelDraw, BorderLayout.SOUTH );

                startX = 0;
                startY = 0;
                endX = 0;
                endY = 0;
            }

        public class MyMouseAdapter extends MouseAdapter
            {
                @Override
                public void mousePressed( MouseEvent e )
                    {
                        startX = e.getX();
                        startY = e.getY();
                    }

                @Override
                public void mouseReleased( MouseEvent e )
                    {
                        endX = e.getX();
                        endY = e.getY();

                        shapes.add( getFigure() );
                        repaint();
                    }
            }

        public class MyMouseMotionListener extends MouseMotionAdapter
            {
                @Override
                public void mouseDragged( MouseEvent e )
                    {
                        endX = e.getX();
                        endY = e.getY();

                        tempShape = getFigure();
                        repaint();
                    }
            }


        private Shape getFigure()
            {
                int minX = Math.min( startX, endX );
                int minY = Math.min( startY, endY );
                int maxX = Math.max( startX, endX );
                int maxY = Math.max( startY, endY );

                Ellipse2D ellipse2D = new Ellipse2D.Double( minX, minY, maxX - minX, maxY - minY );
                return ellipse2D;
            }

        private class PanelDraw extends JPanel
            {
                @Override
                public void paint( Graphics g )
                    {
                        Graphics2D g2 = (Graphics2D) g;

                        if (tempShape != null)
                            {
                                g2.draw( tempShape );
                            }

                        for (Shape shape : shapes)
                            {
                                g2.draw( shape );
                            }
                    }

                private void fillBackground()
                    {
                        setBackground( Color.PINK );
                    }
            }

        public class MyActionListener implements ActionListener
            {
                @Override
                public void actionPerformed( ActionEvent e )
                    {
                        if (e.getSource() == button1)
                            {
                                panelDraw.fillBackground();
                            }
                    }
            }

        public static void main( String[] args )
            {
                MyFrameMix frame = new MyFrameMix();
                frame.setVisible( true );
            }
    }
