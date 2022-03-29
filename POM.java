package org.orangeHRM.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import MiniProject1.POM2;

public class POM {
	
	public static WebDriver driver;
	
	public POM(WebDriver driver1) {
		POM.driver = driver1;
		PageFactory.initElements(driver1, this);
	}
	
	@FindBy(id="txtUsername")
	private WebElement username;
	
	@FindBy(id="txtPassword")
	private WebElement pass;
	
	@FindBy(id="btnLogin")
	private WebElement login;
	
	@FindBy(id="menu_admin_viewAdminModule")
	private WebElement admin;
	
	@FindBy(id="menu_admin_Job")
	private WebElement job;
	
	@FindBy(id="menu_admin_workShift")
	private WebElement work_shift;
	
	@FindBy(id="btnAdd")
	private WebElement add;
	
	@FindBy(id="workShift_name")
	private WebElement workShift_name;
	
	@FindBy(id="workShift_workHours_from")
	private WebElement workShift_workHours_from;
	
	@FindBy(id="workShift_workHours_to")
	private WebElement workShift_workHours_to;
	
	@FindBy(id="workShift_availableEmp")
	private WebElement workShift_availableEmp;
	
	@FindBy(id="btnAssignEmployee")
	private WebElement btnAssignEmployee;
	
	@FindBy(id="btnSave")
	private WebElement btnSave;
	
	@FindBy(id="ohrmList_chkSelectRecord_5")
	private WebElement selectcheck;
	
	@FindBy(id="btnDelete")
	private WebElement btnDelete;
	
	@FindBy(id="dialogDeleteBtn")
	private WebElement dialogDeleteBtn;
	
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLogin() {
		return login;
	}
	public WebElement getAdmin() {
		return admin;
	}
	public WebElement getJob() {
		return job;
	}
	public WebElement getWork_shift() {
		return work_shift;
	}
	public WebElement getAdd() {
		return add;
	}
	public WebElement getWorkShift_name() {
		return workShift_name;
	}
	public WebElement getWorkShift_workHours_from() {
		return workShift_workHours_from;
	}
	public WebElement getWorkShift_workHours_to() {
		return workShift_workHours_to;
	}
	public WebElement getWorkShift_availableEmp() {
		return workShift_availableEmp;
	}
	public WebElement getBtnAssignEmployee() {
		return btnAssignEmployee;
	}
	public WebElement getBtnSave() {
		return btnSave;
	}
	public WebElement getSelectcheck() {
		return selectcheck;
	}
	public WebElement getBtnDelete() {
		return btnDelete;
	}
	public WebElement getDialogDeleteBtn() {
		return dialogDeleteBtn;
	}
		
}
