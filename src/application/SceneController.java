package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneController {
	private Stage stage;
	private Scene scene;
	
	public void backToHomePage(ActionEvent event) throws IOException{
		Parent root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToAddCourse(ActionEvent event) throws IOException{
		Parent root = FXMLLoader.load(getClass().getResource("AddCourse.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToRecommendations(ActionEvent event) throws IOException{
		Parent root = FXMLLoader.load(getClass().getResource("Recommendations.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToAddTask(ActionEvent event) throws IOException{
		Parent root = FXMLLoader.load(getClass().getResource("AddTask.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToEditTask(ActionEvent event) throws IOException{
		Parent root = FXMLLoader.load(getClass().getResource("EditTask.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToWeeklySchedule(ActionEvent event) throws IOException{
		Parent root = FXMLLoader.load(getClass().getResource("WeeklySchedule.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToAddEvent(ActionEvent event) throws IOException{
		Parent root = FXMLLoader.load(getClass().getResource("AddEvent.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToRemoveEvent(ActionEvent event) throws IOException{
		Parent root = FXMLLoader.load(getClass().getResource("RemoveEvent.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToAddGrade(ActionEvent event) throws IOException{
		Parent root = FXMLLoader.load(getClass().getResource("addgrade.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToGradeReport(ActionEvent event) throws IOException{
		Parent root = FXMLLoader.load(getClass().getResource("GradeReport.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToCoursePage(ActionEvent event) throws IOException{
		Parent root = FXMLLoader.load(getClass().getResource("CoursePage.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}
