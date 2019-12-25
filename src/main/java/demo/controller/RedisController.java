/**
 * @author Dobby
 * Dec 24, 2019
 */
package demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import demo.util.RedisUtil;

/**
 * @author Dobby
 *
 * Dec 24, 2019
 */
@RestController
public class RedisController {

	@Autowired
	private RedisUtil redisUtil;
	@RequestMapping(value="/hset", method = RequestMethod.GET)
	public boolean hset(String key,String item,String value) {
		return redisUtil.hset(key, item,value);
	}
	@RequestMapping(value="/hget", method = RequestMethod.GET)
	public Object hget(String key,String item) {
		return  redisUtil.hget(key,item);
	}
}
