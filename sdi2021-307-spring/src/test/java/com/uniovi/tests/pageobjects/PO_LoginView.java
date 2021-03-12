package com.uniovi.tests.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PO_LoginView extends PO_NavView {
	static public void fillForm(WebDriver driver, String dnip, String passwordp) {
		WebElement dni= driver.findElement(By.name("username"));
		dni.click();
		dni.clear();
		dni.sendKeys(dnip);
		WebElement password= driver.findElement(By.name("password"));
		password.click();
		password.clear();
		password.sendKeys(passwordp);
		//Pulsar el botonde Alta.
		By boton= By.className("btn");
		driver.findElement(boton).click();
	}
}