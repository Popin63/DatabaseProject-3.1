/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package microfinancemanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Atel Dot Net
 */
public class Setting extends javax.swing.JFrame {

    /**
     * Creates new form Setting
     */
    public Setting() {
        initComponents();
        Rate_Show();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        MonthlyRate = new javax.swing.JTextField();
        DaillyRate = new javax.swing.JTextField();
        WeeklyRate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 51, 204));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("UPDATE LOAN RATE ");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(610, 20, 420, 70);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1370, 100);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(0, 51, 204));
        jPanel4.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DAILLY RATE       :");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(60, 40, 240, 60);

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("WEEKLY RATE     :");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(60, 130, 240, 60);

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MONTHLY RATE :");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(60, 210, 240, 60);

        MonthlyRate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MonthlyRate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(MonthlyRate);
        MonthlyRate.setBounds(310, 220, 220, 40);

        DaillyRate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DaillyRate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(DaillyRate);
        DaillyRate.setBounds(310, 50, 220, 40);

        WeeklyRate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        WeeklyRate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(WeeklyRate);
        WeeklyRate.setBounds(310, 140, 220, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("%");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(540, 220, 50, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("%");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(540, 50, 70, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("%");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(540, 140, 70, 40);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(60, 50, 790, 320);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(240, 170, 910, 420);

        jButton1.setBackground(new java.awt.Color(0, 51, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/microfinancemanagement/update_32.png"))); // NOI18N
        jButton1.setText("    UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(610, 600, 180, 80);

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DATA UPDATE FOR 120 DAYS OR 4 MONTH");
        jPanel5.add(jLabel5);
        jLabel5.setBounds(240, 10, 290, 30);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(360, 110, 690, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1370, 730);

        setSize(new java.awt.Dimension(1383, 767));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
           try
        {
            
           // float D_Amount=Float.parseFloat(amount);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=MicroFinanceManagement;user=sa;password=123456";
          Connection  con4 = DriverManager.getConnection(url);

            String a=DaillyRate.getText();
            String b=WeeklyRate.getText();
            String c=MonthlyRate.getText();
            
            int a1=Integer.parseInt(a);
            int b1=Integer.parseInt(b);
            int c1=Integer.parseInt(c);
            
            
            String sql = "Update LOANRATE set Dailly="+a1+", WEEKLY="+b1+", MONTHLY="+c1+"";

            
            PreparedStatement pst = con4.prepareStatement(sql);
            
       
            pst.executeUpdate();

         //   JOptionPane.showMessageDialog(null, "LOAN STATUS CLEAR");
          //  Loan_Complete.setText("LOAN ALREADY COMPLETED");
            con4.close();
            JOptionPane.showConfirmDialog(null, "SUCCESSFULLY UPDATED");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
      
        
    }//GEN-LAST:event_jButton1ActionPerformed
public void Rate_Show()
{
    try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=MicroFinanceManagement;selectMethod=cursor", "sa", "123456");


            Statement statement = connection.createStatement();
            ResultSet resultSet = statement
                    .executeQuery("SELECT * FROM LOANRATE");
            
            int x=0, y=0, z=0;
            while (resultSet.next()) {
                
                x=resultSet.getInt("Dailly");
                y=resultSet.getInt("WEEKLY");
                z=resultSet.getInt("MONTHLY");
              
            }
           
            DaillyRate.setText(""+x);
            WeeklyRate.setText(""+y);
            MonthlyRate.setText(""+z);
            
           connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
}
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
            java.util.logging.Logger.getLogger(Setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Setting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DaillyRate;
    private javax.swing.JTextField MonthlyRate;
    private javax.swing.JTextField WeeklyRate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}