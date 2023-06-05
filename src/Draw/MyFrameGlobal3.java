package Draw;

import MyMethods.MyCollections;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;

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
                panelButton.add( button2 );

                button3 = new JButton( ("Button 3") );
                panelButton.add( button3 );

                button4 = new JButton( ("Button 4") );
                panelButton.add( button4 );

                button5 = new JButton( ("Button 5") );
                panelButton.add( button5 );

                button6 = new JButton( ("Button 6") );
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
                                panelDraw.drawCircle();
                            }
                    }
            }




        public static class MyCircle
            {
                private Ellipse2D circle;
                private Color color;
                private double stepX;
                private double stepY;

                public MyCircle( Ellipse2D circle, Color color, double stepX, double stepY )
                    {
                        this.circle = circle;
                        this.color = color;
                        this.stepX = stepX;
                        this.stepY = stepY;
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

                        for (MyCircle myCircle : myCircles)
                            {
                                g2d.setColor( myCircle.color );
                                g2d.fill( myCircle.circle );
                            }
                    }

                public void drawCircle()
                    {
                        Ellipse2D ellipse2D = new Ellipse2D.Double(100,100,80,80);
                        myCircles.add( new MyCircle( ellipse2D, Color.BLUE,0, 0 ) );

                        repaint();
                    }

            }

        public static void main( String[] args )
            {
                MyFrameGlobal3 frame = new MyFrameGlobal3();
                frame.setVisible( true );
            }
    }
