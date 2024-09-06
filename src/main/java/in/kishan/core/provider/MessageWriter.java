package in.kishan.core.provider;

import org.springframework.beans.factory.annotation.Autowired;
public class MessageWriter {
	
	@Autowired
	private MessageConverter messageConvertor;
	
	public void writeMessage(String message) {
		String convertedMessage=null;
		convertedMessage=messageConvertor.messageConverter(message);
		System.out.println(convertedMessage);
		
	}

}
