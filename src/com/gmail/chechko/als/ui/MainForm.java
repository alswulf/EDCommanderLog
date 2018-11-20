package com.gmail.chechko.als.ui;

import com.gmail.chechko.als.parser.LogParser;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {
    private JPanel mainPanel;
    private JTextArea logsArea;
    private JButton processButton;

    private static LogParser logParser;

    public MainForm() {
        processButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                logParser = new LogParser("netLog.180729011842.01.log");
                logsArea.append(logParser.parse().toString());
            }
        });
    }

    private static void initComponents()
    {
        JFrame mainFrame = new JFrame("ED Commander's Log");
        mainFrame.setContentPane(new MainForm().mainPanel);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(1000, 850);
        mainFrame.setResizable(false);
        mainFrame.setVisible(true);
    }

    private static void initParser()
    {

    }

    public static void main(String[] args)
    {
        initComponents();
    }
}
