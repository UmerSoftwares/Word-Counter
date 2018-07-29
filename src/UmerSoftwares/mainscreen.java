package UmerSoftwares;

/**
 *
 * @author Hafiz Muhammad Umer
 */
import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.datatransfer.*;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class mainscreen extends javax.swing.JFrame {

    /**
     * Creates new form mainscreen
     */
    private static int historycount=0;
    private static ArrayList <String> arr =new ArrayList();
    public static data d;
    
    public mainscreen() {
        initComponents();
        //initial settings
        setLocationRelativeTo(null);
        setTitle("Word Counter");
        ImageIcon head=new ImageIcon(getClass().getResource("head.jpg"));
        heading.setIcon(head);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.jpg")));
        text.requestFocus();
        record();
        //info
        ImageIcon infoi=new ImageIcon(getClass().getResource("info.jpg"));
        info.setIcon(infoi);
        ImageIcon infor=new ImageIcon(getClass().getResource("infog.png"));
        info.setRolloverIcon(infor);
        trans(info);
        info.setToolTipText("How to use");
        //web
        ImageIcon webi=new ImageIcon(getClass().getResource("web.jpg"));
        web.setIcon(webi);
        ImageIcon webr=new ImageIcon(getClass().getResource("webg.jpg"));
        web.setRolloverIcon(webr);
        trans(web);
        web.setToolTipText("Visit website");
        //mail
        ImageIcon maili=new ImageIcon(getClass().getResource("mail.jpg"));
        mail.setIcon(maili);
        ImageIcon mailr=new ImageIcon(getClass().getResource("mailg.jpg"));
        mail.setRolloverIcon(mailr);
        trans(mail);
        mail.setToolTipText("Send E-Mail to developer");
        //bug
        ImageIcon bugi=new ImageIcon(getClass().getResource("bug.jpg"));
        bug.setIcon(bugi);
        ImageIcon bugr=new ImageIcon(getClass().getResource("bugg.jpg"));
        bug.setRolloverIcon(bugr);
        trans(bug);
        bug.setToolTipText("Report a bug");
        //code
        ImageIcon codei=new ImageIcon(getClass().getResource("code.jpg"));
        code.setIcon(codei);
        ImageIcon coder=new ImageIcon(getClass().getResource("codeg.jpg"));
        code.setRolloverIcon(coder);
        trans(code);
        code.setToolTipText("View source code");
        //update
        ImageIcon updatei=new ImageIcon(getClass().getResource("update.jpg"));
        update.setIcon(updatei);
        ImageIcon updater=new ImageIcon(getClass().getResource("updateg.png"));
        update.setRolloverIcon(updater);
        trans(update);
        update.setToolTipText("Check for Updates (Current version 1.0)");
        //history
        ImageIcon historyi=new ImageIcon(getClass().getResource("history.jpg"));
        history.setIcon(historyi);
        ImageIcon historyr=new ImageIcon(getClass().getResource("historyg.jpg"));
        history.setRolloverIcon(historyr);
        trans(history);
        history.setToolTipText("View history");
        //clear
        ImageIcon cleari=new ImageIcon(getClass().getResource("clear.jpg"));
        clear.setIcon(cleari);
        ImageIcon clearr=new ImageIcon(getClass().getResource("clearg.jpg"));
        clear.setRolloverIcon(clearr);
        trans(clear);
        clear.setToolTipText("Clear the text field");
        //paste
        ImageIcon pastei=new ImageIcon(getClass().getResource("paste.jpg"));
        paste.setIcon(pastei);
        ImageIcon paster=new ImageIcon(getClass().getResource("pasteg.jpg"));
        paste.setRolloverIcon(paster);
        trans(paste);
        paste.setToolTipText("Paste from clipboard");
        //copy
        ImageIcon copyi=new ImageIcon(getClass().getResource("copy.jpg"));
        copy.setIcon(copyi);
        ImageIcon copyr=new ImageIcon(getClass().getResource("copyg.jpg"));
        copy.setRolloverIcon(copyr);
        trans(copy);
        copy.setToolTipText("Copy to clipboard");
        //undo
        ImageIcon undoi=new ImageIcon(getClass().getResource("undo.jpg"));
        undo.setIcon(undoi);
        ImageIcon undor=new ImageIcon(getClass().getResource("undog.jpg"));
        undo.setRolloverIcon(undor);
        trans(update);
        undo.setToolTipText("Undo");
        //redo
        ImageIcon redoi=new ImageIcon(getClass().getResource("redo.jpg"));
        redo.setIcon(redoi);
        ImageIcon redor=new ImageIcon(getClass().getResource("redog.jpg"));
        redo.setRolloverIcon(redor);
        trans(update);
        redo.setToolTipText("Redo");
        //count
        ImageIcon counti=new ImageIcon(getClass().getResource("count.png"));
        count.setIcon(counti);
        ImageIcon countr=new ImageIcon(getClass().getResource("countg.png"));
        count.setRolloverIcon(countr);
        trans(count);
        count.setToolTipText("Start counting");
        //settings
        ImageIcon settingsi=new ImageIcon(getClass().getResource("settings.jpg"));
        settings.setIcon(settingsi);
        ImageIcon settingsr=new ImageIcon(getClass().getResource("settingsg.jpg"));
        settings.setRolloverIcon(settingsr);
        trans(settings);
        settings.setToolTipText("Settings");
        //get settings from hard disk
        setting.getSettings();
        try {
            d=new data();
        } catch (Exception ex) {
            if (setting.b[3])
            {
            int i=JOptionPane.showConfirmDialog(null, "Reading from disk failed\nDo you want to disable auto save?");
            if (i==JOptionPane.YES_OPTION)
            {
                setting.b[3]=false;
                setting.b[4]=true;
                setting.saveSettings();
            }
        }
        }
        text.setLineWrap(true);
        text.setWrapStyleWord(true);
    }
   
    private void trans(JButton b)
    {
        //Makes a button transparent
        b.setOpaque(false);
        b.setContentAreaFilled(false);
        b.setBorderPainted(false);
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
        heading = new javax.swing.JLabel();
        info = new javax.swing.JButton();
        mail = new javax.swing.JButton();
        web = new javax.swing.JButton();
        bug = new javax.swing.JButton();
        code = new javax.swing.JButton();
        update = new javax.swing.JButton();
        paste = new javax.swing.JButton();
        redo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();
        clear = new javax.swing.JButton();
        undo = new javax.swing.JButton();
        history = new javax.swing.JButton();
        count = new javax.swing.JButton();
        copy = new javax.swing.JButton();
        settings = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoActionPerformed(evt);
            }
        });

        mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailActionPerformed(evt);
            }
        });

        web.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                webActionPerformed(evt);
            }
        });

        bug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bugActionPerformed(evt);
            }
        });

        code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeActionPerformed(evt);
            }
        });

        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        paste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteActionPerformed(evt);
            }
        });

        redo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redoActionPerformed(evt);
            }
        });

        text.setColumns(20);
        text.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        text.setRows(5);
        text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(text);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        undo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoActionPerformed(evt);
            }
        });

        history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyActionPerformed(evt);
            }
        });

        count.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countActionPerformed(evt);
            }
        });

        copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyActionPerformed(evt);
            }
        });

        settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bug, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(web, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(paste, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(clear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(undo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(copy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(heading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(history, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(settings, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 368, Short.MAX_VALUE)
                        .addComponent(count, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(redo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(heading, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(paste, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(copy, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(undo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(web, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bug, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(history, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(count, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(redo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(settings, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyActionPerformed
        text.requestFocus();
        //copy
        String myString = text.getText();
        StringSelection stringSelection = new StringSelection(myString);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }//GEN-LAST:event_copyActionPerformed

    private void countActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countActionPerformed
        text.requestFocus();
        record();
        char[] c=text.getText().toCharArray();
        int word=0,number=0,digit=0,letter=0,space=0,punc=0,enter=0,other=0;
        boolean isWord=false,isNumber=false;
        for (int i=0;i<c.length;i++)
        {
            if ((c[i]>='A' && c[i]<='Z') || (c[i]>='a' && c[i]<='z'))
                letter++;
            else if (c[i]>='0' && c[i]<='9')
                digit++;
            else if (c[i]=='.' || c[i]==',' || c[i]==';' || c[i]==':' || c[i]==39 || c[i]==34 || c[i]=='!'
                    || c[i]==96 || c[i]=='?' || c[i]=='_' || c[i]=='-' || c[i]=='(' || c[i]==')' )
                punc++;
            else if (c[i]==' ')
                space++;
            else if (c[i]=='\n')
                enter++;
            else
                other++;
            
            if (((c[i]>='A' && c[i]<='Z') || (c[i]>='a' && c[i]<='z')))
            {
                isWord=true;
                if (isNumber)
                {
                    isNumber=false;
                    number++;
                }
            }
            else if ((c[i]==39 || c[i]==96 || c[i]=='-')&& isWord)
            {
                if (isNumber)
                {
                    isNumber=false;
                    number++;
                }
            }
            else if ((c[i]>='0' && c[i]<='9'))
            {
                isNumber=true;
                if (isWord)
                {
                    isWord=false;
                    word++;
                }
            }
            else if ((c[i]=='.' || c[i]==',')&& isNumber)
            {
                if (isWord)
                {
                    isWord=false;
                    word++;
                }
            }
            else 
            {
                if (isNumber)
                {
                    isNumber=false;
                    number++;
                }
                if (isWord)
                {
                    isWord=false;
                    word++;
                }
            }
        }
        if (isWord)
            word++;
        if (isNumber)
            number++;
        result.word=word;
        result.number=number;
        result.digit=digit;
        result.letter=letter;
        result.punc=punc;
        result.space=space;
        result.enter=enter;
        result.other=other;
        result.fr=this;
        if (setting.b[3]){
            try{
                d.add(text.getText());
                result.dataWritten=true;
            } 
            catch (Exception ex) {
                result.dataWritten=false;
            if (!("Empty Record".equals(ex.getMessage()))){
            int i=JOptionPane.showConfirmDialog(null, "Reading from disk failed\nDo you want to disable auto save?");
            if (i==JOptionPane.YES_OPTION)
            {
                setting.b[3]=false;
                setting.b[4]=true;
                setting.saveSettings();
            }}
        }}
        else{
            result.temp=text.getText();
            result.dataWritten=false;
        }
        result.main(null);
    }//GEN-LAST:event_countActionPerformed

    private void pasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteActionPerformed
        text.requestFocus();
        String data="";
        try {
            data = (String) Toolkit.getDefaultToolkit()
                    .getSystemClipboard().getData(DataFlavor.stringFlavor);
        } catch (UnsupportedFlavorException ex) {
        } catch (IOException ex) {
        }
        catch (Exception e)
        {}
        String temp=text.getText();
        if (!data.equals(""))
        {
            if (temp.equals(""))
            {
                text.setText(data);
            }
            else if (setting.b[0])
            {
                temp+=data;
                text.setText(temp);
            }
            else if (setting.b[1])
            {
                text.setText(data);
            }
            else if (setting.b[2])
            {
                if (!((""+temp.charAt(temp.length()-1)).equals(" ")))
                {
                    temp+=" ";
                }
                temp+=data;
                text.setText(temp);
            }
        }
        record();
    }//GEN-LAST:event_pasteActionPerformed

    private void webActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_webActionPerformed
        try
        {
            URI u=new URI("http://www.UmerSoftwares.blogspot.com");
            try
            {
                if (Desktop.isDesktopSupported())
                Desktop.getDesktop().browse(u);
            }catch (IOException e) {}
        } catch (URISyntaxException ex) {}
        text.requestFocus();
    }//GEN-LAST:event_webActionPerformed

    private void mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailActionPerformed
        try
        {
            URI u=new URI("mailto:UmerSoftwares@gmail.com?subject=Mail%20from%20Word%20Counter%20application%20user");
            try
            {
                if (Desktop.isDesktopSupported())
                Desktop.getDesktop().browse(u);
            }catch (IOException e) {}
        } catch (URISyntaxException ex) {}
        text.requestFocus();
    }//GEN-LAST:event_mailActionPerformed

    private void bugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bugActionPerformed
        try
        {
            URI u=new URI("mailto:UmerSoftwares@gmail.com?subject=Word%20Counter%20bug%20report");
            try
            {
                if (Desktop.isDesktopSupported())
                Desktop.getDesktop().browse(u);
            }catch (IOException e) {}
        } catch (URISyntaxException ex) {}
        text.requestFocus();
    }//GEN-LAST:event_bugActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        text.requestFocus();
        text.setText("");
        record();
    }//GEN-LAST:event_clearActionPerformed

    private void textKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textKeyReleased
        record();
    }//GEN-LAST:event_textKeyReleased

    private void undoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoActionPerformed
        text.requestFocus();
        if (historycount>1)
        {
            historycount--;
            text.setText(arr.get(historycount-1));
        }
    }//GEN-LAST:event_undoActionPerformed

    private void redoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redoActionPerformed
        text.requestFocus();
        if (historycount<arr.size())
        {
            text.setText(arr.get(historycount));
            historycount++;
        }
    }//GEN-LAST:event_redoActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
    try
        {
            URI u=new URI("http://umersoftwares.blogspot.com/2018/06/word-counter-by-umer-softwares.html");
            try
            {
                if (Desktop.isDesktopSupported())
                Desktop.getDesktop().browse(u);
            }catch (IOException e) {}
        } catch (URISyntaxException ex) {}
        text.requestFocus();
    }//GEN-LAST:event_updateActionPerformed

    private void codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeActionPerformed
            try
        {
            URI u=new URI("http://javawithumer.blogspot.com/2018/06/word-counter-source-code.html");
            try
            {
                if (Desktop.isDesktopSupported())
                Desktop.getDesktop().browse(u);
            }catch (IOException e) {}
        } catch (URISyntaxException ex) {}
        text.requestFocus();
    }//GEN-LAST:event_codeActionPerformed

    private void historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyActionPerformed
        text.requestFocus();
        hist.main(new String[1]);
        
    }//GEN-LAST:event_historyActionPerformed

    private void settingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsActionPerformed
        text.requestFocus();
        setting.fr=this;
        setting.main(new String[1]);
    }//GEN-LAST:event_settingsActionPerformed

    private void infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoActionPerformed
        text.requestFocus();
        infor.fr=this;
        infor.main(null);
    }//GEN-LAST:event_infoActionPerformed
    
    public void record()
    {
        if (historycount==arr.size()){
            if (historycount==0 || !arr.get(arr.size()-1).toString().equals(text.getText()))
            {
                arr.add(text.getText());
                historycount++;
            }
        }
        else
        {
            arr.add(historycount,text.getText());
            historycount++;
            int k=arr.size()-historycount;
            for (int i=0;i<k;i++)
            {
                arr.remove(historycount);
            }
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainscreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bug;
    private javax.swing.JButton clear;
    private javax.swing.JButton code;
    private javax.swing.JButton copy;
    private javax.swing.JButton count;
    private javax.swing.JLabel heading;
    private javax.swing.JButton history;
    private javax.swing.JButton info;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mail;
    private javax.swing.JButton paste;
    private javax.swing.JButton redo;
    private javax.swing.JButton settings;
    private javax.swing.JTextArea text;
    private javax.swing.JButton undo;
    private javax.swing.JButton update;
    private javax.swing.JButton web;
    // End of variables declaration//GEN-END:variables
}
