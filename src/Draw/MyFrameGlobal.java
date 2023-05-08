package Draw;

import javax.swing.*;
import java.awt.*;

public class MyFrameGlobal extends JFrame
    {
        public MyFrameGlobal()
            {
                setTitle( "My global frame" );
                setSize( 600,500 );
                setLocationRelativeTo( null );
                setDefaultCloseOperation( EXIT_ON_CLOSE );

                JPanel panelButton = new JPanel();
                panelButton.setLayout( new GridLayout(2,4) );

                JButton button1 = new JButton("Button 1");
                panelButton.add( button1 );

                JButton button2 = new JButton(("Button 2"));
                panelButton.add( button2 );

                JButton button3 = new JButton(("Button 3"));
                panelButton.add( button3 );

                JButton button4 = new JButton(("Button 4"));
                panelButton.add( button4 );

                JButton button5 = new JButton(("Button 5"));
                panelButton.add( button5 );

                JButton button6 = new JButton(("Button 6"));
                panelButton.add( button6 );

                JButton button7 = new JButton(("Button 7"));
                panelButton.add( button7 );

                JButton button8 = new JButton(("Button 8"));
                panelButton.add( button8 );

                add( panelButton , BorderLayout.NORTH);
            }



        public static void main( String[] args )
            {
                MyFrameGlobal frame = new MyFrameGlobal();
                frame.setVisible( true );
            }
    }
