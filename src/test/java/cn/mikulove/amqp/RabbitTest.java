package cn.mikulove.amqp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.mikulove.entities.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitTest {

	@Autowired
	private RabbitTemplate template;
	
	@Test
	public void sendMessage(){
		//template.convertAndSend("exchange.direct","baronqueue","123");
		User u = new User();
		u.setAge(24);
		u.setName("undsd");
		template.convertAndSend("exchange.direct","baronqueue",u);
	}
	
	@Test
	public void receiveMessage(){
		Object o = template.receiveAndConvert("baronqueue");
		System.out.println(o);
	}
}
