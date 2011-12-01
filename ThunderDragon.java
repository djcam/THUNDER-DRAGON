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
        game.getContentPane().add(playersWin);
        game.setVisible(true);

        while (!playersWin.getDone()) {}
        for (int i = 0; i < 4; i++) {
            names[i] = playersWin.getText(i);
            if (names[i].equals(""))
                numPlayers--;
        }
        game.dispose();

        System.out.println(names[0]);
        game = new GameLayout("THUNDER DRAGON!");
        Jams jams = new Jams();
        jams.play();
        game.setMap();
        game.setBar(names, numPlayers);
        game.pack();
        game.setSize(1000, 615);
        game.setVisible(true);

    }
}
