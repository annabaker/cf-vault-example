package io.vaultproject.javaclientexample;
import com.bettercloud.vault.*;
import com.bettercloud.vault.response.LogicalResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world from Vault!
 *
 */
public class App 
{
    public static void main( String[] args ) throws VaultException
    {
        final VaultConfig config = new VaultConfig()
                .address("http://192.81.218.202:8200")
                .token("s.PcrFlQcqyFlynjWkjNAjOaOQ")
                .build();
        final Vault vault = new Vault(config);

        final Map<String, Object> secrets = new HashMap<String, Object>();
        secrets.put("value", "world");
        secrets.put("other_value", "You can store multiple name/value pairs under a single key");

        // Write operation
        final LogicalResponse writeResponse = vault.logical()
                .write("kv/secret", secrets);
    }
}
