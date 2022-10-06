package apiconfigs;

import java.util.HashMap;
import java.util.Map;

public class HeaderConfigs {
	
	public Map<String, String> defaultHeaders(){
		Map<String, String> defaultHeaders = new HashMap<String, String>();
		defaultHeaders.put("Content-Type", "application/json");		
		
		return defaultHeaders;	
	}
	
	public Map<String, String> headersWithToken(){
		Map<String, String> defaultHeaders = new HashMap<String, String>();
		defaultHeaders.put("Content-Type", "application/json");
		defaultHeaders.put("Authorization", "Bearer bed5e0955719ff667c9688ac6b944284914057b7e08a89fc8ddd8e0a5864f52c");
		
		return defaultHeaders;	
	}
}
