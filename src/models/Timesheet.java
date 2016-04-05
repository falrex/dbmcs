package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Timesheet {
	
	@JsonProperty(value="Name")
	private String name;
	
	@JsonProperty(value="Number_of_hours__c")
	private String numberOfHours;
	
	@JsonProperty(value="Actual_Leave_Time_Off__c")
	private String actualLeaveTimeOff;
	
	@JsonProperty(value="Date__c")
	private String date;
	
	@JsonProperty(value="Day__c")
	private String day;
	
	@JsonProperty(value="Service_Area__c")
	private String serviceArea;
	
	@JsonProperty(value="Task__c")
	private String task;
	
	@JsonProperty(value="Task_Type__c")
	private String taskType;
	
	@JsonProperty(value="Week__c")
	private String weekNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumberOfHours() {
		return numberOfHours;
	}

	public void setNumberOfHours(String numberOfHours) {
		this.numberOfHours = numberOfHours;
	}

	public String getActualLeaveTimeOff() {
		return actualLeaveTimeOff;
	}

	public void setActualLeaveTimeOff(String actualLeaveTimeOff) {
		this.actualLeaveTimeOff = actualLeaveTimeOff;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getServiceArea() {
		return serviceArea;
	}

	public void setServiceArea(String serviceArea) {
		this.serviceArea = serviceArea;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public String getTaskType() {
		return taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	public String getWeekNumber() {
		return weekNumber;
	}

	public void setWeekNumber(String weekNumber) {
		this.weekNumber = weekNumber;
	}
	
}
