import com.lambdaworks.redis.RedisConnection;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        App demoApp = new App();
        RedisConnection connection = demoApp.connectToRedis();
        connection.set("key1", "value1");
        assertTrue(connection.get("key1").equals("value1"));
        connection.close();
    }
}
