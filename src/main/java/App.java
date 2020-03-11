import com.lambdaworks.redis.RedisClient;
import com.lambdaworks.redis.RedisConnection;
import com.lambdaworks.redis.RedisURI;

/**
 * Hello world from Vault!
 *
 */
public class App 
{
    public static RedisConnection connectToRedis() {

        String password = System.getenv("password");

        RedisClient redisClient = new RedisClient(
               // RedisURI.create("redis://" + password + "@my-redis-db-host:6379"));
                RedisURI.create("redis://localhost/"));
        RedisConnection<String, String> connection = redisClient.connect();

        System.out.println("Connected to Redis!!");

        return connection;
    }
}
