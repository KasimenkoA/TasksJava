package Draw;

import MyMethods.MyCollections;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MyFrameGlobal3 extends JFrame
    {
        PanelDraw panelDraw;
        JButton button1;
        JButton button2;
        JButton button3;
        JButton button4;
        JButton button5;
        JButton button6;
        JButton button7;
        JButton button8;

        public MyFrameGlobal3()
            {
                setTitle( "My global frame 3" );
                setSize( 600, 500 );
                setLocationRelativeTo( null );
                setDefaultCloseOperation( EXIT_ON_CLOSE );

                JPanel panelButton = new JPanel();
                panelButton.setLayout( new GridLayout( 2, 4 ) );

                panelDraw = new PanelDraw();
                panelDraw.setPreferredSize( new Dimension( 600, 400 ) );

                button1 = new JButton( "Button 1" );
                button1.addActionListener( new MyActionListener());
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
                panelButton.add( button6 );

                button7 = new JButton( ("Button 7") );
                panelButton.add( button7 );

                button8 = new JButton( ("Button 8") );
                panelButton.add( button8 );


                add( panelButton, BorderLayout.NORTH );
                add( panelDraw, BorderLayout.SOUTH );

                ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
                service.scheduleWithFixedDelay( new PanelRepaint(), 100,50, TimeUnit.MILLISECONDS );
            }

        public class PanelRepaint implements Runnable
            {
                @Override
                public void run()
                    {
                        panelDraw.repaint();
                    }
            }

        public class MyActionListener implements ActionListener
            {
                @Override
                public void actionPerformed( ActionEvent e )
                    {
                        if (e.getSource() == button1)
                            {
                                panelDraw.drawCircle();
                            }
                        else if (e.getSource() == button2)
                            {
                                panelDraw.drawCircles();
                            }
                        else if (e.getSource() == button3)
                            {
                                panelDraw.changeColor();
                            }
                        else if (e.getSource() == button4)
                            {
                                panelDraw.setRandomPuls();
                            }
                        else if (e.getSource() == button5)
                            {
                                panelDraw.goAway();
                            }
                    }
            }

        public static class MyCircle
            {
                private Ellipse2D circle;
                private Color color;
                private double stepX;
                private double stepY;
                private double pulse;
                private int pulseCount;


                public MyCircle( Ellipse2D circle, Color color, double stepX, double stepY )
                    {
                        this.circle = circle;
                        this.color = color;
                        this.stepX = stepX;
                        this.stepY = stepY;
                        this.pulse = 0;
                        this.pulseCount = 0;
                    }
            }


        public static class PanelDraw extends JPanel
            {
                private ArrayList<MyCircle> myCircles;

                public PanelDraw()
                    {
                        myCircles = new ArrayList<>();
                    }

                @Override
                protected void paintComponent( Graphics g )
                    {
                        super.paintComponent( g );

                        Graphics2D g2d = (Graphics2D) g;
                        double curX;
                        double curY;
                        double curSize;

                        for (MyCircle myCircle : myCircles)
                            {
                                g2d.setColor( myCircle.color );
                                g2d.fill( myCircle.circle );

                                curX = myCircle.circle.getX() + myCircle.stepX;
                                if (curX>=this.getWidth() || curX<=0 )
                                    {
                                        curX = myCircle.circle.getX();
                                        myCircle.stepX = -myCircle.stepX;
                                    }

                                curY = myCircle.circle.getY() + myCircle.stepY;
                                if (curY>=this.getHeight() || curY<=0 )
                                    {
                                        curY = myCircle.circle.getY();
                                        myCircle.stepY = -myCircle.stepY;
                                    }

                                curSize = myCircle.circle.getWidth();

                                curSize -= myCircle.pulse;
                                if (curSize<1) curSize=1;

                                myCircle.pulseCount = myCircle.pulseCount + 1;
                                if (myCircle.pulseCount >= 10)
                                    {
                                        myCircle.pulse = -myCircle.pulse;
                                        myCircle.pulseCount = 0;
                                    }


                                myCircle.circle.setFrame( curX,curY,curSize,curSize );
                            }
                    }

                public void drawCircle()
                    {
                        Ellipse2D ellipse2D = new Ellipse2D.Double(100,100,80,80);
                        myCircles.add( new MyCircle( ellipse2D, Color.BLUE,0, 0 ) );

                        repaint();
                    }

                public void drawCircles()
                    {
                        double x;
                        double y;
                        double size;
                        double stepX;
                        double stepY;
                        Color color;

                        for (int i = 0; i < 5; i++)
                            {
                                x = Math.random()*400 + 50;
                                y = Math.random()*300 + 50;
                                size = Math.random()*40 + 10;
                                stepX = Math.random()*10;
                                stepY = Math.random()*10;
                                color = MyCollections.getRandomColor();

                                Ellipse2D ellipse2D = new Ellipse2D.Double(x,y,size,size);
                                myCircles.add( new MyCircle( ellipse2D, color,stepX, stepY ) );
                            }

                        repaint();
                    }

                public void changeColor()
                    {
                        Color color = JColorChooser.showDialog( null,"Select color", Color.white );

                        for (MyCircle myCircle : myCircles)
                            {
                                myCircle.color = color;
                            }
                    }

                public void setRandomPuls()
                    {
                        for (MyCircle myCircle : myCircles)
                            {
                                myCircle.pulse = Math.random()*10;
                                myCircle.pulseCount = 0;
                            }
                    }

                public void goAway()
                    {
                        double centerX = getWidth()/2;
                        double centerY = getHeight()/2;

                        double moduleStepX = 0;
                        double moduleStepY = 0;

                        for (MyCircle myCircle : myCircles)
                            {
                                moduleStepX = Math.abs( myCircle.stepX );
                                moduleStepY = Math.abs( myCircle.stepY );

                                if (myCircle.circle.getX()>centerX) myCircle.stepX = moduleStepX;
                                else myCircle.stepX = -moduleStepX;

                                if (myCircle.circle.getY()>centerY) myCircle.stepY = moduleStepY;
                                else myCircle.stepY = -moduleStepY;
                            }

                        Ellipse2D ellipse2D = new Ellipse2D.Double(centerX,centerY,10,10);
                        myCircles.add( new MyCircle( ellipse2D, Color.BLACK,0, 0 ) );
                    }
            }

        public static void main( String[] args )
            {
                MyFrameGlobal3 frame = new MyFrameGlobal3();
                frame.setVisible( true );
            }
    }
