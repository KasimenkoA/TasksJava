package Draw;

import MyMethods.MyCollections;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrameGlobal extends JFrame
    {
        public static int curX;
        public static int curY;

        PanelDraw panelDraw;
        JButton button1;
        JButton button2;
        JButton button3;
        JButton button4;
        JButton button5;
        JButton button6;
        JButton button7;
        JButton button8;

        public MyFrameGlobal()
            {
                setTitle( "My global frame" );
                setSize( 600, 500 );
                setLocationRelativeTo( null );
                setDefaultCloseOperation( EXIT_ON_CLOSE );

                JPanel panelButton = new JPanel();
                panelButton.setLayout( new GridLayout( 2, 4 ) );

                panelDraw = new PanelDraw();
                panelDraw.setPreferredSize( new Dimension( 600, 400 ) );

                button1 = new JButton( "Button 1" );
//                button1.addActionListener( new ActionListener()
//                    {
//                        @Override
//                        public void actionPerformed( ActionEvent e )
//                            {
//                                panelDraw.drawMyOval();
//                            }
//                    } );
                button1.addActionListener( new MyActionListener() );
                panelButton.add( button1 );

                button2 = new JButton( ("Button 2") );
                button2.addActionListener( new MyActionListener() );
                panelButton.add( button2 );

                button3 = new JButton( ("Button 3") );
                button3.addActionListener( new MyActionListener() );
                panelButton.add( button3 );

                button4 = new JButton( ("Button 4") );
                button4.addActionListener( new MyActionListener() );
                panelButton.add( button4 );

                button5 = new JButton( ("Button 5") );
                button5.addActionListener( new MyActionListener() );
                panelButton.add( button5 );

                button6 = new JButton( ("Button 6") );
                button6.addActionListener( new MyActionListener() );
                panelButton.add( button6 );

                button7 = new JButton( ("Button 7") );
                panelButton.add( button7 );

                button8 = new JButton( ("Button 8") );
                panelButton.add( button8 );


                add( panelButton, BorderLayout.NORTH );
                add( panelDraw, BorderLayout.SOUTH );
            }

        public class MyActionListener implements ActionListener
            {
                @Override
                public void actionPerformed( ActionEvent e )
                    {
                        if (e.getSource() == button1)
                            {
                                panelDraw.drawMyOval();
                            }
                        else if (e.getSource() == button2)
                            {
                                panelDraw.moveOval();
                            }
                        else if (e.getSource() == button3)
                            {
                                panelDraw.rotateRectangle();
                            }
                        else if (e.getSource() == button4)
                            {
                                panelDraw.changeColor();
                            }
                        else if (e.getSource() == button5)
                            {
                                panelDraw.drawArcCircle();
                            }
                        else if (e.getSource() == button6)
                            {
                                panelDraw.CircleToPoint();
                            }
                    }
            }


        public static void main( String[] args )
            {
                MyFrameGlobal frame = new MyFrameGlobal();
                frame.setVisible( true );
            }


        public static class PanelDraw extends JPanel
            {
                public void drawMyOval()
                    {
                        Graphics g = getGraphics();
                        g.setColor( Color.blue );
                        g.fillOval( 200, 150, 90, 80 );
                    }

                public void moveOval()
                    {
                        Graphics g = getGraphics();
                        g.setColor( Color.green );

                        curX = 0;
                        curY = 0;

                        while (true)
                            {
                                g.clearRect( 0, 0, getWidth(), getHeight() );

                                g.fillOval( curX, curY, 90, 80 );
                                try
                                    {
                                        Thread.sleep( 10 );
                                    } catch (InterruptedException e)
                                    {
                                        e.printStackTrace();
                                    }

                                curX++;
                                curY++;

                                if (curX >= getWidth() || curY >= getHeight())
                                    {
                                        break;
                                    }
                            }
                    }

                public void rotateRectangle()
                    {
                        Graphics g = getGraphics();
                        Graphics2D g2d = (Graphics2D) g;
                        g2d.setColor( Color.CYAN );
                        g2d.setRenderingHint( RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON );


                        int rSize = 80;

                        int angle = 0;
                        int angleStep = 1;
                        int count = 0;

                        while (count < 3)
                            {
                                g2d.clearRect( 0, 0, getWidth(), getHeight() );
                                g2d.rotate( Math.toRadians( angleStep ), getWidth() / 2, getHeight() / 2 );
                                g2d.fillRect( getWidth() / 2 - rSize / 2, getHeight() / 2 - rSize / 2, rSize, rSize );

                                try
                                    {
                                        Thread.sleep( 10 );
                                    } catch (InterruptedException e)
                                    {
                                        e.printStackTrace();
                                    }

                                angle += angleStep;
                                if (angle > 360)
                                    {
                                        angle = angleStep;
                                        count++;
                                    }

                            }
                        g2d.clearRect( 0, 0, getWidth(), getHeight() );
                    }

                public void changeColor()
                    {
                        new Thread( () ->
                        {
                            Color curColor = MyCollections.getRandomColor();
                            for (int i = 0; i < 100; i++)
                                {
                                    setBackground( curColor );
                                    try
                                        {
                                            Thread.sleep( 100 );
                                        } catch (InterruptedException e)
                                        {
                                            e.printStackTrace();
                                        }
                                    curColor = MyCollections.getNextRandomColor( curColor );
                                }
                        } ).start();
                    }

                public void drawArcCircle()
                    {
                        Graphics g = getGraphics();

                        g.setColor( Color.red );
                        g.fillArc( 50, 50, 300,300, 0, 90 );

                        g.setColor( Color.green );
                        g.fillArc( 50, 50, 300,300, 90, 90 );

                        g.setColor( Color.blue );
                        g.fillArc( 50, 50, 300,300, 180, 90 );

                        g.setColor( Color.yellow );
                        g.fillArc( 50, 50, 300,300, 270, 90 );
                    }

                public void CircleToPoint()
                    {
                        new Thread( () ->
                        {
                            int size = 100;
                            Graphics g = getGraphics();
                            g.setColor( Color.green );

                            for (int i = 0; i < 100; i++)
                                {
                                    g.fillOval( 100,100, size,size );
                                    try
                                        {
                                            Thread.sleep( 100 );
                                        } catch (InterruptedException e)
                                        {
                                            e.printStackTrace();
                                        }
                                    g.clearRect( 100,100,100,100 );
                                    size--;
                                }
                        } ).start();

                    }
            }

    }
