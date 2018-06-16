/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medievil.FrontIn;

import javax.swing.JOptionPane;
import medievil.Backend.Player;
import medievil.Backend.Character;
import medievil.Backend.Knight;
import medievil.Backend.Princess;
import medievil.Backend.Wizard;


/**
 *
 * @author jose
 */
public class PlayersInfoDialog extends javax.swing.JDialog {
	private Player[] players;
                private Character character;
                private Character character1;
                private int wizardPosition;                    
                private int wizard1Position;
                private int knightPosition;
                private int knight1Position;
                private int princessPosition;
                private int princess1Position;
                
	/**
	 * Creates new form PlayersInfoDialog
	 */
	public PlayersInfoDialog(java.awt.Frame parent) {
		super(parent, true);
		initComponents();
                                 
	}

	/**
	 * This method is called from within the constructor to initialize the form. WARNING:
	 * Do NOT modify this code. The content of this method is always regenerated by the
	 * Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        name1Label = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        name2Label = new javax.swing.JLabel();
        name1Text = new javax.swing.JTextField();
        orderLabel = new javax.swing.JLabel();
        wizardLabel = new javax.swing.JLabel();
        spinnerWizard = new javax.swing.JSpinner();
        knightLabel = new javax.swing.JLabel();
        princessLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        charactersLabel1 = new javax.swing.JLabel();
        wizardLabel1 = new javax.swing.JLabel();
        knightLabel1 = new javax.swing.JLabel();
        princessLabel1 = new javax.swing.JLabel();
        errorLabel = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        spinnerKnight = new javax.swing.JSpinner();
        spinnerPrincess = new javax.swing.JSpinner();
        spinnerWizard1 = new javax.swing.JSpinner();
        spinnerKnight1 = new javax.swing.JSpinner();
        spinnerPrincess1 = new javax.swing.JSpinner();

        setTitle("Names");

        name1Label.setText("Player 1 name:*");

        name2Label.setText("Player 2 name:*");

        orderLabel.setText("Characters Order:");

        wizardLabel.setText("Wizard:");

        spinnerWizard.setModel(new javax.swing.SpinnerNumberModel(1, 1, 3, 1));

        knightLabel.setText("Knight:");

        princessLabel.setText("Princess:");

        charactersLabel1.setText("Characters Order:");

        wizardLabel1.setText("Wizard:");

        knightLabel1.setText("Knight:");

        princessLabel1.setText("Princess:");

        errorLabel.setText("The names are required!");

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        spinnerKnight.setModel(new javax.swing.SpinnerNumberModel(1, 1, 3, 1));

        spinnerPrincess.setModel(new javax.swing.SpinnerNumberModel(1, 1, 3, 1));

        spinnerWizard1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 3, 1));

        spinnerKnight1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 3, 1));

        spinnerPrincess1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 3, 1));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addComponent(wizardLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spinnerWizard1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(knightLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spinnerKnight1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(princessLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spinnerPrincess1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(name1Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(wizardLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spinnerWizard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(knightLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spinnerKnight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(princessLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(spinnerPrincess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nameText)))
                    .addComponent(errorLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(orderLabel)
                            .addComponent(charactersLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(name2Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(name1Text)))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameText)
                    .addComponent(name1Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(orderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wizardLabel)
                    .addComponent(spinnerWizard, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(knightLabel)
                    .addComponent(princessLabel)
                    .addComponent(spinnerKnight, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerPrincess, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name1Text))
                .addGap(18, 18, 18)
                .addComponent(charactersLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wizardLabel1)
                    .addComponent(knightLabel1)
                    .addComponent(princessLabel1)
                    .addComponent(spinnerWizard1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerKnight1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerPrincess1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(errorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(cancelButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
          if (nameText.getText().isEmpty() || name1Text.getText().isEmpty()) {
			errorLabel.setVisible(true);
          		} else {
                                        try {
                                                addValues();
                                                validateSpinners();
                                                character = new Character(new Princess(princessPosition), new Knight(knightPosition), new Wizard(wizardPosition));
                                                character1 = new Character(new Princess(princess1Position), new Knight(knight1Position), new Wizard(wizard1Position));
			players = new Player[2];
			players[0] = new Player(nameText.getText(), character , 5, 1);
			players[1] = new Player(name1Text.getText(), character1, 5, 2);
			setVisible(false);
                                        } catch(Exception e) {
                                                JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                                        }
		}
     }//GEN-LAST:event_saveButtonActionPerformed

     private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
          setVisible(false);
     }//GEN-LAST:event_cancelButtonActionPerformed

	public Player[] getPlayers() {
		return players;
	}

                public void addValues() {
                    wizardPosition = (int) spinnerWizard.getModel().getValue();                    
                    wizard1Position = (int) spinnerWizard1.getModel().getValue();
                    knightPosition = (int) spinnerKnight.getModel().getValue();
                    knight1Position = (int) spinnerKnight1.getModel().getValue();
                    princessPosition = (int) spinnerPrincess.getModel().getValue();
                    princess1Position = (int) spinnerPrincess1.getModel().getValue();                    
                }
	@Override
	public void setVisible(boolean visible) {
		if (visible) {
			players = null;
			nameText.setText("");
			name1Text.setText("");
			errorLabel.setVisible(false);
		}
		super.setVisible(visible);
	}

                public void validateSpinners() throws Exception{                  
                        if(wizardPosition == knightPosition || wizardPosition == princessPosition || knightPosition == princessPosition) {
                            throw new Exception("Primer jugador, verifique las posiciones, no se pueden repetir.");
                        } else if(wizard1Position == knight1Position || wizard1Position == princess1Position || knight1Position == princess1Position) {
                            throw new Exception("Segundo jugador, verifique las posiciones, no se pueden repetir.");                            
                        }
                }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel charactersLabel1;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel knightLabel;
    private javax.swing.JLabel knightLabel1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel name1Label;
    private javax.swing.JTextField name1Text;
    private javax.swing.JLabel name2Label;
    private javax.swing.JTextField nameText;
    private javax.swing.JLabel orderLabel;
    private javax.swing.JLabel princessLabel;
    private javax.swing.JLabel princessLabel1;
    private javax.swing.JButton saveButton;
    private javax.swing.JSpinner spinnerKnight;
    private javax.swing.JSpinner spinnerKnight1;
    private javax.swing.JSpinner spinnerPrincess;
    private javax.swing.JSpinner spinnerPrincess1;
    private javax.swing.JSpinner spinnerWizard;
    private javax.swing.JSpinner spinnerWizard1;
    private javax.swing.JLabel wizardLabel;
    private javax.swing.JLabel wizardLabel1;
    // End of variables declaration//GEN-END:variables
}
