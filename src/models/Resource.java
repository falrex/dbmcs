package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Resource {
	@JsonProperty(value="Id")
	private String id;
	
	@JsonProperty(value="Name")
	private String Name;
	
	@JsonProperty(value="First_Name__c")
	private String firstName;
	
	@JsonProperty(value="Last_Name__c")
	private String lastName;
	
	@JsonProperty(value="Email_Address__c")
	private String emailAddress;
	
	@JsonProperty(value="Phone_Number__c")
	private String phoneNumber;
	
	@JsonProperty(value="ID_Number__c")
	private String idNumber;
	
	@JsonProperty(value="Service_Area__c")
	private String serviceArea;
	
	@JsonProperty(value="Original_42__c")
	private String original42;
	
	@JsonProperty(value="Key_Personnel__c")
	private String keyPersonnel;
	
	@JsonProperty(value="Freeancer__c")
	private String freelancer;
	
	@JsonProperty(value="Replacement__c")
	private String replacement;
	
	@JsonProperty(value="Status__c")
	private String status;
	
	@JsonProperty(value="Onboarding_Date__c")
	private String onboardingDate;
	
	@JsonProperty(value="Offboarding_Date__c")
	private String offboardingDate;
	
	@JsonProperty(value="Overlap_30_days__c")
	private String overlap;
	
	@JsonProperty(value="Replacement__Of__c")
	private String replacementOf;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getServiceArea() {
		return serviceArea;
	}

	public void setServiceArea(String serviceArea) {
		this.serviceArea = serviceArea;
	}

	public String getOriginal42() {
		return original42;
	}

	public void setOriginal42(String original42) {
		this.original42 = original42;
	}

	public String getKeyPersonnel() {
		return keyPersonnel;
	}

	public void setKeyPersonnel(String keyPersonnel) {
		this.keyPersonnel = keyPersonnel;
	}

	public String getFreelancer() {
		return freelancer;
	}

	public void setFreelancer(String freelancer) {
		this.freelancer = freelancer;
	}

	public String getReplacement() {
		return replacement;
	}

	public void setReplacement(String replacement) {
		this.replacement = replacement;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOnboardingDate() {
		return onboardingDate;
	}

	public void setOnboardingDate(String onboardingDate) {
		this.onboardingDate = onboardingDate;
	}

	public String getOffboardingDate() {
		return offboardingDate;
	}

	public void setOffboardingDate(String offboardingDate) {
		this.offboardingDate = offboardingDate;
	}

	public String getOverlap() {
		return overlap;
	}

	public void setOverlap(String overlap) {
		this.overlap = overlap;
	}

	public String getReplacementOf() {
		return replacementOf;
	}

	public void setReplacementOf(String replacementOf) {
		this.replacementOf = replacementOf;
	}
	
	
}
