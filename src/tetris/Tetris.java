package tetris;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tetris extends JFrame implements ActionListener
{
    JLabel bckgrund,player;
    JButton back,quit,play,instructions;
    JTextField name;
    public static JFrame ff;
    
    public Tetris(JFrame ff) 
    {
        this.ff=ff;
        setSize(1366, 768);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);
        
        bckgrund=new JLabel(new ImageIcon("src\\images/tet.jpg"));
        bckgrund.setBounds(0, 0, 1366, 768);
        add(bckgrund);
        
        back=new JButton(new ImageIcon("src\\images/back.png"));
        back.setBounds(20, 690, 48, 48);
        back.setBackground(Color.GRAY);
        bckgrund.add(back);
        
        play=new JButton(new ImageIcon("src\\images/ply.jpg"));
        play.setBounds(200, 300, 224, 81);
        play.setBackground(Color.white);
        bckgrund.add(play);
        
        instructions=new JButton(new ImageIcon("src\\images/instr.jpg"));
        instructions.setBounds(800, 550, 290, 82);
        bckgrund.add(instructions);
        
        instructions.addActionListener(this);
        play.addActionListener(this);
        back.addActionListener(this);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==back)
        {
            new Slctgame(ff,false);
            this.dispose();
        }
        else if(e.getSource()==instructions)
        {
            new TetrisInst("");
        }
        else if(e.getSource()==play)
        {
            new TetrisPlay();
            this.dispose();
        }
    }
}