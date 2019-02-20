package cn.mikulove.log;

import org.junit.Test;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class Slf4jTest {

	
	@Test
	public void test1(){
		log.trace("trace");
		log.debug("debug");
		log.info("info");
		log.warn("warn");
		log.error("error");
	}
}
