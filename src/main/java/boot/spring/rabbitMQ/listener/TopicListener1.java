package boot.spring.rabbitMQ.listener;

import java.io.IOException;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import boot.spring.po.Mail;



@Component
public class TopicListener1 {
	@RabbitListener(queues = "topicqueue1")
	public void displayTopic(Mail mail) {
		System.out.println("从topicqueue1取出消息"+mail.toString());
		}
}
