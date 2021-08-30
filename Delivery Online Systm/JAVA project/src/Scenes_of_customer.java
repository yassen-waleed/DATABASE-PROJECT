import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Scenes_of_customer {
	static Boolean f = false;
	static Dbase database = new Dbase();
	static ArrayList<Meal> order = new ArrayList<>();
	static int counter = 0;
	static int j = 0;

	public static Scene mainscene(Stage primatyStage) throws FileNotFoundException {
		VBox v = new VBox(25);

		Button b1 = new Button("Cutomer page");

		b1.setPrefHeight(39);
		b1.setPrefWidth(209);

		Button b2 = new Button("Order Now");
		b2.setPrefHeight(39);
		b2.setPrefWidth(209);
		b2.setLayoutX(525);
		b2.setLayoutY(411);
		v.getChildren().addAll(b1);
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
		pane1.getChildren().addAll(pane, pane2, b2);
		Scene scene = new Scene(pane1, 960, 660);
		scene.getStylesheets().add("stayle2.css");
		b2.setOnAction(e -> {
			try {
				primatyStage.setScene(Scenes_of_customer.mainscene1(primatyStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});

		return scene;

	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static Scene mainscene1(Stage primatyStage) throws FileNotFoundException {
		VBox v = new VBox(25);

		Button b3 = new Button("Foods");

		b3.setTextFill(Color.valueOf("#150843"));
		b3.setPrefHeight(35);
		b3.setPrefWidth(148);
		b3.setLayoutX(390);
		b3.setLayoutY(200);
		b3.setStyle("-fx-background-color:   #898683 ");
		b3.setFont(Font.font("Baskerville Old Face", 24));

		Button b4 = new Button("Drinks");

		b4.setTextFill(Color.valueOf("#150843"));
		b4.setPrefHeight(35);
		b4.setPrefWidth(148);
		b4.setLayoutX(680);
		b4.setLayoutY(200);
		b4.setStyle("-fx-background-color:   #898683 ");
		b4.setFont(Font.font("Baskerville Old Face", 24));

		Button b5 = new Button("Salads");

		b5.setTextFill(Color.valueOf("#150843"));
		b5.setPrefHeight(35);
		b5.setPrefWidth(148);
		b5.setLayoutX(390);
		b5.setLayoutY(420);
		b5.setStyle("-fx-background-color:   #898683 ");
		b5.setFont(Font.font("Baskerville Old Face", 24));

		Button b6 = new Button("Dessert");

		b6.setTextFill(Color.valueOf("#150843"));
		b6.setPrefHeight(35);
		b6.setPrefWidth(148);
		b6.setLayoutX(680);
		b6.setLayoutY(420);
		b6.setStyle("-fx-background-color:   #898683 ");
		b6.setFont(Font.font("Baskerville Old Face", 24));
		Image image = new Image(new FileInputStream("p1.png"));

		ImageView imageView = new ImageView(image);
		imageView.setFitHeight(112);
		imageView.setFitWidth(143);
		imageView.setLayoutX(305);
		imageView.setLayoutY(0);

		Image image3 = new Image(new FileInputStream("p6.jpg"));
		ImageView imageView3 = new ImageView(image3);
		imageView3.setFitHeight(152);
		imageView3.setFitWidth(148);
		imageView3.setLayoutX(390);
		imageView3.setLayoutY(250);

		Image image4 = new Image(new FileInputStream("p7.jpg"));
		ImageView imageView4 = new ImageView(image4);
		imageView4.setFitHeight(152);
		imageView4.setFitWidth(148);
		imageView4.setLayoutX(680);
		imageView4.setLayoutY(250);

		Image image5 = new Image(new FileInputStream("p8.jpg"));
		ImageView imageView5 = new ImageView(image5);
		imageView5.setFitHeight(152);
		imageView5.setFitWidth(148);
		imageView5.setLayoutX(390);
		imageView5.setLayoutY(460);

		Image image6 = new Image(new FileInputStream("p9.png"));
		ImageView imageView6 = new ImageView(image6);
		imageView6.setFitHeight(152);
		imageView6.setFitWidth(148);
		imageView6.setLayoutX(680);
		imageView6.setLayoutY(450);

		Button b1 = new Button("Cutomer page");

		b1.setPrefHeight(39);
		b1.setPrefWidth(209);
		Button b21 = new Button("exit");

		b21.setPrefHeight(39);
		b21.setPrefWidth(209);
		v.getChildren().addAll(b1, b21);
		b21.setOnAction(e -> {
			try {
				primatyStage.setScene(Scenes_of_Admin.mainscene(primatyStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
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
		pane1.getChildren().addAll(pane, pane2, b3, b4, b5, b6, imageView3, imageView4, imageView5, imageView6);
		Scene scene = new Scene(pane1, 960, 660);
		scene.getStylesheets().add("stayle2.css");

		b3.setOnAction(e -> {
			try {
				primatyStage.setScene(mainscenefood(primatyStage));
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
		b4.setOnAction(e -> {
			try {
				primatyStage.setScene(mainsceneDrinks(primatyStage));
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

		b5.setOnAction(e -> {
			try {
				primatyStage.setScene(mainscenesalad(primatyStage));
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

		b6.setOnAction(e -> {
			try {
				primatyStage.setScene(mainsceneDessert(primatyStage));
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

	public static Scene mainscenefood(Stage primatyStage)
			throws FileNotFoundException, ClassNotFoundException, SQLException {

		ArrayList<Meal> array = database.getDataMealfood();
		System.out.println(array.size());

		ArrayList<Pane> panes = new ArrayList<>();

		ArrayList<TextField> texts = new ArrayList<>();
		for (int i = 0; i < array.size(); i++) {
			Pane pan = new Pane();
			pan.setPrefWidth(174);
			pan.setPrefHeight(165);
			pan.setStyle("-fx-background-radius : 40;" + "-fx-background-color : #898683;");

			Label ll = new Label(String.valueOf(array.get(i).getPrice()) + "  $");
			ll.setTextFill(Color.web("White"));

			ll.setFont(Font.font("system", 14));
			ll.setPrefWidth(69);
			ll.setPrefHeight(32);
			ll.setLayoutX(49);
			ll.setLayoutY(21);
			ll.setAlignment(Pos.CENTER);

			Label ll1 = new Label(array.get(i).getMeal_type());
			ll1.setTextFill(Color.web("White"));

			ll1.setFont(Font.font("Agency FB", 25));
			ll1.setPrefWidth(178);
			ll1.setPrefHeight(32);
			ll1.setLayoutX(1);
			ll1.setLayoutY(50);
			ll1.setAlignment(Pos.CENTER);

			Label ll2 = new Label("Number of Meals");
			ll2.setTextFill(Color.web("White"));

			ll2.setFont(Font.font("system", 12));
			ll2.setPrefWidth(98);
			ll2.setPrefHeight(32);
			ll2.setLayoutX(14);
			ll2.setLayoutY(95);

			TextField txt = new TextField();
			txt.setPrefWidth(25);
			txt.setPrefHeight(25);
			txt.setLayoutX(118);
			txt.setLayoutY(97);
			texts.add(txt);

			pan.getChildren().addAll(ll, ll1, ll2, txt);
			panes.add(pan);
		}

		FlowPane flowpane = new FlowPane();
		flowpane.setPrefWidth(700);
		flowpane.setVgap(8);
		flowpane.setHgap(80);
		flowpane.setPadding(new Insets(10, 4, 4, 10));
		for (int i = 0; i < panes.size(); i++) {
			flowpane.getChildren().addAll(panes.get(i));
		}

		ScrollPane scroll = new ScrollPane();
		scroll.setPrefSize(722, 494);
		scroll.setContent(flowpane);
		scroll.setLayoutX(247);
		scroll.setLayoutY(166);

		VBox v = new VBox(25);

		Button b1 = new Button("Cutomer page");

		b1.setPrefHeight(39);
		b1.setPrefWidth(209);
		Button b7 = new Button("Add to Order");

		b7.setAlignment(Pos.CENTER);

		b7.setPrefHeight(32);
		b7.setPrefWidth(209);

		Button b6 = new Button("Submit my Order");

		b6.setAlignment(Pos.CENTER);

		b6.setPrefHeight(32);
		b6.setPrefWidth(209);
		Button b8 = new Button("Reset");

		b8.setAlignment(Pos.CENTER);

		b8.setPrefHeight(32);
		b8.setPrefWidth(209);
		b8.setOnAction(e -> {
			order.clear();
			f = false;
		});
		Button b5 = new Button("Exit");

		b5.setAlignment(Pos.CENTER);

		b5.setPrefHeight(32);
		b5.setPrefWidth(209);

		v.getChildren().addAll(b1, b7, b8, b6, b5);
		v.setLayoutX(0);
		v.setLayoutY(166);
		v.setPrefHeight(209);
		v.setPrefWidth(209);

		AnchorPane pane1 = new AnchorPane();
		AnchorPane pane = new AnchorPane();
		pane.setStyle("-fx-background-color:  #4c534c ;" + "-fx-background-radius : 0;");
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
		pane1.getChildren().addAll(pane, pane2, scroll);
		Scene scene = new Scene(pane1, 960, 660);
		scene.getStylesheets().add("stayle2.css");
		b5.setOnAction(e -> {
			try {

				primatyStage.setScene(mainscene1(primatyStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		b7.setOnAction(e -> {
			f = true;
			System.out.println(f);
			for (int i = 0; i < texts.size(); i++) {

				if (texts.get(i).getText().trim().equals("") == false) {
					try {
						array.get(i).setNum_of_meal(Integer.parseInt(texts.get(i).getText()));
						array.get(i).setPrice((Integer.parseInt(texts.get(i).getText())) * array.get(i).getPrice());
						order.add(array.get(i));
						texts.get(i).clear();
					} catch (NumberFormatException ee) {
						// TODO: handle exception
						Alert alert = new Alert(AlertType.ERROR);
						alert.setHeaderText("NumberFormatException");
						alert.setContentText("Number of meals should be only number");
						alert.showAndWait();

					}
				}
			}
			for (int i = 0; i < order.size(); i++) {
				System.out.println(order.get(i).toString());
			}

		});
		b6.setOnAction(e -> {
			try {
				if (f == true)
					primatyStage.setScene(Scenecusinfo(primatyStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});

		return scene;

	}

	public static Scene mainsceneDrinks(Stage primatyStage)
			throws FileNotFoundException, ClassNotFoundException, SQLException {

		ArrayList<Meal> array = database.getDataMealDrinks();

		System.out.println(array.size());

		ArrayList<Pane> panes = new ArrayList<>();

		ArrayList<TextField> texts = new ArrayList<>();
		for (int i = 0; i < array.size(); i++) {
			Pane pan = new Pane();
			pan.setPrefWidth(174);
			pan.setPrefHeight(165);
			pan.setStyle("-fx-background-radius : 40;" + "-fx-background-color : #898683;");

			Label ll = new Label(String.valueOf(array.get(i).getPrice()) + "  $");
			ll.setTextFill(Color.web("White"));

			ll.setFont(Font.font("system", 14));
			ll.setPrefWidth(69);
			ll.setPrefHeight(32);
			ll.setLayoutX(49);
			ll.setLayoutY(21);
			ll.setAlignment(Pos.CENTER);

			Label ll1 = new Label(array.get(i).getMeal_type());
			ll1.setTextFill(Color.web("White"));

			ll1.setFont(Font.font("Agency FB", 25));
			ll1.setPrefWidth(178);
			ll1.setPrefHeight(32);
			ll1.setLayoutX(1);
			ll1.setLayoutY(50);
			ll1.setAlignment(Pos.CENTER);

			Label ll2 = new Label("Number of Meals");
			ll2.setTextFill(Color.web("White"));

			ll2.setFont(Font.font("system", 12));
			ll2.setPrefWidth(98);
			ll2.setPrefHeight(32);
			ll2.setLayoutX(14);
			ll2.setLayoutY(95);

			TextField txt = new TextField();
			txt.setPrefWidth(25);
			txt.setPrefHeight(25);
			txt.setLayoutX(118);
			txt.setLayoutY(97);
			texts.add(txt);

			pan.getChildren().addAll(ll, ll1, ll2, txt);
			panes.add(pan);
		}

		FlowPane flowpane = new FlowPane();
		flowpane.setPrefWidth(700);
		flowpane.setVgap(8);
		flowpane.setHgap(80);
		flowpane.setPadding(new Insets(10, 4, 4, 10));
		for (int i = 0; i < panes.size(); i++) {
			flowpane.getChildren().addAll(panes.get(i));
		}

		ScrollPane scroll = new ScrollPane();
		scroll.setPrefSize(722, 494);
		scroll.setContent(flowpane);
		scroll.setLayoutX(247);
		scroll.setLayoutY(166);

		VBox v = new VBox(25);

		Button b1 = new Button("Cutomer page");

		b1.setPrefHeight(39);
		b1.setPrefWidth(209);
		Button b7 = new Button("Add to Order");

		b7.setAlignment(Pos.CENTER);

		b7.setPrefHeight(32);
		b7.setPrefWidth(209);

		Button b6 = new Button("Submit my Order");

		b6.setAlignment(Pos.CENTER);

		b6.setPrefHeight(32);
		b6.setPrefWidth(209);

		Button b5 = new Button("Exit");

		b5.setAlignment(Pos.CENTER);

		b5.setPrefHeight(32);
		b5.setPrefWidth(209);
		Button b8 = new Button("Reset");

		b8.setAlignment(Pos.CENTER);

		b8.setPrefHeight(32);
		b8.setPrefWidth(209);
		b8.setOnAction(e -> {
			order.clear();
			f = false;
		});
		v.getChildren().addAll(b1, b7, b8, b6, b5);
		v.setLayoutX(0);
		v.setLayoutY(166);
		v.setPrefHeight(209);
		v.setPrefWidth(209);

		AnchorPane pane1 = new AnchorPane();
		AnchorPane pane = new AnchorPane();
		pane.setStyle("-fx-background-color:  #4c534c ;" + "-fx-background-radius : 0;");
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
		pane1.getChildren().addAll(pane, pane2, scroll);
		Scene scene = new Scene(pane1, 960, 660);
		scene.getStylesheets().add("stayle2.css");
		b5.setOnAction(e -> {
			try {

				primatyStage.setScene(mainscene1(primatyStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		b7.setOnAction(e -> {
			f = true;
			System.out.println(f);
			for (int i = 0; i < texts.size(); i++) {

				if (texts.get(i).getText().trim().equals("") == false) {
					try {
						array.get(i).setNum_of_meal(Integer.parseInt(texts.get(i).getText()));
						array.get(i).setPrice((Integer.parseInt(texts.get(i).getText())) * array.get(i).getPrice());
						order.add(array.get(i));
						texts.get(i).clear();
					} catch (NumberFormatException ee) {
						// TODO: handle exception
						Alert alert = new Alert(AlertType.ERROR);
						alert.setHeaderText("NumberFormatException");
						alert.setContentText("Number of meals should be only number");
						alert.showAndWait();

					}
				}
			}
			for (int i = 0; i < order.size(); i++) {
				System.out.println(order.get(i).toString());
			}

		});
		b6.setOnAction(e -> {
			try {
				if (f == true)
					primatyStage.setScene(Scenecusinfo(primatyStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});

		return scene;

	}

	public static Scene mainscenesalad(Stage primatyStage)
			throws FileNotFoundException, ClassNotFoundException, SQLException {

		ArrayList<Meal> array = database.getDataMealsalad();
		System.out.println(array.size());

		ArrayList<Pane> panes = new ArrayList<>();

		ArrayList<TextField> texts = new ArrayList<>();
		for (int i = 0; i < array.size(); i++) {
			Pane pan = new Pane();
			pan.setPrefWidth(174);
			pan.setPrefHeight(165);
			pan.setStyle("-fx-background-radius : 40;" + "-fx-background-color : #898683;");

			Label ll = new Label(String.valueOf(array.get(i).getPrice()) + "  $");
			ll.setTextFill(Color.web("White"));

			ll.setFont(Font.font("system", 14));
			ll.setPrefWidth(69);
			ll.setPrefHeight(32);
			ll.setLayoutX(49);
			ll.setLayoutY(21);
			ll.setAlignment(Pos.CENTER);

			Label ll1 = new Label(array.get(i).getMeal_type());
			ll1.setTextFill(Color.web("White"));

			ll1.setFont(Font.font("Agency FB", 25));
			ll1.setPrefWidth(178);
			ll1.setPrefHeight(32);
			ll1.setLayoutX(1);
			ll1.setLayoutY(50);
			ll1.setAlignment(Pos.CENTER);

			Label ll2 = new Label("Number of Meals");
			ll2.setTextFill(Color.web("White"));

			ll2.setFont(Font.font("system", 12));
			ll2.setPrefWidth(98);
			ll2.setPrefHeight(32);
			ll2.setLayoutX(14);
			ll2.setLayoutY(95);

			TextField txt = new TextField();
			txt.setPrefWidth(25);
			txt.setPrefHeight(25);
			txt.setLayoutX(118);
			txt.setLayoutY(97);
			texts.add(txt);

			pan.getChildren().addAll(ll, ll1, ll2, txt);
			panes.add(pan);
		}

		FlowPane flowpane = new FlowPane();
		flowpane.setPrefWidth(700);
		flowpane.setVgap(8);
		flowpane.setHgap(80);
		flowpane.setPadding(new Insets(10, 4, 4, 10));
		for (int i = 0; i < panes.size(); i++) {
			flowpane.getChildren().addAll(panes.get(i));
		}

		ScrollPane scroll = new ScrollPane();
		scroll.setPrefSize(722, 494);
		scroll.setContent(flowpane);
		scroll.setLayoutX(247);
		scroll.setLayoutY(166);

		VBox v = new VBox(25);

		Button b1 = new Button("Cutomer page");

		b1.setPrefHeight(39);
		b1.setPrefWidth(209);
		Button b7 = new Button("Add to Order");

		b7.setAlignment(Pos.CENTER);

		b7.setPrefHeight(32);
		b7.setPrefWidth(209);

		Button b6 = new Button("Submit my Order");

		b6.setAlignment(Pos.CENTER);

		b6.setPrefHeight(32);
		b6.setPrefWidth(209);

		Button b5 = new Button("Exit");

		b5.setAlignment(Pos.CENTER);

		b5.setPrefHeight(32);
		b5.setPrefWidth(209);
		Button b8 = new Button("Reset");

		b8.setAlignment(Pos.CENTER);

		b8.setPrefHeight(32);
		b8.setPrefWidth(209);
		b8.setOnAction(e -> {
			order.clear();
			f = false;
		});
		v.getChildren().addAll(b1, b7, b8, b6, b5);
		v.setLayoutX(0);
		v.setLayoutY(166);
		v.setPrefHeight(209);
		v.setPrefWidth(209);

		AnchorPane pane1 = new AnchorPane();
		AnchorPane pane = new AnchorPane();
		pane.setStyle("-fx-background-color:  #4c534c ;" + "-fx-background-radius : 0;");
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
		pane1.getChildren().addAll(pane, pane2, scroll);
		Scene scene = new Scene(pane1, 960, 660);
		scene.getStylesheets().add("stayle2.css");
		b5.setOnAction(e -> {
			try {

				primatyStage.setScene(mainscene1(primatyStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		b7.setOnAction(e -> {
			f = true;
			System.out.println(f);
			for (int i = 0; i < texts.size(); i++) {

				if (texts.get(i).getText().trim().equals("") == false) {
					try {
						array.get(i).setNum_of_meal(Integer.parseInt(texts.get(i).getText()));
						array.get(i).setPrice((Integer.parseInt(texts.get(i).getText())) * array.get(i).getPrice());
						order.add(array.get(i));
						texts.get(i).clear();
					} catch (NumberFormatException ee) {
						// TODO: handle exception
						Alert alert = new Alert(AlertType.ERROR);
						alert.setHeaderText("NumberFormatException");
						alert.setContentText("Number of meals should be only number");
						alert.showAndWait();

					}
				}
			}
			for (int i = 0; i < order.size(); i++) {
				System.out.println(order.get(i).toString());
			}

		});
		b6.setOnAction(e -> {
			try {
				if (f == true)
					primatyStage.setScene(Scenecusinfo(primatyStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});

		return scene;

	}

	public static Scene mainsceneDessert(Stage primatyStage)
			throws FileNotFoundException, ClassNotFoundException, SQLException {

		ArrayList<Meal> array = database.getDataMealDessert();

		System.out.println(array.size());

		ArrayList<Pane> panes = new ArrayList<>();

		ArrayList<TextField> texts = new ArrayList<>();
		for (int i = 0; i < array.size(); i++) {
			Pane pan = new Pane();
			pan.setPrefWidth(174);
			pan.setPrefHeight(165);
			pan.setStyle("-fx-background-radius : 40;" + "-fx-background-color : #898683;");

			Label ll = new Label(String.valueOf(array.get(i).getPrice()) + "  $");
			ll.setTextFill(Color.web("White"));

			ll.setFont(Font.font("system", 14));
			ll.setPrefWidth(69);
			ll.setPrefHeight(32);
			ll.setLayoutX(49);
			ll.setLayoutY(21);
			ll.setAlignment(Pos.CENTER);

			Label ll1 = new Label(array.get(i).getMeal_type());
			ll1.setTextFill(Color.web("White"));

			ll1.setFont(Font.font("Agency FB", 25));
			ll1.setPrefWidth(178);
			ll1.setPrefHeight(32);
			ll1.setLayoutX(1);
			ll1.setLayoutY(50);
			ll1.setAlignment(Pos.CENTER);

			Label ll2 = new Label("Number of Meals");
			ll2.setTextFill(Color.web("White"));

			ll2.setFont(Font.font("system", 12));
			ll2.setPrefWidth(98);
			ll2.setPrefHeight(32);
			ll2.setLayoutX(14);
			ll2.setLayoutY(95);

			TextField txt = new TextField();
			txt.setPrefWidth(25);
			txt.setPrefHeight(25);
			txt.setLayoutX(118);
			txt.setLayoutY(97);
			texts.add(txt);

			pan.getChildren().addAll(ll, ll1, ll2, txt);
			panes.add(pan);
		}

		FlowPane flowpane = new FlowPane();
		flowpane.setPrefWidth(700);
		flowpane.setVgap(8);
		flowpane.setHgap(80);
		flowpane.setPadding(new Insets(10, 4, 4, 10));
		for (int i = 0; i < panes.size(); i++) {
			flowpane.getChildren().addAll(panes.get(i));
		}

		ScrollPane scroll = new ScrollPane();
		scroll.setPrefSize(722, 494);
		scroll.setContent(flowpane);
		scroll.setLayoutX(247);
		scroll.setLayoutY(166);

		VBox v = new VBox(25);

		Button b1 = new Button("Cutomer page");

		b1.setPrefHeight(39);
		b1.setPrefWidth(209);
		Button b7 = new Button("Add to Order");

		b7.setAlignment(Pos.CENTER);

		b7.setPrefHeight(32);
		b7.setPrefWidth(209);

		Button b6 = new Button("Submit my Order");

		b6.setAlignment(Pos.CENTER);

		b6.setPrefHeight(32);
		b6.setPrefWidth(209);

		Button b5 = new Button("Exit");

		b5.setAlignment(Pos.CENTER);

		b5.setPrefHeight(32);
		b5.setPrefWidth(209);
		Button b8 = new Button("Reset");

		b8.setAlignment(Pos.CENTER);

		b8.setPrefHeight(32);
		b8.setPrefWidth(209);
		b8.setOnAction(e -> {
			order.clear();
			f = false;
		});
		v.getChildren().addAll(b1, b7, b8, b6, b5);
		v.setLayoutX(0);
		v.setLayoutY(166);
		v.setPrefHeight(209);
		v.setPrefWidth(209);

		AnchorPane pane1 = new AnchorPane();
		AnchorPane pane = new AnchorPane();
		pane.setStyle("-fx-background-color:  #4c534c ;" + "-fx-background-radius : 0;");
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
		pane1.getChildren().addAll(pane, pane2, scroll);
		Scene scene = new Scene(pane1, 960, 660);
		scene.getStylesheets().add("stayle2.css");
		b5.setOnAction(e -> {
			try {

				primatyStage.setScene(mainscene1(primatyStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		b7.setOnAction(e -> {
			f = true;
			System.out.println(f);
			for (int i = 0; i < texts.size(); i++) {

				if (texts.get(i).getText().trim().equals("") == false) {
					try {
						array.get(i).setNum_of_meal(Integer.parseInt(texts.get(i).getText()));
						array.get(i).setPrice((Integer.parseInt(texts.get(i).getText())) * array.get(i).getPrice());
						order.add(array.get(i));
						texts.get(i).clear();
					} catch (NumberFormatException ee) {
						// TODO: handle exception
						Alert alert = new Alert(AlertType.ERROR);
						alert.setHeaderText("NumberFormatException");
						alert.setContentText("Number of meals should be only number");
						alert.showAndWait();

					}
				}
			}
			for (int i = 0; i < order.size(); i++) {
				System.out.println(order.get(i).toString());
			}

		});
		b6.setOnAction(e -> {
			try {
				if (f == true)
					primatyStage.setScene(Scenecusinfo(primatyStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});

		return scene;
	}

	public static Scene Scenecusinfo(Stage primaryStage) throws FileNotFoundException {

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

		Label l3 = new Label("Phone Number");
		l3.setPrefHeight(34);
		l3.setPrefWidth(130);
		l3.setTextFill(Color.valueOf("#120543"));
		l3.setFont(Font.font("Baskerville Old Face", 18));

		Label l4 = new Label("City ");
		l4.setPrefHeight(34);
		l4.setPrefWidth(130);
		l4.setTextFill(Color.valueOf("#120543"));
		l4.setFont(Font.font("Baskerville Old Face", 17));

		Label l5 = new Label("Street ");
		l5.setPrefHeight(34);
		l5.setPrefWidth(130);
		l5.setTextFill(Color.valueOf("#120543"));
		l5.setFont(Font.font("Baskerville Old Face", 18));

		Label l6 = new Label("House_num ");
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

		Button b1 = new Button("Customer");
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
		Button b2 = new Button("confirm information");

		b2.setPrefHeight(32);
		b2.setPrefWidth(150);

		Button b3 = new Button("Exit");

		b3.setPrefHeight(32);
		b3.setPrefWidth(80);

		h11.getChildren().addAll(b2, b3);

		Label l222 = new Label(" information of Customer  ");

		l222.setLayoutX(450);
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

		b3.setOnAction(e -> {
			try {
				primaryStage.setScene(mainscene1(primaryStage));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});

		b2.setOnAction(e -> {
			if (tx1.getText().trim().equals("") || tx2.getText().trim().equals("") || tx3.getText().trim().equals("")
					|| tx4.getText().trim().equals("") || tx6.getText().trim().equals("")
					|| tx6.getText().trim().equals("")) {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setContentText("");
				alert.setHeaderText("Any Text Field is Empty ");
				alert.showAndWait();
			} else {
				Customer c = new Customer(tx1.getText(), tx2.getText(), tx4.getText(), tx5.getText(),
						Integer.parseInt(tx6.getText()), tx3.getText());
				c.toString();
				try {
					primaryStage.setScene(Sceneordinfo(primaryStage, c));
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		return scene;
	}

	public static Scene Sceneordinfo(Stage primaryStage, Customer c)
			throws FileNotFoundException, ClassNotFoundException {
		Image image1 = new Image(new FileInputStream("p10.png"));

		ImageView imageView1 = new ImageView(image1);
		imageView1.setFitHeight(40);
		imageView1.setFitWidth(40);
		imageView1.setLayoutX(305);
		imageView1.setLayoutY(0);
		Label l1 = new Label("Name :  " + c.getFirst_name() + "  " + c.getLast_name() + "(  " + c.getHouse_num()
				+ " ,  " + c.getStreet() + " ,  " + c.getCity() + "  )");
		l1.setPrefHeight(34);
		l1.setPrefWidth(397);
		l1.setTextFill(Color.valueOf("#120543"));
		l1.setFont(Font.font("Baskerville Old Face", 18));
		l1.setLayoutX(280);
		l1.setAlignment(Pos.CENTER);
		l1.setLayoutY(157);
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

		Button b1 = new Button("Customer page");
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
		Button b2 = new Button("Confirm  my  Order");

		b2.setPrefHeight(32);
		b2.setPrefWidth(190);

		Button b3 = new Button("Cancel");
		b3.setOnAction(e -> {
			try {
				primaryStage.setScene(mainscene1(primaryStage));
				order.clear();
				f = false;
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		b3.setPrefHeight(32);
		b3.setPrefWidth(120);

		h11.getChildren().addAll(b2, b3);

		TableView<Meal> table = database.tablemeal2(order);
		table.setPrefHeight(402);
		table.setPrefWidth(700);
		table.setLayoutX(258);
		table.setLayoutY(252);
		table.setEditable(true);
		pane2.getChildren().addAll(imageView, l);
		pane1.setStyle("-fx-background-color:   #8fd393");
		pane.getChildren().addAll(v);
		pane1.getChildren().addAll(pane, pane2, h11, table, l1);
		Scene scene = new Scene(pane1, 960, 660);
		scene.getStylesheets().add("stayle2.css");
		b2.setOnAction(e -> {
			try {
				database.insertcus(c);

				Scenebill(c).show();
			} catch (FileNotFoundException | ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		return scene;
	}

	public static Stage Scenebill(Customer ce) throws FileNotFoundException, ClassNotFoundException, SQLException {

		Customer c = database.getDatalastcustomer();

		Date d = new Date();
		@SuppressWarnings("deprecation")
		String date = (d.getDate() + "-" + d.getMonth() + 1 + "-" + (d.getYear() + 1900));
		int driver = database.getranddriver();
		Orders order1 = new Orders(c.getCustomer_id(), driver, "not delivered", "20", "20", date);

		Label l = new Label(" < Food Dilevery Resturant >");
		l.setLayoutX(80);
		l.setLayoutY(14);
		l.setPrefHeight(77);
		l.setPrefWidth(350);
		l.setTextFill(Color.valueOf("#120543"));
		l.setFont(Font.font("Baskerville Old Face", 25));

		Label ll = new Label("Thank you For Order ");

		ll.setLayoutX(110);
		ll.setLayoutY(410);
		ll.setPrefHeight(77);
		ll.setPrefWidth(350);
		ll.setTextFill(Color.valueOf("#120543"));
		ll.setFont(Font.font("Baskerville Old Face", 25));

		Label l1 = new Label("Name :  " + c.getFirst_name() + "  " + c.getLast_name());
		l1.setPrefHeight(34);
		l1.setPrefWidth(397);
		l1.setTextFill(Color.valueOf("#120543"));
		l1.setFont(Font.font("Baskerville Old Face", 18));
		l1.setLayoutX(30);
		l1.setAlignment(Pos.CENTER);
		l1.setLayoutY(360);

		Label l2 = new Label("Order date " + order1.getDelivery_date());
		l2.setPrefHeight(34);
		l2.setPrefWidth(397);
		l2.setTextFill(Color.valueOf("#120543"));
		l2.setFont(Font.font("Baskerville Old Face", 18));
		l2.setLayoutX(0);
		l2.setAlignment(Pos.CENTER);
		l2.setLayoutY(72);

		Label l3 = new Label("Status " + order1.getStatus());
		l3.setPrefHeight(34);
		l3.setPrefWidth(397);
		l3.setTextFill(Color.valueOf("#120543"));
		l3.setFont(Font.font("Baskerville Old Face", 18));
		l3.setLayoutX(140);
		l3.setAlignment(Pos.CENTER);
		l3.setLayoutY(72);
		double total = 0;
		for (int i = 0; i < order.size(); i++) {
			total += order.get(i).getPrice();
		}

		Label l4 = new Label("Total Price : " + String.format("%.2f", total));
		l4.setPrefHeight(34);
		l4.setPrefWidth(397);
		l4.setTextFill(Color.valueOf("#120543"));
		l4.setFont(Font.font("Baskerville Old Face", 18));
		l4.setLayoutX(30);
		l4.setAlignment(Pos.CENTER);
		l4.setLayoutY(400);

		Button b1 = new Button("Done & Exit");

		b1.setTextFill(Color.valueOf("White"));
		b1.setPrefHeight(32);
		b1.setPrefWidth(110);
		b1.setStyle("-fx-background-color: #030125 ");
		b1.setFont(Font.font("Baskerville Old Face", 16));
		b1.setAlignment(Pos.BASELINE_LEFT);
		b1.setLayoutX(170);
		b1.setLayoutY(480);

		AnchorPane pane1 = new AnchorPane();

		TableView<Meal> table = database.tablemeal2(order);
		table.setPrefHeight(234);
		table.setPrefWidth(386);
		table.setLayoutX(31);
		table.setLayoutY(103);
		table.setEditable(true);
		pane1.setPrefWidth(462);
		pane1.setPrefHeight(551);
		pane1.setLayoutX(0);
		pane1.setLayoutY(0);

		pane1.getChildren().addAll(b1, l1, l2, table, ll, l3, l, l4);
		int g = database.getrandcheff();
		Scene scene = new Scene(pane1, 462, 551);
		Stage st = new Stage();
		st.setScene(scene);
		Bill b = new Bill(total, driver, c.getCustomer_id());
		b1.setOnAction(e -> {

			database.insertorder(order1);
			Orders or = null;
			try {
				or = database.getDatalastOrder();
			} catch (ClassNotFoundException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			database.insertbill(b);
			for (int i = 0; i < order.size(); i++) {
				database.insertordertomeal(or.getOrder_id(), order.get(i).getMeal_id(), order.get(i).getNum_of_meal());
			}
			database.insertoFinalize(or.getOrder_id(), g);
			st.close();
		});
		return st;
	}
}
