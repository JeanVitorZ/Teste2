/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrodeinfor;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author jean.zimmermann
 */
public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
        for (int i =1900; i < 2021; i++) {
             AnoA.addItem(Integer.toString(i));
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        Nome = new javax.swing.JTextField();
        AnoA = new javax.swing.JComboBox<>();
        DataA = new javax.swing.JComboBox<>();
        MesA = new javax.swing.JComboBox<>();
        Dep = new javax.swing.JComboBox<>();
        Gen = new javax.swing.JComboBox<>();
        Ender = new javax.swing.JTextField();
        Cont = new javax.swing.JTextField();
        Save = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 62, 25));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 62, 25));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Endereço:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 100, 25));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Data de Nascimento:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 180, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Contato:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 90, 25));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Departamento:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, -1, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Genero:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 62, 25));
        getContentPane().add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 470, 30));
        getContentPane().add(Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 470, 30));

        AnoA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021" }));
        getContentPane().add(AnoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, -1));

        DataA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(DataA, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 80, -1));

        MesA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Set", "Out", "Nov", "Dez" }));
        getContentPane().add(MesA, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, -1, -1));

        Dep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TI", "RH", "Financeiro", "Comercial", "Marketing", "SAC", "Logistica", "Recebimento", "Engenheiro", "Arquiteto", "Cyber Security" }));
        getContentPane().add(Dep, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 240, 30));

        Gen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masc.", "Fem." }));
        getContentPane().add(Gen, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 240, 30));

        Ender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnderActionPerformed(evt);
            }
        });
        getContentPane().add(Ender, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 470, 30));
        getContentPane().add(Cont, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 470, 30));

        Save.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        getContentPane().add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 400, 90, 40));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("Deletar Infos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 190, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
       try{
        String url = "jdbc:mysql://localhost:3306/trab1";
       String user = "root";
       String pass = "";
       
       Connection conn = DriverManager.getConnection(url, user, pass);
       Statement stmt = conn.createStatement();
       String Query = "INSERT INTO `dados` (`Nome`,`ID`,`DataAniversario`, `MesAniversario`, `AnoAniversario`,`NumCont`,`Endereco`,`genero`,`Departamento`) VALUES ('"+Nome.getText()+"','"+ID.getText()+"','"+DataA.getSelectedItem()+"','"+MesA.getSelectedItem()+"','"+AnoA.getSelectedItem()+"','"+Cont.getText()+"','"+Ender.getText()+"','"+Gen.getSelectedItem()+"','"+Dep.getSelectedItem()+"');";
               stmt.execute(Query);
               
               JOptionPane.showMessageDialog(null, "Save as Completed");
       
    }catch(SQLException e) {
        JOptionPane.showMessageDialog(null, e.toString());
    }
    }//GEN-LAST:event_SaveActionPerformed

    private void EnderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnderActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

            Nome.setText(null);
            ID.setText(null);
            Cont.setText(null);
            Ender.setText(null);
            DataA.setSelectedIndex(0);
            MesA.setSelectedIndex(0);
            AnoA.setSelectedIndex(0);
            Dep.setSelectedIndex(0);
            Gen.setSelectedIndex(0);
            
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AnoA;
    private javax.swing.JTextField Cont;
    private javax.swing.JComboBox<String> DataA;
    private javax.swing.JComboBox<String> Dep;
    private javax.swing.JTextField Ender;
    private javax.swing.JComboBox<String> Gen;
    private javax.swing.JTextField ID;
    private javax.swing.JComboBox<String> MesA;
    private javax.swing.JTextField Nome;
    private javax.swing.JButton Save;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables

    /*private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
}
