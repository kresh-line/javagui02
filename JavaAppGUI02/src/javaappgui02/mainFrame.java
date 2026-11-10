/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package javaappgui02;

import javax.swing.*;

import java.awt.*;

/**
 *
 * @author iektm1-03
 */
public class mainFrame extends JFrame {
    JLabel jl1, jl2, jl3, jl4;
    JTextField jtf1, jtf2;
    JList jliSports;
    JRadioButton jrb1, jrb2;
    JCheckBox jcb1, jcb2, jcb3;
    JButton b1, b2, b3;

    mainFrame() {
        super();
        createGUI();
    }

    mainFrame(String t) {
        super(t);
        createGUI();
    }

    private void createGUI() {
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        // dhmiourgia twn stoixeiwn
        JPanel upleftP = new JPanel();
        upleftP.setLayout(new GridLayout(2, 2));

        jl1 = new JLabel("Ετικετα 1");
        jl2 = new JLabel("Ετικετα 2");
        jtf1 = new JTextField(12);
        jtf2 = new JTextField(12);
        
        upleftP.add(jl1);
        upleftP.add(jtf1);
        upleftP.add(jl2);
        upleftP.add(jtf2);



        String[] dm = { "Ποδόσφαιρο", "Μπάσκετ", "Βόλεϊ", "Άλλα" };
        jliSports = new JList(dm);

        JPanel fyloP = new JPanel();
        fyloP.setLayout(new GridLayout(2, 2));

        jl3 = new JLabel("Φύλο");
        jrb1 = new JRadioButton("Ανδρας");
        jrb2 = new JRadioButton("Γυναίκα");
        ButtonGroup bg = new ButtonGroup();
        bg.add(jrb1);
        bg.add(jrb2);
        jrb1.setSelected(true);

        fyloP.add(jl3);
        fyloP.add(jrb1);
        fyloP.add(new JLabel(" ")); // empty label for spacing
        fyloP.add(jrb2);
        
        // chekbox
        jl4 = new JLabel("Γλώσ Προ/σμού");
        jcb1 = new JCheckBox("Python");
        jcb2 = new JCheckBox("Java");
        jcb3 = new JCheckBox("C++");
        // dimiourgia panel kai vendosja e tij ne dritare me tre buttona
        JPanel downPanelB = new JPanel();
        downPanelB.setLayout(new GridLayout(1, 3));
        b1 = new JButton("Φυλο");
        b2 = new JButton("Γλώσσα");
        b3 = new JButton("Κλείσιμο");
        downPanelB.add(b1);
        downPanelB.add(b2);
        downPanelB.add(b3);
        // ta prostheso
        c.insets = new Insets(5, 5, 5, 5);
        c.anchor = GridBagConstraints.LINE_START; // komponentet do te vendosen ne fillim te rreshtit
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 2;
        add(upleftP, c); // rreshti 0, kolona 0
         // rreshti 0, kolona 1 (anash jl1)

        c.gridx = 1;
        c.gridy = 0;
       
        c.gridheight = 2;
        c.fill = GridBagConstraints.BOTH;
        add(jliSports, c);

         c.gridx = 0;
        c.gridy = 2;
       
        c.gridheight = 2;
        c.fill = GridBagConstraints.NONE;
        add(fyloP, c);

        
        // Γλώσ Προ/σμού - njelloj si Φύλο: etiketa ne kolonen 0, kutite ne kolonen 1
        c.gridx = 0;
        c.gridy = 7;
        add(jl4, c);
        c.gridx = 1;
        c.gridy = 7;
        add(jcb1, c);
        c.gridx = 1;
        c.gridy = 8;
        add(jcb2, c);
        c.gridx = 1;
        c.gridy = 9;
        add(jcb3, c);

        c.gridx = 0;
        c.gridy = 10;
        c.gridwidth = 2;
        add(downPanelB, c);

        pack(); // madhesia e dritares sipas komponenteve, qe te duken te gjitha
    }

    private void createGUIOld() {
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        // dhmiourgia twn stoixeiwn
        jl1 = new JLabel("Ετικετα 1");
        jl2 = new JLabel("Ετικετα 2");
        jtf1 = new JTextField(12);
        jtf2 = new JTextField(12);

        String[] dm = { "Ποδόσφαιρο", "Μπάσκετ", "Βόλεϊ", "Άλλα" };
        jliSports = new JList(dm);
        jl3 = new JLabel("Φύλο");
        jrb1 = new JRadioButton("Ανδρας");
        jrb2 = new JRadioButton("Γυναίκα");
        ButtonGroup bg = new ButtonGroup();
        bg.add(jrb1);
        bg.add(jrb2);
        jrb1.setSelected(true);
        // chekbox
        jl4 = new JLabel("Γλώσ Προ/σμού");
        jcb1 = new JCheckBox("Python");
        jcb2 = new JCheckBox("Java");
        jcb3 = new JCheckBox("C++");
        // dimiourgia panel kai vendosja e tij ne dritare me tre buttona
        JPanel downPanelB = new JPanel();
        downPanelB.setLayout(new GridLayout(1, 3));
        b1 = new JButton("Φυλο");
        b2 = new JButton("Γλώσσα");
        b3 = new JButton("Κλείσιμο");
        downPanelB.add(b1);
        downPanelB.add(b2);
        downPanelB.add(b3);
        // ta prostheso
        c.insets = new Insets(5, 5, 5, 5);
        c.anchor = GridBagConstraints.LINE_START; // komponentet do te vendosen ne fillim te rreshtit
        c.gridx = 0;
        c.gridy = 0;

        add(jl1, c); // rreshti 0, kolona 0
        c.gridx = 1;
        add(jtf1, c); // rreshti 0, kolona 1 (anash jl1)

        c.gridx = 0;
        c.gridy = 1;
        add(jl2, c); // rreshti 1, kolona 0
        c.gridx = 1;
        add(jtf2, c);
        // rreshti 1, kolona 1 (anash jl2)
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 2;
        c.gridheight = 3;
        c.fill = GridBagConstraints.BOTH;
        add(jliSports, c);

        c.gridx = 0;
        c.gridy = 5;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.fill = GridBagConstraints.NONE;
        add(jl3, c);
        c.gridx = 1;
        c.gridy = 5;
        add(jrb1, c);
        c.gridx = 1;
        c.gridy = 6;
        add(jrb2, c);

        // Γλώσ Προ/σμού - njelloj si Φύλο: etiketa ne kolonen 0, kutite ne kolonen 1
        c.gridx = 0;
        c.gridy = 7;
        add(jl4, c);
        c.gridx = 1;
        c.gridy = 7;
        add(jcb1, c);
        c.gridx = 1;
        c.gridy = 8;
        add(jcb2, c);
        c.gridx = 1;
        c.gridy = 9;
        add(jcb3, c);

        c.gridx = 0;
        c.gridy = 10;
        c.gridwidth = 2;
        add(downPanelB, c);

        pack(); // madhesia e dritares sipas komponenteve, qe te duken te gjitha
    }
}
