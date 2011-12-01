import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;


public class GameLayout extends JFrame
{

    JPanel master;
    JPanel subMaster;
    ImageFrame map;
    JPanel bar;
    JPanel players;
    JPanel dice;
    
    public GameLayout(String inTitle) {
        //Super Panel
        super(inTitle);
        setLayout(new BorderLayout());
       
    }
    
    public void setMap() {
        map = new ImageFrame("/Users/Dan/desktop/map.png");
        map.setBounds(0, 0, 768, 598);
        add(map, BorderLayout.CENTER);
        validate();
    }
    
    public void setBar(String [] names, int num) {
        bar = new JPanel(new BorderLayout());
        bar.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        bar.setSize(232, 598);
        
        dice = new JPanel(new FlowLayout());
        players = new JPanel(new GridLayout(num, 1));
        
        for (int i = 0; i < num; i++) {
            JLabel name = new JLabel(names[i], SwingConstants.LEFT);
            players.add(name);
        }
        
        dice.setSize(232, 250);
        JLabel diceLabel = new JLabel("Dice", SwingConstants.LEFT);
        dice.add(diceLabel);
        
        bar.add(dice, BorderLayout.NORTH);
        bar.add(players, BorderLayout.WEST);
        add(bar, BorderLayout.EAST);
   
        validate();
    }
}
