package tetris;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TetrisPlay extends JFrame
{
    JLabel statusbar,bk;
    JPanel statusPanel;
    //public static JFrame fr;
    public TetrisPlay()
    {
       // this.fr=fr;
        setSize(1366, 768);
        setLocationRelativeTo(null);
        setBounds(0, 0, 1366, 768);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);
       bk=new JLabel(new ImageIcon());
       add(bk);
       bk.setBounds(0, 0, 1366, 768);
      // bk.setBackground(Color.red);
       bk.setVisible(true);
 // statusPanel=new JPanel(null);
  
 // add(statusPanel);
  //statusPanel.setBounds(700, 0, 200, 650);
 
   statusbar = new JLabel("<html><body>Score<br/> 0 </body></html>");
       
       statusbar.setFont(new Font("pristina", Font.BOLD, 40));

        //statusbar.setBackground(Color.yellow);
        add(statusbar,BorderLayout.EAST);
     // add(statusbar);
        
      // statusPanel.add(statusbar, BorderLayout.EAST);
        //statusbar.setBounds(700, 0, 150, 600);
                                                                                                              
        TetrisBoard board = new TetrisBoard(this);
        add(board);
        board.start();
        
        
        
        board.setBackground(Color.black);
        
        setSize(1300,768);
        setTitle("Tetris");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
   }

   public JLabel getStatusBar() {
       return statusbar;
   }
   public JLabel getb1(){
       return bk;
    }
//    public static void main(String[] args) 
//    {
//        new TetrisPlay();
//    }
}