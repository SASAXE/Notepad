import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;

public class SimpleNotepad {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Notepad");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane);

        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);

        
        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        newItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
            }
        });

        openItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                if (chooser.showOpenDialog(frame) == JFileChooser.APPROVE_OPTION) {
                    try {
                        File file = chooser.getSelectedFile();
                        BufferedReader reader = new BufferedReader(new FileReader(file));
                        String line = reader.readLine();
                        String content = "";
                        while (line != null) {
                            content += line + "\n";
                            line = reader.readLine();
                        }
                        textArea.setText(content);
                        reader.close();
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(frame, "Oops! Can't open that.");
                    }
                }
            }
        });

        saveItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                if (chooser.showSaveDialog(frame) == JFileChooser.APPROVE_OPTION) {
                    try {
                        File file = chooser.getSelectedFile();
                        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                        textArea.write(writer);
                        writer.close();
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(frame, "Oops! Can't save that.");
                    }
                }
            }
        });

        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        
        JMenu editMenu = new JMenu("Edit");
        menuBar.add(editMenu);
        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");
        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        cutItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.cut();
            }
        });

        copyItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.copy();
            }
        });

        pasteItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.paste();
            }
        });

        
        JMenu formatMenu = new JMenu("Format");
        menuBar.add(formatMenu);
        JMenuItem fontItem = new JMenuItem("Choose Font");
        JMenuItem colorItem = new JMenuItem("Choose Color");
        formatMenu.add(fontItem);
        formatMenu.add(colorItem);

        fontItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JDialog fontDialog = new JDialog(frame, "Choose Font", true);
                JPanel panel = new JPanel();
                String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
                JComboBox<String> fontBox = new JComboBox<>(fonts);
                JSpinner sizeSpinner = new JSpinner(new SpinnerNumberModel(12, 1, 72, 1));
                JCheckBox boldCheck = new JCheckBox("Bold");
                JCheckBox italicCheck = new JCheckBox("Italic");
                JButton okButton = new JButton("OK");
                okButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent ee) {
                        String fontName = (String) fontBox.getSelectedItem();
                        int size = (Integer) sizeSpinner.getValue();
                        int style = Font.PLAIN;
                        if (boldCheck.isSelected()) style |= Font.BOLD;
                        if (italicCheck.isSelected()) style |= Font.ITALIC;
                        textArea.setFont(new Font(fontName, style, size));
                        fontDialog.dispose();
                    }
                });
                panel.add(new JLabel("Font:"));
                panel.add(fontBox);
                panel.add(new JLabel("Size:"));
                panel.add(sizeSpinner);
                panel.add(boldCheck);
                panel.add(italicCheck);
                panel.add(okButton);
                fontDialog.add(panel);
                fontDialog.pack();
                fontDialog.setVisible(true);
            }
        });

        colorItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Color color = JColorChooser.showDialog(frame, "Pick a Color", Color.BLACK);
                if (color != null) {
                    textArea.setForeground(color);
                }
            }
        });

        
        JMenu helpMenu = new JMenu("Help");
        menuBar.add(helpMenu);
        JMenuItem aboutItem = new JMenuItem("About");
        helpMenu.add(aboutItem);

        aboutItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Sasanka\nID: s16800\nThis is my notepad!");
            }
        });

        frame.setVisible(true);
    }
}
