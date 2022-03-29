package org.orangeHRM.com;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import SeleniumProject.Assertion;

public class WorkShiftFunction extends BaseClass{

	public static void main(String[] args) throws Throwable {
		
		setup("Firefox");
		navigate(driver, "maximize");
		geturl("https://opensource-demo.orangehrmlive.com/");
		POM pc = new POM(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Login with correct credentials
		sendkeys(pc.getUsername(), "Admin");
		String expuname = pc.getUsername().getAttribute("value");
		String actuname = "Admin";
		System.out.println("User Name Validation is: " + actuname.equals(expuname));
		sendkeys(pc.getPass(), "admin123");
		String exppwd = pc.getPass().getAttribute("value");
		String actpwd = "admin123";
		System.out.println("Password Validation is: " + actpwd.equals(exppwd));
		click(pc.getLogin());
		
		/*//Negative Test Cases 
		//Login with incorrect credentials (without username & Password)
		sendkeys(pc.getUsername(), "");
		sendkeys(pc.getPass(), "");
		click(pc.getLogin());
		sleep();
		//Login with incorrect credentials (Invalid username & Password)
		sendkeys(pc.getUsername(), "sdgdfsgdf");
		String expuname2 = pc.getUsername().getAttribute("value");
		String actuname2 = "Admin";
		System.out.println("User Name Validation is: " + actuname2.equals(expuname2));
		sendkeys(pc.getPass(), "admin123");
		String exppwd2 = pc.getPass().getAttribute("value");
		String actpwd2 = "admin123";
		System.out.println("Password Validation is: " + actpwd2.equals(exppwd2));
		sendkeys(pc.getPass(), "dfd");
		click(pc.getLogin());
		sleep();
		//Login with incorrect credentials (Valid username & invalid Password)
		sendkeys(pc.getUsername(), "Admin");
		sendkeys(pc.getPass(), "dfd");
		click(pc.getLogin());
		sleep();
		//Login with incorrect credentials (invalid username & Valid Password)
		sendkeys(pc.getUsername(), "Adminnn");
		sendkeys(pc.getPass(), "admin123");
		click(pc.getLogin());*/
		
		click(pc.getAdmin());
		click(pc.getJob());
		
		click(pc.getWork_shift());
		click(pc.getAdd());
		
		sendkeys(pc.getWorkShift_name(), "Second");
		sleep();
		select(pc.getWorkShift_workHours_from(), "14:00");
		select(pc.getWorkShift_workHours_to(), "22:00");
		sleep();
		select(pc.getWorkShift_availableEmp(), "28");
		click(pc.getBtnAssignEmployee());
		click(pc.getBtnSave());
		
		/*//Negative Text Cases in Work Shift
		//Work Shift & Work hours are empty value
		sendkeys(pc.getWorkShift_name(), "");
		click(pc.getBtnSave());
		String actshift = "Required";
		WebElement shift = driver.findElement(By.xpath("//*[@id=\"frmWorkShift\"]/fieldset/ol/li[1]/span"));
		String expshift = shift.getText();
		System.out.println("Work Shift Validation: " + expshift.equals(actshift));
		sleep();
		select(pc.getWorkShift_workHours_from(), "");
		select(pc.getWorkShift_workHours_to(), "");
		String actwork = "Required";
		WebElement work = driver.findElement(By.xpath("//*[@id=\"frmWorkShift\"]/fieldset/ol/li[2]/span[2]"));
		String expwork= work.getText();
		System.out.println("Work Hours Validation: " + expwork.equals(actwork));
		sleep();
		click(pc.getBtnSave());
		//Work Shift is empty value
		pc.getWorkShift_name().clear();
		sendkeys(pc.getWorkShift_name(), "");
		sleep();
		select(pc.getWorkShift_workHours_from(), "00:15");
		select(pc.getWorkShift_workHours_to(), "00:45");
		sleep();
		click(pc.getBtnSave());
		//Work Hours is empty value
		pc.getWorkShift_name().clear();
		sendkeys(pc.getWorkShift_name(), "Shift-1");
		sleep();
		select(pc.getWorkShift_workHours_from(), "");
		select(pc.getWorkShift_workHours_to(), "");
		sleep();
		click(pc.getBtnSave());
		//Already saved Work Shift
		pc.getWorkShift_name().clear();
		sendkeys(pc.getWorkShift_name(), "Second");
		String alwork = "Already exists";
		WebElement inwork = driver.findElement(By.xpath("//*[@id=\"frmWorkShift\"]/fieldset/ol/li[1]/span"));
		String alsave = inwork.getText();
		System.out.println("Work Hours Validation: " + alsave.equals(alwork));
		sleep();
		select(pc.getWorkShift_workHours_from(), "00:15");
		select(pc.getWorkShift_workHours_to(), "00:45");
		sleep();
		click(pc.getBtnSave());
		//Work Duration is 0
		pc.getWorkShift_name().clear();
		sendkeys(pc.getWorkShift_name(), "Shift-2");
		String acout = "From time should be less than To time";
		WebElement hour = driver.findElement(By.xpath("//*[@id=\"frmWorkShift\"]/fieldset/ol/li[2]/span[2]"));
		String expout = hour.getText();
		System.out.println("Work Hours Validation: " + expout.equals(acout));
		sleep();
		select(pc.getWorkShift_workHours_from(), "00:15");
		select(pc.getWorkShift_workHours_to(), "00:15");
		sleep();
		click(pc.getBtnSave());
		//Work Duration is Negative value
		pc.getWorkShift_name().clear();
		sendkeys(pc.getWorkShift_name(), "Shift-2");
		sleep();
		select(pc.getWorkShift_workHours_from(), "02:00");
		select(pc.getWorkShift_workHours_to(), "01:00");
		sleep();
		click(pc.getBtnSave());*/
			
		screenshot("C:\\Users\\Sheela.WINDOWS-4R3S7OJ\\eclipse-workspace\\Selenium\\Screenshot\\");
		Set<String> whandles = driver.getWindowHandles();
		System.out.println(whandles);
		
		click(pc.getSelectcheck());		
		click(pc.getBtnDelete());
		click(pc.getDialogDeleteBtn());
		screenshot("C:\\Users\\Sheela.WINDOWS-4R3S7OJ\\eclipse-workspace\\Selenium\\Screenshot\\");
		
	}
	
}
