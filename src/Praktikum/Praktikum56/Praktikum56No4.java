/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class Praktikum56No4 extends javax.swing.JFrame {

    /**
     * Creates new form Praktikum56No4
     */
    public Praktikum56No4() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        labelBilangan1 = new javax.swing.JLabel();
        labelBilangan2 = new javax.swing.JLabel();
        fieldBilangan1 = new javax.swing.JTextField();
        fieldBilangan2 = new javax.swing.JTextField();
        radioTambahan = new javax.swing.JRadioButton();
        radioKurangan = new javax.swing.JRadioButton();
        radioPembagian = new javax.swing.JRadioButton();
        radioPerkalian = new javax.swing.JRadioButton();
        buttonProses = new javax.swing.JButton();
        labelHasil = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelBilangan1.setText("Bilangan 1");

        labelBilangan2.setText("Bilangan 2");

        buttonGroup1.add(radioTambahan);
        radioTambahan.setText("Tambahan");

        buttonGroup1.add(radioKurangan);
        radioKurangan.setText("Kurangan");

        buttonGroup1.add(radioPembagian);
        radioPembagian.setText("Pembagian");

        buttonGroup1.add(radioPerkalian);
        radioPerkalian.setText("Perkalian");

        buttonProses.setText("proses");
        buttonProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProsesActionPerformed(evt);
            }
        });

        labelHasil.setText("HASIL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelBilangan1)
                                .addGap(18, 18, 18)
                                .addComponent(fieldBilangan1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelBilangan2)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonProses)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(radioPerkalian)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(radioPembagian)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(radioKurangan)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(radioTambahan)
                                                    .addComponent(fieldBilangan2)))))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(labelHasil)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBilangan1)
                    .addComponent(fieldBilangan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBilangan2)
                    .addComponent(fieldBilangan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(radioTambahan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioKurangan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioPembagian)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioPerkalian)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonProses)
                .addGap(18, 18, 18)
                .addComponent(labelHasil)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProsesActionPerformed
        // TODO add your handling code here:
        int a = Integer.parseInt(fieldBilangan1.getText());
        int b = Integer.parseInt(fieldBilangan2.getText());
        
        if(radioTambahan.isSelected()) {
            int hasilInteger = a+b;
            String hasil = new Integer(hasilInteger).toString();
            labelHasil.setText(hasil);
        } else if(radioKurangan.isSelected()) {
            int hasilInteger = a-b;
            String hasil = new Integer(hasilInteger).toString();
            labelHasil.setText(hasil);
        } else if(radioPembagian.isSelected()) {
            int hasilInteger = a/b;
            String hasil = new Integer(hasilInteger).toString();
            labelHasil.setText(hasil);
        } else if(radioPerkalian.isSelected()) {
            int hasilInteger = a*b;
            String hasil = new Integer(hasilInteger).toString();
            labelHasil.setText(hasil);
        } else {
            labelHasil.setText("Invalid");
        }
    }//GEN-LAST:event_buttonProsesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Praktikum56No4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Praktikum56No4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Praktikum56No4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Praktikum56No4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Praktikum56No4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton buttonProses;
    private javax.swing.JTextField fieldBilangan1;
    private javax.swing.JTextField fieldBilangan2;
    private javax.swing.JLabel labelBilangan1;
    private javax.swing.JLabel labelBilangan2;
    private javax.swing.JLabel labelHasil;
    private javax.swing.JRadioButton radioKurangan;
    private javax.swing.JRadioButton radioPembagian;
    private javax.swing.JRadioButton radioPerkalian;
    private javax.swing.JRadioButton radioTambahan;
    // End of variables declaration//GEN-END:variables
}
