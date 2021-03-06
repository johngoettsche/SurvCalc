/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survcalc.view;

/**
 *
 * @author John H. Goettsche <john.h.goettsche@gmail.com>
 */
public class PointCoordinatePanel extends javax.swing.JPanel {

    /**
     * Creates new form PointCoordinatePanel
     */
    public PointCoordinatePanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        numberField = new javax.swing.JTextField();
        northingField = new javax.swing.JTextField();
        eastingField = new javax.swing.JTextField();
        elevationField = new javax.swing.JTextField();
        descriptionField = new javax.swing.JTextField();
        northingLabel = new javax.swing.JLabel();
        eastingLabel = new javax.swing.JLabel();
        elevationLabel = new javax.swing.JLabel();
        descriptionLable = new javax.swing.JLabel();

        jLabel1.setText("Point Number");
        jLabel1.setToolTipText("");

        northingLabel.setText("Northing");

        eastingLabel.setText("Easting");

        elevationLabel.setText("Elevation");

        descriptionLable.setText("Description");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(northingLabel)
                    .addComponent(eastingLabel)
                    .addComponent(elevationLabel)
                    .addComponent(descriptionLable))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(northingField)
                    .addComponent(numberField)
                    .addComponent(eastingField)
                    .addComponent(elevationField)
                    .addComponent(descriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(numberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(northingField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(northingLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eastingField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eastingLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elevationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(elevationLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descriptionLable))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public String getNumberField(){
        return numberField.getText();
    }
    
    public String getNorthingField(){
        return northingField.getText();
    }
    
    public String getEastingField(){
        return eastingField.getText();
    }
    
    public String getElevationField(){
        return elevationField.getText();
    }
    
    public String getDescriptionField(){
        return descriptionField.getText();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField descriptionField;
    private javax.swing.JLabel descriptionLable;
    private javax.swing.JTextField eastingField;
    private javax.swing.JLabel eastingLabel;
    private javax.swing.JTextField elevationField;
    private javax.swing.JLabel elevationLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField northingField;
    private javax.swing.JLabel northingLabel;
    private javax.swing.JTextField numberField;
    // End of variables declaration//GEN-END:variables
}
