import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
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

public class Scenes_of_Admin {
	static Dbase database = new Dbase();

	public static Scene mainscene(Stage primatyStage) throws FileNotFoundException {
		VBox v = new VBox(25);

		Button b = new Button("Admin page");
		Button b1 = new Button("Cutomer page");
		Button b2 = new Button("Delivery guy page");

		b.setPrefHeight(39);
		b.setPrefWidth(209);

		b1.setPrefHeight(39);
		b1.setPrefWidth(209);

		b2.setPrefHeight(39);
		b2.setPrefWidth(209);

		v.getChildren().addAll(b, b1, b2);
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
		pane1.getChildren().addAll(pane, pane2);
		Scene scene = new Scene(pane1, 960, 660);
		scene.getStylesheets().add("stayle2.css");
		b.setOnAction(e -> {

			try {
				primatyStage.setScene(Scenes_of_Admin.Scene1(primatyStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		});
		b1.setOnAction(e -> {
			try {
				primatyStage.setScene(Scenes_of_customer.mainscene(primatyStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		b2.setOnAction(e -> {
			try {
				primatyStage.setScene(Scenes_of_Delivery.Scenedel(primatyStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		return scene;

	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static Scene Scene1(Stage primarystage) throws FileNotFoundException {

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

		Button b = new Button("Admin page");
		Button b1 = new Button("Exit");
		b1.setOnAction(e -> {
			try {
				primarystage.setScene(Scenes_of_Admin.mainscene(primarystage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
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
				database.datamanger = new ArrayList<Manger>();
				database.getDatamanger();
				System.out.println(database.datamanger.get(0).getUserName());
				System.out.println(database.datamanger.get(0).getPassword());
				System.out.println(tx1.getText());
				System.out.println(tx2.getText());

				if ((tx1.getText().trim().equalsIgnoreCase(database.datamanger.get(0).getUserName().trim()))
						&& (tx2.getText().trim().equalsIgnoreCase(database.datamanger.get(0).getPassword().trim()))) {
					primarystage.setScene(Scenes_of_Admin.Scene2(primarystage));
				} else {
					Alert alert = new Alert(AlertType.ERROR);
					alert.setContentText("");
					alert.setHeaderText("invalid username or password");
					alert.showAndWait();
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

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static Scene Scene2(Stage primaryStage) throws FileNotFoundException, ClassNotFoundException, SQLException {

		VBox v = new VBox(25);

		Button b = new Button("Admin page");

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

		Label l = new Label("Delivery Resturant ");

		l.setLayoutX(294);
		l.setLayoutY(115);
		l.setPrefHeight(32);
		l.setPrefWidth(217);
		l.setTextFill(Color.valueOf("white"));
		l.setFont(Font.font("Baskerville Old Face", 25));

		Button b1 = new Button("Edit a dish to a menu");
		b1.setPrefHeight(40);
		b1.setPrefWidth(209);
		b1.setTextAlignment(TextAlignment.LEFT);
		Button b2 = new Button("Edit a Employee");
		b2.setPrefHeight(40);
		b2.setPrefWidth(209);
		b2.setTextAlignment(TextAlignment.LEFT);
		Button b3 = new Button("Edit of Orders");
		b3.setPrefHeight(40);
		b3.setPrefWidth(209);
		b3.setTextAlignment(TextAlignment.LEFT);
		Button b4 = new Button("Edit of Cars");
		b4.setPrefHeight(40);
		b4.setPrefWidth(209);
		b4.setTextAlignment(TextAlignment.LEFT);
		Button b5 = new Button("show details of Resturent");
		b5.setPrefHeight(40);
		b5.setPrefWidth(250);
		b5.setLayoutX(0);
		b5.setLayoutY(500);
		b5.setTextAlignment(TextAlignment.LEFT);
		v.getChildren().addAll(b1, b2, b3, b4);

		Image image1 = new Image(new FileInputStream("p10.png"));

		ImageView imageView1 = new ImageView(image1);
		imageView1.setFitHeight(40);
		imageView1.setFitWidth(40);
		imageView1.setLayoutX(305);
		imageView1.setLayoutY(0);

		Image image2 = new Image(new FileInputStream("p11.png"));

		ImageView imageView2 = new ImageView(image2);
		imageView2.setFitHeight(40);
		imageView2.setFitWidth(40);

		Image image3 = new Image(new FileInputStream("note.png"));

		ImageView imageView3 = new ImageView(image3);
		imageView3.setFitHeight(40);
		imageView3.setFitWidth(40);

		Image image4 = new Image(new FileInputStream("car.png"));

		ImageView imageView4 = new ImageView(image4);
		imageView4.setFitHeight(40);
		imageView4.setFitWidth(40);

		Image image5 = new Image(new FileInputStream("p12.png"));

		ImageView imageView5 = new ImageView(image5);
		imageView5.setFitHeight(94);
		imageView5.setFitWidth(130);
		imageView5.setLayoutX(51);
		imageView5.setLayoutY(14);

		VBox v1 = new VBox(25);
		v1.getChildren().addAll(imageView1, imageView2, imageView3, imageView4);
		v1.setLayoutX(18);
		v1.setLayoutY(166);
		pane2.getChildren().addAll(imageView, l);
		pane1.setStyle("-fx-background-color:   #8fd393");
		pane.getChildren().addAll(imageView5, v, v1, b5, b);
		pane1.getChildren().addAll(pane, pane2);
		Scene scene = new Scene(pane1, 960, 660);
		scene.getStylesheets().add("stayle2.css");
		b1.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene3(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		b2.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene3_2(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		b3.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene4_1(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		b4.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene5_1(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		b5.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenequaries(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		return scene;
	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static Scene Scene3(Stage primaryStage) throws FileNotFoundException {

		VBox v = new VBox(25);

		Button b = new Button("Admin page");

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

		Label l = new Label("Delivery Resturant ");

		l.setLayoutX(294);
		l.setLayoutY(115);
		l.setPrefHeight(32);
		l.setPrefWidth(217);
		l.setTextFill(Color.valueOf("white"));
		l.setFont(Font.font("Baskerville Old Face", 25));

		Button b1 = new Button("Edit a dish to a menu");
		b1.setPrefHeight(40);
		b1.setPrefWidth(209);
		b1.setTextAlignment(TextAlignment.LEFT);
		Button b2 = new Button("Edit a Employee");
		b2.setPrefHeight(40);
		b2.setPrefWidth(209);
		b2.setTextAlignment(TextAlignment.LEFT);
		Button b3 = new Button("Edit of Orders");
		b3.setPrefHeight(40);
		b3.setPrefWidth(209);
		b3.setTextAlignment(TextAlignment.LEFT);
		Button b4 = new Button("Edit of Cars");
		b4.setPrefHeight(40);
		b4.setPrefWidth(209);
		b4.setTextAlignment(TextAlignment.LEFT);
		Button b5 = new Button("show details of Resturent");
		b5.setPrefHeight(40);
		b5.setPrefWidth(250);
		b5.setLayoutX(0);
		b5.setLayoutY(500);
		Button b6 = new Button("Exit");
		b6.setPrefHeight(40);
		b6.setPrefWidth(250);
		b6.setLayoutX(0);
		b6.setLayoutY(550);
		b6.setTextAlignment(TextAlignment.LEFT);
		b6.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.mainscene(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		v.getChildren().addAll(b1, b2, b3, b4);

		Image image2 = new Image(new FileInputStream("p11.png"));

		ImageView imageView2 = new ImageView(image2);
		imageView2.setFitHeight(40);
		imageView2.setFitWidth(40);

		Image image3 = new Image(new FileInputStream("note.png"));

		ImageView imageView3 = new ImageView(image3);
		imageView3.setFitHeight(40);
		imageView3.setFitWidth(40);

		Image image4 = new Image(new FileInputStream("car.png"));

		ImageView imageView4 = new ImageView(image4);
		imageView4.setFitHeight(40);
		imageView4.setFitWidth(40);
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

		VBox v1 = new VBox(25);
		v1.getChildren().addAll(imageView1, imageView2, imageView3, imageView4);
		v1.setLayoutX(18);
		v1.setLayoutY(166);
		Label l2 = new Label(" Meals ");

		l2.setPrefHeight(77);
		l2.setPrefWidth(130);
		l2.setLayoutX(70);
		l2.setLayoutY(110);
		l2.setTextFill(Color.valueOf("#ffffff"));
		l2.setFont(Font.font("Baskerville Old Face", 25));

		Button b11 = new Button("Add");

		b11.setPrefHeight(32);
		b11.setPrefWidth(164);

		Button b22 = new Button("Remove");

		b22.setPrefHeight(32);
		b22.setPrefWidth(164);

		Button b44 = new Button("Update");

		b44.setPrefHeight(32);
		b44.setPrefWidth(164);

		TableView<Meal> mealtable = database.tablemeal();

		HBox h = new HBox(120);
		h.getChildren().addAll(b11, b22, b44);
		h.setLayoutX(270);
		h.setLayoutY(183);
		h.setPrefHeight(63);
		h.setPrefWidth(692);
		pane2.getChildren().addAll(imageView, l);
		pane1.setStyle("-fx-background-color:   #8fd393");
		pane.getChildren().addAll(imageView5, v, v1, b5, b6, b, l2);
		pane1.getChildren().addAll(pane, pane2, h, mealtable);
		Scene scene = new Scene(pane1, 960, 660);
		scene.getStylesheets().add("stayle2.css");
		b11.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene4(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		b22.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene5(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});

		b44.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene6(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});

		b2.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene3_2(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		b3.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene4_1(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		b4.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene5_1(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		b5.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenequaries(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		return scene;
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static Scene Scene4(Stage primaryStage) throws FileNotFoundException {
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

		Label l1 = new Label("Num_of_meal ");
		l1.setPrefHeight(34);
		l1.setPrefWidth(130);
		l1.setTextFill(Color.valueOf("#120543"));
		l1.setFont(Font.font("Baskerville Old Face", 18));

		Label l2 = new Label("Price ");
		l2.setPrefHeight(34);
		l2.setPrefWidth(130);
		l2.setTextFill(Color.valueOf("#120543"));
		l2.setFont(Font.font("Baskerville Old Face", 18));

		Label l3 = new Label("Meal_Type");
		l3.setPrefHeight(34);
		l3.setPrefWidth(130);
		l3.setTextFill(Color.valueOf("#120543"));
		l3.setFont(Font.font("Baskerville Old Face", 18));

		Label l4 = new Label("Category ");
		l4.setPrefHeight(34);
		l4.setPrefWidth(130);
		l4.setTextFill(Color.valueOf("#120543"));
		l4.setFont(Font.font("Baskerville Old Face", 17));

		TextField tx1 = new TextField();
		tx1.setPrefHeight(34);
		tx1.setPrefWidth(216);
		TextField tx2 = new TextField();
		tx2.setPrefHeight(34);
		tx2.setPrefWidth(216);
		TextField tx3 = new TextField();
		tx3.setPrefHeight(34);
		tx3.setPrefWidth(216);
		ComboBox<String> c = new ComboBox<>();
		c.getItems().addAll("food", "drink", "Dessert", "salad");
		VBox v1 = new VBox(20);
		v1.getChildren().addAll(l1, l2, l3, l4);
		VBox v2 = new VBox(20);
		v2.getChildren().addAll(tx1, tx2, tx3, c);
		HBox h = new HBox();
		h.getChildren().addAll(v1, v2);
		h.setLayoutX(400);
		h.setLayoutY(260);
		h.setPrefHeight(347);
		h.setPrefWidth(313);
		Button b = new Button("Admin page");

		b.setPrefHeight(39);
		b.setPrefWidth(209);
		b.setLayoutX(20);
		b.setLayoutY(97);

		v.setLayoutX(400);
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

		Label l = new Label("Delivery Resturant ");

		l.setLayoutX(294);
		l.setLayoutY(115);
		l.setPrefHeight(32);
		l.setPrefWidth(217);
		l.setTextFill(Color.valueOf("white"));
		l.setFont(Font.font("Baskerville Old Face", 25));

		Button b1 = new Button("Edit a Employee");
		b1.setPrefHeight(40);
		b1.setPrefWidth(209);
		b1.setTextAlignment(TextAlignment.LEFT);
		v.getChildren().addAll(b, b1);

		v.setLayoutX(0);
		v.setLayoutY(131);
		v.setPrefHeight(209);
		v.setPrefWidth(209);

		HBox h11 = new HBox(20);
		h11.setLayoutX(465);
		h11.setLayoutY(600);
		Button b2 = new Button("Add");

		b2.setPrefHeight(32);
		b2.setPrefWidth(80);

		Button b3 = new Button("Exit");
		b3.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene3(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		b3.setPrefHeight(32);
		b3.setPrefWidth(80);

		h11.getChildren().addAll(b2, b3);

		Label l222 = new Label("Enter the information of Employee want to Add  ");

		l222.setLayoutX(400);
		l222.setLayoutY(170);
		l222.setPrefHeight(56);
		l222.setPrefWidth(385);

		l222.setTextFill(Color.valueOf("#250000"));
		l222.setFont(Font.font("Baskerville Old Face", 18));

		pane2.getChildren().addAll(imageView, l);
		pane1.setStyle("-fx-background-color:   #8fd393");
		pane.getChildren().addAll(imageView5, v);
		pane1.getChildren().addAll(pane, pane2, h11, l222, h);
		Scene scene = new Scene(pane1, 960, 660);
		scene.getStylesheets().add("stayle2.css");

		b1.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene3(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		b2.setOnAction(e -> {
			Meal meal = new Meal(Integer.parseInt(tx2.getText()), Float.parseFloat(tx3.getText()), tx1.getText(),

					c.getValue());
			database.dataListmeal.add(meal);
			database.insertDatameal(meal);
			;
			tx1.clear();
			tx2.clear();
			tx3.clear();
			c.setValue("");

		});
		return scene;
	}

	////////////////////////////////////////////////////////////////////// /////////////////////////////////////////////////////////

	public static Scene Scene5(Stage primaryStage) throws FileNotFoundException {
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

		Button b = new Button("Admin page");

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

		Button b1 = new Button("Edit a dish to a menu");
		b1.setPrefHeight(40);
		b1.setPrefWidth(209);
		b1.setTextAlignment(TextAlignment.LEFT);
		v.getChildren().addAll(b, b1);

		v.setLayoutX(0);
		v.setLayoutY(131);
		v.setPrefHeight(209);
		v.setPrefWidth(209);

		HBox h11 = new HBox(40);

		Button b2 = new Button("Remove");

		b2.setPrefHeight(32);
		b2.setPrefWidth(120);

		Button b3 = new Button("Exit");
		b3.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene3(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		b3.setPrefHeight(32);
		b3.setPrefWidth(120);

		h11.getChildren().addAll(b2, b3);

		Label l222 = new Label("choose the row of meal want to Delete ");

		l222.setLayoutX(400);
		l222.setLayoutY(160);
		l222.setPrefHeight(56);
		l222.setPrefWidth(385);
		h11.setLayoutX(420);
		h11.setLayoutY(200);
		l222.setTextFill(Color.valueOf("#250000"));
		l222.setFont(Font.font("Baskerville Old Face", 18));
		TableView<Meal> mealtable = database.tablemeal();
		pane2.getChildren().addAll(imageView, l);
		pane1.setStyle("-fx-background-color:   #8fd393");
		pane.getChildren().addAll(imageView5, v);
		pane1.getChildren().addAll(pane, pane2, h11, l222, mealtable);
		Scene scene = new Scene(pane1, 960, 660);
		scene.getStylesheets().add("stayle2.css");

		b1.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene3(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		b2.setOnAction(e -> {
			ObservableList<Meal> selectedRows = mealtable.getSelectionModel().getSelectedItems();
			ArrayList<Meal> rows = new ArrayList<>(selectedRows);
			rows.forEach(row -> {
				mealtable.getItems().remove(row);
				database.deleteRowMeal(row);
				mealtable.refresh();
			});
		});
		return scene;
	}

///////////////////////////////////////////////////////////////////////////////////////////////

	public static Scene Scene6(Stage primaryStage) throws FileNotFoundException {

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

		Button b = new Button("Admin page");

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

		Button b1 = new Button("Edit a dish to a menu");
		b1.setPrefHeight(40);
		b1.setPrefWidth(209);
		b1.setTextAlignment(TextAlignment.LEFT);
		v.getChildren().addAll(b, b1);

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
		b3.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene3(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		b3.setPrefHeight(32);
		b3.setPrefWidth(120);

		h11.getChildren().addAll(b2, b3);

		TableView<Meal> mealtable = database.tablemeal1();
		pane2.getChildren().addAll(imageView, l);
		pane1.setStyle("-fx-background-color:   #8fd393");
		pane.getChildren().addAll(imageView5, v);
		pane1.getChildren().addAll(pane, pane2, h11, mealtable);
		Scene scene = new Scene(pane1, 960, 660);
		scene.getStylesheets().add("stayle2.css");
		b1.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene3(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});

		return scene;
	}

	/////////////////////////////////////////////////////////////////////////////

	///////////////////////////////////////////// Employee////////////////////////////////////////////////////////////////////////

	public static Scene Scene3_2(Stage primaryStage) throws FileNotFoundException {

		VBox v = new VBox(25);

		Button b = new Button("Admin page");

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

		Label l = new Label("Delivery Resturant ");

		l.setLayoutX(294);
		l.setLayoutY(115);
		l.setPrefHeight(32);
		l.setPrefWidth(217);
		l.setTextFill(Color.valueOf("white"));
		l.setFont(Font.font("Baskerville Old Face", 25));

		Button b1 = new Button("Edit a dish to a menu");
		b1.setPrefHeight(40);
		b1.setPrefWidth(209);
		b1.setTextAlignment(TextAlignment.LEFT);
		Button b2 = new Button("Edit a Employee");
		b2.setPrefHeight(40);
		b2.setPrefWidth(209);
		b2.setTextAlignment(TextAlignment.LEFT);
		Button b3 = new Button("Edit of Orders");
		b3.setPrefHeight(40);
		b3.setPrefWidth(209);
		b3.setTextAlignment(TextAlignment.LEFT);
		Button b4 = new Button("Edit of Cars");
		b4.setPrefHeight(40);
		b4.setPrefWidth(209);
		b4.setTextAlignment(TextAlignment.LEFT);
		Button b5 = new Button("show details of Resturent");
		b5.setPrefHeight(40);
		b5.setPrefWidth(250);
		b5.setLayoutX(0);
		b5.setLayoutY(500);
		b5.setTextAlignment(TextAlignment.LEFT);
		v.getChildren().addAll(b1, b2, b3, b4);
		Button b6 = new Button("Exit");
		b6.setPrefHeight(40);
		b6.setPrefWidth(250);
		b6.setLayoutX(0);
		b6.setLayoutY(550);
		b6.setTextAlignment(TextAlignment.LEFT);
		b6.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.mainscene(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		Image image2 = new Image(new FileInputStream("p11.png"));

		ImageView imageView2 = new ImageView(image2);
		imageView2.setFitHeight(40);
		imageView2.setFitWidth(40);

		Image image3 = new Image(new FileInputStream("note.png"));

		ImageView imageView3 = new ImageView(image3);
		imageView3.setFitHeight(40);
		imageView3.setFitWidth(40);

		Image image4 = new Image(new FileInputStream("car.png"));

		ImageView imageView4 = new ImageView(image4);
		imageView4.setFitHeight(40);
		imageView4.setFitWidth(40);
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

		VBox v1 = new VBox(25);
		v1.getChildren().addAll(imageView1, imageView2, imageView3, imageView4);
		v1.setLayoutX(18);
		v1.setLayoutY(166);
		Label l2 = new Label(" Employee ");

		l2.setPrefHeight(77);
		l2.setPrefWidth(130);
		l2.setLayoutX(70);
		l2.setLayoutY(110);
		l2.setTextFill(Color.valueOf("#ffffff"));
		l2.setFont(Font.font("Baskerville Old Face", 25));

		Button b11 = new Button("Add");

		b11.setPrefHeight(32);
		b11.setPrefWidth(164);

		Button b22 = new Button("Remove");

		b22.setPrefHeight(32);
		b22.setPrefWidth(164);

		Button b44 = new Button("Update");

		b44.setPrefHeight(32);
		b44.setPrefWidth(164);

		TableView<Employee> mealtable = database.tableemp();

		HBox h = new HBox(120);
		h.getChildren().addAll(b11, b22, b44);
		h.setLayoutX(270);
		h.setLayoutY(183);
		h.setPrefHeight(63);
		h.setPrefWidth(692);
		pane2.getChildren().addAll(imageView, l);
		pane1.setStyle("-fx-background-color:   #8fd393");
		pane.getChildren().addAll(imageView5, v, b6, v1, b5, b, l2);
		pane1.getChildren().addAll(pane, pane2, h, mealtable);
		Scene scene = new Scene(pane1, 960, 660);
		scene.getStylesheets().add("stayle2.css");
		b1.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene3(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		b3.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene4_1(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		b4.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene5_1(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		b5.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenequaries(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		b11.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene3_3(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		b22.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene3_4(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});

		b44.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene3_6(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		return scene;
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static Scene Scene3_3(Stage primaryStage) throws FileNotFoundException {

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

		Label l1 = new Label("First Name ");
		l1.setPrefHeight(34);
		l1.setPrefWidth(130);
		l1.setTextFill(Color.valueOf("#120543"));
		l1.setFont(Font.font("Baskerville Old Face", 18));

		Label l2 = new Label("Last Name ");
		l2.setPrefHeight(34);
		l2.setPrefWidth(130);
		l2.setTextFill(Color.valueOf("#120543"));
		l2.setFont(Font.font("Baskerville Old Face", 18));

		Label l3 = new Label("Monthly Salary");
		l3.setPrefHeight(34);
		l3.setPrefWidth(130);
		l3.setTextFill(Color.valueOf("#120543"));
		l3.setFont(Font.font("Baskerville Old Face", 18));

		Label l4 = new Label("Phone Number ");
		l4.setPrefHeight(34);
		l4.setPrefWidth(130);
		l4.setTextFill(Color.valueOf("#120543"));
		l4.setFont(Font.font("Baskerville Old Face", 17));

		Label l5 = new Label("Hire date ");
		l5.setPrefHeight(34);
		l5.setPrefWidth(130);
		l5.setTextFill(Color.valueOf("#120543"));
		l5.setFont(Font.font("Baskerville Old Face", 18));

		Label l6 = new Label("End date ");
		l6.setPrefHeight(34);
		l6.setPrefWidth(130);
		l6.setTextFill(Color.valueOf("#120543"));
		l6.setFont(Font.font("Baskerville Old Face", 18));

		TextField tx1 = new TextField();
		tx1.setPrefHeight(34);
		tx1.setPrefWidth(216);
		TextField tx2 = new TextField();
		tx2.setPrefHeight(34);
		tx2.setPrefWidth(216);
		TextField tx3 = new TextField();
		tx3.setPrefHeight(34);
		tx3.setPrefWidth(216);
		TextField tx4 = new TextField();
		tx4.setPrefHeight(34);
		tx4.setPrefWidth(216);
		TextField tx5 = new TextField();
		tx5.setPrefHeight(34);
		tx5.setPrefWidth(216);
		TextField tx6 = new TextField();
		tx6.setPrefHeight(34);
		tx6.setPrefWidth(216);
		VBox v1 = new VBox(20);
		v1.getChildren().addAll(l1, l2, l3, l4, l5, l6);
		VBox v2 = new VBox(20);
		v2.getChildren().addAll(tx1, tx2, tx3, tx4, tx5, tx6);
		HBox h = new HBox();
		h.getChildren().addAll(v1, v2);
		h.setLayoutX(400);
		h.setLayoutY(260);
		h.setPrefHeight(347);
		h.setPrefWidth(313);
		Button b = new Button("Admin page");

		b.setPrefHeight(39);
		b.setPrefWidth(209);
		b.setLayoutX(20);
		b.setLayoutY(97);

		v.setLayoutX(400);
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

		Label l = new Label("Delivery Resturant ");

		l.setLayoutX(294);
		l.setLayoutY(115);
		l.setPrefHeight(32);
		l.setPrefWidth(217);
		l.setTextFill(Color.valueOf("white"));
		l.setFont(Font.font("Baskerville Old Face", 25));

		Button b1 = new Button("Edit a Employee");
		b1.setPrefHeight(40);
		b1.setPrefWidth(209);
		b1.setTextAlignment(TextAlignment.LEFT);
		v.getChildren().addAll(b, b1);

		v.setLayoutX(0);
		v.setLayoutY(131);
		v.setPrefHeight(209);
		v.setPrefWidth(209);

		HBox h11 = new HBox(20);
		h11.setLayoutX(465);
		h11.setLayoutY(600);
		Button b2 = new Button("Add");

		b2.setPrefHeight(32);
		b2.setPrefWidth(80);

		Button b3 = new Button("Exit");
		b3.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene3_2(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		b3.setPrefHeight(32);
		b3.setPrefWidth(80);

		h11.getChildren().addAll(b2, b3);

		Label l222 = new Label("Enter the information of Employee want to Add  ");

		l222.setLayoutX(400);
		l222.setLayoutY(170);
		l222.setPrefHeight(56);
		l222.setPrefWidth(385);

		l222.setTextFill(Color.valueOf("#250000"));
		l222.setFont(Font.font("Baskerville Old Face", 18));

		pane2.getChildren().addAll(imageView, l);
		pane1.setStyle("-fx-background-color:   #8fd393");
		pane.getChildren().addAll(imageView5, v);
		pane1.getChildren().addAll(pane, pane2, h11, l222, h);
		Scene scene = new Scene(pane1, 960, 660);
		scene.getStylesheets().add("stayle2.css");

		b1.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene3_2(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		b2.setOnAction(e -> {
			Employee rc = new Employee(Float.valueOf(tx3.getText()), tx1.getText(), tx2.getText(), tx4.getText(),
					tx5.getText(), tx6.getText());
			database.dataListEmp.add(rc);
			database.insertDataemp(rc);

			tx1.clear();
			tx2.clear();
			tx3.clear();
			tx4.clear();
			tx5.clear();
			tx6.clear();
		});

		return scene;
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static Scene Scene3_4(Stage primaryStage) throws FileNotFoundException {

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

		Button b = new Button("Admin page");

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

		Button b1 = new Button("Edit a Employee");
		b1.setPrefHeight(40);
		b1.setPrefWidth(209);
		b1.setTextAlignment(TextAlignment.LEFT);
		v.getChildren().addAll(b, b1);

		v.setLayoutX(0);
		v.setLayoutY(131);
		v.setPrefHeight(209);
		v.setPrefWidth(209);

		HBox h11 = new HBox(40);

		Button b2 = new Button("Remove");

		b2.setPrefHeight(32);
		b2.setPrefWidth(120);

		Button b3 = new Button("Exit");

		b3.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene3_2(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		b3.setPrefHeight(32);
		b3.setPrefWidth(120);

		h11.getChildren().addAll(b2, b3);

		Label l222 = new Label("choose the row of Employee want to Delete ");

		l222.setLayoutX(400);
		l222.setLayoutY(160);
		l222.setPrefHeight(56);
		l222.setPrefWidth(385);
		h11.setLayoutX(420);
		h11.setLayoutY(200);
		l222.setTextFill(Color.valueOf("#250000"));
		l222.setFont(Font.font("Baskerville Old Face", 18));
		TableView<Employee> emptable = database.tableemp();
		pane2.getChildren().addAll(imageView, l);
		pane1.setStyle("-fx-background-color:   #8fd393");
		pane.getChildren().addAll(imageView5, v);
		pane1.getChildren().addAll(pane, pane2, h11, l222, emptable);
		Scene scene = new Scene(pane1, 960, 660);
		scene.getStylesheets().add("stayle2.css");

		b1.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene3_2(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		b2.setOnAction(e -> {
			ObservableList<Employee> selectedRows = emptable.getSelectionModel().getSelectedItems();
			ArrayList<Employee> rows = new ArrayList<>(selectedRows);
			rows.forEach(row -> {
				emptable.getItems().remove(row);
				database.deleteRowemp(row);
				emptable.refresh();
			});
		});

		return scene;
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////////

	public static Scene Scene3_6(Stage primaryStage) throws FileNotFoundException {

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

		Button b = new Button("Admin page");

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

		Button b1 = new Button("Edit a Employee");
		b1.setPrefHeight(40);
		b1.setPrefWidth(209);
		b1.setTextAlignment(TextAlignment.LEFT);
		v.getChildren().addAll(b, b1);

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
		b3.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene3_2(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		b3.setPrefHeight(32);
		b3.setPrefWidth(120);

		h11.getChildren().addAll(b2, b3);

		TableView<Employee> emptable = database.tableemp();
		pane2.getChildren().addAll(imageView, l);
		pane1.setStyle("-fx-background-color:   #8fd393");
		pane.getChildren().addAll(imageView5, v);
		pane1.getChildren().addAll(pane, pane2, h11, emptable);
		Scene scene = new Scene(pane1, 960, 660);
		scene.getStylesheets().add("stayle2.css");
		b1.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene3_2(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		return scene;
	}

	////////////////////////////////////////////////////////////////////// Order
	////////////////////////////////////////////////////////////////////// //////////////////////////////////////////////////////

	public static Scene Scene4_1(Stage primaryStage) throws FileNotFoundException {

		TextField tx = new TextField();
		tx.setPromptText("Enter Order_id went to Search ");

		tx.setPrefWidth(190);
		VBox v = new VBox(25);

		Button b = new Button("Admin page");

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

		Label l = new Label("Delivery Resturant ");

		l.setLayoutX(294);
		l.setLayoutY(115);
		l.setPrefHeight(32);
		l.setPrefWidth(217);
		l.setTextFill(Color.valueOf("white"));
		l.setFont(Font.font("Baskerville Old Face", 25));

		Button b1 = new Button("Edit a dish to a menu");
		b1.setPrefHeight(40);
		b1.setPrefWidth(209);
		b1.setTextAlignment(TextAlignment.LEFT);
		Button b2 = new Button("Edit a Employee");
		b2.setPrefHeight(40);
		b2.setPrefWidth(209);
		b2.setTextAlignment(TextAlignment.LEFT);
		Button b3 = new Button("Edit of Orders");
		b3.setPrefHeight(40);
		b3.setPrefWidth(209);
		b3.setTextAlignment(TextAlignment.LEFT);
		Button b4 = new Button("Edit of Cars");
		b4.setPrefHeight(40);
		b4.setPrefWidth(209);
		b4.setTextAlignment(TextAlignment.LEFT);
		Button b5 = new Button("show details of Resturent");
		b5.setPrefHeight(40);
		b5.setPrefWidth(250);
		b5.setLayoutX(0);
		b5.setLayoutY(500);
		b5.setTextAlignment(TextAlignment.LEFT);
		Button b6 = new Button("Exit");
		b6.setPrefHeight(40);
		b6.setPrefWidth(250);
		b6.setLayoutX(0);
		b6.setLayoutY(550);
		b6.setTextAlignment(TextAlignment.LEFT);
		b6.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.mainscene(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		v.getChildren().addAll(b1, b2, b3, b4);

		Image image2 = new Image(new FileInputStream("p11.png"));

		ImageView imageView2 = new ImageView(image2);
		imageView2.setFitHeight(40);
		imageView2.setFitWidth(40);

		Image image3 = new Image(new FileInputStream("note.png"));

		ImageView imageView3 = new ImageView(image3);
		imageView3.setFitHeight(40);
		imageView3.setFitWidth(40);

		Image image4 = new Image(new FileInputStream("car.png"));

		ImageView imageView4 = new ImageView(image4);
		imageView4.setFitHeight(40);
		imageView4.setFitWidth(40);
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

		VBox v1 = new VBox(25);
		v1.getChildren().addAll(imageView1, imageView2, imageView3, imageView4);
		v1.setLayoutX(18);
		v1.setLayoutY(166);
		Label l2 = new Label(" Employee ");

		l2.setPrefHeight(77);
		l2.setPrefWidth(130);
		l2.setLayoutX(70);
		l2.setLayoutY(110);
		l2.setTextFill(Color.valueOf("#ffffff"));
		l2.setFont(Font.font("Baskerville Old Face", 25));

		Button b22 = new Button("Search");

		b22.setPrefHeight(32);
		b22.setPrefWidth(164);

		Button b44 = new Button("Update");

		b44.setPrefHeight(32);
		b44.setPrefWidth(164);

		TableView<Orders> mealtable = database.tableorder();
		tx.setPrefHeight(32);
		tx.setPrefWidth(164);
		HBox h = new HBox(120);
		h.getChildren().addAll(b22, b44, tx);
		h.setLayoutX(270);
		h.setLayoutY(183);
		h.setPrefHeight(63);
		h.setPrefWidth(692);
		pane2.getChildren().addAll(imageView, l);
		pane1.setStyle("-fx-background-color:   #8fd393");
		pane.getChildren().addAll(imageView5, v, v1, b5, b6, b, l2);
		pane1.getChildren().addAll(pane, pane2, h, mealtable);
		Scene scene = new Scene(pane1, 960, 660);
		scene.getStylesheets().add("stayle2.css");

		b1.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene3(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		b2.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene3_2(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});

		b4.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene5_1(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		b5.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenequaries(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		b22.setOnAction(e -> {
			try {
				if (tx.getText().trim().equals("")) {
					Alert alert = new Alert(AlertType.ERROR);
					alert.setContentText("");
					alert.setHeaderText("Enter order id");
					alert.showAndWait();
				} else {
					int i = Integer.parseInt(tx.getText().trim());
					TableView<Orders> table = database.tableorder1(i);
					primaryStage.setScene(Scenes_of_Admin.Scene4_2(primaryStage, table));
				}
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});

		return scene;
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static Scene Scene4_2(Stage primaryStage, TableView<Orders> table) throws FileNotFoundException {
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

		Button b = new Button("Admin page");

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

		Button b1 = new Button("Edit a Orders");
		b1.setPrefHeight(40);
		b1.setPrefWidth(209);
		b1.setTextAlignment(TextAlignment.LEFT);
		v.getChildren().addAll(b, b1);

		v.setLayoutX(0);
		v.setLayoutY(131);
		v.setPrefHeight(209);
		v.setPrefWidth(209);

		HBox h11 = new HBox(40);
		h11.setLayoutX(420);
		h11.setLayoutY(200);

		Button b3 = new Button("Exit");
		b3.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene4_1(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		b3.setPrefHeight(32);
		b3.setPrefWidth(120);

		h11.getChildren().addAll(b3);

		pane2.getChildren().addAll(imageView, l);
		pane1.setStyle("-fx-background-color:   #8fd393");
		pane.getChildren().addAll(imageView5, v);
		pane1.getChildren().addAll(pane, pane2, h11, table);
		Scene scene = new Scene(pane1, 960, 660);
		scene.getStylesheets().add("stayle2.css");
		b1.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene4_1(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		b3.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene4_1(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		return scene;
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static Scene Scene5_1(Stage primaryStage) throws FileNotFoundException {
		VBox v = new VBox(25);

		Button b = new Button("Admin page");

		b.setPrefHeight(39);
		b.setPrefWidth(209);
		b.setLayoutX(20);
		b.setLayoutY(97);

		v.setLayoutX(50);
		v.setLayoutY(166);
		v.setPrefHeight(209);
		v.setPrefWidth(209);
		Button b6 = new Button("Exit");
		b6.setPrefHeight(40);
		b6.setPrefWidth(250);
		b6.setLayoutX(0);
		b6.setLayoutY(550);
		b6.setTextAlignment(TextAlignment.LEFT);
		b6.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.mainscene(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
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

		Label l = new Label("Delivery Resturant ");

		l.setLayoutX(294);
		l.setLayoutY(115);
		l.setPrefHeight(32);
		l.setPrefWidth(217);
		l.setTextFill(Color.valueOf("white"));
		l.setFont(Font.font("Baskerville Old Face", 25));

		Button b1 = new Button("Edit a dish to a menu");
		b1.setPrefHeight(40);
		b1.setPrefWidth(209);
		b1.setTextAlignment(TextAlignment.LEFT);
		Button b2 = new Button("Edit a Employee");
		b2.setPrefHeight(40);
		b2.setPrefWidth(209);
		b2.setTextAlignment(TextAlignment.LEFT);
		Button b3 = new Button("Edit of Orders");
		b3.setPrefHeight(40);
		b3.setPrefWidth(209);
		b3.setTextAlignment(TextAlignment.LEFT);
		Button b4 = new Button("Edit of Cars");
		b4.setPrefHeight(40);
		b4.setPrefWidth(209);
		b4.setTextAlignment(TextAlignment.LEFT);
		Button b5 = new Button("show details of Resturent");
		b5.setPrefHeight(40);
		b5.setPrefWidth(250);
		b5.setLayoutX(0);
		b5.setLayoutY(500);
		b5.setTextAlignment(TextAlignment.LEFT);
		v.getChildren().addAll(b1, b2, b3, b4);

		Image image2 = new Image(new FileInputStream("p11.png"));

		ImageView imageView2 = new ImageView(image2);
		imageView2.setFitHeight(40);
		imageView2.setFitWidth(40);

		Image image3 = new Image(new FileInputStream("note.png"));

		ImageView imageView3 = new ImageView(image3);
		imageView3.setFitHeight(40);
		imageView3.setFitWidth(40);

		Image image4 = new Image(new FileInputStream("car.png"));

		ImageView imageView4 = new ImageView(image4);
		imageView4.setFitHeight(40);
		imageView4.setFitWidth(40);
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

		VBox v1 = new VBox(25);
		v1.getChildren().addAll(imageView1, imageView2, imageView3, imageView4);
		v1.setLayoutX(18);
		v1.setLayoutY(166);
		Label l2 = new Label(" Car ");

		l2.setPrefHeight(77);
		l2.setPrefWidth(130);
		l2.setLayoutX(70);
		l2.setLayoutY(110);
		l2.setTextFill(Color.valueOf("#ffffff"));
		l2.setFont(Font.font("Baskerville Old Face", 25));

		Button b11 = new Button("Add");

		b11.setPrefHeight(32);
		b11.setPrefWidth(164);

		Button b22 = new Button("Remove");

		b22.setPrefHeight(32);
		b22.setPrefWidth(164);

		Button b44 = new Button("Update");

		b44.setPrefHeight(32);
		b44.setPrefWidth(164);

		TableView<Car> cartable = database.tablecar();

		HBox h = new HBox(120);
		h.getChildren().addAll(b11, b22, b44);
		h.setLayoutX(270);
		h.setLayoutY(183);
		h.setPrefHeight(63);
		h.setPrefWidth(692);
		pane2.getChildren().addAll(imageView, l);
		pane1.setStyle("-fx-background-color:   #8fd393");
		pane.getChildren().addAll(imageView5, v, v1, b6, b5, b, l2);
		pane1.getChildren().addAll(pane, pane2, h, cartable);
		Scene scene = new Scene(pane1, 960, 660);
		scene.getStylesheets().add("stayle2.css");

		b1.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene3(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		b11.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene5_2(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});

		b22.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene5_3(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		b5.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenequaries(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		b44.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene5_5(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		b2.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene3_2(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		b3.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene4_1(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});

		return scene;
	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static Scene Scene5_2(Stage primaryStage) throws FileNotFoundException {
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

		Label l1 = new Label("Outlays ");
		l1.setPrefHeight(34);
		l1.setPrefWidth(130);
		l1.setTextFill(Color.valueOf("#120543"));
		l1.setFont(Font.font("Baskerville Old Face", 18));

		Label l2 = new Label("Driver_id ");
		l2.setPrefHeight(34);
		l2.setPrefWidth(130);
		l2.setTextFill(Color.valueOf("#120543"));
		l2.setFont(Font.font("Baskerville Old Face", 18));

		TextField tx1 = new TextField();
		tx1.setPrefHeight(34);
		tx1.setPrefWidth(216);
		TextField tx2 = new TextField();
		tx2.setPrefHeight(34);
		tx2.setPrefWidth(216);

		VBox v1 = new VBox(20);
		v1.getChildren().addAll(l1, l2);
		VBox v2 = new VBox(20);
		v2.getChildren().addAll(tx1, tx2);
		HBox h = new HBox();
		h.getChildren().addAll(v1, v2);
		h.setLayoutX(400);
		h.setLayoutY(260);
		h.setPrefHeight(347);
		h.setPrefWidth(313);
		Button b = new Button("Admin page");

		b.setPrefHeight(39);
		b.setPrefWidth(209);
		b.setLayoutX(20);
		b.setLayoutY(97);

		v.setLayoutX(400);
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

		Label l = new Label("Delivery Resturant ");

		l.setLayoutX(294);
		l.setLayoutY(115);
		l.setPrefHeight(32);
		l.setPrefWidth(217);
		l.setTextFill(Color.valueOf("white"));
		l.setFont(Font.font("Baskerville Old Face", 25));

		Button b1 = new Button("Edit a Employee");
		b1.setPrefHeight(40);
		b1.setPrefWidth(209);
		b1.setTextAlignment(TextAlignment.LEFT);
		v.getChildren().addAll(b, b1);

		v.setLayoutX(0);
		v.setLayoutY(131);
		v.setPrefHeight(209);
		v.setPrefWidth(209);

		HBox h11 = new HBox(20);
		h11.setLayoutX(465);
		h11.setLayoutY(600);
		Button b2 = new Button("Add");

		b2.setPrefHeight(32);
		b2.setPrefWidth(80);

		Button b3 = new Button("Exit");
		b3.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene5_1(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		b3.setPrefHeight(32);
		b3.setPrefWidth(80);

		h11.getChildren().addAll(b2, b3);

		Label l222 = new Label("Enter the information of Car want to Add  ");

		l222.setLayoutX(400);
		l222.setLayoutY(170);
		l222.setPrefHeight(56);
		l222.setPrefWidth(385);

		l222.setTextFill(Color.valueOf("#250000"));
		l222.setFont(Font.font("Baskerville Old Face", 18));

		pane2.getChildren().addAll(imageView, l);
		pane1.setStyle("-fx-background-color:   #8fd393");
		pane.getChildren().addAll(imageView5, v);
		pane1.getChildren().addAll(pane, pane2, h11, l222, h);
		Scene scene = new Scene(pane1, 960, 660);
		scene.getStylesheets().add("stayle2.css");

		b1.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene5_1(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		b2.setOnAction(e -> {
			Car rc = new Car(tx1.getText(), Integer.parseInt(tx2.getText()));
			database.dataListCar.add(rc);
			database.insertDatacar(rc);

			tx1.clear();
			tx2.clear();

		});
		return scene;
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static Scene Scene5_3(Stage primaryStage) throws FileNotFoundException {
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

		Button b = new Button("Admin page");

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

		Button b1 = new Button("Edit a Car");
		b1.setPrefHeight(40);
		b1.setPrefWidth(209);
		b1.setTextAlignment(TextAlignment.LEFT);
		v.getChildren().addAll(b, b1);

		v.setLayoutX(0);
		v.setLayoutY(131);
		v.setPrefHeight(209);
		v.setPrefWidth(209);

		HBox h11 = new HBox(40);

		Button b2 = new Button("Remove");

		b2.setPrefHeight(32);
		b2.setPrefWidth(120);

		Button b3 = new Button("Exit");
		b3.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene5_1(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		b3.setPrefHeight(32);
		b3.setPrefWidth(120);

		h11.getChildren().addAll(b2, b3);

		Label l222 = new Label("choose the row of car want to Delete ");

		l222.setLayoutX(400);
		l222.setLayoutY(160);
		l222.setPrefHeight(56);
		l222.setPrefWidth(385);
		h11.setLayoutX(420);
		h11.setLayoutY(200);
		l222.setTextFill(Color.valueOf("#250000"));
		l222.setFont(Font.font("Baskerville Old Face", 18));
		TableView<Car> cartable = database.tablecar();
		pane2.getChildren().addAll(imageView, l);
		pane1.setStyle("-fx-background-color:   #8fd393");
		pane.getChildren().addAll(imageView5, v);
		pane1.getChildren().addAll(pane, pane2, h11, l222, cartable);
		Scene scene = new Scene(pane1, 960, 660);
		scene.getStylesheets().add("stayle2.css");

		b1.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene5_1(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		b2.setOnAction(e -> {
			ObservableList<Car> selectedRows = cartable.getSelectionModel().getSelectedItems();
			ArrayList<Car> rows = new ArrayList<>(selectedRows);
			rows.forEach(row -> {
				cartable.getItems().remove(row);
				database.deleteRowcar(row);
				cartable.refresh();
			});
		});
		return scene;
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static Scene Scene5_5(Stage primaryStage) throws FileNotFoundException {
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

		Button b = new Button("Admin page");

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

		Button b1 = new Button("Edit a Car");
		b1.setPrefHeight(40);
		b1.setPrefWidth(209);
		b1.setTextAlignment(TextAlignment.LEFT);
		v.getChildren().addAll(b, b1);

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
		b3.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene5_1(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		b3.setPrefHeight(32);
		b3.setPrefWidth(120);

		h11.getChildren().addAll(b2, b3);

		TableView<Car> cartable = database.tablecar();
		pane2.getChildren().addAll(imageView, l);
		pane1.setStyle("-fx-background-color:   #8fd393");
		pane.getChildren().addAll(imageView5, v);
		pane1.getChildren().addAll(pane, pane2, h11, cartable);
		Scene scene = new Scene(pane1, 960, 660);
		scene.getStylesheets().add("stayle2.css");

		b1.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene5_1(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		return scene;
	}

	public static Scene Scenequaries(Stage primaryStage)
			throws FileNotFoundException, ClassNotFoundException, SQLException {
		VBox v = new VBox(25);

		Label priceorder = new Label(
				"The Total price Of All Orders  :  " + String.format("%.2f", database.getAllOrdersTotalPrice()));
		priceorder.setPrefHeight(32);
		priceorder.setPrefWidth(340);
		priceorder.setLayoutX(285);
		priceorder.setLayoutY(261);
		priceorder.setTextFill(Color.valueOf("Black"));
		priceorder.setFont(Font.font("Baskerville Old Face", 18));

		Label totaltrip = new Label("The Cost of All trips :  " + String.format("%.2f", database.getNumberOfTrips()));
		totaltrip.setPrefHeight(32);
		totaltrip.setPrefWidth(340);
		totaltrip.setLayoutX(285);
		totaltrip.setLayoutY(300);
		totaltrip.setTextFill(Color.valueOf("Black"));
		totaltrip.setFont(Font.font("Baskerville Old Face", 18));

		Label totalmonth = new Label("The Total Salary of all Employee in Mounth :  "
				+ String.format("%.2f", database.getTotalMonthlySalaryEmployee()));
		totalmonth.setPrefHeight(32);
		totalmonth.setPrefWidth(410);
		totalmonth.setLayoutX(285);
		totalmonth.setLayoutY(335);
		totalmonth.setTextFill(Color.valueOf("Black"));
		totalmonth.setFont(Font.font("Baskerville Old Face", 18));

		Cheff c = database.getcheffonumoforder().get(0);
		String s = null;

		ArrayList<Employee> emps = database.getData1();

		for (int i = 0; i < emps.size(); i++) {
			if (c.getEmployee_id() == emps.get(i).getEmployee_id()) {
				s = emps.get(i).getFirst_name() + "  " + emps.get(i).getLast_name() + "   ";
				break;
			}
		}

		Label totalcheffesorder = new Label("The Cheff who completed the largest number of Order :  " + s
				+ "\n  Number of order is -->" + c.getCheff_num() + ".");
		totalcheffesorder.setPrefHeight(50);
		totalcheffesorder.setPrefWidth(500);
		totalcheffesorder.setLayoutX(285);
		totalcheffesorder.setLayoutY(360);
		totalcheffesorder.setTextFill(Color.valueOf("Black"));
		totalcheffesorder.setFont(Font.font("Baskerville Old Face", 16));

		Button bb = new Button("Admin page");
		bb.setPrefHeight(39);
		bb.setPrefWidth(209);
		bb.setLayoutX(20);
		bb.setLayoutY(97);

		v.setLayoutX(50);
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

		Label l = new Label("Delivery Resturant ");

		l.setLayoutX(294);
		l.setLayoutY(115);
		l.setPrefHeight(32);
		l.setPrefWidth(217);
		l.setTextFill(Color.valueOf("white"));
		l.setFont(Font.font("Baskerville Old Face", 25));

		Label l22 = new Label("Accounting Page ");

		l22.setLayoutX(490);
		l22.setLayoutY(190);
		l22.setPrefHeight(32);
		l22.setPrefWidth(217);
		l22.setTextFill(Color.valueOf("black"));
		l22.setFont(Font.font("Baskerville Old Face", 25));

		Button b1 = new Button("Edit a dish to a menu");
		b1.setPrefHeight(40);
		b1.setPrefWidth(209);
		b1.setTextAlignment(TextAlignment.LEFT);
		Button b2 = new Button("Edit a Employee");
		b2.setPrefHeight(40);
		b2.setPrefWidth(209);
		b2.setTextAlignment(TextAlignment.LEFT);
		Button b3 = new Button("Edit of Orders");
		b3.setPrefHeight(40);
		b3.setPrefWidth(209);
		b3.setTextAlignment(TextAlignment.LEFT);
		Button b4 = new Button("Edit of Cars");
		b4.setPrefHeight(40);
		b4.setPrefWidth(209);
		b4.setTextAlignment(TextAlignment.LEFT);
		Button b5 = new Button("show details of Resturent");
		b5.setPrefHeight(40);
		b5.setPrefWidth(250);
		b5.setLayoutX(0);
		b5.setLayoutY(500);
		b5.setTextAlignment(TextAlignment.LEFT);
		v.getChildren().addAll(b1, b2, b3, b4);

		Image image1 = new Image(new FileInputStream("p10.png"));

		ImageView imageView1 = new ImageView(image1);
		imageView1.setFitHeight(40);
		imageView1.setFitWidth(40);
		imageView1.setLayoutX(305);
		imageView1.setLayoutY(0);

		Image image2 = new Image(new FileInputStream("p11.png"));

		ImageView imageView2 = new ImageView(image2);
		imageView2.setFitHeight(40);
		imageView2.setFitWidth(40);

		Image image3 = new Image(new FileInputStream("note.png"));

		ImageView imageView3 = new ImageView(image3);
		imageView3.setFitHeight(40);
		imageView3.setFitWidth(40);

		Image image4 = new Image(new FileInputStream("car.png"));

		ImageView imageView4 = new ImageView(image4);
		imageView4.setFitHeight(40);
		imageView4.setFitWidth(40);

		Image image5 = new Image(new FileInputStream("p12.png"));

		ImageView imageView5 = new ImageView(image5);
		imageView5.setFitHeight(94);
		imageView5.setFitWidth(130);
		imageView5.setLayoutX(51);
		imageView5.setLayoutY(14);

		VBox v1 = new VBox(25);
		v1.getChildren().addAll(imageView1, imageView2, imageView3, imageView4);
		v1.setLayoutX(18);
		v1.setLayoutY(166);
		pane2.getChildren().addAll(imageView, l);
		pane1.setStyle("-fx-background-color:   #8fd393");

		VBox vvv = new VBox(30);
		vvv.getChildren().addAll(priceorder, totaltrip, totalmonth, totalcheffesorder);
		vvv.setLayoutX(285);
		vvv.setLayoutY(250);

		vvv.setStyle("-fx-padding: 50;" + "-fx-border-style: solid inside;" + "-fx-border-width: 20;"
				+ "-fx-border-radius: 5;" + "-fx-border-color: #f1ecd4;" + "-fx-background-color: #ffffff;");
		pane.getChildren().addAll(imageView5, v, v1, b5, bb);
		pane1.getChildren().addAll(pane, pane2, vvv, l22);
		Scene scene = new Scene(pane1, 960, 660);
		scene.getStylesheets().add("stayle2.css");
		b1.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene3(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		b2.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene3_2(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		b3.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene4_1(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		b4.setOnAction(e -> {
			try {
				primaryStage.setScene(Scenes_of_Admin.Scene5_1(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});

		return scene;
	}

}
