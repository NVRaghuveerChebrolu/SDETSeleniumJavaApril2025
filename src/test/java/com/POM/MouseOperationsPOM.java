package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.Library;

public class MouseOperationsPOM extends Library{
	public MouseOperationsPOM() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[@class='context-menu-one btn btn-neutral']")
	public WebElement RightClickMeButton;

	@FindBy(xpath="//span[text()='Paste']")
	public WebElement PasteOption;
	
	@FindBy(xpath="//iframe[@width='100%']")
	public WebElement iframe;
	
	@FindBy(xpath="//span[contains(text(),'Double click')]/preceding-sibling::div")
	public WebElement blueColorBox;
	
	@FindBy(xpath="//iframe[@class='demo-frame']")
	public WebElement DragAndDropiframe;
	
	@FindBy(id="draggable")
	public WebElement draggable;
	
	@FindBy(id="droppable")
	public WebElement droppable;
}
