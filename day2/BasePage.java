package week3.day2;

public class BasePage {

	
	    // finding an element
	    public void findElement() {
	        System.out.println("BasePage: Finding element on the page");
	    }

	    // clicking an element
	    public void clickElement() {
	        System.out.println("BasePage: Clicking on the element");
	    }

	    // entering text into an element
	    public void enterText() {
	        System.out.println("BasePage: Entering text into the element");
	    }

	    // overridden by subclasses
	    public void performCommonTasks() {
	        System.out.println("BasePage: Performing common tasks on a generic page");
	    }
	}



