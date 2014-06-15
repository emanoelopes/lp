package template;

import java.security.InvalidParameterException;

public abstract class HTTPServlet {
	public void service(String reqHTTP,String tipo) {
		if("GET".equals(tipo)){
			doGet(reqHTTP);
		}else if("POST".equals(tipo)){
			doPost(reqHTTP);
		}else{
			throw new InvalidParameterException();
		}
		
	}
	
	public abstract void doGet(String reqHTTP);
	public abstract void doPost(String reqHTTP);	
}
