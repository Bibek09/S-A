package com.prepare.sense.act;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class cucumberPage extends PageObject{

public void searchItem(){
	getDriver().findElement(By.name("q")).sendKeys("Fintech");
}
	
public void verifyResult(){
	getDriver().findElement(By.name("q")).sendKeys("Fintech");	
}
	
}
