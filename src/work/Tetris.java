package work;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import javax.swing.Timer;
 
public class Tetris extends JFrame {
    public Tetris() {
        Tetrisblok a = new Tetrisblok();
        addKeyListener(a);
        add(a);
    }
    public static void main(String[] args) {
        Tetris frame = new Tetris();
        JMenuBar menu = new JMenuBar();
        frame.setJMenuBar(menu);
        JMenu game = new JMenu("��Ϸ");
        JMenuItem newgame = game.add("����Ϸ");
        JMenuItem pause = game.add("��ͣ");
        JMenuItem goon = game.add("����");
        JMenuItem exit = game.add("�˳�");
        JMenu help = new JMenu("����");
        JMenuItem about = help.add("����");
        menu.add(game);
        menu.add(help);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(220, 275);
        frame.setTitle("Tetris�ڲ��");
        // frame.setUndecorated(true);
        frame.setVisible(true);
        frame.setResizable(false);
 
    }
}

            