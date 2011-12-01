import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InputFrame extends Panel
{
    private boolean done;
    private JButton doneButton;
    private JLabel label;
    private JTextField text1;
    private JTextField text2;
    private JTextField text3;
    private JTextField text4;
    
    public InputFrame(JFrame mainFrame, String inTitle, 
                      String inLabel, boolean modal)
    {
        super();
        setLayout(new BorderLayout());
        done = false;
        
        JPanel master = new JPanel(new BorderLayout());
        JPanel topPan = new JPanel(new BorderLayout());
        JLayeredPane midPane = new JLayeredPane();
        JLabel imagePan = new JLabel(new ImageIcon("/Users/Dan/desktop/images/scroll.png"));
        JPanel botPan = new JPanel(new FlowLayout());
        
        inLabel = "   "+inLabel;
        //label = new JLabel(inLabel, SwingConstants.LEFT);
        //topPan.add(label, BorderLayout.WEST);
        
        imagePan.setBounds(0, 0, 500, 400);
        midPane.add(imagePan, new Integer(0), 0);
        label = new JLabel(new ImageIcon("/Users/Dan/desktop/images/enterplayer.png"));
        label.setBounds(140, 60, 220, 30);
        text1 = new JTextField(20);
        text1.setBounds(105, 115, 300, 25);
        text2 = new JTextField(20);
        text2.setBounds(105, 165, 300, 25);
        text3 = new JTextField(20);
        text3.setBounds(105, 215, 300, 25);
        text4 = new JTextField(20);
        text4.setBounds(105, 265, 300, 25);
        midPane.add(label, new Integer(1), 0);
        midPane.add(text1, new Integer(2), 0);
        midPane.add(text2, new Integer(3), 0);
        midPane.add(text3, new Integer(4), 0);
        midPane.add(text4, new Integer(5), 0);
        midPane.validate();
        midPane.setVisible(true);
        
        doneButton = new JButton("Done");
        botPan.add(doneButton);
        
        //master.add(topPan, BorderLayout.NORTH);
        master.add(midPane, BorderLayout.CENTER);
        master.add(botPan, BorderLayout.SOUTH);
        add(master);

        doneButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                setVisible(false);
                done = true;
            }
        });
        
        setVisible(true);
    }
        
    public boolean getDone() {
        return done;
    }
    
    public String getText(int i) {
        if (i == 0)
            return text1.getText();
        if (i == 1)
            return text2.getText();
        if (i == 2)
            return text3.getText();
        
        return text4.getText();
    }
    
}