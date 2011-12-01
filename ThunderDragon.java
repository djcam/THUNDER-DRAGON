import javax.swing.JFrame;

public class ThunderDragon
{
    static public void main(String args[]) throws Exception {
        String [] names = new String[4];
        int numPlayers = 4;
        GameLayout game = new GameLayout("THUNDER DRAGON!");
        InputFrame playersWin = new InputFrame(game, "Add Players",
                                               "Enter Players' Names", true);
            
        game.pack();
        game.setSize(530, 480);
        game.setVisible(true);
        game.getContentPane().add(playersWin);
        while (!playersWin.getDone()) {}
        for (int i = 0; i < 4; i++) {
            names[i] = playersWin.getText(i);
            if (names[i].equals(""))
                numPlayers--;
        }
        
        //Jams jams = new Jams();
        //jams.play();
        
        game.getContentPane().remove(playersWin);
        game.setMap();
        game.setBar(names, numPlayers);
        game.pack();
        game.setSize(1000, 598);
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
