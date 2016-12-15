package player.view.game;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import player.models.Level;
import player.view.game.submitbutton.CustomSubmitButton;

public class InfoPanel extends JPanel {
    protected Level level;
    protected JLabel highScore;
    protected JLabel currentScore;
    protected JLabel highScoreNum;
    protected JLabel scoreNum;

    protected StarPanel star1;
    protected StarPanel star2;
    protected StarPanel star3;

    protected WordPanel wordsFound;

    protected CustomResetButton reset;
    protected CustomUndoButton undo;
    protected JButton quit;


    public InfoPanel(Level l) {
        this.setLevel(l);
        initialize();
    }

    private void initialize() {
        setBounds(660, 170, 260, 510);
        //setBackground(Color.lightGray);

        setHighScore(new JLabel("High score"));
        getHighScore().setFont(getHighScore().getFont().deriveFont(18.0f));
        highScoreNum = new JLabel();
        sethighScoreNum(0);
        gethighScoreNum().setFont(gethighScoreNum().getFont().deriveFont(18.0f));

        setCurrentScore(new JLabel("Score"));
        getCurrentScore().setFont(getHighScore().getFont().deriveFont(18.0f));
        scoreNum = new JLabel();
        setscoreNum(0);
        getscoreNum().setFont(getscoreNum().getFont().deriveFont(18.0f));

        setStar1(new StarPanel(1, 0));
        setStar2(new StarPanel(2, 0));
        setStar3(new StarPanel(3, 0));

        setWordsFound(new WordPanel());

        reset = new CustomResetButton(getLevel(), this);
        undo = new CustomUndoButton(getLevel(), wordsFound, this);
        setQuit(new JButton("Skip"));

        GroupLayout groupLayout = new GroupLayout(this);

        groupLayout.setVerticalGroup(
                groupLayout.createSequentialGroup()
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGroup(groupLayout.createParallelGroup()
                                        .addComponent(getHighScore(), GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(gethighScoreNum(), GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                                //.addGap(18)
                                .addGroup(groupLayout.createParallelGroup()
                                        .addComponent(getCurrentScore(), GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(getscoreNum(), GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                                //.addComponent(currentScore, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addComponent(getStar1(), GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addComponent(getStar2(), GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addComponent(getStar3(), GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                //.addComponent(progressbar, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                //.addPreferredGap(ComponentPlacement.RELATED)
                                .addContainerGap(0, 0))
                        .addComponent(getWordsFound(), GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)

                        .addGap(60)
                        .addGroup(groupLayout.createParallelGroup()
                                .addComponent(getReset(), GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        )
                        .addGap(8)

                        .addGroup(groupLayout.createParallelGroup()
                                .addComponent(getUndo(), GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addComponent(getQuit(), GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)));

        groupLayout.setHorizontalGroup(

                groupLayout.createParallelGroup()
                        .addGroup(groupLayout.createSequentialGroup()
                                .addComponent(getHighScore(), GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
                                .addComponent(gethighScoreNum(), GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
                        .addGroup(groupLayout.createSequentialGroup()
                                .addComponent(getCurrentScore(), GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
                                .addComponent(getscoreNum(), GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
                        //.addComponent(currentScore, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
                        //.addComponent(progressbar, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
                        .addComponent(getStar1(), GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                        .addComponent(getStar2(), GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                        .addComponent(getStar3(), GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                        .addComponent(getWordsFound(), GroupLayout.PREFERRED_SIZE, this.getWidth(), GroupLayout.PREFERRED_SIZE)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addComponent(getReset(), GroupLayout.PREFERRED_SIZE, this.getWidth() / 2, GroupLayout.PREFERRED_SIZE))
                        .addGroup(groupLayout.createSequentialGroup()
                                .addComponent(getUndo(), GroupLayout.PREFERRED_SIZE, this.getWidth() / 2, GroupLayout.PREFERRED_SIZE)
                                .addComponent(getQuit(), GroupLayout.PREFERRED_SIZE, this.getWidth() / 2, GroupLayout.PREFERRED_SIZE)));

        setLayout(groupLayout);
    }

    public void setStar1(StarPanel star1) {
        this.star1 = star1;
    }

    public void setStar2(StarPanel star2) {
        this.star2 = star2;
    }

    public void setStar3(StarPanel star3) {
        this.star3 = star3;
    }

    public StarPanel getStar1() {
        return star1;
    }

    public StarPanel getStar2() {
        return star2;
    }

    public StarPanel getStar3() {
        return star3;
    }

    public JButton getReset() {
        return reset;
    }

    public JButton getUndo() {
        return undo;
    }

    public JButton getQuit() {
        return quit;
    }

    public void setReset(CustomResetButton reset) {
        this.reset = reset;
    }

    public void setUndo(CustomUndoButton undo) {
        this.undo = undo;
    }

    public void setQuit(JButton quit) {
        this.quit = quit;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public WordPanel getWordsFound() {
        return wordsFound;
    }

    public void setWordsFound(WordPanel wordsFound) {
        this.wordsFound = wordsFound;
    }

    public JLabel getHighScore() {
        return highScore;
    }

    public JLabel getCurrentScore() {
        return currentScore;
    }

    public JLabel gethighScoreNum() {
        return highScoreNum;
    }

    public JLabel getscoreNum() {
        return scoreNum;
    }

    public void setHighScore(JLabel highScore) {
        this.highScore = highScore;
    }

    public void setCurrentScore(JLabel currentScore) {
        this.currentScore = currentScore;
    }

    public void sethighScoreNum(int input) {
        this.highScoreNum.setText("" + input);
    }

    public void setscoreNum(int input) {
        this.scoreNum.setText("" + input);
    }
}
