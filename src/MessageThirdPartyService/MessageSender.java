package MessageThirdPartyService;

public class MessageSender implements IMessageSender{

	@Override
	public Boolean sendMessage(String body) {

		System.out.print(body);
		return true;
		
	}

}
