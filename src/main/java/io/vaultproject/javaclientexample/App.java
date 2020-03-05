package io.vaultproject.javaclientexample;

/**
 * Hello world from Vault!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String username = System.getenv("$username");
        String password = System.getenv("$password");

        System.out.println(username);
        System.out.println(password);
    }
}
