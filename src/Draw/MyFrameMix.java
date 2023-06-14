package Draw;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrameMix extends JFrame
    {
        PanelDraw panelDraw;
        JButton button1;

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

                button1 = new JButton( "Button 1" );
                button1.addActionListener( new MyActionListener());
                panelButton.add( button1 );

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
                                panelDraw.fillBackground();
                            }
                    }
            }

        private class PanelDraw extends JPanel
            {
                private void fillBackground()
                    {
                        setBackground( Color.PINK );
                    }

            }

        public static void main( String[] args )
            {
                MyFrameMix frame = new MyFrameMix();
                frame.setVisible( true );
            }
    }
