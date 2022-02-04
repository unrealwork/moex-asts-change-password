package com.axibase.asts;

import com.axibase.asts.client.Clients;
import com.axibase.asts.client.MoexAstsClient;
import com.axibase.asts.client.config.ClientConfig;
import com.axibase.asts.client.transaction.TransactionResult;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ChangePassword {
    public static void main(String[] args) throws Exception {
        try (MoexAstsClient client = Clients.defaultClient()) {
            ClientConfig clientConfig = client.getConfig();
            final String newPassword = clientConfig.param("newPassword");
            TransactionResult result = client.changePassword(newPassword);
            if (result.isSuccess()) {
                log.info("Password changed. " + result.getMessage());
            } else {
                log.error("Unable to change password. " + result.getMessage());
            }
        }
    }
}
