package your.package.here;

/**
 * Code in this class is written by xShequ/Scott. (in 2020)
 * @author Scott/xShequ
 * You can use this code in any way you like and you DO NOT need to credit me.
 * I'm not responsible for any damage that this code will cause!
 * Have fun!
 */

public class ExampleMain {

    // Main method to connect to MySQL.
    public void main(String[] args) {
        connectMySQL();
    }

    /**
     * Void method used to connect to MySQL and to create the databases.
     * Set host data here.
     * Creates a table called "ExampleTable" with the value "test" as an integer.
     * Prints an error if something failed.
     */
    private void connectMySQL() {
        try {
            MySQL mySQL = new MySQL("coolHostHere", "coolDataBaseHere", "coolUsernameHere", "coolPasswordHere");
            mySQL.update("CREATE TABLE IF NOT EXISTS ExampleTable(TEST int);");
            System.out.println("[MYSQL] Tables were successfully created any MySQL established");
        } catch (Exception e) {
            System.out.println("[ERROR] Could not connect to MySQL Database!");
            System.out.println("[ERROR] Error: " + e.getMessage());
        }
    }

}
