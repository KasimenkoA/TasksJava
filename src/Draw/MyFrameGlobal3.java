package Draw;

import MyMethods.MyCollections;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
                                //panelDraw.drawMyOval();
                            }
                    }
            }


        public static void main( String[] args )
            {
                MyFrameGlobal3 frame = new MyFrameGlobal3();
                frame.setVisible( true );
            }


        public static class PanelDraw extends JPanel
            {
//                public void drawMyOval()
//                    {
//                        Graphics g = getGraphics();
//                        g.setColor( Color.blue );
//                        g.fillOval( 200, 150, 90, 80 );
//                    }


            }

    }
