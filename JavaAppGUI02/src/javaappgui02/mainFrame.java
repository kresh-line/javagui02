/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaappgui02;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 *
 * @author Administrator
 */
public class mainFrame extends JFrame {
    JLabel jl1, jl2;
    JTextField tf1, tf2;
    JList<String> listSports;
    JRadioButton jrb1, jrb2;
    JLabel jl3, jl4;
    JCheckBox chk1, chk2, chk3, chk4;
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
        setSize(500, 340);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        //Δημιουργώ τα αντικείμενα που θ προσθέσω στο Frame
        JPanel upLeftP = new JPanel();
        upLeftP.setLayout(new GridLayout(2,2));
        
        jl1 = new JLabel("Ετικέτα 1");
        jl2 = new JLabel("Ετικέτα 2");
        tf1 = new JTextField(12);
        tf2 = new JTextField(12);
        
        upLeftP.add(jl1);
        upLeftP.add(tf1);
        upLeftP.add(jl2);
        upLeftP.add(tf2);
         
        DefaultListModel<String> dlm = new DefaultListModel<>();
        dlm.addElement("Κολύμβηση");
        dlm.addElement("Τρέξιμο");
        dlm.addElement("Άλμα εις μήκος");
        dlm.addElement("a1");
        dlm.addElement("a2");
        dlm.addElement("a3");
        
        listSports = new JList<>(dlm);
        listSports.setLayoutOrientation(JList.VERTICAL);
        listSports.setVisibleRowCount(4);
        JScrollPane sp = new JScrollPane(listSports);
        
        JPanel fyloP = new JPanel();
        fyloP.setLayout(new GridLayout(2,2));
        
        jl3 = new JLabel("Φύλο");
        jrb1 = new JRadioButton("Άντρας");
        jrb2 = new JRadioButton("Γυναίκα");
        //Δημιουργώ ένα ButtonGroup και προσθέτω σε αυτό τα δύο JRadioButton
        //ώστε όταν πατάς το ένα να ξεεπιλέγεται το άλλο
        ButtonGroup bg = new ButtonGroup();
        bg.add(jrb1);
        bg.add(jrb2);
        jrb2.setSelected(true);
        
        fyloP.add(jl3);
        fyloP.add(jrb1);
        fyloP.add(new JLabel(" "));
        fyloP.add(jrb2);
        
        
        JPanel glossaP = new JPanel();
        glossaP.setLayout(new GridLayout(4,2));
        
        jl4 = new JLabel("Γλώσσα Πρ/σμού:");
        chk1 = new JCheckBox("Java");
        chk2 = new JCheckBox("Python");
        chk3 = new JCheckBox("PHP");
        chk4 = new JCheckBox("C++");
        
        glossaP.add(jl4);
        glossaP.add(chk1);
        glossaP.add(new JLabel(" "));
        glossaP.add(chk2);
        glossaP.add(new JLabel(" "));
        glossaP.add(chk3);
        glossaP.add(new JLabel(" "));
        glossaP.add(chk4);
        
        //Δημιούργησε ένα JPanel και εφάρμοσέ του gridLayout με 3 στήλες
        //και βάλε πάνω του τα κουμπιά
        JPanel downButtonP = new JPanel();
        downButtonP.setLayout(new GridLayout(1,3));
        b1 = new JButton("Φύλο");
        b2 = new JButton("Γλώσσα");
        b3 = new JButton("Κλείσιμο");
        downButtonP.add(b1);
        downButtonP.add(b2);
        downButtonP.add(b3);
        
        //τα προσθέτω
        //Να υπάρχει περιθώριο 5 pixels πάνω, αριστερά, κάτω και δεξιά
        //γύρω από το κάθε αντικείμενο
        c.insets = new Insets(5, 5, 5, 5);
        
        c.anchor = GridBagConstraints.LINE_START;
        c.fill = GridBagConstraints.HORIZONTAL;
        
        c.gridx = 0;
        c.gridy = 0;
        c.gridheight = 2;
        add(upLeftP, c);
        
        c.gridx = 1;
        c.gridy = 0;
        c.gridheight = 2;
        add(sp, c);
        
        c.gridx = 0;
        c.gridy = 2;
        c.gridheight = 2;
        add(fyloP, c);
        
        c.gridx = 1;
        c.gridy = 2;
        c.gridheight = 2;
        add(glossaP, c);        
        
        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 2;
        c.gridheight = 1;
        add(downButtonP, c);
        
        //pack();
    }
    
    private void createGUIOld() {
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        //Δημιουργώ τα αντικείμενα που θ προσθέσω στο Frame
        jl1 = new JLabel("Ετικέτα 1");
        jl2 = new JLabel("Ετικέτα 2");
        tf1 = new JTextField(12);
        tf2 = new JTextField(12);
        
        String[] dm = {"Κολύμβηση", "Τρέξιμο", "Άλμα εις μήκος", "Κωπηλασία"}; 

        listSports = new JList<>(dm);

        
        jl3 = new JLabel("Φύλο");
        jrb1 = new JRadioButton("Άντρας");
        jrb2 = new JRadioButton("Γυναίκα");
        //Δημιουργώ ένα ButtonGroup και προσθέτω σε αυτό τα δύο JRadioButton
        //ώστε όταν πατάς το ένα να ξεεπιλέγεται το άλλο
        ButtonGroup bg = new ButtonGroup();
        bg.add(jrb1);
        bg.add(jrb2);
        jrb2.setSelected(true);
        
        
        jl4 = new JLabel("Γλώσσα Πρ/σμού:");
        chk1 = new JCheckBox("Java");
        chk2 = new JCheckBox("Python");
        chk3 = new JCheckBox("PHP");
        
        //Δημιούργησε ένα JPanel και εφάρμοσέ του gridLayout με 3 στήλες
        //και βάλε πάνω του τα κουμπιά
        JPanel downButtonP = new JPanel();
        downButtonP.setLayout(new GridLayout(1,3));
        b1 = new JButton("Φύλο");
        b2 = new JButton("Γλώσσα");
        b3 = new JButton("Κλείσιμο");
        downButtonP.add(b1);
        downButtonP.add(b2);
        downButtonP.add(b3);
        
        //τα προσθέτω
        //Να υπάρχει περιθώριο 5 pixels πάνω, αριστερά, κάτω και δεξιά
        //γύρω από το κάθε αντικείμενο
        c.insets = new Insets(5, 5, 5, 5);
        
        c.anchor = GridBagConstraints.LINE_START;
        
        c.gridx = 0;
        c.gridy = 0;
        add(jl1, c);
        
        c.gridx = 0;
        c.gridy = 1;
        add(jl2, c);
        
        c.gridx = 1;
        c.gridy = 0;
        add(tf1, c);
        
        c.gridx = 1;
        c.gridy = 1;
        add(tf2, c);
        
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 2;
        c.gridheight = 3;
        c.fill = GridBagConstraints.BOTH;
        add(listSports, c); 
        
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
        
        c.gridx = 0;
        c.gridy = 7;
        add(jl4, c);
        
        c.gridx = 1;
        c.gridy = 7;
        add(chk1, c);
        
        c.gridx = 1;
        c.gridy = 8;
        add(chk2, c);
        
        c.gridx = 1;
        c.gridy = 9;
        add(chk3, c);
        
        
        c.gridx = 0;
        c.gridy = 10;
        c.gridwidth = 2;
        add(downButtonP, c);
        
        pack();
    }
    
    
}

// package javaappgui02;

// import javax.swing.*;

// import java.awt.*;

// /**
//  *
//  * @author iektm1-03
//  */
// public class mainFrame extends JFrame {
//     //component
//     JLabel jl1, jl2, jl3, jl4;
//     JTextField jtf1, jtf2;
//     JList<String> jliSports;
//     JRadioButton jrb1, jrb2;
//     JCheckBox jcb1, jcb2, jcb3;
//     JButton b1, b2, b3;

//     private final GridBagConstraints c = new GridBagConstraints();

//     mainFrame() {
//         super();
//         createGUI();
//     }

//     mainFrame(String t) {
//         super(t);
//         createGUI();
//     }

//     private void createGUI() {
        
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLayout(new GridBagLayout());
//         c.insets = new Insets(5, 5, 5, 5);
//         c.anchor = GridBagConstraints.LINE_START; // komponentet vendosen ne fillim te rreshtit
// // container
//         // Rreshti 0: fushat e tekstit majtas, lista e sporteve djathtas
//         addAt(createTextPanel(), 0, 0, 1, 1, GridBagConstraints.NONE);
//         addAt(createSportsList(), 1, 0, 1, 2, GridBagConstraints.BOTH);
//         // Rreshti 1: gjinia (nen fushat e tekstit)
//         addAt(createGenderPanel(), 0, 1, 1, 1, GridBagConstraints.NONE);
//         // Rreshti 2: gjuhet e programimit
//         addAt(createLanguagePanel(), 0, 2, 2, 1, GridBagConstraints.NONE);
//         // Rreshti 3: butonat ne gjithe gjeresine
//         addAt(createButtonPanel(), 0, 3, 2, 1, GridBagConstraints.HORIZONTAL);

//         pack(); // madhesia e dritares sipas komponenteve, qe te duken te gjitha
//     }

//     /**
//      * Vendos nje komponent ne GridBagLayout ne pozicionin dhe madhesine e dhene.
//      */
//     private void addAt(Component comp, int x, int y, int w, int h, int fill) {
//         c.gridx = x;
//         c.gridy = y;
//         c.gridwidth = w;
//         c.gridheight = h;
//         c.fill = fill;
//         add(comp, c);
//     }

//     /** Dy etiketa me dy fusha teksti (2x2). */
//     private JPanel createTextPanel() {
//         JPanel p = new JPanel(new GridLayout(2, 2));
//         jl1 = new JLabel("Ετικετα 1");
//         jl2 = new JLabel("Ετικετα 2");
//         jtf1 = new JTextField(12);
//         jtf2 = new JTextField(12);

//         p.add(jl1);
//         p.add(jtf1);
//         p.add(jl2);
//         p.add(jtf2);
//         return p;
//     }

//     /** Lista e sporteve. */
//     private JList<String> createSportsList() {
//         String[] dm = { "Ποδόσφαιρο", "Μπάσκετ", "Βόλεϊ", "Άλλα" };
//         jliSports = new JList<>(dm);
//         return jliSports;
//     }

//     /**
//      * Etiketa "Φύλο" me dy radio butona (2x2, etiketa majtas, butonat djathtas).
//      */
//     private JPanel createGenderPanel() {
//         JPanel p = new JPanel(new GridLayout(2, 2));
//         jl3 = new JLabel("Φύλο");
//         jrb1 = new JRadioButton("Ανδρας");
//         jrb2 = new JRadioButton("Γυναίκα");
//         ButtonGroup bg = new ButtonGroup();
//         bg.add(jrb1);
//         bg.add(jrb2);
//         jrb1.setSelected(true);

//         p.add(jl3);
//         p.add(jrb1);
//         p.add(new JLabel(" ")); // etikete bosh per hapesire
//         p.add(jrb2);
//         return p;
//     }

//     /**
//      * Etiketa "Γλώσ Προ/σμού" me tre checkbox (3x2, etiketa majtas, kutite
//      * djathtas).
//      */
//     private JPanel createLanguagePanel() {
//         JPanel p = new JPanel(new GridLayout(3, 2));
//         jl4 = new JLabel("Γλώσ Προ/σμού");
//         jcb1 = new JCheckBox("Python");
//         jcb2 = new JCheckBox("Java");
//         jcb3 = new JCheckBox("C++");

//         p.add(jl4);
//         p.add(jcb1);
//         p.add(new JLabel(" ")); // etikete bosh per hapesire
//         p.add(jcb2);
//         p.add(new JLabel(" "));
//         p.add(jcb3);
//         return p;
//     }

//     /** Tre butona ne nje rresht. */
//     private JPanel createButtonPanel() {
//         JPanel p = new JPanel(new GridLayout(1, 3));
//         b1 = new JButton("Φυλο");
//         b2 = new JButton("Γλώσσα");
//         b3 = new JButton("Κλείσιμο");
//         p.add(b1);
//         p.add(b2);
//         p.add(b3);
//         return p;
//     }

    /*
     * Menyra e vjeter: cdo komponent shtohej direkt ne frame me GridBagConstraints,
     * pa panele. Mbahet per krahasim me createGUI().
     * 
     * private void createGUIOld() {
     * setSize(300, 300);
     * setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     * setLayout(new GridBagLayout());
     * GridBagConstraints c = new GridBagConstraints();
     * // dhmiourgia twn stoixeiwn
     * jl1 = new JLabel("Ετικετα 1");
     * jl2 = new JLabel("Ετικετα 2");
     * jtf1 = new JTextField(12);
     * jtf2 = new JTextField(12);
     * 
     * String[] dm = { "Ποδόσφαιρο", "Μπάσκετ", "Βόλεϊ", "Άλλα" };
     * jliSports = new JList(dm);
     * jl3 = new JLabel("Φύλο");
     * jrb1 = new JRadioButton("Ανδρας");
     * jrb2 = new JRadioButton("Γυναίκα");
     * ButtonGroup bg = new ButtonGroup();
     * bg.add(jrb1);
     * bg.add(jrb2);
     * jrb1.setSelected(true);
     * // chekbox
     * jl4 = new JLabel("Γλώσ Προ/σμού");
     * jcb1 = new JCheckBox("Python");
     * jcb2 = new JCheckBox("Java");
     * jcb3 = new JCheckBox("C++");
     * // dimiourgia panel kai vendosja e tij ne dritare me tre buttona
     * JPanel downPanelB = new JPanel();
     * downPanelB.setLayout(new GridLayout(1, 3));
     * b1 = new JButton("Φυλο");
     * b2 = new JButton("Γλώσσα");
     * b3 = new JButton("Κλείσιμο");
     * downPanelB.add(b1);
     * downPanelB.add(b2);
     * downPanelB.add(b3);
     * // ta prostheso
     * c.insets = new Insets(5, 5, 5, 5);
     * c.anchor = GridBagConstraints.LINE_START; // komponentet do te vendosen ne
     * fillim te rreshtit
     * c.gridx = 0;
     * c.gridy = 0;
     * 
     * add(jl1, c); // rreshti 0, kolona 0
     * c.gridx = 1;
     * add(jtf1, c); // rreshti 0, kolona 1 (anash jl1)
     * 
     * c.gridx = 0;
     * c.gridy = 1;
     * add(jl2, c); // rreshti 1, kolona 0
     * c.gridx = 1;
     * add(jtf2, c);
     * // rreshti 1, kolona 1 (anash jl2)
     * c.gridx = 0;
     * c.gridy = 2;
     * c.gridwidth = 2;
     * c.gridheight = 3;
     * c.fill = GridBagConstraints.BOTH;
     * add(jliSports, c);
     * 
     * c.gridx = 0;
     * c.gridy = 5;
     * c.gridwidth = 1;
     * c.gridheight = 1;
     * c.fill = GridBagConstraints.NONE;
     * add(jl3, c);
     * c.gridx = 1;
     * c.gridy = 5;
     * add(jrb1, c);
     * c.gridx = 1;
     * c.gridy = 6;
     * add(jrb2, c);
     * 
     * // Γλώσ Προ/σμού - njelloj si Φύλο: etiketa ne kolonen 0, kutite ne kolonen 1
     * c.gridx = 0;
     * c.gridy = 7;
     * add(jl4, c);
     * c.gridx = 1;
     * c.gridy = 7;
     * add(jcb1, c);
     * c.gridx = 1;
     * c.gridy = 8;
     * add(jcb2, c);
     * c.gridx = 1;
     * c.gridy = 9;
     * add(jcb3, c);
     * 
     * c.gridx = 0;
     * c.gridy = 10;
     * c.gridwidth = 2;
     * add(downPanelB, c);
     * 
     * pack(); // madhesia e dritares sipas komponenteve, qe te duken te gjitha
     * }
     */
