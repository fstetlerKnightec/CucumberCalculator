package org.example;


import javax.swing.*;

public class FrontEnd {
    public JFrame frame = new JFrame("Calculator");
    public final JTextField sumField = new JTextField();
    public final JTextField stringOutputField = new JTextField();
    public JButton oneButton = new JButton("1");
    public JButton twoButton = new JButton("2");
    public JButton threeButton = new JButton("3");
    public JButton fourButton = new JButton("4");
    public JButton fiveButton = new JButton("5");
    public JButton sixButton = new JButton("6");
    public JButton sevenButton = new JButton("7");
    public JButton eightButton = new JButton("8");
    public JButton nineButton = new JButton("9");
    public JButton zeroButton = new JButton("0");
    public JButton plusButton = new JButton("+");
    public JButton minusButton = new JButton("-");
    public JButton timesButton = new JButton("*");
    public JButton divideButton = new JButton("/");
    public JButton sumButton = new JButton("=");
    public JButton clearButton = new JButton("Clear");
    public JButton closeButton = new JButton("Close");

    public void initialize() {
        sumField.setBounds(50, 50, 150, 20);
        stringOutputField.setBounds(50, 90, 150, 20);

        setBoundsOnButtons();
        addButtonsToFrame();

        frame.add(sumField);
        frame.add(stringOutputField);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    private void addButtonsToFrame() {
        frame.add(oneButton);
        frame.add(twoButton);
        frame.add(threeButton);
        frame.add(fourButton);
        frame.add(fiveButton);
        frame.add(sixButton);
        frame.add(sevenButton);
        frame.add(eightButton);
        frame.add(nineButton);
        frame.add(zeroButton);

        frame.add(plusButton);
        frame.add(minusButton);
        frame.add(divideButton);
        frame.add(timesButton);
        frame.add(sumButton);
        frame.add(clearButton);
        frame.add(closeButton);
    }

    private void setBoundsOnButtons() {
        oneButton.setBounds(50, 270, 50, 50);
        twoButton.setBounds(120, 270, 50, 50);
        threeButton.setBounds(190, 270, 50, 50);
        fourButton.setBounds(50, 200, 50, 50);
        fiveButton.setBounds(120, 200, 50, 50);
        sixButton.setBounds(190, 200, 50, 50);
        sevenButton.setBounds(50, 130, 50, 50);
        eightButton.setBounds(120, 130, 50, 50);
        nineButton.setBounds(190, 130, 50, 50);
        zeroButton.setBounds(50, 340, 50, 50);

        plusButton.setBounds(260, 270, 50, 50);
        minusButton.setBounds(260, 200, 50, 50);
        timesButton.setBounds(260, 130, 50, 50);
        divideButton.setBounds(330, 200, 50, 50);
        clearButton.setBounds(330, 340, 50, 50);
        closeButton.setBounds(260, 340, 50, 50);

        sumButton.setBounds(330, 270, 50, 50);
    }
}
