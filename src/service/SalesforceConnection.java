package service;

import java.util.List;
import java.util.Map;

import com.force.api.ApiConfig;
import com.force.api.ApiException;
import com.force.api.ForceApi;
import com.force.api.QueryResult;

public class SalesforceConnection<T> {
	
	private static final String CLIENTID = "3MVG9pHRjzOBdkd_TW27CXplcyOgFL7jZujoUzOgL2zc4gUGn3wJV4b9tbcoOwTFXzyEQQeIrtKaVa.rRsveE";
	private static final String CLIENTSECRET = "3130102777585279462";
	private static final String DOMAIN = "https://test.salesforce.com";
	private static final String USERNAME = "sfadmin@77soft.com.dbmcs";
	private static final String PASSWORD = "77dbmcs!";
	private static final String SECURITY_TOKEN = "PAtZ11wg0U82hc47Rh2e4yhlw ";
	
	private ApiConfig config;
	private ForceApi api;

	public void connect() {
		config = new ApiConfig();
		
		config.setUsername(USERNAME);
		config.setPassword(PASSWORD+SECURITY_TOKEN);
		config.setClientId(CLIENTID);
		config.setClientSecret(CLIENTSECRET);
		config.setLoginEndpoint(DOMAIN);
		
		api = new ForceApi(config);
	}
	
	public void connect(String username, String password, String securityToken) {
		config = new ApiConfig();
		
		config.setUsername(username);
		config.setPassword(password+securityToken);
		config.setClientId(CLIENTID);
		config.setClientSecret(CLIENTSECRET);
		config.setLoginEndpoint(DOMAIN);
		
		api = new ForceApi(config);
	
	}
	
	public boolean checkLoginSuccess() {
		if(api == null) 
			return false;
		return true;
	}	
	
	public QueryResult<Map> query (String query) {
		return api.query(query);
	}
	
	public List<T> retrieve(String query, Class<T> objectType) {
		
		return api.query(query, objectType).getRecords();
	}
	
	public String create(String objectType, Object object) throws ApiException{
		return api.createSObject(objectType, object);
	}
	
	public ForceApi getApi() {
		return api;
	}

	public String update(String objectType, Object object) {
		return objectType;
	}

	public String delete(String objectType, Object object) {
		return objectType;
	}
}