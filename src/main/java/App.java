import com.lambdaworks.redis.RedisClient;
import com.lambdaworks.redis.RedisConnection;
import com.lambdaworks.redis.RedisURI;

/**
 * Hello world from Vault!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       RedisConnection connection = connectToRedis();

        System.out.println("Connected to Redis!");

        connection.close();
        //redisClient.shutdown();
    }

    public static RedisConnection connectToRedis() {

        String password = System.getenv("password");

        RedisClient redisClient = new RedisClient(
                RedisURI.create("redis://" + password + "@192.81.218.202:6379"));
        RedisConnection<String, String> connection = redisClient.connect();

        return connection;
    }
}
