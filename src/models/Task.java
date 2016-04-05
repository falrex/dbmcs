package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author dennis.deigo
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Task {
	@JsonProperty(value="Class__c")
	private String taskClass;
	
	@JsonProperty(value="Id")
	private String id;
	
	@JsonProperty(value="Name")
	private String name;
	
	@JsonProperty(value="Resource__c")
	private String resource;
	
	@JsonProperty(value="Project__c")
	private String project;
	
	@JsonProperty(value="Task_Name__c")
	private String taskName;
	
	@JsonProperty(value="Task__c")
	private String task;
	
	@JsonProperty(value="Type__c")
	private String taskType;
	
	@JsonProperty(value="Description__c")
	private String description;
	
	@JsonProperty(value="Forecast_Hours__c")
	private String forecastHours;
	
	@JsonProperty(value="Planned_Start_Date__c")
	private String plannedStartDate;
	
	@JsonProperty(value="Planned_Finish_date__c")
	private String plannedFinishDate;
	
	@JsonProperty(value="Actual_Hours__c")
	private String actualHours;
	
	@JsonProperty(value="Actual_Start_Date__c")
	private String actualStartDate;
	
	@JsonProperty(value="Actual_Finish_Date__c")
	private String actualFinishDate;
	
	@JsonProperty(value="Number_of_Revisions__c")
	private String numberOfRevisions;
	
	@JsonProperty(value="Details_of_Changes__c")
	private String detailsOfChanges;
	
	@JsonProperty(value="Negative_Review_Remarks__c")
	private String negativeReviewRemarks;
	
	@JsonProperty(value="Negative_Review_Points__c")
	private String negativeReviewPoints;
	
	@JsonProperty(value="Deliverable__c")
	private String deliverable;
	
	@JsonProperty(value="Number of_Business_Requirements__c")
	private String numberOfBusinessRequirements;
	
	@JsonProperty(value="Number_of_Functional_Requirements__c")
	private String numberOfFunctionalRequirements;
	
	@JsonProperty(value="Number_of_Test_Cases")
	private String numberOfTestCases;
	
	private Resource resourceObject;
	
	//private Resource projectObject;
	
	@JsonProperty(value="Schedule_Variance__c")
	private String scheduleVariance;
	


	public String getTaskClass() {
		return taskClass;
	}

	public void setTaskClass(String taskClass) {
		this.taskClass = taskClass;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getTaskType() {
		return taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getForecastHours() {
		return forecastHours;
	}

	public void setForecastHours(String forecastHours) {
		this.forecastHours = forecastHours;
	}

	public String getPlannedStartDate() {
		return plannedStartDate;
	}

	public void setPlannedStartDate(String plannedStartDate) {
		this.plannedStartDate = plannedStartDate;
	}

	public String getPlannedFinishDate() {
		return plannedFinishDate;
	}

	public void setPlannedFinishDate(String plannedFinishDate) {
		this.plannedFinishDate = plannedFinishDate;
	}

	public String getActualHours() {
		return actualHours;
	}

	public void setActualHours(String actualHours) {
		this.actualHours = actualHours;
	}

	public String getActualStartDate() {
		return actualStartDate;
	}

	public void setActualStartDate(String actualStartDate) {
		this.actualStartDate = actualStartDate;
	}

	public String getActualFinishDate() {
		return actualFinishDate;
	}

	public void setActualFinishDate(String actualFinishDate) {
		this.actualFinishDate = actualFinishDate;
	}

	public String getNumberOfRevisions() {
		return numberOfRevisions;
	}

	public void setNumberOfRevisions(String numberOfRevisions) {
		this.numberOfRevisions = numberOfRevisions;
	}

	public String getDetailsOfChanges() {
		return detailsOfChanges;
	}

	public void setDetailsOfChanges(String detailsOfChanges) {
		this.detailsOfChanges = detailsOfChanges;
	}

	public String getNegativeReviewRemarks() {
		return negativeReviewRemarks;
	}

	public void setNegativeReviewRemarks(String negativeReviewRemarks) {
		this.negativeReviewRemarks = negativeReviewRemarks;
	}

	public String getNegativeReviewPoints() {
		return negativeReviewPoints;
	}

	public void setNegativeReviewPoints(String negativeReviewPoints) {
		this.negativeReviewPoints = negativeReviewPoints;
	}

	public String getDeliverable() {
		return deliverable;
	}

	public void setDeliverable(String deliverable) {
		this.deliverable = deliverable;
	}

	public String getNumberOfBusinessRequirements() {
		return numberOfBusinessRequirements;
	}

	public void setNumberOfBusinessRequirements(String numberOfBusinessRequirements) {
		this.numberOfBusinessRequirements = numberOfBusinessRequirements;
	}

	public String getNumberOfFunctionalRequirements() {
		return numberOfFunctionalRequirements;
	}

	public void setNumberOfFunctionalRequirements(String numberOfFunctionalRequirements) {
		this.numberOfFunctionalRequirements = numberOfFunctionalRequirements;
	}

	public String getNumberOfTestCases() {
		return numberOfTestCases;
	}

	public void setNumberOfTestCases(String numberOfTestCases) {
		this.numberOfTestCases = numberOfTestCases;
	}

	public String getScheduleVariance() {
		return scheduleVariance;
	}

	public void setScheduleVariance(String scheduleVariance) {
		this.scheduleVariance = scheduleVariance;
	}

	public Resource getResourceObject() {
		return resourceObject;
	}

	public void setResourceObject(Resource resourceObject) {
		this.resourceObject = resourceObject;
	}
	
	
}
