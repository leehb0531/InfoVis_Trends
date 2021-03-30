package com.company;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{

    private Vis mainPanel;
    Dimension screenSize;


    public Main(){
        JMenuBar menuBar = setupMenu();
        screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        setJMenuBar(menuBar);
        mainPanel = new Vis();
        setContentPane(mainPanel);

        setSize((int)(screenSize.width*0.9),(int)(screenSize.height*0.9));
        setLocation(screenSize.width/2-getWidth()/2, screenSize.height/2-getHeight()/2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Youtube Trends");
        setVisible(true);
    }

    // Set up MenuBar*******************************
    private JMenuBar setupMenu(){
        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = new JMenu("File");
        JMenuItem openFile = new JMenuItem("Open data file");
        JMenu menu2 = new JMenu("Algorithm");


        return menuBar;
    }
    // end setting MenuBar ****************

    //main
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main();
            }
        });
    }
}
