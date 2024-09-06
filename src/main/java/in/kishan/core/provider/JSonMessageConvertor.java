package in.kishan.core.provider;



public class JSonMessageConvertor implements MessageConverter{

	@Override
	public String messageConverter(String message) {
		// TODO Auto-generated method stub
		return "<json>"+message+"</json>";
	}
  
}
