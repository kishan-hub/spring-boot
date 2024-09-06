package in.kishan.core.provider;


public class PDFMessageConvertor implements MessageConverter{

	@Override
	public String messageConverter(String message) {
		// TODO Auto-generated method stub
		
		return "<pdf>"+message+"</pdf>";
	}
	

}
