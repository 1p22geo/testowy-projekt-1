package org.example;

import javax.swing.*;
import java.awt.*;

public class VehicleStatsDialog extends JDialog {

  public VehicleStatsDialog(JFrame parent) {
    super(parent, "Vehicle Statistics", true);
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    setLayout(new BorderLayout(10, 10));

    JPanel statsPanel = new JPanel(new GridLayout(3, 2, 10, 10));
    statsPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

    statsPanel.add(new JLabel("Liczba samochodów:", SwingConstants.RIGHT));
    statsPanel.add(new JTextField("6", 5));

    statsPanel.add(new JLabel("suma przebiegu:", SwingConstants.RIGHT));
    statsPanel.add(new JTextField("125 000", 5));

    statsPanel.add(new JLabel("najstarszy rocznik:", SwingConstants.RIGHT));
    statsPanel.add(new JTextField("1991", 5));

    JButton okButton = new JButton("OK");
    okButton.addActionListener(e -> dispose());

    JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
    buttonPanel.add(okButton);

    add(statsPanel, BorderLayout.CENTER);
    add(buttonPanel, BorderLayout.SOUTH);

    pack();
    setLocationRelativeTo(parent);
  }
}
