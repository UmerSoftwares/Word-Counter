package UmerSoftwares;

/**
 *
 * @author Hafiz Muhammad Umer
 */
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.font.TextAttribute;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class setting extends javax.swing.JDialog {

    /**
     * Creates new form setting
     */
        
    
    public setting(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        //initial settings
        setLocationRelativeTo(null);
        setTitle("Settings");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("settinghead.png")));
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        trans(op1);
        trans(op2);
        trans(op3);
        trans(op4);
        trans(op5);
        trans(chk1);
        trans(chk2);
        trans(chk3);
        trans(chk4);
        trans(chk5);
        trans(ok);
        trans(restore);
        ok.requestFocus();
        //ok button
        ImageIcon oki=new ImageIcon(getClass().getResource("ok.jpg"));
        ok.setIcon(oki);
        ImageIcon okr=new ImageIcon(getClass().getResource("okg.jpg"));
        ok.setRolloverIcon(okr);
        ok.setToolTipText("OK");
        //restore button
        ImageIcon restorei=new ImageIcon(getClass().getResource("restore.jpg"));
        restore.setIcon(restorei);
        ImageIcon restorer=new ImageIcon(getClass().getResource("restoreg.jpg"));
        restore.setRolloverIcon(restorer);
        restore.setToolTipText("Restore Default Settings");
        prIcon();
    }
    public static boolean[] b={false,true,false,true,false};
    public static String path="C:\\Umer Softwares\\Word Counter";
    public static void getSettings()
    {
        try
        {
            File f=new File(path+"//settings.txt");
            Scanner in = new Scanner(f);
            char[] c=in.next().toCharArray();
            for (int i=0;i<5;i++)
            {
                if (c[i]=='1')
                    b[i]=true;
                else
                    b[i]=false;
            }
        }   
        catch (Exception ex) {
                b[0]=false;
                b[1]=true;
                b[2]=false;
                b[3]=true;
                b[4]=false;
            }
    }
    public static boolean exp=true;
    public static void saveSettings()
    {
        try
        {
            new File(path).mkdirs();
            Formatter f=new Formatter(path+"//settings.txt");
            String s="";
            for (int i=0;i<5;i++)
            {
                if (b[i])
                    s+="1";
                else
                    s+="0";
            }
            f.format("%s", s);
            f.close();
        } catch (FileNotFoundException ex) {
            if (exp){
            JOptionPane.showMessageDialog(null,"There was an error in saving the settings to the disk"
                    + "\nThe settings are saved for this time only."
                    + "\nThey will reset when you open the program again");
            exp=false;
            }
        }
    }
    
    private void prIcon()
    {
        saveSettings();
        setIcons(chk1,b[0]);
        setIcons(chk2,b[1]);
        setIcons(chk3,b[2]);
        setIcons(chk4,b[3]);
        setIcons(chk5,b[4]);
        
    }
    private void setIcons(JButton j,boolean b)
    {
        ImageIcon checked=new ImageIcon(getClass().getResource("checked.png"));
        ImageIcon unchecked=new ImageIcon(getClass().getResource("unchecked.png"));
        ImageIcon checkedg=new ImageIcon(getClass().getResource("checkedg.jpg"));
        ImageIcon uncheckedg=new ImageIcon(getClass().getResource("uncheckedg.jpg"));
        if (b)
        {
            j.setIcon(checked);
            j.setRolloverIcon(checkedg);
        }
        else
        {
            j.setIcon(unchecked);
            j.setRolloverIcon(uncheckedg);
        }
    }
    
    private void trans(JButton b)
    {
        //Makes a button transparent
        b.setOpaque(false);
        b.setContentAreaFilled(false);
        b.setBorderPainted(false);
    }
    private void underline(JButton b)
    {
        HashMap<TextAttribute, Object> textAttrMap = new HashMap<TextAttribute, Object>();
        textAttrMap.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        b.setFont(b.getFont().deriveFont(textAttrMap));
    }
    private void nunderline(JButton b)
    {
        HashMap<TextAttribute, Object> textAttrMap = new HashMap<TextAttribute, Object>();
        textAttrMap.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE);
        b.setFont(b.getFont().deriveFont(textAttrMap));
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
        chk1 = new javax.swing.JButton();
        chk5 = new javax.swing.JButton();
        chk2 = new javax.swing.JButton();
        chk4 = new javax.swing.JButton();
        chk3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        op1 = new javax.swing.JButton();
        op2 = new javax.swing.JButton();
        op3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        op4 = new javax.swing.JButton();
        op5 = new javax.swing.JButton();
        ok = new javax.swing.JButton();
        restore = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        chk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk1ActionPerformed(evt);
            }
        });

        chk5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk5ActionPerformed(evt);
            }
        });

        chk2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk2ActionPerformed(evt);
            }
        });

        chk4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk4ActionPerformed(evt);
            }
        });

        chk3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Function of Paste button:");

        op1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        op1.setText("Paste the text at the end of what is already present in the text area");
        op1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        op1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                op1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                op1MouseExited(evt);
            }
        });
        op1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op1ActionPerformed(evt);
            }
        });

        op2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        op2.setText("Clear the text area and paste the text from the clipboard");
        op2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        op2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                op2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                op2MouseExited(evt);
            }
        });
        op2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op2ActionPerformed(evt);
            }
        });

        op3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        op3.setText("Paste at the end of already present text along with a space");
        op3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        op3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                op3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                op3MouseExited(evt);
            }
        });
        op3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Automatically save history:");

        op4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        op4.setText("ON");
        op4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        op4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                op4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                op4MouseExited(evt);
            }
        });
        op4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op4ActionPerformed(evt);
            }
        });

        op5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        op5.setText("OFF");
        op5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        op5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                op5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                op5MouseExited(evt);
            }
        });
        op5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op5ActionPerformed(evt);
            }
        });

        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        restore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restoreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chk5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chk4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(op4)
                                    .addComponent(op5)))
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ok, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(restore, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chk2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chk3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(op3)
                                    .addComponent(op2)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(chk1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(op1)))
                        .addGap(0, 130, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(op1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(op2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(op3)
                    .addComponent(chk3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(op4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(op5)
                            .addComponent(chk5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(restore, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk1ActionPerformed
        ok.requestFocus();
        b[0]=true;
        b[1]=b[2]=false;
        prIcon();
    }//GEN-LAST:event_chk1ActionPerformed

    private void chk5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk5ActionPerformed
        ok.requestFocus();
        b[4]=true;
        b[3]=false;
        prIcon();
    }//GEN-LAST:event_chk5ActionPerformed

    private void chk2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk2ActionPerformed
        ok.requestFocus();
        b[1]=true;
        b[0]=b[2]=false;
        prIcon();
    }//GEN-LAST:event_chk2ActionPerformed

    private void chk4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk4ActionPerformed
        ok.requestFocus();
        b[3]=true;
        b[4]=false;
        prIcon();
    }//GEN-LAST:event_chk4ActionPerformed

    private void chk3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk3ActionPerformed
        ok.requestFocus();
        b[2]=true;
        b[1]=b[0]=false;
        prIcon();
    }//GEN-LAST:event_chk3ActionPerformed

    private void op1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_op1MouseEntered
        underline(op1);
    }//GEN-LAST:event_op1MouseEntered

    private void op1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_op1MouseExited
        nunderline(op1);
    }//GEN-LAST:event_op1MouseExited

    private void op1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op1ActionPerformed
        chk1ActionPerformed(null);
    }//GEN-LAST:event_op1ActionPerformed

    private void op2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_op2MouseEntered
        underline(op2);
    }//GEN-LAST:event_op2MouseEntered

    private void op2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_op2MouseExited
        nunderline(op2);
    }//GEN-LAST:event_op2MouseExited

    private void op2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op2ActionPerformed
        chk2ActionPerformed(null);
    }//GEN-LAST:event_op2ActionPerformed

    private void op3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_op3MouseEntered
        underline(op3);
    }//GEN-LAST:event_op3MouseEntered

    private void op3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_op3MouseExited
        nunderline(op3);
    }//GEN-LAST:event_op3MouseExited

    private void op3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op3ActionPerformed
        chk3ActionPerformed(null);
    }//GEN-LAST:event_op3ActionPerformed

    private void op4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_op4MouseEntered
        underline(op4);
    }//GEN-LAST:event_op4MouseEntered

    private void op4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_op4MouseExited
        nunderline(op4);
    }//GEN-LAST:event_op4MouseExited

    private void op4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op4ActionPerformed
        chk4ActionPerformed(null);
    }//GEN-LAST:event_op4ActionPerformed

    private void op5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_op5MouseEntered
        underline(op5);
    }//GEN-LAST:event_op5MouseEntered

    private void op5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_op5MouseExited
        nunderline(op5);
    }//GEN-LAST:event_op5MouseExited

    private void op5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op5ActionPerformed
        chk5ActionPerformed(null);
    }//GEN-LAST:event_op5ActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        dispose();
    }//GEN-LAST:event_okActionPerformed

    private void restoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restoreActionPerformed
        ok.requestFocus();
        b[1]=b[3]=true;
        b[0]=b[2]=b[4]=false;
        prIcon();
    }//GEN-LAST:event_restoreActionPerformed
    public static javax.swing.JFrame fr=null;
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                setting dialog = new setting(fr, true);
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chk1;
    private javax.swing.JButton chk2;
    private javax.swing.JButton chk3;
    private javax.swing.JButton chk4;
    private javax.swing.JButton chk5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton ok;
    private javax.swing.JButton op1;
    private javax.swing.JButton op2;
    private javax.swing.JButton op3;
    private javax.swing.JButton op4;
    private javax.swing.JButton op5;
    private javax.swing.JButton restore;
    // End of variables declaration//GEN-END:variables
}
