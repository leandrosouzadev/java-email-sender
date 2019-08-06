/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.email;

import java.io.File;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

public class EnvioEmail {

    private final MultiPartEmail email;

    public static void enviarEmail(String assunto, String msg, List<File> anexos, Emitente emit, String emailDestino) throws Exception {
        validaEmit(emit);
        validaEmailDest(emailDestino);

        try {
            EnvioEmail enviar = new EnvioEmail(emit.getSmtp(), emit.getPorta(),
                    emit.isTls(), emit.isSsl());

            enviar.doRemetente(emit.getEmail(), emit.getSenha(), emit.getNome())
                    .paraDestinatario(emailDestino)
                    .comAssunto(assunto)
                    .comMensagem(msg)
                    .comAnexo(anexos)
                    .enviar();
        } catch (Exception e) {
            throw new Exception("Erro ao enviar Email: " + e.getMessage(), e);
        }
    }

    private static void validaEmit(Emitente emit) throws Exception {
        if (StringUtils.isEmpty(emit.getEmail()) || StringUtils.isEmpty(emit.getEmail()) || emit.getPorta() == 0
                || StringUtils.isEmpty(emit.getSenha()) || StringUtils.isEmpty(emit.getSmtp())) {
            throw new Exception("É necessário preencher todos os dados de email do emitente.");
        }
    }
    private static void validaEmailDest(String emailDestino) throws Exception {
        if (StringUtils.isBlank(emailDestino)) {
            throw new Exception("O email do destinatário não foi informado.");
        }
    }

    private EnvioEmail(String serverSmtp, int portaSmtp, boolean tls, boolean ssl) {
        this.email = new MultiPartEmail();
        this.email.setHostName(serverSmtp);

        if (ssl) {
            this.email.setSSL(ssl);
            this.email.setSmtpPort(portaSmtp);
            this.email.setSslSmtpPort(String.valueOf(portaSmtp));
        } else {
            this.email.setSmtpPort(portaSmtp);
            this.email.setTLS(tls);
        }
        this.email.setDebug(false);
    }

    private EnvioEmail doRemetente(String email, String senha, String fantasia) throws EmailException {
        this.email.setFrom(email, fantasia);
        this.email.setAuthenticator(new DefaultAuthenticator(email, senha));
        return this;
    }

    private EnvioEmail paraDestinatario(String email) throws EmailException {
        this.email.addTo(email);
        return this;
    }

    public EnvioEmail paraDestinatarioIf(String email, boolean condicao) throws EmailException {
        if (condicao) {
            this.email.addTo(email);
        }
        return this;
    }

    private EnvioEmail comAssunto(String assunto) {
        email.setSubject(assunto);
        return this;
    }

    private EnvioEmail comMensagem(String mensagem) throws EmailException {
        this.email.setMsg(mensagem);
        return this;
    }

    private EnvioEmail comAnexo(String pathAnexo) throws EmailException {
        EmailAttachment anexo = new EmailAttachment();
        anexo.setPath(pathAnexo);
        anexo.setDisposition(EmailAttachment.ATTACHMENT);
        this.email.attach(anexo);
        return this;
    }

    private EnvioEmail comAnexo(List<File> pathAnexo) throws EmailException {
        for (File file : pathAnexo) {
            EmailAttachment anexo = new EmailAttachment();
            anexo.setPath(file.toString());
            anexo.setDisposition(EmailAttachment.ATTACHMENT);

            if (file.exists()) {
                this.email.attach(anexo);
            }
        }
        return this;
    }

    private void enviar() throws EmailException {
        this.email.send();
    }
}
