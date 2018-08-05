/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinebankwebserviceapiclient;

import com.google.gson.Gson;
import com.mycompany.onlinebankwebserviceapi.model.Customer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import com.google.gson.annotations.SerializedName;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.util.List;


/**
 *
 * @author carlosneia
 */
public class RunnerGUI extends javax.swing.JFrame {

    /**
     * Creates new form RunnerGUI
     */
    public RunnerGUI() {
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

        showAllCustomersBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayTa = new javax.swing.JTextArea();
        getCustomerByIdBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        getCustomerByIdTf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        getAccountByIdTf = new javax.swing.JTextField();
        getAccountByIdBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        accDetailsTf = new javax.swing.JTextField();
        accDetailsBtn = new javax.swing.JButton();
        showAllTransactionsBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        transferFromTf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        transferToTf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        transferAmountTf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        showAllCustomersBtn.setText("Show All Customers");
        showAllCustomersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAllCustomersBtnActionPerformed(evt);
            }
        });

        displayTa.setColumns(20);
        displayTa.setRows(5);
        jScrollPane1.setViewportView(displayTa);

        getCustomerByIdBtn.setText("Search");
        getCustomerByIdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getCustomerByIdBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Customer By Id:");

        getCustomerByIdTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getCustomerByIdTfActionPerformed(evt);
            }
        });

        jLabel2.setText("Accounts By Id:");

        getAccountByIdTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getAccountByIdTfActionPerformed(evt);
            }
        });

        getAccountByIdBtn.setText("Search");
        getAccountByIdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getAccountByIdBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("Acc Details By Acc Number:");

        accDetailsTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accDetailsTfActionPerformed(evt);
            }
        });

        accDetailsBtn.setText("Search");
        accDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accDetailsBtnActionPerformed(evt);
            }
        });

        showAllTransactionsBtn.setText("Show All Transactions");
        showAllTransactionsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAllTransactionsBtnActionPerformed(evt);
            }
        });

        jLabel4.setText("Transfer From: ");

        transferFromTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferFromTfActionPerformed(evt);
            }
        });

        jLabel5.setText("To:");

        jLabel6.setText("Amount:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(showAllCustomersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showAllTransactionsBtn)
                        .addGap(151, 151, 151))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(getAccountByIdTf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(getCustomerByIdTf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(accDetailsTf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(getAccountByIdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                            .addComponent(getCustomerByIdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(accDetailsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(37, 37, 37))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(transferFromTf, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27)
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(transferToTf, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(31, 31, 31)
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(transferAmountTf, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showAllCustomersBtn)
                    .addComponent(showAllTransactionsBtn))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getCustomerByIdBtn)
                    .addComponent(jLabel1)
                    .addComponent(getCustomerByIdTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(getAccountByIdTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getAccountByIdBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(accDetailsTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accDetailsBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(transferFromTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(transferToTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(transferAmountTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    GETRequestes cm = new GETRequestes();
    
    private void showAllCustomersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAllCustomersBtnActionPerformed
       
        displayTa.setText("");
        
        for(int i=0; i<cm.getAllCustomers().size(); i++){
            String name = cm.getAllCustomers().get(i).getName();
            String address = cm.getAllCustomers().get(i).getAddress();
            String email = cm.getAllCustomers().get(i).getEmail();
            String login = cm.getAllCustomers().get(i).getLogin();
            String password = cm.getAllCustomers().get(i).getPassword();
            
            displayTa.append("Name: " + name +
                "\nAddress: " + address +
                "\nEmail: " + email + 
                "\nLogin: " + login+
                "\nPassword: " + password + "\n\n");
         } 
    }//GEN-LAST:event_showAllCustomersBtnActionPerformed
    
    //Search customer's details by customer ID and Display it
    private void getCustomerByIdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getCustomerByIdBtnActionPerformed
        displayTa.setText("");
        String customerId = getCustomerByIdTf.getText();
        String name = cm.getCustomerByID(customerId).getName();
        String address = cm.getCustomerByID(customerId).getAddress();
        String email = cm.getCustomerByID(customerId).getEmail();
        String login = cm.getCustomerByID(customerId).getLogin();
        String password = cm.getCustomerByID(customerId).getPassword();
        
        displayTa.append("Name: " + name +
                "\nAddress: " + address +
                "\nEmail: " + email + 
                "\nLogin: " + login+
                "\nPassword: " + password);
    }//GEN-LAST:event_getCustomerByIdBtnActionPerformed

    private void getCustomerByIdTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getCustomerByIdTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getCustomerByIdTfActionPerformed

    private void getAccountByIdTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getAccountByIdTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getAccountByIdTfActionPerformed

    private void getAccountByIdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getAccountByIdBtnActionPerformed
        displayTa.setText("");
        
        String login = getAccountByIdTf.getText();

        for (int i=0; i<cm.getAllAccountsForCustomer(login).size(); i++){
          int sortCode = cm.getAllAccountsForCustomer(login).get(i).getSortCode();
          int accNumber = cm.getAllAccountsForCustomer(login).get(i).getAccountNumber();
          double balance = cm.getAllAccountsForCustomer(login).get(i).getBalance();
          String customerId = cm.getAllAccountsForCustomer(login).get(i).getCustomerId();
          
          displayTa.append("Sort Code: " + sortCode +
                "\nAccount Number: " + accNumber +
                "\nBalance: " + balance+
                "\nCustomer Id: " + customerId + "\n\n");
        }
        
                
    }//GEN-LAST:event_getAccountByIdBtnActionPerformed

    private void accDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accDetailsBtnActionPerformed
        displayTa.setText("");
        
        int accNumber = Integer.parseInt(accDetailsTf.getText());

          int sortCode = cm.getAccountsDetails(accNumber).getSortCode();
          int myAccNumber = cm.getAccountsDetails(accNumber).getAccountNumber();
          double balance = cm.getAccountsDetails(accNumber).getBalance();
          String customerId = cm.getAccountsDetails(accNumber).getCustomerId();
        
        displayTa.append("Sort Code: " + sortCode +
                "\nAccount Number: " + accNumber +
                "\nBalance: " + balance+
                "\nCustomer Id: " + customerId);    
    }//GEN-LAST:event_accDetailsBtnActionPerformed

    private void accDetailsTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accDetailsTfActionPerformed
            accDetailsTf.setEditable(true); 

    }//GEN-LAST:event_accDetailsTfActionPerformed

    private void showAllTransactionsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAllTransactionsBtnActionPerformed
        displayTa.setText("");
        for (int i = 0; i < cm.getAllTransactions().size(); i++) {
            int transactionType = cm.getAllTransactions().get(i).getTransactionType();
            LocalDate date = cm.getAllTransactions().get(i).getDate();
            String description = cm.getAllTransactions().get(i).getDescription();
            double postTransactionBalance = cm.getAllTransactions().get(i).getPostTransactionBalance();
            int accountNumber = cm.getAllTransactions().get(i).getAccountNumber();
            double amount = cm.getAllTransactions().get(i).getAmount();

            displayTa.append("Transaction Type: " + transactionType
                    + "\nDate: " + date
                    + "\nDescription: " + description
                    + "\nPost Transaction Balance: " + postTransactionBalance
                    + "\nAccount Number: " + accountNumber
                    + "\nAmount: " + amount+ "\n\n");

        }
    }//GEN-LAST:event_showAllTransactionsBtnActionPerformed

    private void transferFromTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferFromTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transferFromTfActionPerformed

    
    
    
    
    public String performGETRequest(String URL){
        String output="";  
	  try {
		URL url = new URL(URL);
		HttpURLConnection conn = (HttpURLConnection) 
                        url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Accept", "application/json");
                conn.getResponseCode();

		BufferedReader br = new BufferedReader(new InputStreamReader(
			(conn.getInputStream())));
                //all replies consist of one line only
		output = br.readLine();
		conn.disconnect();

	  } catch (MalformedURLException e) {
		e.printStackTrace();
	  } catch (IOException e) {
		e.printStackTrace();
	  }
          return output;
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
            java.util.logging.Logger.getLogger(RunnerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RunnerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RunnerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RunnerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RunnerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accDetailsBtn;
    private javax.swing.JTextField accDetailsTf;
    private javax.swing.JTextArea displayTa;
    private javax.swing.JButton getAccountByIdBtn;
    private javax.swing.JTextField getAccountByIdTf;
    private javax.swing.JButton getCustomerByIdBtn;
    private javax.swing.JTextField getCustomerByIdTf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton showAllCustomersBtn;
    private javax.swing.JButton showAllTransactionsBtn;
    private javax.swing.JTextField transferAmountTf;
    private javax.swing.JTextField transferFromTf;
    private javax.swing.JTextField transferToTf;
    // End of variables declaration//GEN-END:variables
}
