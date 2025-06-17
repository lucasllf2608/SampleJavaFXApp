package gui;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable{

	@FXML
	private MenuItem menuItemSeller;
	
	@FXML
	private MenuItem menuItemDepartment;
	
	@FXML
	private MenuItem menuItemAbout;
	
	@FXML
	public void menuItemSellerAction() {
		System.out.println("opa");
	}
	
	@FXML
	public void menuItemDepartmentAction() {
		System.out.println("aoba");
	}
	
	@FXML
	public void menuItemAboutAction() {
		System.out.println("ui");
	}

	
	@Override
	public void initialize(URL uri, ResourceBundle rb) {
		// TODO Auto-generated method stub
		
	}

}
