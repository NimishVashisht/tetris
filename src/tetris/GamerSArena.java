package tetris;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class GamerSArena extends JFrame {

    int d = 10000;
    Timer t;
    public static AudioClip music;
    JLabel gamel;
    public static JFrame ff;

    public GamerSArena() {
        ff = this;
        setSize(800, 600);
        setLayout(null);
        setLocationRelativeTo(null);
        setExtendedState(JFrame.NORMAL);
        setUndecorated(true);
        getContentPane().setBackground(Color.black);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Timer t1=new ti
        t = new Timer(d, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Slctgame(ff, true);
                ff.dispose();
                music.stop();
                t.stop();
            }
        });
        t.start();
        gamel = new JLabel(new ImageIcon("src\\images/arena.gif"));
        gamel.setBounds(0, 0, 850, 650);
        add(gamel);

        music = Applet.newAudioClip(Get_Location("ps4.au"));
        music.play();

        setVisible(true);
    }

    public static void main(String[] args) {
        new GamerSArena();
    }

    public URL Get_Location(String filename) {
        URL url = null;
        try {
            url = this.getClass().getResource(filename);
        } catch (Exception e) {
        }
        return url;
    }
}
