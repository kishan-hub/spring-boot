package in.kishan.core.provider;


public class HtmlMessageConvertorImpl implements MessageConverter {

	@Override
	public String messageConverter(String message) {
		// TODO Auto-generated method stub
		//logic to convert the String into html Page
		return "<html>"+message+"</html>";
	}

}
