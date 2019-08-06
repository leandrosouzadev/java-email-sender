/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.email;

import java.awt.Cursor;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Leandro
 */
public class FormEnviaEmail extends javax.swing.JFrame {

    /**
     * Creates new form FormEnviaEmail
     */
    public FormEnviaEmail() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jpAcao = new javax.swing.JPanel();
        btEnviar = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();
        jtabEmail = new javax.swing.JTabbedPane();
        jpEnvio = new javax.swing.JPanel();
        jpDestinatario = new javax.swing.JPanel();
        lbEmailDest = new javax.swing.JLabel();
        jtEmailDest = new javax.swing.JTextField();
        jpRemetente = new javax.swing.JPanel();
        lbEmailRemet = new javax.swing.JLabel();
        jtEmailRemet = new javax.swing.JTextField();
        lbSenha = new javax.swing.JLabel();
        lbSmtp = new javax.swing.JLabel();
        jtSmtp = new javax.swing.JTextField();
        lbPorta = new javax.swing.JLabel();
        jtPorta = new javax.swing.JTextField();
        ckTls = new javax.swing.JCheckBox();
        ckSsl = new javax.swing.JCheckBox();
        lbNome = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jtSenha = new javax.swing.JPasswordField();
        jpEmail = new javax.swing.JPanel();
        lbAssunto = new javax.swing.JLabel();
        jtAssunto = new javax.swing.JTextField();
        lbMensagem = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMensagem = new javax.swing.JTextArea();
        lbAnexo = new javax.swing.JLabel();
        jtAnexo = new javax.swing.JTextField();
        btAnexo = new javax.swing.JButton();
        jpLogs = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtLogs = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Teste de envio de e-mail");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jpAcao.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Ação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        jpAcao.setLayout(new java.awt.GridBagLayout());

        btEnviar.setText("Enviar");
        btEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnviarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        jpAcao.add(btEnviar, gridBagConstraints);

        btFechar.setText("Fechar");
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        jpAcao.add(btFechar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 273;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jpAcao, gridBagConstraints);

        jpEnvio.setLayout(new java.awt.GridBagLayout());

        jpDestinatario.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Destinatário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        jpDestinatario.setLayout(new java.awt.GridBagLayout());

        lbEmailDest.setText("Email:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        jpDestinatario.add(lbEmailDest, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 382;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 0, 0);
        jpDestinatario.add(jtEmailDest, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jpEnvio.add(jpDestinatario, gridBagConstraints);

        jpRemetente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Remetente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        jpRemetente.setLayout(new java.awt.GridBagLayout());

        lbEmailRemet.setText("Email:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        jpRemetente.add(lbEmailRemet, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 247;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 0, 0);
        jpRemetente.add(jtEmailRemet, gridBagConstraints);

        lbSenha.setText("Senha:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 0);
        jpRemetente.add(lbSenha, gridBagConstraints);

        lbSmtp.setText("Smtp:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 0, 0);
        jpRemetente.add(lbSmtp, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 141;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 0, 0);
        jpRemetente.add(jtSmtp, gridBagConstraints);

        lbPorta.setText("Porta:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 0, 0);
        jpRemetente.add(lbPorta, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 96;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 0, 0);
        jpRemetente.add(jtPorta, gridBagConstraints);

        ckTls.setText("TLS");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 0, 0);
        jpRemetente.add(ckTls, gridBagConstraints);

        ckSsl.setText("SSL");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 0, 0);
        jpRemetente.add(ckSsl, gridBagConstraints);

        lbNome.setText("Nome:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 0, 0);
        jpRemetente.add(lbNome, gridBagConstraints);

        jtNome.setText("Empresa de Teste");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 382;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 0, 0);
        jpRemetente.add(jtNome, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 0, 0);
        jpRemetente.add(jtSenha, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jpEnvio.add(jpRemetente, gridBagConstraints);

        jpEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        jpEmail.setLayout(new java.awt.GridBagLayout());

        lbAssunto.setText("Assunto:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        jpEmail.add(lbAssunto, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 397;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 0, 0);
        jpEmail.add(jtAssunto, gridBagConstraints);

        lbMensagem.setText("Mensagem:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 0, 0);
        jpEmail.add(lbMensagem, gridBagConstraints);

        jtMensagem.setColumns(20);
        jtMensagem.setLineWrap(true);
        jtMensagem.setRows(5);
        jtMensagem.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jtMensagem);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 380;
        gridBagConstraints.ipady = 73;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 0, 0);
        jpEmail.add(jScrollPane1, gridBagConstraints);

        lbAnexo.setText("Anexo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 0, 0);
        jpEmail.add(lbAnexo, gridBagConstraints);

        jtAnexo.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 318;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 0, 0);
        jpEmail.add(jtAnexo, gridBagConstraints);

        btAnexo.setText("...");
        btAnexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnexoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(1, 3, 0, 0);
        jpEmail.add(btAnexo, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = -153;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jpEnvio.add(jpEmail, gridBagConstraints);

        jtabEmail.addTab("Envio", jpEnvio);

        jpLogs.setLayout(new java.awt.GridLayout());

        jtLogs.setColumns(20);
        jtLogs.setLineWrap(true);
        jtLogs.setRows(5);
        jtLogs.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jtLogs);

        jpLogs.add(jScrollPane2);

        jtabEmail.addTab("Logs", jpLogs);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jtabEmail, gridBagConstraints);

        setSize(new java.awt.Dimension(431, 560));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        fechar();
    }//GEN-LAST:event_btFecharActionPerformed

    private void btEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnviarActionPerformed
        enviarEmail();
    }//GEN-LAST:event_btEnviarActionPerformed

    private void btAnexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnexoActionPerformed
        buscaAnexo();
    }//GEN-LAST:event_btAnexoActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormEnviaEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FormEnviaEmail().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAnexo;
    private javax.swing.JButton btEnviar;
    private javax.swing.JButton btFechar;
    private javax.swing.JCheckBox ckSsl;
    private javax.swing.JCheckBox ckTls;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpAcao;
    private javax.swing.JPanel jpDestinatario;
    private javax.swing.JPanel jpEmail;
    private javax.swing.JPanel jpEnvio;
    private javax.swing.JPanel jpLogs;
    private javax.swing.JPanel jpRemetente;
    private javax.swing.JTextField jtAnexo;
    private javax.swing.JTextField jtAssunto;
    private javax.swing.JTextField jtEmailDest;
    private javax.swing.JTextField jtEmailRemet;
    private javax.swing.JTextArea jtLogs;
    private javax.swing.JTextArea jtMensagem;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtPorta;
    private javax.swing.JPasswordField jtSenha;
    private javax.swing.JTextField jtSmtp;
    private javax.swing.JTabbedPane jtabEmail;
    private javax.swing.JLabel lbAnexo;
    private javax.swing.JLabel lbAssunto;
    private javax.swing.JLabel lbEmailDest;
    private javax.swing.JLabel lbEmailRemet;
    private javax.swing.JLabel lbMensagem;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbPorta;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JLabel lbSmtp;
    // End of variables declaration//GEN-END:variables

    private void enviarEmail() {

        btEnviar.setEnabled(false);
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));

        Thread t = new Thread(() -> {

            try {
                jtLogs.setText("");
                EnvioEmail.enviarEmail(
                        jtAssunto.getText(),
                        jtMensagem.getText(),
                        preparaAnexos(),
                        preparaEmit(),
                        jtEmailDest.getText());

                JOptionPane.showMessageDialog(rootPane, "E-mail enviado com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ex) {
                log(ex);
                Logger.getLogger(FormEnviaEmail.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Não fo possivel enviar email!", JOptionPane.ERROR_MESSAGE);
            }

            btEnviar.setEnabled(true);
            setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        });

        t.start();
    }

    @SuppressWarnings("UseSpecificCatch")
    private Emitente preparaEmit() throws Exception {

        try {
            Emitente emitente = new Emitente();

            emitente.setNome(jtNome.getText());
            emitente.setEmail(jtEmailRemet.getText());
            emitente.setSenha(new String(jtSenha.getPassword()));
            emitente.setSmtp(jtSmtp.getText());
            emitente.setPorta(Integer.parseInt(jtPorta.getText()));
            emitente.setTls(ckTls.isSelected());
            emitente.setSsl(ckSsl.isSelected());

            return emitente;
        } catch (Exception ex) {
            throw new Exception("Não foi possivel ler as informações do remetente."
                    + "\n Preencha todos os campos e tente novamente.", ex);
        }
    }

    private List<File> preparaAnexos() throws Exception {
        List<File> anexos = new ArrayList<>();

        if (StringUtils.isNotBlank(jtAnexo.getText())) {

            File anexo = new File(jtAnexo.getText());

            if (!anexo.exists()) {
                throw new Exception("Anexo informado não pode ser encontrado.");
            }

            anexos.add(anexo);

        }

        return anexos;
    }

    private void log(Throwable ex) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        ex.printStackTrace(pw);
        jtLogs.setText(jtLogs.getText() + "\n" + sw.toString());
    }

    private void buscaAnexo() {
        jtAnexo.setText("");

        JFileChooser chooser = new JFileChooser();
        if (chooser.showOpenDialog(rootPane) == JFileChooser.APPROVE_OPTION) {
            jtAnexo.setText(chooser.getSelectedFile().toString());
        }
    }

    private void fechar() {
        int escolha = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente fechar a aplicação?", "Tem certeza?",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (escolha == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
}