package tetris;

import static tetris.Tetris.ff;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TetrisGameOver implements ActionListener
{
    
    JLabel bckgrund,score,scr;
    JButton tryagain,exit;
    JFrame j;
 
    TetrisGameOver(int s1)
    {
        j=new JFrame();
        j.setSize(1366, 768);
        j.setLocation(0, 0);
        j.setLayout(null);
        j.setExtendedState(JFrame.MAXIMIZED_BOTH);
        j.setUndecorated(true);
        
        bckgrund=new JLabel(new ImageIcon("src\\images/gameover_1.jpg"));
        bckgrund.setBounds(0, 0, 1366, 768);
        j.add(bckgrund);
        
        score=new JLabel("Your Score");
        score.setFont(new Font("Algerian", Font.BOLD, 50));
        score.setBounds(480, 430, 380, 190);
        bckgrund.add(score);
        
        scr=new JLabel("");
        scr.setFont(new Font("Algerian", Font.BOLD, 50));
        scr.setBounds(600, 490, 380, 190);
        scr.setText(String.valueOf(s1));
        bckgrund.add(scr);
        
        tryagain=new JButton("Try Again");
        tryagain.setFont(new Font("Bernard MT Condensed", Font.BOLD, 50));
        tryagain.setBounds(300, 670, 280, 70);
        tryagain.setBackground(Color.ORANGE);
        bckgrund.add(tryagain);
       
        exit=new JButton("Exit");
        exit.setFont(new Font("Bernard MT Condensed", Font.BOLD, 50));
        exit.setBounds(700, 670, 280, 70);
        exit.setBackground(Color.orange);
        bckgrund.add(exit);
        
        tryagain.addActionListener(this);
        exit.addActionListener(this);
        
        j.setVisible(true);
    }
    
    public static void main(String[] args) {
        new TetrisGameOver(0);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==tryagain)
        {
            new Tetris(ff);
            j.dispose();
        }
        else if(e.getSource()==exit)
        {
            new Slctgame(ff,false);
            j.dispose();
        }
    }
}