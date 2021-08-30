import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;

import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Scenes_of_Delivery {
	static Dbase database = new Dbase();

	public static Scene Scenedel(Stage primarystage) throws FileNotFoundException {

		Label l1 = new Label("UserName");
		Label l2 = new Label("Password");
		TextField tx1 = new TextField();
		TextField tx2 = new TextField();
		tx1.setPrefHeight(25);
		tx1.setPrefWidth(191);
		tx2.setPrefHeight(25);
		tx2.setPrefWidth(191);
		tx1.setLayoutX(560);
		tx1.setLayoutY(370);
		tx2.setLayoutX(560);
		tx2.setLayoutY(430);
		l1.setLayoutX(470);
		l1.setLayoutY(370);
		l1.setPrefHeight(25);
		l1.setPrefWidth(370);

		l1.setTextFill(Color.valueOf("#030125"));
		l1.setFont(Font.font("Baskerville Old Face", 16));

		l2.setLayoutX(470);
		l2.setLayoutY(430);
		l2.setPrefHeight(25);
		l2.setPrefWidth(80);

		l2.setTextFill(Color.valueOf("#030125"));
		l2.setFont(Font.font("Baskerville Old Face", 16));
		VBox v = new VBox(25);

		Button b = new Button("Delivery  page");
		Button b1 = new Button("Exit");

		b.setPrefHeight(39);
		b.setPrefWidth(209);

		b1.setPrefHeight(39);
		b1.setPrefWidth(209);

		Button b2 = new Button("Login");

		b2.setPrefHeight(39);
		b2.setPrefWidth(120);
		b2.setLayoutX(560);
		b2.setLayoutY(500);
		v.getChildren().addAll(b, b1);
		v.setLayoutX(0);
		v.setLayoutY(166);
		v.setPrefHeight(209);
		v.setPrefWidth(209);

		AnchorPane pane1 = new AnchorPane();
		AnchorPane pane = new AnchorPane();
		pane.setStyle("-fx-background-color:  #4c534c ;" + "-fx-background-radius : 30;");
		pane.setPrefWidth(247);
		pane.setPrefHeight(670);
		pane.setLayoutX(0);
		pane.setLayoutY(0);

		pane1.setPrefWidth(966);
		pane1.setPrefHeight(661);

		AnchorPane pane2 = new AnchorPane();
		pane2.setStyle("-fx-background-color:   #4c534c ;");
		pane2.setPrefWidth(750);
		pane2.setPrefHeight(141);
		pane2.setLayoutX(235);
		pane2.setLayoutY(20);
		Image image = new Image(new FileInputStream("p1.png"));

		ImageView imageView = new ImageView(image);
		imageView.setFitHeight(112);
		imageView.setFitWidth(143);
		imageView.setLayoutX(305);
		imageView.setLayoutY(0);
		Image image11 = new Image(new FileInputStream("p3.jpg"));
		ImageView imageView11 = new ImageView(image11);
		imageView11.setFitHeight(133);
		imageView11.setFitWidth(150);
		imageView11.setLayoutX(540);
		imageView11.setLayoutY(180);

		Label l = new Label("Delivery Resturant ");

		l.setLayoutX(294);
		l.setLayoutY(115);
		l.setPrefHeight(32);
		l.setPrefWidth(217);
		l.setTextFill(Color.valueOf("white"));
		l.setFont(Font.font("Baskerville Old Face", 25));
		pane2.getChildren().addAll(imageView, l);
		pane1.setStyle("-fx-background-color:   #8fd393");
		pane.getChildren().addAll(v);
		pane1.getChildren().addAll(pane, pane2, imageView11, l1, l2, tx1, tx2, b2);

		Scene scene = new Scene(pane1, 960, 660);
		scene.getStylesheets().add("stayle2.css");

		b2.setOnAction(e -> {
			try {
				database.datadel = new ArrayList<>();
				database.getDatadriver();

				for (int i = 0; i < database.datadel.size(); i++) {

					if ((Integer.parseInt(tx1.getText().trim()) == database.datadel.get(i).getDelivery_num())
							&& (tx2.getText().trim().equalsIgnoreCase(database.datadel.get(i).getPassword().trim()))) {
						primarystage.setScene(Scene6(primarystage, Integer.parseInt(tx1.getText().trim())));
						break;
					} else if (i == database.datadel.size() - 1) {
						Alert alert = new Alert(AlertType.ERROR);
						alert.setContentText("");
						alert.setHeaderText("invalid username or password");
						alert.showAndWait();

					}
				}
			} catch (FileNotFoundException | ClassNotFoundException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		});
		b1.setOnAction(e -> {
			try {
				primarystage.setScene(Scenes_of_Admin.mainscene(primarystage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		return scene;
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////

	public static Scene Scene6(Stage primaryStage, int id) throws FileNotFoundException {

		Image image1 = new Image(new FileInputStream("p10.png"));

		ImageView imageView1 = new ImageView(image1);
		imageView1.setFitHeight(40);
		imageView1.setFitWidth(40);
		imageView1.setLayoutX(305);
		imageView1.setLayoutY(0);

		Image image5 = new Image(new FileInputStream("p12.png"));

		ImageView imageView5 = new ImageView(image5);
		imageView5.setFitHeight(94);
		imageView5.setFitWidth(130);
		imageView5.setLayoutX(51);
		imageView5.setLayoutY(14);
		VBox v = new VBox(25);

		Button b = new Button("Delivery  page");

		b.setPrefHeight(39);
		b.setPrefWidth(209);
		b.setLayoutX(20);
		b.setLayoutY(97);

		v.setLayoutX(50);
		v.setLayoutY(166);
		v.setPrefHeight(209);
		v.setPrefWidth(209);

		AnchorPane pane1 = new AnchorPane();
		AnchorPane pane = new AnchorPane();
		pane.setStyle("-fx-background-color:  #4c534c ;" + "-fx-background-radius : 30;");
		pane.setPrefWidth(252);
		pane.setPrefHeight(670);
		pane.setLayoutX(0);
		pane.setLayoutY(0);

		pane1.setPrefWidth(966);
		pane1.setPrefHeight(661);

		AnchorPane pane2 = new AnchorPane();
		pane2.setStyle("-fx-background-color:   #4c534c ;");
		pane2.setPrefWidth(750);
		pane2.setPrefHeight(141);
		pane2.setLayoutX(235);
		pane2.setLayoutY(20);
		Image image = new Image(new FileInputStream("p1.png"));

		ImageView imageView = new ImageView(image);
		imageView.setFitHeight(112);
		imageView.setFitWidth(143);
		imageView.setLayoutX(305);
		imageView.setLayoutY(0);

		Label l = new Label("Delivery Resturant ");

		l.setLayoutX(294);
		l.setLayoutY(115);
		l.setPrefHeight(32);
		l.setPrefWidth(217);
		l.setTextFill(Color.valueOf("white"));
		l.setFont(Font.font("Baskerville Old Face", 25));

		Button b1 = new Button("Delivery page");
		b1.setPrefHeight(40);
		b1.setPrefWidth(209);
		b1.setTextAlignment(TextAlignment.LEFT);
		v.getChildren().addAll(b);

		v.setLayoutX(0);
		v.setLayoutY(131);
		v.setPrefHeight(209);
		v.setPrefWidth(209);

		HBox h11 = new HBox(40);
		h11.setLayoutX(420);
		h11.setLayoutY(200);
		Button b2 = new Button("Update");

		b2.setPrefHeight(32);
		b2.setPrefWidth(120);

		Button b3 = new Button("Exit");

		b3.setPrefHeight(32);
		b3.setPrefWidth(120);
		b3.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.mainscene(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		h11.getChildren().addAll(b2, b3);

		TableView<Orders> mealtable = database.tableorderfordelivery(id);
		pane2.getChildren().addAll(imageView, l);
		pane1.setStyle("-fx-background-color:   #8fd393");
		pane.getChildren().addAll(imageView5, v);
		pane1.getChildren().addAll(pane, pane2, h11, mealtable);
		Scene scene = new Scene(pane1, 960, 660);
		scene.getStylesheets().add("stayle2.css");

		b2.setOnAction(e -> {
			ObservableList<Orders> selectedRows = mealtable.getSelectionModel().getSelectedItems();
			ArrayList<Orders> rows = new ArrayList<>(selectedRows);
			rows.forEach(row -> {

				database.updatestatus(row.getOrder_id(), "delevered");
				try {
					primaryStage.setScene(Scene6(primaryStage, id));
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			});
		});
		return scene;
	}

}
