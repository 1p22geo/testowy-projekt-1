package org.example;

import javax.swing.*;
import java.awt.*;

public class VehicleDetailsDialog extends JDialog {

  public VehicleDetailsDialog(JFrame parent) {
    super(parent, "Vehicle Details", true);
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    setLayout(new BorderLayout(10, 10));

    JPanel formPanel = new JPanel(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(5, 5, 5, 5);
    gbc.fill = GridBagConstraints.HORIZONTAL;

    JLabel modelLabel = new JLabel("Model:");
    JTextField modelField = new JTextField(15);

    JLabel mileageLabel = new JLabel("Przebieg:");
    JTextField mileageField = new JTextField(15);

    JLabel yearLabel = new JLabel("Rok produkcji:");
    JTextField yearField = new JTextField(15);

    JButton saveButton = new JButton("Zapisz");

    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.anchor = GridBagConstraints.WEST;
    formPanel.add(modelLabel, gbc);

    gbc.gridx = 1;
    gbc.gridy = 0;
    gbc.weightx = 1.0;
    formPanel.add(modelField, gbc);

    gbc.gridx = 0;
    gbc.gridy = 1;
    gbc.weightx = 0.0;
    formPanel.add(mileageLabel, gbc);

    gbc.gridx = 1;
    gbc.gridy = 1;
    gbc.weightx = 1.0;
    formPanel.add(mileageField, gbc);

    gbc.gridx = 0;
    gbc.gridy = 2;
    gbc.weightx = 0.0;
    formPanel.add(yearLabel, gbc);

    gbc.gridx = 1;
    gbc.gridy = 2;
    gbc.weightx = 1.0;
    formPanel.add(yearField, gbc);

    JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
    buttonPanel.add(saveButton);

    saveButton.addActionListener(e -> dispose());

    add(formPanel, BorderLayout.CENTER);
    add(buttonPanel, BorderLayout.SOUTH);

    pack();
    setLocationRelativeTo(parent);
  }
}
