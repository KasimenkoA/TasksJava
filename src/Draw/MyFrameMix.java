package Draw;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

public class MyFrameMix extends JFrame
    {
        PanelDraw panelDraw;
        JButton button1;
        JButton button2;
        MyShape tempShape;
        Color curColor;
        JCheckBox checkBox1;
        JTextField jTextField;
        ArrayList<MyShape> shapes = new ArrayList<>();
        JComboBox<String> jComboBox;
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

                button2 = new JButton( "Color" );
                button2.addActionListener( new MyActionListener() );
                panelButton.add( button2 );

                checkBox1 = new JCheckBox( "fill", false );
                panelButton.add( checkBox1 );

                jTextField = new JTextField();
                panelButton.add( jTextField );

                String[] masSS = {"line", "rectangle", "oval", "arc"};
                jComboBox = new JComboBox<>(masSS);
                panelButton.add( jComboBox );


                add( panelButton, BorderLayout.NORTH );
                add( panelDraw, BorderLayout.SOUTH );

                startX = 0;
                startY = 0;
                endX = 0;
                endY = 0;

                curColor = Color.BLACK;

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

                        shapes.add( getMyShape() );
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

                        tempShape = getMyShape();
                        repaint();
                    }
            }

        private Shape getFigure()
            {
                int minX = Math.min( startX, endX );
                int minY = Math.min( startY, endY );
                int maxX = Math.max( startX, endX );
                int maxY = Math.max( startY, endY );

                String shapeType = jComboBox.getSelectedItem().toString();

                if (shapeType.equals( "oval" ))
                    {
                        Ellipse2D ellipse2D = new Ellipse2D.Double( minX, minY, maxX - minX, maxY - minY );
                        return ellipse2D;
                    }
                else if (shapeType.equals( "rectangle" ))
                    {
                        Rectangle2D rectangle2D = new Rectangle2D.Double( minX, minY, maxX - minX, maxY - minY );
                        return rectangle2D;
                    }
                else if (shapeType.equals( "arc" ))
                    {
                        Arc2D arc2D = new Arc2D.Double( minX, minY, maxX - minX, maxY - minY , 0, 90 , Arc2D.PIE);
                        return arc2D;
                    }

                Line2D line2D = new Line2D.Double(startX,startY,endX,endY);
                return line2D;
            }

        private MyShape getMyShape()
            {
                return new MyShape();
            }

        private class MyShape
            {
                Shape shape;
                Color color;
                Boolean isFill;
                int lineWidth;

                public MyShape()
                    {
                        this.color = curColor;
                        this.shape = getFigure();
                        this.isFill = checkBox1.isSelected();

                        this.lineWidth = 1;
                        String text = jTextField.getText();
                        if (text.matches( "\\d+" )) this.lineWidth = Integer.parseInt( text );
                    }
            }

        private class PanelDraw extends JPanel
            {
                @Override
                public void paint( Graphics g )
                    {
                        Graphics2D g2 = (Graphics2D) g;

                        if (tempShape != null)
                            {
                                g2.setColor( tempShape.color );
                                if (tempShape.lineWidth>0)
                                    {
                                        g2.setStroke( new BasicStroke(tempShape.lineWidth) );
                                    }
                                if (tempShape.isFill)
                                    {
                                        g2.fill( tempShape.shape );
                                    }
                                else
                                    {
                                        g2.draw( tempShape.shape );
                                    }
                            }

                        for (MyShape shape : shapes)
                            {
                                g2.setColor( shape.color );
                                if (shape.lineWidth>0)
                                    {
                                        g2.setStroke( new BasicStroke(shape.lineWidth) );
                                    }

                                if (shape.isFill)
                                    {
                                        g2.fill( shape.shape );
                                    }
                                else
                                    {
                                        g2.draw( shape.shape );
                                    }
                            }
                    }

                private void fillBackground()
                    {
                        setBackground( Color.PINK );
                    }

                private void selectColor()
                    {
                        curColor = JColorChooser.showDialog( null, "Select color", Color.WHITE );
                        button2.setBackground( curColor );
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
                        else if (e.getSource() == button2)
                            {
                                panelDraw.selectColor();
                            }
                    }
            }

        public static void main( String[] args )
            {
                MyFrameMix frame = new MyFrameMix();
                frame.setVisible( true );
            }
    }
