/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package microfinancemanagement;

import java.awt.Image;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Atel Dot Net
 */
public class LoanPay extends javax.swing.JFrame {

     DefaultListModel defaultListModel=new DefaultListModel();
     //DefaultTableModel model = new DefaultTableModel();
    int MemberID_id;
    String Apply_MemberId;
    public Connection connection;
    float HavetoPay=0;
    boolean loan_complete=false;
    boolean MouseExit=false;
    Connection con1, con2, con3, con4;
    String MEMBERNAME;
      StringBuffer strBuffer = new StringBuffer();
      float PRINT_TOTAL_SUM=0;
      
       Vector<String> DATA1 = new Vector<String>(); 
       Vector<String> DATA2 = new Vector<String>();
       Vector<String> DATA3 = new Vector<String>();
     // DefaultTableModel model = new DefaultTableModel();
    /**
     * Creates new form LoanPay
     */
    public LoanPay() {
        initComponents();
        this.bindData();
       jScrollPane2.setVisible(false);
       jScrollPane2.setBounds(0,0,0,0);
    }
    
      
 private ArrayList getStars()
{
    ArrayList stars=new ArrayList();
    
    try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection connection = DriverManager.getConnection(
                "jdbc:sqlserver://localhost:1433;databaseName=MicroFinanceManagement;selectMethod=cursor", "sa", "123456");


            Statement statement = connection.createStatement();
            ResultSet resultSet = statement
                    .executeQuery("SELECT MemberId, MemberName FROM AdmissionForm");
            
            
            while (resultSet.next()) {
                
               int MemberID=resultSet.getInt("MemberId");
                String MemberName=resultSet.getString("MemberName");
                stars.add(MemberID+"   "+MemberName);
                
            }
            
           connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
   
return stars;
}
 
 
 
   private void bindData(){
        

getStars().stream().forEach((star) -> {
defaultListModel.addElement(star);
});

jList1.setModel(defaultListModel);
jList1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
}
   
   private void searchFilter(String searchTerm)
{
DefaultListModel filteredItems=new DefaultListModel();
ArrayList stars=getStars();
stars.stream().forEach((star) -> {
String starName=star.toString().toLowerCase();
if (starName.contains(searchTerm.toLowerCase())) {
filteredItems.addElement(star);
}
});
defaultListModel=filteredItems;
jList1.setModel(defaultListModel);

}
    
    
    public void Image(int MemberID1)
    {
        // this.MemberID=MemberID;
        
         try {
          
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=MicroFinanceManagement;selectMethod=cursor", "sa", "123456");


            Statement statement = connection.createStatement();
            String sql="SELECT * FROM AdmissionForm WHERE MemberId="+MemberID1;
            //System.out.println(sql);
            ResultSet resultSet = statement
                    .executeQuery(sql);
            
     
           
            while (resultSet.next()) {
                
            
                
              //  MemebrIdText.setText(resultSet.getString("MemberId"));
            //    MemberNameText.setText(resultSet.getString("MemberName"));
              
              
                
               InputStream in = resultSet.getBinaryStream("MemberImage");
               Image image = ImageIO.read(in);
               Image newimg = image.getScaledInstance(250, 190,  java.awt.Image.SCALE_SMOOTH);
               ImageIcon icon=new ImageIcon(newimg);

          
                MemberImage.setIcon(icon);
                MemberImage.revalidate();
                MemberImage.revalidate();
                

                  
            }
            connection.close();
            
        } catch (Exception e) {
            e.printStackTrace();
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PRINT = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        MemberImage = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        DateText = new datechooser.beans.DateChooserCombo();
        jLabel6 = new javax.swing.JLabel();
        DepositText = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        LoanText = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        MemberNameText = new javax.swing.JLabel();
        SearchMember = new javax.swing.JTextField();
        MEMBER_ID_TEXT = new javax.swing.JLabel();
        MEMBER_NAME_TEXT = new javax.swing.JLabel();
        Loan_Complete = new javax.swing.JLabel();
        ResidueText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jList1.setBackground(new java.awt.Color(0, 102, 255));
        jList1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jList1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jList1.setForeground(new java.awt.Color(255, 255, 255));
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jList1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jList1MouseExited(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(1010, 290, 350, 0);

        jTable1.setBackground(new java.awt.Color(204, 204, 255));
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SERIAL", "PAYEMENT DATE", "AMOUNT", "SUBSIDE"
            }
        ));
        jTable1.setRowHeight(28);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(760, 290, 600, 400);

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("REPAY LOAN");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(560, 10, 270, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/microfinancemanagement/qqqq.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(210, 10, 90, 60);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/microfinancemanagement/reee.png"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(1050, 10, 130, 70);

        PRINT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/microfinancemanagement/print64.png"))); // NOI18N
        PRINT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRINTActionPerformed(evt);
            }
        });
        jPanel2.add(PRINT);
        PRINT.setBounds(1260, 0, 110, 90);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1370, 90);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        MemberImage.setText("                          IMAGE");
        jPanel1.add(MemberImage);
        MemberImage.setBounds(0, 0, 250, 190);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 90, 250, 190);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(0, 51, 204));
        jPanel4.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ENTER DEPOSIT   :");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(50, 160, 180, 60);

        DateText.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED,
            (java.awt.Color)null,
            (java.awt.Color)null,
            (java.awt.Color)null,
            (java.awt.Color)null));
    DateText.setCalendarPreferredSize(new java.awt.Dimension(402, 212));
    DateText.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 18));
    jPanel4.add(DateText);
    DateText.setBounds(250, 30, 360, 40);

    jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(255, 255, 255));
    jLabel6.setText("DATE                  :");
    jPanel4.add(jLabel6);
    jLabel6.setBounds(50, 20, 180, 60);

    DepositText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    DepositText.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    jPanel4.add(DepositText);
    DepositText.setBounds(250, 170, 360, 40);

    Add.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    Add.setText("ADD");
    Add.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    Add.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            AddActionPerformed(evt);
        }
    });
    jPanel4.add(Add);
    Add.setBounds(360, 240, 150, 70);

    jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel7.setForeground(new java.awt.Color(255, 255, 255));
    jLabel7.setText("ENTER LOAN PAY  :");
    jPanel4.add(jLabel7);
    jLabel7.setBounds(50, 90, 180, 60);

    LoanText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    LoanText.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    jPanel4.add(LoanText);
    LoanText.setBounds(250, 100, 360, 40);

    jPanel3.add(jPanel4);
    jPanel4.setBounds(50, 40, 650, 330);

    getContentPane().add(jPanel3);
    jPanel3.setBounds(0, 290, 760, 400);

    jPanel6.setBackground(new java.awt.Color(0, 51, 204));
    jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    jPanel6.setLayout(null);

    jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/microfinancemanagement/search.png"))); // NOI18N
    jPanel6.add(jLabel8);
    jLabel8.setBounds(200, 0, 50, 40);

    jLabel9.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
    jLabel9.setForeground(new java.awt.Color(255, 255, 255));
    jLabel9.setText("SEARCH MEMBER");
    jPanel6.add(jLabel9);
    jLabel9.setBounds(10, 0, 170, 40);

    MemberNameText.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
    MemberNameText.setForeground(new java.awt.Color(0, 51, 204));
    MemberNameText.setText("MEMBER NAME");
    jPanel6.add(MemberNameText);
    MemberNameText.setBounds(-340, -40, 450, 70);

    getContentPane().add(jPanel6);
    jPanel6.setBounds(760, 250, 250, 40);

    SearchMember.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    SearchMember.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            SearchMemberMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            SearchMemberMouseExited(evt);
        }
    });
    SearchMember.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            SearchMemberKeyReleased(evt);
        }
    });
    getContentPane().add(SearchMember);
    SearchMember.setBounds(1010, 250, 350, 40);

    MEMBER_ID_TEXT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    MEMBER_ID_TEXT.setForeground(new java.awt.Color(0, 51, 204));
    getContentPane().add(MEMBER_ID_TEXT);
    MEMBER_ID_TEXT.setBounds(280, 100, 440, 60);

    MEMBER_NAME_TEXT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    MEMBER_NAME_TEXT.setForeground(new java.awt.Color(0, 51, 204));
    getContentPane().add(MEMBER_NAME_TEXT);
    MEMBER_NAME_TEXT.setBounds(280, 190, 440, 60);

    Loan_Complete.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    Loan_Complete.setForeground(new java.awt.Color(0, 51, 153));
    getContentPane().add(Loan_Complete);
    Loan_Complete.setBounds(760, 100, 550, 60);

    ResidueText.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    ResidueText.setForeground(new java.awt.Color(0, 51, 153));
    getContentPane().add(ResidueText);
    ResidueText.setBounds(760, 180, 600, 50);

    setSize(new java.awt.Dimension(1383, 770));
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
        
        String Loan_amount=LoanText.getText().toString();
        
        if(Loan_amount.equals(""))
        {
            JOptionPane.showMessageDialog(null, "PLEASE ENTER AMOUNT");
        }
        
        else
        {
            
        try
        {
            
           // float D_Amount=Float.parseFloat(amount);
            LOAN_GET_APL_ID();
            
            INSTALLMENT_TOTAL();
          
            
            if(loan_complete==false)
            {
             
           // LOAN_GET_APL_ID();
            float Loan_Amount=Float.parseFloat(Loan_amount);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=MicroFinanceManagement;user=sa;password=123456";
            con1 = DriverManager.getConnection(url);

            String sql = "Insert into INSTALLMENT "
            +"(Amount, Paydate, MemberId_ApplyDate)"
            +"values(?, ?, ?)";
         

            PreparedStatement pst = con1.prepareStatement(sql);
        
            pst.setString(2, DateText.getText());
            pst.setFloat(1, Loan_Amount);
            pst.setString(3, Apply_MemberId);
           
         
            pst.executeUpdate();
            
           
            
            JOptionPane.showMessageDialog(null, "Successfully ENTERED AMOUNT");
            
            
            
            LoanText.setText("");
            DepositText.setText("");
      
            con1.close();
            con2.close();
            con3.close();
            FETCH_TABLE();
          //  RESIDUE_TEXT();
           
        }
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        }
    }//GEN-LAST:event_AddActionPerformed

    private void SearchMemberMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMemberMouseEntered
        // TODO add your handling code here:
        jScrollPane2.setVisible(true);
        jScrollPane2.setBounds(1010, 280, 350, 400);
    }//GEN-LAST:event_SearchMemberMouseEntered

    private void SearchMemberMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMemberMouseExited
        // TODO add your handling code here:
         if(MouseExit==true)
        {
             jScrollPane2.setVisible(false);
             jScrollPane2.setBounds(1010, 280, 0, 0);
        }
    }//GEN-LAST:event_SearchMemberMouseExited

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        // TODO add your handling code here
        
        String selct=jList1.getSelectedValue().toString();
     
        Vector<Character> s1 = new Vector<Character>(); 
        Vector<Character> s2 = new Vector<Character>(); 
        // Use add() method to add elements into the Vector 
       // vec_tor.add(10); 

       int i=0;
       char wt;
       
       for(i=0; i<selct.length(); i++)
       {
            wt=selct.charAt(i);
            // char c='a';
            if(Character.isWhitespace(wt)==false)
            {
                  s1.add(selct.charAt(i));                
            } 
            else if(Character.isWhitespace(wt)==true)
            {
               // s1[i]=selct.charAt(i);
                i=i+3;
                break;
                
            } 
           // s1[i]=selct.charAt(i);
       }
       
       int l=0;
       for(int k=i+l; k<selct.length(); k++)
       {
           s2.add(selct.charAt(k));
           l++;
       }
       
     /*  for(int m=0; m<30; m++)
       {
           System.out.println(s1[m]+"  "+s2[m]);
       }
       */
     
   //  Character[] array1 = s1.toArray(new Character[s1.size()]);
    // Character[] array2 = s2.toArray(new Character[s2.size()]);
    int size1=s1.size();
    int size2=s2.size();
    
    char ss1[]=new char[size1];
    char ss2[]=new char[size2];
    
    
    for(i=0; i<size1; i++)
    {
        ss1[i]=s1.get(i);
    }
    
    for(i=0; i<size2; i++)
    {
        ss2[i]=s2.get(i);
    }
     
      //System.out.println("hellow");
      String st1=new String(ss1);
     // memberid=st1;
   //  String bt=st1;
      String st2=new String(ss2);
    
      //System.out.println(st1);
      //System.out.println(st2);
      
     // System.out.println(st1.length());
     // System.out.println(st2.length());

       Integer result1 = Integer.valueOf(st1);
     //  MemberID=result1;
       
       MemberID_id=result1;
       MEMBERNAME=st2;
     //  System.out.println(result1);
      
      //  JOptionPane.showMessageDialog(rootPane,jList1.getSelectedValue(), "Selected Member", JOptionPane.INFORMATION_MESSAGE);
       
            
        MEMBER_ID_TEXT.setText("MEMBER ID : "+result1);
        MEMBER_NAME_TEXT.setText("MEMEBR NAME : "+MEMBERNAME);
        
        Loan_Complete.setText("");
        ResidueText.setText("");
            
      //  getData(st1);
      
        jScrollPane2.setVisible(false);
        jScrollPane2.setBounds(900, 280, 0, 0);
        
       
        Image(result1);
      
         LOAN_GET_APL_ID(); 
         FETCH_TABLE();
         INSTALLMENT_TOTAL();
         // RESIDUE_TEXT();
         
    }//GEN-LAST:event_jList1MouseClicked

    private void jList1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseEntered
        // TODO add your handling code here:
         jScrollPane2.setVisible(true);
        jScrollPane2.setBounds(1010, 280, 350, 400);
    }//GEN-LAST:event_jList1MouseEntered

    private void jList1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseExited
        // TODO add your handling code here:
         MouseExit=true;
        jScrollPane2.setVisible(false);
        jScrollPane2.setBounds(1010, 280, 0, 0);
    }//GEN-LAST:event_jList1MouseExited

    private void SearchMemberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchMemberKeyReleased
        // TODO add your handling code here:
        searchFilter(SearchMember.getText());
    }//GEN-LAST:event_SearchMemberKeyReleased

    private void PRINTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRINTActionPerformed
        // TODO add your handling code here:
        
        strBuffer.delete(0, strBuffer.length());
        strBuffer.append("<table style=\"width:100%\">\n"
                + "  <tr>\n"
                + "    <th>MICROFINANCE MANAGEMENT SYSTEM</th>\n"
                + "  </tr>\n"
                + "  \n"
                + "   <tr>\n"
                + "    <th>MODHUBAG DHAKA</th>\n"
                + "  </tr>\n"
                + "  \n"
                + "   <tr>\n"
                + "    <th>CONTACT : 01521407602</th>\n"
                + "  </tr>\n"
                + "    <th>Email : tanvirhasan.tanshen2019@gmail.com</th>\n"
                + "  </tr>\n"
                + "    <th>MEMBER NAME "+MEMBERNAME+"</th>\n"
                + "  </tr>\n"
                + "  \n"
                + "<tr></tr><tr></tr></table>");

        strBuffer.append("\n<table border = \"1\" cellpadding = \"5\" cellspacing = \"5\" style=\"width:100%; border: 1px solid black;\">\n"
                + "  <tr>\n"
                + "     <td>NO</td> \n"
                + "     <td>DATE</td>\n"
                + "     <td>AMOUNT</td>\n"
                + "    \n"
                + "  </tr>");

      
        int ln=DATA1.size();
        
        for(int i=0; i<ln; i++)
        {
             strBuffer.append(" <tr>\n"
                    + "    <td>" +i+ "</td>\n"
                    + "    <td>" + DATA2.elementAt(i)+ "</td>\n"
                    + "    <td>" + DATA3.elementAt(i)+ "</td>\n"
                    + "  </tr>");
        }
        
        
        strBuffer.append("</table>");

        strBuffer.append("<table style=\"width:100%\">\n"
                + "  <tr>\n"
                + "     <td align=\"right\">TOTAL PAID : " +PRINT_TOTAL_SUM + "</td>\n"
                + "  </tr>\n"
                + "\n"
                + "</table>");

        strBuffer.append("\n\n<table style=\"width:100%\">\n"
                + "  <tr>\n"
                + "  <tr>\n"
                + "    <th>WELCOME FOR JOIN MICROFINANCE COMPANY </th>\n"
                + "   </tr>\n"
                + "  </tr>\n"
                + " \n"
                + "</table>");
        
        
        PrintData obj=new PrintData();
        obj.PrintString(strBuffer.toString());
        obj.setVisible(true);
        
        
    }//GEN-LAST:event_PRINTActionPerformed

    public void INSTALLMENT_TOTAL()
    {
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=MicroFinanceManagement;user=sa;password=123456";
            con2 = DriverManager.getConnection(url);

            Statement statement = con2.createStatement();
            ResultSet resultSet = statement
                    .executeQuery("SELECT Amount FROM INSTALLMENT WHERE MemberId_ApplyDate='"+Apply_MemberId+"'");
            
            float Total1=0;
            
            while (resultSet.next()) 
            {
          
              Total1 = Total1+resultSet.getFloat("Amount");
            //  System.out.println(Total1);
              
            }
            
            System.out.println("TOTAL-LOAN done "+Total1);
            ResidueText.setText("RESIDUE LOAN"+(HavetoPay-Total1));
          //  LOAN_GET_APL_ID();
            String payment=LoanText.getText().toString();
            float temp=Float.valueOf(payment);
            float x=temp+Total1;
            CHECK_LOAN_COMPLETE(x);
            
            con2.close();

    
        }
        catch(Exception e){
           // JOptionPane.showMessageDialog(null, e);
        }  

    }
    
    public void LOAN_GET_APL_ID()
    {
         try{
             
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=MicroFinanceManagement;user=sa;password=123456";
            con3 = DriverManager.getConnection(url);
            Statement statement = con3.createStatement();

            
            ResultSet resultSet = statement
                    .executeQuery("SELECT ApplyDate, HaveToPay FROM LOAN where MemberId='"+MemberID_id+"'");
            
            
            String Apply_Date="";
            
            while (resultSet.next()) {
          
              Apply_Date=resultSet.getString("ApplyDate");
              HavetoPay=resultSet.getFloat("HaveToPay");
            }
            
          //  System.out.println("LOAN TABLE : "+HavetoPay+"  "+Apply_Date);
            Apply_MemberId=MemberID_id+Apply_Date;
            con3.close();
            
         }catch(Exception e)
         {
             System.out.println(e);
         }
    }
    
    public void CHECK_LOAN_COMPLETE(float Total)
    {
       
        
      /*  if(HavetoPay==Total)
          {
            loan_complete=true;
            JOptionPane.showMessageDialog(null, "LOAN ALREADY COMPLETED");
            INSTALLMENT1_STATUS();
          }
        
      
        else if(HavetoPay<Total)
        {
            JOptionPane.showMessageDialog(null, "ENTER VALID AMOUNT");
            loan_complete=true;
        }
       else
        {
            loan_complete=false;
        } */
        
       if(HavetoPay<Total)
        {
            JOptionPane.showMessageDialog(null, "ENTER VALID AMOUNT");
            loan_complete=true;
        }
       
       if(HavetoPay==Total)
          {
           // loan_complete=true;
           // JOptionPane.showMessageDialog(null, "LOAN ALREADY COMPLETED");
            INSTALLMENT1_STATUS();
          }
       if(HavetoPay>=Total)
         {
            loan_complete=false;
           
         }
      
    }
    
    public void INSTALLMENT1_STATUS()
    {
         try
        {
            
           // float D_Amount=Float.parseFloat(amount);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=MicroFinanceManagement;user=sa;password=123456";
            con4 = DriverManager.getConnection(url);

          
            String sql = "Update INSTALLMENT1 set Status = 'CLEAR' WHERE MemberId_ApplyDate='"+Apply_MemberId+"'";

            
            PreparedStatement pst = con4.prepareStatement(sql);
            
       
            pst.executeUpdate();
            
            Loan_Complete.setText("LOAN COMPLETED");
            JOptionPane.showMessageDialog(null, "LOAN STATUS CLEAR");
           // Loan_Complete.setText("LOAN ALREADY COMPLETED");
            con4.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    public void FETCH_TABLE()
    {
         
       try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             Connection connection = DriverManager.getConnection(
                     "jdbc:sqlserver://localhost:1433;databaseName=MicroFinanceManagement;selectMethod=cursor", "sa", "123456");


            Statement statement = connection.createStatement();
          //  String sql="SELECT Amount,PayementDay,EntryBy  FROM DEPOSIT WHERE MemberId="+id;
          
           String sql="SELECT INSTALLMENT.Paydate, INSTALLMENT.Amount FROM INSTALLMENT WHERE\n" +
"INSTALLMENT.MemberId_ApplyDate IN (SELECT INSTALLMENT1.MemberId_ApplyDate FROM INSTALLMENT1 WHERE INSTALLMENT1.Status='UNCLEAR' AND INSTALLMENT1.MemberId='"+MemberID_id+"')";
          
            ResultSet resultSet = statement
                    .executeQuery(sql);
            
            
           String[] columnNames = {"NO","DATE", "AMOUNT"};
           DefaultTableModel model = new DefaultTableModel();
           model.setColumnIdentifiers(columnNames);
           
           jTable1.setModel(model);
            
           
            int i=1;
            float sumR=0, xr=0;
            
           
            
            while (resultSet.next()) {
               
            //   int ID=resultSet.getInt("MemberId");
               String Date =resultSet.getString("Paydate");
               String amnt =resultSet.getString("Amount");
               
              // float Amount= resultSet.getFloat("Amount");
               xr=Float.parseFloat(amnt);
               sumR=sumR+xr;
               model.addRow(new Object[]{i, Date, amnt});
               i++;
               
               DATA1.add(""+i);
               DATA2.add(Date);
               DATA3.add(amnt);
               
            }
           
           
             PRINT_TOTAL_SUM=sumR;
             
            int chk=model.getRowCount();
            
            System.out.println("TOtal Row "+chk);
            
        /*    ResidueText.setText("RESIDUE LOAN "+HavetoPay);
            if(HavetoPay>=sumR)
            {
               ResidueText.setText("RESIDUE LOAN "+(HavetoPay-sumR));
            }
            if(chk==0)
            {
                ResidueText.setText("");
            } */
        
        
        
      /*    float sum1=0;
          for (int count = 0; count < model.getRowCount(); count++)
         {
             String tl=model.getValueAt(count, 2).toString();
             Float ft=Float.parseFloat(tl);
             sum1 +=ft;
             System.out.println(sum1);
           //  finalTotal.setText("TOTAL PRICE : "+sum);
         }
          if(loan_complete==false)
          {
              ResidueText.setText("RESIDUE LOAN "+(HavetoPay-sum1));
          }  */
         /*   ResidueText.setText("RESIDUE LOAN "+(sum1-HavetoPay));
           if(sum1>=HavetoPay)
            {
                                
               Loan_Complete.setText("LOAN COMPLETED");
               
            }  */
            
            connection.close();
                
        } catch (Exception e) {
            e.printStackTrace();
        }
     
    }
    
  /*  public void RESIDUE_TEXT()
    {
        ///AMOUNT FROM JTABLE
       // LOAN_GET_APL_ID();
        float sum=0;
          for (int count = 0; count < model.getRowCount(); count++)
         {
             String tl=model.getValueAt(count, 2).toString();
             Float ft=Float.parseFloat(tl);
             sum +=ft;
             System.out.println(sum);
           //  finalTotal.setText("TOTAL PRICE : "+sum);
         }
          
        // System.out.println("TABLE SUM "+sum);
        
        
       /// CHECK IS LOAN COMLETE
       
        try{
             
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=MicroFinanceManagement;user=sa;password=123456";
           Connection con33 = DriverManager.getConnection(url);
            Statement statement = con3.createStatement();

            
            ResultSet resultSet = statement
                    .executeQuery("SELECT ApplyDate, HaveToPay FROM LOAN where MemberId='"+MemberID_id+"'");
            
            
            String Apply_Date="";
            
            while (resultSet.next()) {
          
              Apply_Date=resultSet.getString("ApplyDate");
              HavetoPay=resultSet.getFloat("HaveToPay");
            }
          //  System.out.println("LOAN TABLE : "+HavetoPay+"  "+Apply_Date);
           // Apply_MemberId=MemberID_id+Apply_Date;
            if(loan_complete==false)
            {
                ResidueText.setText("RESIDUE LOAN "+(HavetoPay-sum));
            }
            
            if(sum>=HavetoPay)
            {
                if(loan_complete==false)
                {
                     Loan_Complete.setText("LOAN COMPLETED");
                }
               
            }
            con33.close();
            
         }catch(Exception e)
         {
             System.out.println(e);
         }
           
    } */
    
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
            java.util.logging.Logger.getLogger(LoanPay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoanPay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoanPay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoanPay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoanPay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private datechooser.beans.DateChooserCombo DateText;
    private javax.swing.JTextField DepositText;
    private javax.swing.JTextField LoanText;
    private javax.swing.JLabel Loan_Complete;
    private javax.swing.JLabel MEMBER_ID_TEXT;
    private javax.swing.JLabel MEMBER_NAME_TEXT;
    private javax.swing.JLabel MemberImage;
    private javax.swing.JLabel MemberNameText;
    private javax.swing.JButton PRINT;
    private javax.swing.JLabel ResidueText;
    private javax.swing.JTextField SearchMember;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}