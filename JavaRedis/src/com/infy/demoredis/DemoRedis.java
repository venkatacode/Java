package com.infy.demoredis;

import redis.clients.jedis.Jedis;

public class DemoRedis {
	
	public static void main(String[] args) {
		Jedis jedis=new Jedis("localhost",6379);
		System.out.println(""+jedis.ping());
	}
}
