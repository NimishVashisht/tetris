package tetris;

import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class TetrisInst 
{
    Window win;
    JLabel inst,info;
    JButton ok;
    public TetrisInst(String s)
    {
        inst=new JLabel(new ImageIcon("src\\images/light-gray-textured-solid.jpg"));
        inst.setText(s);
        win=new Window(null);
        win.setLayout(null);
        win.setLocation(420,250);
        ok=new JButton(new ImageIcon("src\\images/tetok.jpg"));
        ok.setBounds(310,330,63,31);   
        inst.setBounds(0, 0, 400, 380);
        info=new JLabel("<html><body><br>Tetris has game pieces in geometric shapes composed of four square blocks each. A random sequence of blocks fall down the playing field. The objective of the game is to manipulate these blocks, by moving each one sideways and rotating it by 90 degree units, with the aim of creating a horizontal line without gaps. When such a line is created, it disappears, and any block above the deleted line will fall. <br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Let's Play.  </body></html>");
        info.setFont(new Font("pristina", Font.PLAIN, 25));
        info.setVerticalAlignment(JLabel.NORTH);
        info.setBounds(0,0,400,350);
        inst.add(info);
        inst.add(ok);
        ok.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                win.setVisible(false);
            }
        });
        win.add(inst);
        win.setSize(400,380);
        win.setVisible(true);
    }
}