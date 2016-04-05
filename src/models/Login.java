package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author abc
 *
 */

@JsonIgnoreProperties(ignoreUnknown=true)
public class Login {
	@JsonProperty(value="Id")
	private String id;
	
	@JsonProperty(value="Resource__c")
	private String resource;
	
	@JsonProperty(value="Password__c")
	private String password;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
