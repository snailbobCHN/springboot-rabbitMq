package boot.spring.service;

import boot.spring.po.Mail;

public interface Producer {
	public void sendMail(String queue,Mail mail);//向队列queue发送消息
}
