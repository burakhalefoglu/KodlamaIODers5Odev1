package core;

import MessageThirdPartyService.IMessageSender;

public class MessageAdapter implements IMessageAdapter{

	IMessageSender MessageSender;
	
	public MessageAdapter(IMessageSender messageSender) {
		super();
		MessageSender = messageSender;
	}

	public Boolean sendMessage(String body) {
		
		return MessageSender.sendMessage(body);
	}
}
