package tetris;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Slctgame extends JFrame implements ActionListener {

    JLabel gamelbl;
    JButton tetrisbutn, close, msc;
    boolean counter = true;
    public static JFrame ff;
    public static AudioClip music;

    public Slctgame(JFrame ff, boolean isMusicPlay) {
        this.ff = ff;
        getContentPane().setBackground(Color.black);
        setSize(1024, 720);
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        if (isMusicPlay) {
            music = Applet.newAudioClip(Get_Location("DST-DatBeat.au"));
            music.loop();
        }
        gamelbl = new JLabel(new ImageIcon("src\\images/space.jpg"));
        gamelbl.setBounds(0, 0, 1024, 768);
        add(gamelbl);

        tetrisbutn = new JButton(new ImageIcon("src\\images/tetris.jpg"));
        tetrisbutn.setBounds(200, 450, 200, 200);
        gamelbl.add(tetrisbutn);

        close = new JButton(new ImageIcon("src\\images/dialog_close.png"));
        close.setBounds(1290, 10, 24, 24);
        gamelbl.add(close);

        msc = new JButton(new ImageIcon("src\\images/misc.png"));
        msc.setBounds(10, 10, 42, 42);
        gamelbl.add(msc);
        msc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (counter) {
                    System.out.println("if part::");

                    music.stop();
                    counter = !counter;
                } else {
                    System.out.println("else part::");
                    music.play();
                    counter = !counter;
                }
            }
        });

        tetrisbutn.addActionListener(this);
        close.addActionListener(this);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == tetrisbutn) {
            new Tetris(ff);
           this.dispose();
        } else if (e.getSource() == close) {
            music.stop();
            GamerSArena.ff.dispose();
            this.dispose();
        }
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
