package cn.mikulove.component;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import cn.mikulove.entities.User;

@Service
public class MessagerReceiver {

	@RabbitListener(queues = "baronqueue")
	public void receiverUser(User user){
		System.out.println("receive user :"+user.getName());
	}
}
