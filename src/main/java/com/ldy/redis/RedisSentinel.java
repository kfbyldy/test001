package com.ldy.redis;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisSentinelPool;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RedisSentinel {
    private static final JedisSentinelPool pool;
    static {
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxTotal(10);
        jedisPoolConfig.setMaxIdle(5);
        jedisPoolConfig.setMinIdle(5);

        Set<String> sentinels = new HashSet<String>(Arrays.asList(
                "192.168.174.129:26379",
                "192.168.174.129:26380",
                "192.168.174.129:26381"
        ));
        GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();
        poolConfig.setMaxTotal(10);
        poolConfig.setMaxIdle(5);
        poolConfig.setMinIdle(5);
        pool = new JedisSentinelPool("mymaster", sentinels, jedisPoolConfig);
    }

    public static void main(String[] args) throws Exception {
        String key1 = "key1";
        try (Jedis jedis = pool.getResource()) {
            jedis.set(key1, "222");
            System.out.println(jedis.get(key1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
