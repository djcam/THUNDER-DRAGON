import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;


public class GameLayout extends JFrame
{

    JPanel master;
    JPanel subMaster;
    JLabel map;
    JPanel bar;
    JPanel players;
    JPanel dice;
    JLabel [] menNames;
    JLayeredPane [] men;
    
    public GameLayout(String inTitle) {
        //Super Panel
        super(inTitle);
        setLayout(new BorderLayout());
        master = new JPanel(new FlowLayout());
        subMaster = new JPanel(new BorderLayout());
        master.add(subMaster);
        add(master, BorderLayout.NORTH);
    }
    
    public void setMap() {
        map = new JLabel(new ImageIcon("/Users/Dan/desktop/images/map.png"));
        JPanel theMap = new JPanel(new FlowLayout());
        theMap.add(map);
        subMaster.add(theMap, BorderLayout.CENTER);
    }
    
    public void setBar(String [] names, int num) {
        men = new JLayeredPane[num];
        menNames = new JLabel[num];
        int height = 300/num;
        
        bar = new JPanel(new BorderLayout());
        bar.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        dice = new JPanel(new FlowLayout());
        players = new JPanel(new GridLayout(num, 1));
        
        for (int i = 0; i < num; i++) {
            men[i] = new JLayeredPane();
            menNames[i] = new JLabel(names[i], SwingConstants.LEFT);
            menNames[i].setBounds(0, 0, 250, 10);
            men[i].add(menNames[i], new Integer(i), 0);
            men[i].setSize(250, height);
            men[i].setVisible(true);
            men[i].validate();
            players.add(men[i]);
        }
        
        JLabel diceLabel = new JLabel("Dice", SwingConstants.LEFT);
        dice.add(diceLabel);
        
        bar.add(dice, BorderLayout.NORTH);
        bar.add(players, BorderLayout.CENTER);
        subMaster.add(bar, BorderLayout.EAST);
       }
}
