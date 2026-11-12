/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaappgui02;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Image;

/**
 *
 * @author iektm1-03
 */
public class PicturFrame extends JFrame {
    JComboBox<String> picSelect = new JComboBox<>();
    JLabel jbPic = new JLabel("Επιλέξτε άθλημα");
    String path;
    PicturFrame(){
        super();
        createGUI();
    }
    PicturFrame(String t){
        super(t);
        createGUI();
    }
    private void createGUI(){
        setSize(250, 350);
        setLocation(520, 0); // qe te mos dale mbi dritaren e pare
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        DefaultComboBoxModel<String> dlm = new DefaultComboBoxModel<>();
        // user.dir = dosja e projektit (JavaAppGUI02) kur ekzekutohet nga NetBeans
        path = System.getProperty("user.dir") + "/rescur/images/";
        dlm.addElement("Bird.gif");
        dlm.addElement("Cat.gif");
        dlm.addElement("Dog.gif");
        dlm.addElement("Pig.gif");
        dlm.addElement("Rabbit.gif");
      
        picSelect = new JComboBox<>(dlm);
        jbPic = new JLabel();
        // shfaq foton e zgjedhur (ne fillim e para: Bird.gif)
        jbPic.setIcon(loadScaled((String) picSelect.getSelectedItem()));
        // kur ndryshon zgjedhja, ndrysho edhe foton
        picSelect.addActionListener(e ->
            jbPic.setIcon(loadScaled((String) picSelect.getSelectedItem())));

        // 5 pixels hapesire rreth cdo komponenti
        c.insets = new Insets(2, 2, 2, 2);

        // rreshti 0: lista e fotove, ne gjithe gjeresine
        c.gridx = 0;
        c.gridy = 0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.PAGE_START;
        c.weightx = 1.0;
        add(picSelect, c);

        // rreshti 1: fotoja, ne qender
        c.gridx = 0;
        c.gridy = 1;
        c.fill = GridBagConstraints.BOTH;
        c.anchor = GridBagConstraints.CENTER;
        //c.gridheight = 3;
        c.weightx = 1.0;
        c.weighty = 1.0;
        add(jbPic, c);
    }

    // ngarkon foton nga dosja dhe e zvogelon/zmadhon ne 250x250
    private ImageIcon loadScaled(String fileName) {
        ImageIcon original = new ImageIcon(path + fileName);
        Image scaled = original.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
        return new ImageIcon(scaled);
    }
}