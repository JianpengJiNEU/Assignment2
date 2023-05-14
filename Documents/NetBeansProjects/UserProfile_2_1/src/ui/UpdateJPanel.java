/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import model.UserProfile;
import model.UserProfileDirectory;

/**
 *
 * @author jjp
 */
public class AdministrateJPanel extends javax.swing.JPanel {

    private DefaultTableModel model;
    private String selectedImagePath = "";
    private UserProfileDirectory userProfileDirectory;

    /**
     * Creates new form Admin
     */
    public AdministrateJPanel(UserProfileDirectory userProfileDirectory) {
        this.userProfileDirectory = userProfileDirectory;
        initComponents();
        addTableHeader();
        refreshTable();
    }

    private void addTableHeader() {
        model = (DefaultTableModel) userProfileTable.getModel();
        Object[] newIdentifiers = new Object[]{"Name", "Employee ID", "Age", "Gender", "Start Date", "Level", "Team Info", "Position Title", "Phone", "Emali", "Image"};
        model.setColumnIdentifiers(newIdentifiers);
        userProfileTable.setFillsViewportHeight(true);
        userProfileTable.getColumn("Image").setCellRenderer(new CellRenderer());

    }

    class CellRenderer implements TableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table,
                Object value,
                boolean isSelected,
                boolean hasFocus,
                int row,
                int column) {

            TableColumn tb = userProfileTable.getColumn("Image");
            tb.setMaxWidth(60);
            tb.setMinWidth(60);

            userProfileTable.setRowHeight(60);

            return (Component) value;
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        emailLabel = new javax.swing.JLabel();
        jTextFieldLevel = new javax.swing.JTextField();
        uploadPhotoButton = new javax.swing.JButton();
        streetLine1Label = new javax.swing.JLabel();
        jLabelImage = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userProfileTable = new javax.swing.JTable();
        jTextFieldTelephone = new javax.swing.JTextField();
        jTextFieldAge = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        startDate = new com.toedter.calendar.JDateChooser();
        firstNameLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        dobLabel = new javax.swing.JLabel();
        streetLine2Label = new javax.swing.JLabel();
        addDataButton = new javax.swing.JButton();
        degree1StartLabel = new javax.swing.JLabel();
        jTextFieldEmployeeID = new javax.swing.JTextField();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldPositionTitle = new javax.swing.JTextField();
        jTextFieldGender = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        telephoneLabel = new javax.swing.JLabel();
        jTextFieldTeamInfo = new javax.swing.JTextField();
        updateJButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();

        emailLabel.setText("Email");

        uploadPhotoButton.setText("Upload Photo");
        uploadPhotoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadPhotoButtonActionPerformed(evt);
            }
        });

        streetLine1Label.setText("Level");

        userProfileTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Employee ID", "Age", "Gender", "Start date", "Level", "Team info", "Position title", "Phone number", "Email", "Image"
            }
        ));
        userProfileTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userProfileTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(userProfileTable);

        lastNameLabel.setText("Employee ID");

        firstNameLabel.setText("Name");

        ageLabel.setText("Age");

        cityLabel.setText("Position title");

        dobLabel.setText("Gender");

        streetLine2Label.setText("Team info");

        addDataButton.setText("Add Data");
        addDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDataButtonActionPerformed(evt);
            }
        });

        degree1StartLabel.setText("Start date");

        jTextFieldEmployeeID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmployeeIDActionPerformed(evt);
            }
        });

        telephoneLabel.setText("Telephone");

        updateJButton.setText("Update Data");
        updateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateJButtonActionPerformed(evt);
            }
        });

        removeButton.setText("Delete");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ageLabel)
                    .addComponent(degree1StartLabel)
                    .addComponent(firstNameLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telephoneLabel)
                            .addComponent(streetLine2Label))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lastNameLabel)
                        .addGap(35, 35, 35)
                        .addComponent(jTextFieldEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(251, 251, 251)
                                .addComponent(jLabelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(uploadPhotoButton)
                                .addGap(18, 18, 18)))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cityLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(streetLine1Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(dobLabel)
                                .addGap(64, 64, 64)
                                .addComponent(jTextFieldGender, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(emailLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addDataButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(updateJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(260, 260, 260))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(uploadPhotoButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(firstNameLabel)
                                .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lastNameLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ageLabel)
                                .addComponent(dobLabel))
                            .addComponent(jTextFieldGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(degree1StartLabel)
                                        .addGap(24, 24, 24))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(streetLine1Label)
                                            .addComponent(jTextFieldLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)))
                                .addComponent(streetLine2Label))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cityLabel)
                                    .addComponent(jTextFieldPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telephoneLabel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(emailLabel)
                                .addComponent(jTextFieldTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(addDataButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void uploadPhotoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadPhotoButtonActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        JFileChooser browseImageFile = new JFileChooser("C:\\Users\\Public\\Pictures\\Sample Pictures");
        //Filter image extensions
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES", "png", "jpg", "jpeg");
        browseImageFile.addChoosableFileFilter(fnef);
        int showOpenDialogue = browseImageFile.showOpenDialog(null);

        if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {
            File selectedImageFile = browseImageFile.getSelectedFile();
            selectedImagePath = selectedImageFile.getAbsolutePath();
            JOptionPane.showMessageDialog(null, selectedImagePath);
            //Display image on jlable
            ImageIcon ii = new ImageIcon(selectedImagePath);
            System.out.print(selectedImagePath);
            //            Resize image to fit jlabel
            Image image = ii.getImage().getScaledInstance(jLabelImage.getWidth(), jLabelImage.getHeight(), Image.SCALE_SMOOTH);

            jLabelImage.setIcon(new ImageIcon(image));
        }
    }//GEN-LAST:event_uploadPhotoButtonActionPerformed

    private void addDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDataButtonActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        String name = jTextFieldName.getText();
        String employeeID = jTextFieldEmployeeID.getText();
        String age = jTextFieldAge.getText();
        String gender = jTextFieldGender.getText();
        String level = jTextFieldLevel.getText();
        String teamInfo = jTextFieldTeamInfo.getText();
        String positionTitle = jTextFieldPositionTitle.getText();
        String phone = jTextFieldTelephone.getText();
        String email = jTextFieldEmail.getText();
        UserProfile user = userProfileDirectory.addUserProfile();
        user.setName(name);
        user.setEmployeeID(employeeID);
        user.setAge(age);
        user.setGender(gender);
        user.setStartDate(startDate.getDate());
        user.setLevel(level);
        user.setTeamInfo(teamInfo);
        user.setPositionTitle(positionTitle);
        user.setTelephoneNumber(phone);
        user.setEmail(email);

        JLabel imageLabel = new JLabel();
        ImageIcon imageicon = new ImageIcon(selectedImagePath);
        Image img = imageicon.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        imageLabel.setIcon(new ImageIcon(img));

        //Checking if one or more field is empty
        if (name.isEmpty() || gender.isEmpty()) {
            JOptionPane.showMessageDialog(null, "One Or More Fields Are Empty");
        } else {

            model.addRow(new Object[]{name, employeeID, age, gender, startDate.getDate(), level, teamInfo, positionTitle, phone, email, imageLabel});
            JOptionPane.showMessageDialog(null, "Data Inserted");
            //clear fields after inserting the data
            clearFields();
        }
        Image img2 = imageicon.getImage().getScaledInstance(133, 124, Image.SCALE_SMOOTH);
        user.setImageIcon(new ImageIcon(img2));


    }//GEN-LAST:event_addDataButtonActionPerformed

    private void clearFields() {
        jTextFieldName.setText("");
        jTextFieldEmployeeID.setText("");
        jTextFieldAge.setText("");
        jTextFieldGender.setText("");
        startDate.setDate(null);
        jTextFieldLevel.setText("");
        jTextFieldTeamInfo.setText("");
        jTextFieldPositionTitle.setText("");
        jTextFieldTelephone.setText("");
        jTextFieldEmail.setText("");
        ImageIcon ii = new ImageIcon("src\\ui\\profile.jpg");   
        Image image = ii.getImage().getScaledInstance(jLabelImage.getWidth(), jLabelImage.getHeight(), Image.SCALE_SMOOTH);
        jLabelImage.setIcon(new ImageIcon(image));
    }

    private void jTextFieldEmployeeIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmployeeIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmployeeIDActionPerformed

    private void updateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateJButtonActionPerformed
        // TODO add your handling code here:
        int row = userProfileTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String name = jTextFieldName.getText();
        String employeeID = jTextFieldEmployeeID.getText();
        String age = jTextFieldAge.getText();
        String gender = jTextFieldGender.getText();
        String level = jTextFieldLevel.getText();
        String teamInfo = jTextFieldTeamInfo.getText();
        String positionTitle = jTextFieldPositionTitle.getText();
        String phone = jTextFieldTelephone.getText();
        String email = jTextFieldEmail.getText();
        UserProfile user = new UserProfile();
        user.setName(name);
        user.setEmployeeID(employeeID);
        user.setAge(age);
        user.setGender(gender);
        user.setStartDate(startDate.getDate());
        user.setLevel(level);
        user.setTeamInfo(teamInfo);
        user.setPositionTitle(positionTitle);
        user.setTelephoneNumber(phone);
        user.setEmail(email);

        JLabel imageLabel = new JLabel();
        ImageIcon imageicon = new ImageIcon(selectedImagePath);
        Image img = imageicon.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        imageLabel.setIcon(new ImageIcon(img));

        Image img2 = imageicon.getImage().getScaledInstance(133, 124, Image.SCALE_SMOOTH);
        user.setImageIcon(new ImageIcon(img2));
        userProfileDirectory.updateUserProfile(row, user);
        refreshTable();
        //Checking if one or more field is empty
        if (name.isEmpty() || gender.isEmpty()) {
            JOptionPane.showMessageDialog(null, "One Or More Fields Are Empty");
        } else {
            JOptionPane.showMessageDialog(null, "Data updated");
            //clear fields after inserting the data
            clearFields();
        }
    }//GEN-LAST:event_updateJButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        // TODO add your handling code here:

        int row = userProfileTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
//        UserProfile user = (UserProfile) supplierTable.getValueAt(row, 0);
        userProfileDirectory.removeUserProfile(row);
        refreshTable();

    }//GEN-LAST:event_removeButtonActionPerformed

    private void userProfileTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userProfileTableMouseClicked
        // TODO add your handling code here:
        int selectedRow = userProfileTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        UserProfile user = userProfileDirectory.getUserProfileList().get(selectedRow);
        jTextFieldName.setText(model.getValueAt(selectedRow, 0).toString());
        jTextFieldEmployeeID.setText(user.getEmployeeID());
        jTextFieldAge.setText(user.getAge());
        jTextFieldGender.setText(user.getGender());
        startDate.setDate(user.getStartDate());
        jTextFieldLevel.setText(user.getLevel());
        jTextFieldTeamInfo.setText(user.getTeamInfo());
        jTextFieldPositionTitle.setText(user.getPositionTitle());
        jTextFieldTelephone.setText(user.getTelephoneNumber());
        jTextFieldEmail.setText(user.getEmail());
        jLabelImage.setIcon(userProfileDirectory.getUserProfileList().get(selectedRow).getImageIcon());
    }//GEN-LAST:event_userProfileTableMouseClicked

    public void refreshTable() {
        int rowCount = userProfileTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel) userProfileTable.getModel();
        model.setRowCount(0);

        for (UserProfile user : userProfileDirectory.getUserProfileList()) {
            Object row[] = new Object[11];
            row[0] = user.getName();
            row[1] = user.getEmployeeID();
            row[2] = user.getAge();
            row[3] = user.getGender();
            row[4] = user.getStartDate();
            row[5] = user.getLevel();
            row[6] = user.getTeamInfo();
            row[7] = user.getPositionTitle();
            row[8] = user.getTelephoneNumber();
            row[9] = user.getEmail();

            JLabel imageLabel = new JLabel();
            ImageIcon imageicon = user.getImageIcon();
            Image img = imageicon.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
            imageLabel.setIcon(new ImageIcon(img));
            row[10] = imageLabel;
//            model.addRow(new Object[]{user.getName(), "", "", user.getGender(), "", "", imageLabel});
            model.addRow(row);

            System.out.println(user.getName());

        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDataButton;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JLabel degree1StartLabel;
    private javax.swing.JLabel dobLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel jLabelImage;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldAge;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEmployeeID;
    private javax.swing.JTextField jTextFieldGender;
    private javax.swing.JTextField jTextFieldLevel;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPositionTitle;
    private javax.swing.JTextField jTextFieldTeamInfo;
    private javax.swing.JTextField jTextFieldTelephone;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JButton removeButton;
    private com.toedter.calendar.JDateChooser startDate;
    private javax.swing.JLabel streetLine1Label;
    private javax.swing.JLabel streetLine2Label;
    private javax.swing.JLabel telephoneLabel;
    private javax.swing.JButton updateJButton;
    private javax.swing.JButton uploadPhotoButton;
    private javax.swing.JTable userProfileTable;
    // End of variables declaration//GEN-END:variables
}
