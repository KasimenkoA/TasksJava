package Draw;

import MyMethods.MyCollections;
import com.sun.jdi.ThreadReference;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;

public class MyFrameGlobal2 extends JFrame
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


        public MyFrameGlobal2()
            {
                setTitle( "My global frame" );
                setSize( 600, 500 );
                setLocationRelativeTo( null );
                setDefaultCloseOperation( EXIT_ON_CLOSE );

                JPanel panelButton = new JPanel();
                panelButton.setLayout( new GridLayout( 2, 4 ) );

                JPanel panelEdit = new JPanel();
                panelEdit.setPreferredSize( new Dimension( 600, 100 ) );
                JLabel label = new JLabel( "Width:" );
                panelEdit.add( label );
                JTextField textField = new JTextField( "10" );
                textField.setColumns( 5 );
                panelEdit.add( textField );

                JLabel labelColor = new JLabel( "Color:" );
                JButton buttonColor = new JButton( "Select color" );
                buttonColor.addActionListener( new ActionListener()
                    {
                        @Override
                        public void actionPerformed( ActionEvent e )
                            {
                                Color curColor = JColorChooser.showDialog( null, "Select color", Color.white );
                                buttonColor.setBackground( curColor );
                                panelDraw.repaint();
                            }
                    } );
                panelEdit.add( labelColor );
                panelEdit.add( buttonColor );

                panelDraw = new PanelDraw( textField, buttonColor );

                button1 = new JButton( "Button 1" );
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
                button7.addActionListener( new MyActionListener() );
                panelButton.add( button7 );

                button8 = new JButton( ("Button 8") );
                button8.addActionListener( new MyActionListener() );
                panelButton.add( button8 );


                setLayout( new BorderLayout() );
                add( panelButton, BorderLayout.NORTH );
                add( panelEdit, BorderLayout.CENTER );
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
                        else if (e.getSource() == button2)
                            {
                                panelDraw.setEditSize();
                            }
                        else if (e.getSource() == button3)
                            {
                                panelDraw.drawRandomCircle();
                            }
                        else if (e.getSource() == button4)
                            {
                                panelDraw.canvasRepaint();
                            }
                        else if (e.getSource() == button5)
                            {
                                panelDraw.squareBlink();
                            }
                        else if (e.getSource() == button6)
                            {
                                panelDraw.squareToCircle();
                            }
                        else if (e.getSource() == button7)
                            {
                                panelDraw.circleToOval();
                            }
                        else if (e.getSource() == button8)
                            {
                                panelDraw.circleRandomMove();
                            }
                    }
            }

        public static class MyCanvas extends Canvas
            {
                private ArrayList<Shape> shapes;
                private JButton buttonColor;

                public MyCanvas( JButton buttonColor )
                    {
                        shapes = new ArrayList<>();
                        this.buttonColor = buttonColor;
                    }

                @Override
                public void paint( Graphics g )
                    {
                        Graphics2D g2d = (Graphics2D) g;

                        Color color1 = Color.white;
                        Color color2 = this.buttonColor.getBackground();

                        if (!color1.equals( color2 ))
                            {
                                GradientPaint gradientPaint = new GradientPaint( 0, 0, color1, getWidth(), getHeight(), color2 );
                                g2d.setPaint( gradientPaint );
                                g2d.fillRect( 0, 0, getWidth(), getHeight() );
                            }

                        g2d.setColor( Color.CYAN );
                        for (Shape shape : shapes)
                            {
                                g2d.fill( shape );
                            }
                    }
            }


        public static class PanelDraw extends JPanel
            {
                private JTextField textField;
                private MyCanvas canvas;

                public PanelDraw( JTextField textField, JButton buttonColor )
                    {
                        setPreferredSize( new Dimension( 600, 390 ) );
                        canvas = new MyCanvas( buttonColor );
                        canvas.setPreferredSize( new Dimension( 600, 390 ) );
                        add( canvas, BorderLayout.CENTER );
                        this.textField = textField;
                    }


                public void drawCircle()
                    {
                        Ellipse2D ellipse2D = new Ellipse2D.Double( 100, 100, 60, 60 );
                        canvas.shapes.add( ellipse2D );

                        canvas.repaint();
                    }

                public void setEditSize()
                    {
                        int size = Integer.parseInt( textField.getText() );

                        for (Shape shape : canvas.shapes)
                            {
                                if (shape instanceof Ellipse2D)
                                    {
                                        Ellipse2D ellipse = (Ellipse2D) shape;
                                        double newX = ellipse.getX() - (size - ellipse.getWidth()) / 2; // ��������� ����� ��������� X
                                        double newY = ellipse.getY() - (size - ellipse.getHeight()) / 2; // ��������� ����� ��������� Y
                                        ellipse.setFrame( newX, newY, size, size );
                                    }
                            }

                        canvas.repaint();
                    }

                public void drawRandomCircle()
                    {
                        int x = MyCollections.getRandomFromTo( 50, 500 );
                        int y = MyCollections.getRandomFromTo( 50, 300 );
                        int size = MyCollections.getRandomFromTo( 10, 250 );

                        Ellipse2D ellipse2D = new Ellipse2D.Double( x, y, size, size );
                        canvas.shapes.add( ellipse2D );

                        canvas.repaint();
                    }

                public void canvasRepaint()
                    {
                        canvas.repaint();
                    }

                public void squareBlink()
                    {
                        Thread thread = new Thread( () ->
                        {
                            int ii = 100;
                            int centerX = 150;
                            int centerY = 150;
                            int curX;
                            int curY;
                            int direction = -1;

                            while (true)
                                {
                                    curX = centerX - (ii / 2);
                                    curY = centerY - (ii / 2);
                                    canvas.shapes.add( new Rectangle2D.Double( curX, curY, ii, ii ) );

                                    canvas.repaint();
                                    try
                                        {
                                            Thread.sleep( 10 );
                                        } catch (InterruptedException e)
                                        {
                                            e.printStackTrace();
                                        }

                                    canvas.shapes.clear();
                                    ii += direction;

                                    if (ii <= 1)
                                        {
                                            direction = 1;
                                        }
                                    if (ii >= 100)
                                        {
                                            direction = -1;
                                        }
                                }
                        } );
                        thread.start();
                    }

                public void squareToCircle()
                    {
                        Thread thread = new Thread( () ->
                        {
                            int ii = 100;
                            int centerX = 150;
                            int centerY = 150;
                            int curX;
                            int curY;
                            int direction = -1;
                            boolean isSquare = true;

                            while (true)
                                {
                                    curX = centerX - (ii / 2);
                                    curY = centerY - (ii / 2);

                                    if (isSquare)
                                        {
                                            canvas.shapes.add( new Rectangle2D.Double( curX, curY, ii, ii ) );
                                        }
                                    else
                                        {
                                            canvas.shapes.add( new Ellipse2D.Double( curX, curY, ii, ii ) );
                                        }

                                    canvas.repaint();
                                    try
                                        {
                                            Thread.sleep( 10 );
                                        } catch (InterruptedException e)
                                        {
                                            e.printStackTrace();
                                        }

                                    canvas.shapes.clear();
                                    ii += direction;

                                    if (ii <= 1)
                                        {
                                            direction = 1;
                                            isSquare = !isSquare;
                                        }

                                    if (ii >= 100)
                                        {
                                            direction = -1;
                                        }
                                }
                        } );
                        thread.start();
                    }

                public void circleToOval()
                    {
                        Thread thread = new Thread( ()-> {
                            int startW = 100;
                            int startH = 100;

                            for (int i = 100; i < 200; i++)
                                {
                                    startW = i;

                                    Ellipse2D ellipse2D = new Ellipse2D.Double( 100, 100, startW, startH );
                                    canvas.shapes.add( ellipse2D );

                                    canvas.repaint();
                                    try
                                        {
                                            Thread.sleep( 20 );
                                        } catch (InterruptedException e)
                                        {
                                            e.printStackTrace();
                                        }
                                    canvas.shapes.clear();
                                }

                            for (int i = 100; i < 200; i++)
                                {
                                    startH = i;

                                    Ellipse2D ellipse2D = new Ellipse2D.Double( 100, 100, startW, startH );
                                    canvas.shapes.add( ellipse2D );

                                    canvas.repaint();
                                    try
                                        {
                                            Thread.sleep( 20 );
                                        } catch (InterruptedException e)
                                        {
                                            e.printStackTrace();
                                        }
                                    canvas.shapes.clear();
                                }
                        });
                        thread.start();
                    }

                public void circleRandomMove()
                    {
                        Thread thread = new Thread( ()-> {
                            int startX = 200;
                            int startY = 200;
                            int size = 100;
                            int stepCount = 100;

                            double stepX = (Math.random()*getWidth() - startX)/stepCount;
                            double stepY = (Math.random()*getHeight() - startY)/stepCount;

                            double positionX = startX;
                            double positionY = startY;

                            canvas.shapes.clear();
                            for (int i = 0; i < stepCount; i++)
                                {
                                    Ellipse2D ellipse2D = new Ellipse2D.Double( positionX, positionY, size, size );
                                    canvas.shapes.add( ellipse2D );

                                    canvas.repaint();
                                    try
                                        {
                                            Thread.sleep( 20 );
                                        } catch (InterruptedException e)
                                        {
                                            e.printStackTrace();
                                        }
                                    canvas.shapes.clear();

                                    positionX += stepX;
                                    positionY += stepY;
                                }

                        });
                        thread.start();
                    }



            }

        public static void main( String[] args )
            {
                MyFrameGlobal2 frame = new MyFrameGlobal2();
                frame.setVisible( true );
            }

    }
