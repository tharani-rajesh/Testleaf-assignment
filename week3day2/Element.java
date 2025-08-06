package week3day2;

public class Element extends Button {
	    public static void main(String[] args) {
	    	
	        // WebElement reference and method calls
	        WebElement element = new WebElement();
	        element.click();
	        element.setText("Hello Web");

	        // Button reference and method calls
	        Button button = new Button();
	        button.click();
	        button.setText("Click me!");
	        button.submit();

	        // TextField reference and method calls
	        TextField textField = new TextField();
	        textField.click();
	        textField.setText("Username");
	        textField.getText();

	        // CheckBoxButton reference and method calls
	        CheckBoxButton checkBox = new CheckBoxButton();
	        checkBox.click();
	        checkBox.setText("Agree");
	        checkBox.submit();
	        checkBox.clickCheckButton();

	        // RadioButton reference and method calls
	        RadioButton radioButton = new RadioButton();
	        radioButton.click();
	        radioButton.setText("Male");
	        radioButton.submit();
	        radioButton.selectRadioButton();
	    }
	}


