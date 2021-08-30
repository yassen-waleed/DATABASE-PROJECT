import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.converter.FloatStringConverter;

import java.sql.Statement;

public class Dbase {
	ArrayList<delivery_guy> datadel;
	ObservableList<delivery_guy> dataListdel;
	ArrayList<Customer> datacus;
	ObservableList<Customer> dataListcus;
	ArrayList<Car> datacar;
	ObservableList<Car> dataListCar;
	ArrayList<Orders> dataorder;
	ObservableList<Orders> dataListorder;
	ArrayList<Meal> datameal;
	ObservableList<Meal> dataListmeal;
	ArrayList<Manger> datamanger;
	ObservableList<Manger> dataListmanger;
	ArrayList<Employee> dataEmp;
	ObservableList<Employee> dataListEmp;
	private String dbURL;
	private String dbUsername = "root";
	private String dbPassword = "1682";
	private String URL = "127.0.0.1";
	private String port = "3306";
	private String dbName = "project";
	private Connection con;

	public void getData() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub

		String SQL;

		connectDB();
		System.out.println("Connection established");

		SQL = "select * from Employee ";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);

		while (rs.next())
			dataEmp.add(new Employee(Integer.parseInt(rs.getString(1)), Float.parseFloat(rs.getString(2)),
					rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));

		rs.close();
		stmt.close();

		con.close();
		System.out.println("Connection closed" + dataEmp.size());

	}

	public ArrayList<Employee> getData1() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub

		String SQL;

		connectDB();
		System.out.println("Connection established");
		ArrayList<Employee> emps = new ArrayList<>();
		SQL = "select * from Employee ";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);

		while (rs.next())
			emps.add(new Employee(Integer.parseInt(rs.getString(1)), Float.parseFloat(rs.getString(2)), rs.getString(3),
					rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));

		rs.close();
		stmt.close();

		con.close();
		System.out.println("Connection closed");
		return emps;
	}

	public int getranddriver() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub

		String SQL;

		connectDB();
		System.out.println("Connection established");
		ArrayList<Integer> Random = new ArrayList<>();
		SQL = "SELECT D.delivery_num FROM Delivery_guy D ORDER BY RAND() LIMIT 1; ";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);

		while (rs.next())
			Random.add(new Integer(Integer.parseInt(rs.getString(1))));

		rs.close();
		stmt.close();

		con.close();
		System.out.println("Connection closed");
		return Random.get(0);

	}

	public void getDatamanger() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub

		String SQL;

		connectDB();
		System.out.println("Connection established");

		SQL = "select * from Manger ";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);

		while (rs.next())
			datamanger.add(new Manger(rs.getString(1), rs.getString(2), Integer.parseInt(rs.getString(3))));

		rs.close();
		stmt.close();

		con.close();
		System.out.println("Connection closed" + datamanger.size());

	}

	public void getDataCar() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub

		String SQL;

		connectDB();
		System.out.println("Connection established");

		SQL = "select * from Car ";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);

		while (rs.next())
			datacar.add(new Car(Integer.parseInt(rs.getString(1)), rs.getString(2), Integer.parseInt(rs.getString(3))));

		rs.close();
		stmt.close();

		con.close();
		System.out.println("Connection closed" + datacar.size());

	}

	public int getrandcheff() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub

		String SQL;

		connectDB();
		System.out.println("Connection established");
		ArrayList<Integer> Random = new ArrayList<>();
		SQL = "SELECT C.employee_id FROM cheff C ORDER BY RAND() LIMIT 1; ";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);

		while (rs.next())
			Random.add(new Integer(Integer.parseInt(rs.getString(1))));

		rs.close();
		stmt.close();

		con.close();
		System.out.println("Connection closed");
		return Random.get(0);

	}

	public void getDataMeal() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub

		String SQL;

		connectDB();
		System.out.println("Connection established");

		SQL = "SELECT * FROM Meal; ";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);

		while (rs.next())
			datameal.add(new Meal(Integer.parseInt(rs.getString(1)), Integer.parseInt(rs.getString(2)),
					Float.parseFloat(rs.getString(3)), rs.getString(4), rs.getString(5)));

		rs.close();
		stmt.close();

		con.close();
		System.out.println("Connection closed" + datameal.size());

	}

	public Customer getDatalastcustomer() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ArrayList<Customer> ccc = new ArrayList<>();
		String SQL;

		connectDB();
		System.out.println("Connection established1111");

		SQL = "SELECT * FROM customer ORDER BY customer_id DESC LIMIT 1";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);
		while (rs.next())
			ccc.add(new Customer(Integer.parseInt(rs.getString(1)), rs.getString(2), rs.getString(3), rs.getString(4),
					rs.getString(5), Integer.parseInt(rs.getString(6)), rs.getString(7)));
		;

		rs.close();
		stmt.close();

		con.close();
		System.out.println("Connection closed");
		return ccc.get(0);
	}

	public Orders getDatalastOrder() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ArrayList<Orders> ccc = new ArrayList<>();
		String SQL;

		connectDB();
		System.out.println("Connection established1111");

		SQL = "SELECT * FROM Orders ORDER BY order_id DESC LIMIT 1";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);
		while (rs.next())
			ccc.add(new Orders(Integer.parseInt(rs.getString(1)), Integer.parseInt(rs.getString(2)),
					Integer.parseInt(rs.getString(3)), rs.getString(4), rs.getString(5), rs.getString(6),
					rs.getString(7)));

		rs.close();
		stmt.close();

		con.close();
		System.out.println("Connection closed");
		return ccc.get(0);
	}

	public ArrayList<Meal> getDataMealfood() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ArrayList<Meal> array = new ArrayList<>();
		String SQL;

		connectDB();
		System.out.println("Connection established");

		SQL = "select * from Meal WHERE Meal.category='food' ;";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);

		while (rs.next())
			array.add(new Meal(Integer.parseInt(rs.getString(1)), Integer.parseInt(rs.getString(2)),
					Float.parseFloat(rs.getString(3)), rs.getString(4), rs.getString(5)));

		rs.close();
		stmt.close();

		con.close();
		System.out.println("Connection closed" + array.size());
		return array;
	}

	public ArrayList<Meal> getDataMealDrinks() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ArrayList<Meal> array = new ArrayList<>();
		String SQL;

		connectDB();
		System.out.println("Connection established");

		SQL = "select * from Meal WHERE Meal.category='drink' ;";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);

		while (rs.next())
			array.add(new Meal(Integer.parseInt(rs.getString(1)), Integer.parseInt(rs.getString(2)),
					Float.parseFloat(rs.getString(3)), rs.getString(4), rs.getString(5)));

		rs.close();
		stmt.close();

		con.close();
		System.out.println("Connection closed" + array.size());
		return array;
	}

	public ArrayList<Meal> getDataMealsalad() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ArrayList<Meal> array = new ArrayList<>();
		String SQL;

		connectDB();
		System.out.println("Connection established");

		SQL = "select * from Meal WHERE Meal.category='salad' ;";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);

		while (rs.next())
			array.add(new Meal(Integer.parseInt(rs.getString(1)), Integer.parseInt(rs.getString(2)),
					Float.parseFloat(rs.getString(3)), rs.getString(4), rs.getString(5)));

		rs.close();
		stmt.close();

		con.close();
		System.out.println("Connection closed" + array.size());
		return array;
	}

	public ArrayList<Meal> getDataMealDessert() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ArrayList<Meal> array = new ArrayList<>();
		String SQL;

		connectDB();
		System.out.println("Connection established");

		SQL = "select * from Meal WHERE Meal.category='Dessert' ;";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);

		while (rs.next())
			array.add(new Meal(Integer.parseInt(rs.getString(1)), Integer.parseInt(rs.getString(2)),
					Float.parseFloat(rs.getString(3)), rs.getString(4), rs.getString(5)));

		rs.close();
		stmt.close();

		con.close();
		System.out.println("Connection closed" + array.size());
		return array;
	}

///////////////////////////////////////////////////////////////////////////////
	public void getDataorder() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub

		String SQL;

		connectDB();
		System.out.println("Connection established");

		SQL = "SELECT * FROM Orders; ";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);

		while (rs.next())
			dataorder.add(new Orders(Integer.parseInt(rs.getString(1)), Integer.parseInt(rs.getString(2)),
					Integer.parseInt(rs.getString(3)), rs.getString(4), rs.getString(5), rs.getString(6),
					rs.getString(7)));

		rs.close();
		stmt.close();

		con.close();
		System.out.println("Connection closed" + dataorder.size());

	}

	public ArrayList<Orders> getDataorderdel(int id) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub

		String SQL;
		ArrayList<Orders> o = new ArrayList<>();
		connectDB();
		System.out.println("Connection established");

		SQL = "SELECT * FROM orders WHERE delivery_id=" + id + " and status1 ='not delivered'; ";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);

		while (rs.next())
			o.add(new Orders(Integer.parseInt(rs.getString(1)), Integer.parseInt(rs.getString(2)),
					Integer.parseInt(rs.getString(3)), rs.getString(4), rs.getString(5), rs.getString(6),
					rs.getString(7)));

		rs.close();
		stmt.close();

		con.close();
		System.out.println("Connection closed" + o.size());
		return o;
	}

	public void getDatadriver() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub

		String SQL;

		connectDB();
		System.out.println("Connection established");

		SQL = "SELECT * FROM delivery_guy;; ";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);

		while (rs.next())
			datadel.add(new delivery_guy(Integer.parseInt(rs.getString(1)), Integer.parseInt(rs.getString(2)),
					rs.getString(3)));

		rs.close();
		stmt.close();

		con.close();
		System.out.println("Connection closed");

	}

	///////////////////////////////////////////////////////////////////////////////////
	public void connectDB() throws ClassNotFoundException, SQLException {

		dbURL = "jdbc:mysql://" + URL + ":" + port + "/" + dbName + "?verifyServerCertificate=false";
		Properties p = new Properties();
		p.setProperty("user", dbUsername);
		p.setProperty("password", dbPassword);
		p.setProperty("useSSL", "false");
		p.setProperty("autoReconnect", "true");
		Class.forName("com.mysql.jdbc.Driver");

		con = DriverManager.getConnection(dbURL, p);

	}

	public void deleteRowemp(Employee row) {

		try {
			System.out.println("delete from Employee where Employee.employee_id =" + row.getEmployee_id() + ";");
			connectDB();
			ExecuteStatement("delete from Employee where Employee.employee_id =" + row.getEmployee_id() + ";");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void deleteRowcar(Car row) {

		try {
			System.out.println("delete from Car where Car.car_id =" + row.getCar_id() + ";");
			connectDB();
			ExecuteStatement("delete from Car where Car.car_id =" + row.getCar_id() + ";");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void insertoFinalize(int orderId, int cheffId) {

		try {
			System.out.println("insert into Finalize (order_id,cheff_id) values(" + orderId + "," + cheffId + ");");

			connectDB();
			ExecuteStatement("insert into Finalize (order_id,cheff_id) values(" + orderId + "," + cheffId + ");");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void insertordertomeal(int orderId, int mealId, int Quantity) {

		try {
			System.out.println("insert Into order2meal (order_id,meal_id,quantity) values(" + orderId + "," + mealId
					+ "," + Quantity + ");");

			connectDB();
			ExecuteStatement("insert Into order2meal (order_id,meal_id,quantity) values(" + orderId + "," + mealId + ","
					+ Quantity + ");");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void deleteRowMeal(Meal row) {

		try {
			System.out.println("delete from Meal where Meal.meal_id =" + row.getMeal_id() + ";");
			connectDB();
			ExecuteStatement("delete from Meal where Meal.meal_id =" + row.getMeal_id() + ";");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void ExecuteStatement(String SQL) throws SQLException {

		try {
			Statement stmt = con.createStatement();
			stmt.executeUpdate(SQL);
			stmt.close();

		} catch (SQLException s) {
			s.printStackTrace();
			System.out.println("SQL statement is not executed!");

		}

	}

	public TableView<Employee> tableemp() {
		TableView<Employee> emptable = new TableView<>();
		emptable.setPrefHeight(402);
		emptable.setPrefWidth(700);
		emptable.setLayoutX(258);
		emptable.setLayoutY(252);

		emptable.setEditable(true);

		TableColumn<Employee, Integer> snumCol = new TableColumn<Employee, Integer>("id");

		snumCol.setMinWidth(40);

		snumCol.setCellValueFactory(new PropertyValueFactory<Employee, Integer>("employee_id"));

		dataEmp = new ArrayList<Employee>();

		try {
			getData();
			dataListEmp = FXCollections.observableArrayList(dataEmp);

			TableColumn<Employee, String> nameCol = new TableColumn<Employee, String>("first_name");
			nameCol.setMinWidth(40);

			nameCol.setCellValueFactory(new PropertyValueFactory<Employee, String>("first_name"));
			nameCol.setCellFactory(TextFieldTableCell.<Employee>forTableColumn());
			nameCol.setOnEditCommit((CellEditEvent<Employee, String> t) -> {
				((Employee) t.getTableView().getItems().get(t.getTablePosition().getRow()))
						.setFirst_name(t.getNewValue()); // display only
				updatefirstname(t.getRowValue().getEmployee_id(), t.getNewValue());
			});
			TableColumn<Employee, Float> ageCol = new TableColumn<Employee, Float>("salary");
			ageCol.setMinWidth(30);
			ageCol.setCellValueFactory(new PropertyValueFactory<Employee, Float>("month_salary"));
			ageCol.setCellFactory(TextFieldTableCell.<Employee, Float>forTableColumn(new FloatStringConverter()));
			ageCol.setOnEditCommit((CellEditEvent<Employee, Float> t) -> {
				((Employee) t.getTableView().getItems().get(t.getTablePosition().getRow()))
						.setMonth_salary(t.getNewValue()); // display only
				updatesalary(t.getRowValue().getEmployee_id(), t.getNewValue());
			});

			TableColumn<Employee, String> last_nameCol = new TableColumn<Employee, String>("Last_name");
			last_nameCol.setMinWidth(50);
			last_nameCol.setCellValueFactory(new PropertyValueFactory<Employee, String>("Last_name"));

			last_nameCol.setCellFactory(TextFieldTableCell.<Employee>forTableColumn());
			last_nameCol.setOnEditCommit((CellEditEvent<Employee, String> t) -> {
				((Employee) t.getTableView().getItems().get(t.getTablePosition().getRow()))
						.setLast_name(t.getNewValue()); // display only
				updatefirstname(t.getRowValue().getEmployee_id(), t.getNewValue());
			});

			TableColumn<Employee, String> levelCol = new TableColumn<Employee, String>("phone_num");
			levelCol.setMinWidth(80);
			levelCol.setCellValueFactory(new PropertyValueFactory<Employee, String>("phone_num"));

			levelCol.setCellFactory(TextFieldTableCell.<Employee>forTableColumn());
			levelCol.setOnEditCommit((CellEditEvent<Employee, String> t) -> {
				((Employee) t.getTableView().getItems().get(t.getTablePosition().getRow()))
						.setPhone_num(t.getNewValue()); // display only
				updatephone(t.getRowValue().getEmployee_id(), t.getNewValue());
			});

			TableColumn<Employee, String> datefCol = new TableColumn<Employee, String>("hire_date");
			datefCol.setMinWidth(70);

			datefCol.setCellValueFactory(new PropertyValueFactory<Employee, String>("firstwork_date"));

			datefCol.setMinWidth(60);
			TableColumn<Employee, String> datelCol = new TableColumn<Employee, String>("end_date");
			datelCol.setMinWidth(50);

			datelCol.setCellValueFactory(new PropertyValueFactory<Employee, String>("endwork_date"));

			datelCol.setCellFactory(TextFieldTableCell.<Employee>forTableColumn());
			datelCol.setMinWidth(60);
			emptable.setItems(dataListEmp);
			datelCol.setOnEditCommit((CellEditEvent<Employee, String> t) -> {
				((Employee) t.getTableView().getItems().get(t.getTablePosition().getRow()))
						.setEndwork_date(t.getNewValue()); // display only
				updatenddate(t.getRowValue().getEmployee_id(), t.getNewValue());
			});

			emptable.getColumns().addAll(snumCol, nameCol, last_nameCol, ageCol, levelCol, datefCol, datelCol);

		} catch (ClassNotFoundException | SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		return emptable;
	}

	public void insertDataemp(Employee rc) {

		try {
			System.out.println(
					"Insert into Employee ( month_salary, first_name,last_name,phone_num,firstwork_date,endwork_date) values("
							+ rc.getMonth_salary() + ",'" + rc.getFirst_name() + "','" + rc.getLast_name() + "','"
							+ rc.getPhone_num() + "','" + rc.getFirstwork_date() + "','" + rc.getEndwork_date()
							+ "');");

			connectDB();
			ExecuteStatement(
					"Insert into Employee ( month_salary, first_name,last_name,phone_num,firstwork_date,endwork_date) values("
							+ rc.getMonth_salary() + ",'" + rc.getFirst_name() + "','" + rc.getLast_name() + "','"
							+ rc.getPhone_num() + "','" + rc.getFirstwork_date() + "','" + rc.getEndwork_date()
							+ "');");
			con.close();
			System.out.println("Connection closed" + dataEmp.size());

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void insertDatameal(Meal meal) {

		try {
			System.out.println(
					"Insert into Meal (  NumOfMeals, price, mealtype,Category) values(" + meal.getNum_of_meal() + ",'"
							+ meal.getPrice() + "','" + meal.getMeal_type() + "','" + meal.getCategory() + "');");

			connectDB();
			ExecuteStatement("Insert into Meal (  NumOfMeals, price, mealtype,Category) values(" + meal.getNum_of_meal()
					+ ",'" + meal.getPrice() + "','" + meal.getMeal_type() + "','" + meal.getCategory() + "');");
			con.close();
			System.out.println("Connection closed" + datameal.size());

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void insertDatacar(Car car) {

		try {
			System.out.println("Insert into Car (  car_outlays, employee_id) values('" + car.getCar_outlays() + "',"
					+ car.getEmployee_id() + ");");

			connectDB();
			ExecuteStatement("Insert into Car (  car_outlays, employee_id) values('" + car.getCar_outlays() + "',"
					+ car.getEmployee_id() + ");");
			con.close();
			System.out.println("Connection closed" + datacar.size());

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void insertcus(Customer rc) {

		try {
			System.out.println(
					"INSERT INTO `project`.`customer` (`first_name`, `Last_name`, `city`, `street`, `house_num`, `phonenumber`) VALUES ('"
							+ rc.getFirst_name() + "','" + rc.getLast_name() + "','" + rc.getCity() + "','"
							+ rc.getStreet() + "','" + rc.getHouse_num() + "','" + rc.getPhonenumber() + "');");

			connectDB();
			ExecuteStatement(
					"INSERT INTO `project`.`customer` (`first_name`, `Last_name`, `city`, `street`, `house_num`, `phonenumber`) VALUES ('"
							+ rc.getFirst_name() + "','" + rc.getLast_name() + "','" + rc.getCity() + "','"
							+ rc.getStreet() + "','" + rc.getHouse_num() + "','" + rc.getPhonenumber() + "');");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void insertorder(Orders rc) {

		try {
			System.out.println(
					"INSERT INTO `project`.`Orders` (`customer_id`, `delivery_id`, `status1`, `dilevared_time`, `order_time`, `delivery_date`) VALUES ('"
							+ rc.getCustomer_id() + "','" + rc.getDelivery_id() + "','" + rc.getStatus() + "','"
							+ rc.getDelivery_time() + "','" + rc.getOrder_time() + "','" + rc.getDelivery_date()
							+ "');");

			connectDB();
			ExecuteStatement(
					"INSERT INTO `project`.`Orders` (`customer_id`, `delivery_id`, `status1`, `dilevared_time`, `order_time`, `delivery_date`) VALUES ('"
							+ rc.getCustomer_id() + "','" + rc.getDelivery_id() + "','" + rc.getStatus() + "','"
							+ rc.getDelivery_time() + "','" + rc.getOrder_time() + "','" + rc.getDelivery_date()
							+ "');");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void insertbill(Bill b) {

		try {
			System.out.println("Insert into bill ( Total_price, employee_id,customer_id) values(" + b.getTotal_price()
					+ "," + b.getEmployee_id() + "," + b.getCustomer_id() + ");");

			connectDB();
			ExecuteStatement("Insert into bill ( Total_price, employee_id,customer_id) values(" + b.getTotal_price()
					+ "," + b.getEmployee_id() + "," + b.getCustomer_id() + ");");
			con.close();
			System.out.println("Connection closed bill ");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void updatefirstname(int id, String name) {

		try {
			System.out.println("update  Employee set first_name = '" + name + "' where employee_id = " + id + ";");
			connectDB();
			ExecuteStatement("update  Employee set first_name = '" + name + "' where employee_id = " + id + ";");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void updateLastname(int id, String name) {

		try {
			System.out.println("update  Employee set Last_name = '" + name + "' where employee_id = " + id + ";");
			connectDB();
			ExecuteStatement("update  Employee set Last_name = '" + name + "' where employee_id = " + id + ";");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void updatemealprice(int id, Float price) {

		try {
			System.out
					.println("UPDATE `project`.`Meal` SET `price` = '" + price + "' WHERE (`meal_id` = '" + id + "');");
			connectDB();
			ExecuteStatement("UPDATE `project`.`Meal` SET `price` = '" + price + "' WHERE (`meal_id` = '" + id + "');");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void updatemealtype(int id, String name) {

		try {
			System.out.println(
					"UPDATE `project`.`Meal` SET `mealtype` = '" + name + "' WHERE (`meal_id` = '" + id + "');");
			connectDB();
			ExecuteStatement(
					"UPDATE `project`.`Meal` SET `mealtype` = '" + name + "' WHERE (`meal_id` = '" + id + "');");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void updatemealcateg(int id, String name) {

		try {
			System.out.println(
					"UPDATE `project`.`Meal` SET `Category` = '" + name + "' WHERE (`meal_id` = '" + id + "');");
			connectDB();
			ExecuteStatement(
					"UPDATE `project`.`Meal` SET `Category` = '" + name + "' WHERE (`meal_id` = '" + id + "');");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void updatesalary(int id, Float salary) {

		try {
			System.out.println("update  Employee set month_salary = " + salary + " where employee_id = " + id + ";");
			connectDB();
			ExecuteStatement("update  Employee set month_salary = " + salary + " where employee_id = " + id + ";");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void updatephone(int id, String phone) {

		try {
			System.out.println("update  Employee set phone_num = '" + phone + "' where employee_id = " + id + ";");
			connectDB();
			ExecuteStatement("update  Employee set phone_num = '" + phone + "' where employee_id = " + id + ";");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void updatenddate(int id, String date) {

		try {
			System.out.println("update  Employee set endwork_date = '" + date + "' where employee_id = " + id + ";");
			connectDB();
			ExecuteStatement("update  Employee set endwork_date = '" + date + "' where employee_id = " + id + ";");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public void updateordertime(int id, String time) {

		try {
			System.out.println(
					"UPDATE `project`.`Orders` SET `order_time` = '" + time + "' WHERE (`order_id` = '" + id + "');");
			connectDB();
			ExecuteStatement(
					"UPDATE `project`.`Orders` SET `order_time` = '" + time + "' WHERE (`order_id` = '" + id + "');");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void updatedileverytime(int id, String time) {

		try {
			System.out.println("UPDATE `project`.`Orders` SET `dilevared_time` = '" + time + "' WHERE (`order_id` = '"
					+ id + "');");
			connectDB();
			ExecuteStatement("UPDATE `project`.`Orders` SET `dilevared_time` = '" + time + "' WHERE (`order_id` = '"
					+ id + "');");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void updatedate(int id, String time) {

		try {
			System.out.println("UPDATE `project`.`Orders` SET `delivery_date` = '" + time + "' WHERE (`order_id` = '"
					+ id + "');");
			connectDB();
			ExecuteStatement("UPDATE `project`.`Orders` SET `delivery_date` = '" + time + "' WHERE (`order_id` = '" + id
					+ "');");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void updatestatus(int id, String time) {

		try {
			System.out.println(
					"UPDATE `project`.`Orders` SET `status1` = '" + time + "' WHERE (`order_id` = '" + id + "');");
			connectDB();
			ExecuteStatement(
					"UPDATE `project`.`Orders` SET `status1` = '" + time + "' WHERE (`order_id` = '" + id + "');");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void updatecar(int id, String time) {

		try {
			System.out.println(
					"UPDATE `project`.`Car` SET `car_outlays` = '" + time + "' WHERE (`car_id` = '" + id + "');");
			connectDB();
			ExecuteStatement(
					"UPDATE `project`.`Car` SET `car_outlays` = '" + time + "' WHERE (`car_id` = '" + id + "');");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

///////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////
	public TableView<Meal> tablemeal() {
		TableView<Meal> emptable = new TableView<>();
		emptable.setPrefHeight(402);
		emptable.setPrefWidth(700);
		emptable.setLayoutX(260);
		emptable.setLayoutY(252);
		emptable.setEditable(true);

		TableColumn<Meal, Integer> snumCol = new TableColumn<Meal, Integer>("id");

		snumCol.setMinWidth(90);

		snumCol.setCellValueFactory(new PropertyValueFactory<Meal, Integer>("meal_id"));

		datameal = new ArrayList<Meal>();

		try {
			getDataMeal();
			dataListmeal = FXCollections.observableArrayList(datameal);

			TableColumn<Meal, Integer> nameCol = new TableColumn<Meal, Integer>("num_meal");
			nameCol.setMinWidth(90);

			nameCol.setCellValueFactory(new PropertyValueFactory<Meal, Integer>("num_of_meal"));

			TableColumn<Meal, Float> ageCol = new TableColumn<Meal, Float>("price");
			ageCol.setMinWidth(90);
			ageCol.setCellValueFactory(new PropertyValueFactory<Meal, Float>("price"));
			ageCol.setCellFactory(TextFieldTableCell.<Meal, Float>forTableColumn(new FloatStringConverter()));

			TableColumn<Meal, String> last_nameCol = new TableColumn<Meal, String>("type");
			last_nameCol.setMinWidth(90);
			last_nameCol.setCellValueFactory(new PropertyValueFactory<Meal, String>("meal_type"));

			last_nameCol.setCellFactory(TextFieldTableCell.<Meal>forTableColumn());

			TableColumn<Meal, String> levelCol = new TableColumn<Meal, String>("category");
			levelCol.setMinWidth(90);
			levelCol.setCellValueFactory(new PropertyValueFactory<Meal, String>("category"));

			levelCol.setCellFactory(TextFieldTableCell.<Meal>forTableColumn());

			emptable.setItems(dataListmeal);

			emptable.getColumns().addAll(snumCol, nameCol, last_nameCol, ageCol, levelCol);

		} catch (ClassNotFoundException | SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		return emptable;
	}

	public TableView<Meal> tablemeal1() {
		TableView<Meal> emptable = new TableView<>();
		emptable.setPrefHeight(402);
		emptable.setPrefWidth(700);
		emptable.setLayoutX(253);
		emptable.setLayoutY(252);

		emptable.setEditable(true);

		TableColumn<Meal, Integer> snumCol = new TableColumn<Meal, Integer>("id");

		snumCol.setMinWidth(90);

		snumCol.setCellValueFactory(new PropertyValueFactory<Meal, Integer>("meal_id"));

		datameal = new ArrayList<Meal>();

		try {
			getDataMeal();
			dataListmeal = FXCollections.observableArrayList(datameal);

			TableColumn<Meal, Integer> nameCol = new TableColumn<Meal, Integer>("num_meal");
			nameCol.setMinWidth(90);

			nameCol.setCellValueFactory(new PropertyValueFactory<Meal, Integer>("num_of_meal"));

			TableColumn<Meal, Float> ageCol = new TableColumn<Meal, Float>("price");
			ageCol.setMinWidth(90);
			ageCol.setCellValueFactory(new PropertyValueFactory<Meal, Float>("price"));
			ageCol.setCellFactory(TextFieldTableCell.<Meal, Float>forTableColumn(new FloatStringConverter()));
			ageCol.setOnEditCommit((CellEditEvent<Meal, Float> t) -> {
				((Meal) t.getTableView().getItems().get(t.getTablePosition().getRow())).setPrice(t.getNewValue()); // display
																													// only
				updatemealprice(t.getRowValue().getMeal_id(), t.getNewValue());
			});

			TableColumn<Meal, String> last_nameCol = new TableColumn<Meal, String>("type");
			last_nameCol.setMinWidth(90);
			last_nameCol.setCellValueFactory(new PropertyValueFactory<Meal, String>("meal_type"));
			last_nameCol.setCellFactory(TextFieldTableCell.<Meal>forTableColumn());
			last_nameCol.setOnEditCommit((CellEditEvent<Meal, String> t) -> {
				((Meal) t.getTableView().getItems().get(t.getTablePosition().getRow())).setMeal_type(t.getNewValue()); // display
																														// only
				updatemealtype(t.getRowValue().getMeal_id(), t.getNewValue());
			});

			TableColumn<Meal, String> levelCol = new TableColumn<Meal, String>("category");
			levelCol.setMinWidth(90);
			levelCol.setCellValueFactory(new PropertyValueFactory<Meal, String>("category"));

			levelCol.setCellFactory(TextFieldTableCell.<Meal>forTableColumn());
			levelCol.setOnEditCommit((CellEditEvent<Meal, String> t) -> {
				((Meal) t.getTableView().getItems().get(t.getTablePosition().getRow())).setcategory(t.getNewValue()); // display
																														// only
				updatemealcateg(t.getRowValue().getMeal_id(), t.getNewValue());
			});

			emptable.setItems(dataListmeal);

			emptable.getColumns().addAll(snumCol, nameCol, last_nameCol, ageCol, levelCol);

		} catch (ClassNotFoundException | SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		return emptable;
	}

	public TableView<Meal> tablemeal2(ArrayList<Meal> n) {
		TableView<Meal> emptable = new TableView<>();

		TableColumn<Meal, Integer> snumCol = new TableColumn<Meal, Integer>("id");

		snumCol.setMinWidth(90);

		snumCol.setCellValueFactory(new PropertyValueFactory<Meal, Integer>("meal_id"));

		ObservableList<Meal> mea = FXCollections.observableArrayList(n);

		TableColumn<Meal, Integer> nameCol = new TableColumn<Meal, Integer>("num_meal");
		nameCol.setMinWidth(90);

		nameCol.setCellValueFactory(new PropertyValueFactory<Meal, Integer>("num_of_meal"));

		TableColumn<Meal, Float> ageCol = new TableColumn<Meal, Float>("price");
		ageCol.setMinWidth(90);
		ageCol.setCellValueFactory(new PropertyValueFactory<Meal, Float>("price"));
		ageCol.setCellFactory(TextFieldTableCell.<Meal, Float>forTableColumn(new FloatStringConverter()));

		TableColumn<Meal, String> last_nameCol = new TableColumn<Meal, String>("type");
		last_nameCol.setMinWidth(90);
		last_nameCol.setCellValueFactory(new PropertyValueFactory<Meal, String>("meal_type"));
		last_nameCol.setCellFactory(TextFieldTableCell.<Meal>forTableColumn());
		last_nameCol.setOnEditCommit((CellEditEvent<Meal, String> t) -> {
			((Meal) t.getTableView().getItems().get(t.getTablePosition().getRow())).setMeal_type(t.getNewValue()); // display
																													// only
			updatemealtype(t.getRowValue().getMeal_id(), t.getNewValue());
		});

		TableColumn<Meal, String> levelCol = new TableColumn<Meal, String>("category");
		levelCol.setMinWidth(90);
		levelCol.setCellValueFactory(new PropertyValueFactory<Meal, String>("category"));

		levelCol.setCellFactory(TextFieldTableCell.<Meal>forTableColumn());
		levelCol.setOnEditCommit((CellEditEvent<Meal, String> t) -> {
			((Meal) t.getTableView().getItems().get(t.getTablePosition().getRow())).setcategory(t.getNewValue()); // display
																													// only
			updatemealcateg(t.getRowValue().getMeal_id(), t.getNewValue());
		});

		emptable.setItems(mea);

		emptable.getColumns().addAll(snumCol, nameCol, last_nameCol, ageCol, levelCol);

		return emptable;
	}

	public TableView<Orders> tableorder() {
		TableView<Orders> ordertable = new TableView<>();
		ordertable.setPrefHeight(402);
		ordertable.setPrefWidth(700);
		ordertable.setLayoutX(258);
		ordertable.setLayoutY(252);

		TableColumn<Orders, Integer> ordercol = new TableColumn<Orders, Integer>("id");

		ordercol.setMinWidth(90);

		ordercol.setCellValueFactory(new PropertyValueFactory<Orders, Integer>("order_id"));

		dataorder = new ArrayList<Orders>();

		try {
			getDataorder();
			dataListorder = FXCollections.observableArrayList(dataorder);

			TableColumn<Orders, Integer> del_col = new TableColumn<Orders, Integer>("delivery_id");
			del_col.setMinWidth(90);

			del_col.setCellValueFactory(new PropertyValueFactory<Orders, Integer>("delivery_id"));

			TableColumn<Orders, Integer> customercol = new TableColumn<Orders, Integer>("customer_id");
			customercol.setMinWidth(90);

			customercol.setCellValueFactory(new PropertyValueFactory<Orders, Integer>("customer_id"));

			TableColumn<Orders, String> statuscol = new TableColumn<Orders, String>("status");
			statuscol.setMinWidth(90);
			statuscol.setCellValueFactory(new PropertyValueFactory<Orders, String>("status"));
			statuscol.setCellFactory(TextFieldTableCell.<Orders>forTableColumn());
			statuscol.setOnEditCommit((CellEditEvent<Orders, String> t) -> {
				((Orders) t.getTableView().getItems().get(t.getTablePosition().getRow())).setStatus(t.getNewValue()); // display
																														// only
				updatestatus(t.getRowValue().getOrder_id(), t.getNewValue());
			});
			TableColumn<Orders, String> time_col = new TableColumn<Orders, String>("order_time");
			time_col.setMinWidth(90);
			time_col.setCellValueFactory(new PropertyValueFactory<Orders, String>("order_time"));

			time_col.setCellFactory(TextFieldTableCell.<Orders>forTableColumn());
			time_col.setOnEditCommit((CellEditEvent<Orders, String> t) -> {
				((Orders) t.getTableView().getItems().get(t.getTablePosition().getRow()))
						.setOrder_time(t.getNewValue()); // display only
				updateordertime(t.getRowValue().getOrder_id(), t.getNewValue());
			});

			TableColumn<Orders, String> deliveryTime = new TableColumn<Orders, String>("delivared_time");
			deliveryTime.setMinWidth(90);
			deliveryTime.setCellValueFactory(new PropertyValueFactory<Orders, String>("delivared_time"));

			deliveryTime.setCellFactory(TextFieldTableCell.<Orders>forTableColumn());
			deliveryTime.setOnEditCommit((CellEditEvent<Orders, String> t) -> {
				((Orders) t.getTableView().getItems().get(t.getTablePosition().getRow()))
						.setDelivery_time(t.getNewValue()); // display only
				updatedileverytime(t.getRowValue().getOrder_id(), t.getNewValue());
			});
			TableColumn<Orders, String> deliveryDate = new TableColumn<Orders, String>("delivery_date");
			deliveryDate.setMinWidth(90);
			deliveryDate.setCellValueFactory(new PropertyValueFactory<Orders, String>("delivery_date"));

			deliveryDate.setCellFactory(TextFieldTableCell.<Orders>forTableColumn());
			deliveryDate.setOnEditCommit((CellEditEvent<Orders, String> t) -> {
				((Orders) t.getTableView().getItems().get(t.getTablePosition().getRow()))
						.setDelivery_date(t.getNewValue()); // display only
				updatedate(t.getRowValue().getOrder_id(), t.getNewValue());
			});

			ordertable.setItems(dataListorder);

			ordertable.getColumns().addAll(ordercol, del_col, customercol, statuscol, time_col, deliveryTime,
					deliveryDate);

		} catch (ClassNotFoundException | SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		return ordertable;
	}

	public TableView<Orders> tableorder1(int id) {
		TableView<Orders> ordertable = new TableView<>();
		ordertable.setPrefHeight(402);
		ordertable.setPrefWidth(700);
		ordertable.setLayoutX(258);
		ordertable.setLayoutY(252);

		ordertable.setEditable(true);
		TableColumn<Orders, Integer> ordercol = new TableColumn<Orders, Integer>("id");

		ordercol.setMinWidth(90);

		ordercol.setCellValueFactory(new PropertyValueFactory<Orders, Integer>("order_id"));

		try {
			getDataorder();
			ArrayList<Orders> newtable = new ArrayList<>();
			for (int i = 0; i < dataorder.size(); i++) {
				if (dataorder.get(i).getOrder_id() == id)
					newtable.add(dataorder.get(i));
				break;
			}
			ObservableList<Orders> dataListorder1 = FXCollections.observableArrayList(newtable);

			TableColumn<Orders, Integer> del_col = new TableColumn<Orders, Integer>("delivery_id");
			del_col.setMinWidth(90);

			del_col.setCellValueFactory(new PropertyValueFactory<Orders, Integer>("delivery_id"));

			TableColumn<Orders, Integer> customercol = new TableColumn<Orders, Integer>("customer_id");
			customercol.setMinWidth(90);

			customercol.setCellValueFactory(new PropertyValueFactory<Orders, Integer>("customer_id"));

			TableColumn<Orders, String> statuscol = new TableColumn<Orders, String>("status");
			statuscol.setMinWidth(90);
			statuscol.setCellValueFactory(new PropertyValueFactory<Orders, String>("status"));
			statuscol.setCellFactory(TextFieldTableCell.<Orders>forTableColumn());
			statuscol.setOnEditCommit((CellEditEvent<Orders, String> t) -> {
				((Orders) t.getTableView().getItems().get(t.getTablePosition().getRow())).setStatus(t.getNewValue()); // display
																														// only
				updatestatus(t.getRowValue().getOrder_id(), t.getNewValue());
			});
			TableColumn<Orders, String> time_col = new TableColumn<Orders, String>("order_time");
			time_col.setMinWidth(90);
			time_col.setCellValueFactory(new PropertyValueFactory<Orders, String>("order_time"));

			time_col.setCellFactory(TextFieldTableCell.<Orders>forTableColumn());
			time_col.setOnEditCommit((CellEditEvent<Orders, String> t) -> {
				((Orders) t.getTableView().getItems().get(t.getTablePosition().getRow()))
						.setOrder_time(t.getNewValue()); // display only
				updateordertime(t.getRowValue().getOrder_id(), t.getNewValue());
			});

			TableColumn<Orders, String> deliveryTime = new TableColumn<Orders, String>("delivared_time");
			deliveryTime.setMinWidth(90);
			deliveryTime.setCellValueFactory(new PropertyValueFactory<Orders, String>("delivared_time"));

			deliveryTime.setCellFactory(TextFieldTableCell.<Orders>forTableColumn());
			deliveryTime.setOnEditCommit((CellEditEvent<Orders, String> t) -> {
				((Orders) t.getTableView().getItems().get(t.getTablePosition().getRow()))
						.setDelivery_time(t.getNewValue()); // display only
				updatedileverytime(t.getRowValue().getOrder_id(), t.getNewValue());
			});
			TableColumn<Orders, String> deliveryDate = new TableColumn<Orders, String>("delivery_date");
			deliveryDate.setMinWidth(90);
			deliveryDate.setCellValueFactory(new PropertyValueFactory<Orders, String>("delivery_date"));

			deliveryDate.setCellFactory(TextFieldTableCell.<Orders>forTableColumn());
			deliveryDate.setOnEditCommit((CellEditEvent<Orders, String> t) -> {
				((Orders) t.getTableView().getItems().get(t.getTablePosition().getRow()))
						.setDelivery_date(t.getNewValue()); // display only
				updatedate(t.getRowValue().getOrder_id(), t.getNewValue());
			});

			ordertable.setItems(dataListorder1);

			ordertable.getColumns().addAll(ordercol, del_col, customercol, statuscol, time_col, deliveryTime,
					deliveryDate);

		} catch (ClassNotFoundException | SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		return ordertable;
	}

	public TableView<Car> tablecar() {
		TableView<Car> cartable = new TableView<>();
		cartable.setPrefHeight(402);
		cartable.setPrefWidth(700);
		cartable.setLayoutX(258);
		cartable.setLayoutY(252);
		cartable.setEditable(true);

		TableColumn<Car, Integer> idcol = new TableColumn<Car, Integer>("id");

		idcol.setMinWidth(90);

		idcol.setCellValueFactory(new PropertyValueFactory<Car, Integer>("car_id"));

		datacar = new ArrayList<Car>();

		try {
			getDataCar();

			dataListCar = FXCollections.observableArrayList(datacar);

			TableColumn<Car, Integer> del_col = new TableColumn<Car, Integer>("employee_id");
			del_col.setMinWidth(90);

			del_col.setCellValueFactory(new PropertyValueFactory<Car, Integer>("employee_id"));

			TableColumn<Car, String> car_outlays_col = new TableColumn<Car, String>("car_outlays");
			car_outlays_col.setMinWidth(90);
			car_outlays_col.setCellValueFactory(new PropertyValueFactory<Car, String>("car_outlays"));
			car_outlays_col.setCellFactory(TextFieldTableCell.<Car>forTableColumn());
			car_outlays_col.setOnEditCommit((CellEditEvent<Car, String> t) -> {
				((Car) t.getTableView().getItems().get(t.getTablePosition().getRow())).setCar_outlays(t.getNewValue()); // display
																														// only
				updatecar(t.getRowValue().getCar_id(), t.getNewValue());
			});

			cartable.setItems(dataListCar);

			cartable.getColumns().addAll(idcol, del_col, car_outlays_col);

		} catch (ClassNotFoundException | SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		return cartable;
	}

	public TableView<Orders> tableorderfordelivery(int id) {
		TableView<Orders> ordertable = new TableView<>();
		ordertable.setPrefHeight(402);
		ordertable.setPrefWidth(700);
		ordertable.setLayoutX(258);
		ordertable.setLayoutY(252);

		ordertable.setEditable(true);
		TableColumn<Orders, Integer> ordercol = new TableColumn<Orders, Integer>("id");

		ordercol.setMinWidth(90);

		ordercol.setCellValueFactory(new PropertyValueFactory<Orders, Integer>("order_id"));

		try {

			ArrayList<Orders> newtable = getDataorderdel(id);

			ObservableList<Orders> dataListorder1 = FXCollections.observableArrayList(newtable);

			TableColumn<Orders, Integer> del_col = new TableColumn<Orders, Integer>("delivery_id");
			del_col.setMinWidth(90);

			del_col.setCellValueFactory(new PropertyValueFactory<Orders, Integer>("delivery_id"));

			TableColumn<Orders, Integer> customercol = new TableColumn<Orders, Integer>("customer_id");
			customercol.setMinWidth(90);

			customercol.setCellValueFactory(new PropertyValueFactory<Orders, Integer>("customer_id"));

			TableColumn<Orders, String> statuscol = new TableColumn<Orders, String>("status");
			statuscol.setMinWidth(90);
			statuscol.setCellValueFactory(new PropertyValueFactory<Orders, String>("status"));
			statuscol.setCellFactory(TextFieldTableCell.<Orders>forTableColumn());
			statuscol.setOnEditCommit((CellEditEvent<Orders, String> t) -> {
				((Orders) t.getTableView().getItems().get(t.getTablePosition().getRow())).setStatus(t.getNewValue()); // display
																														// only
				updatestatus(t.getRowValue().getOrder_id(), t.getNewValue());
			});
			TableColumn<Orders, String> time_col = new TableColumn<Orders, String>("order_time");
			time_col.setMinWidth(90);
			time_col.setCellValueFactory(new PropertyValueFactory<Orders, String>("order_time"));

			time_col.setCellFactory(TextFieldTableCell.<Orders>forTableColumn());
			time_col.setOnEditCommit((CellEditEvent<Orders, String> t) -> {
				((Orders) t.getTableView().getItems().get(t.getTablePosition().getRow()))
						.setOrder_time(t.getNewValue()); // display only
				updateordertime(t.getRowValue().getOrder_id(), t.getNewValue());
			});

			TableColumn<Orders, String> deliveryTime = new TableColumn<Orders, String>("delivared_time");
			deliveryTime.setMinWidth(90);
			deliveryTime.setCellValueFactory(new PropertyValueFactory<Orders, String>("delivared_time"));

			deliveryTime.setCellFactory(TextFieldTableCell.<Orders>forTableColumn());
			deliveryTime.setOnEditCommit((CellEditEvent<Orders, String> t) -> {
				((Orders) t.getTableView().getItems().get(t.getTablePosition().getRow()))
						.setDelivery_time(t.getNewValue()); // display only
				updatedileverytime(t.getRowValue().getOrder_id(), t.getNewValue());
			});
			TableColumn<Orders, String> deliveryDate = new TableColumn<Orders, String>("delivery_date");
			deliveryDate.setMinWidth(90);
			deliveryDate.setCellValueFactory(new PropertyValueFactory<Orders, String>("delivery_date"));

			deliveryDate.setCellFactory(TextFieldTableCell.<Orders>forTableColumn());
			deliveryDate.setOnEditCommit((CellEditEvent<Orders, String> t) -> {
				((Orders) t.getTableView().getItems().get(t.getTablePosition().getRow()))
						.setDelivery_date(t.getNewValue()); // display only
				updatedate(t.getRowValue().getOrder_id(), t.getNewValue());
			});

			ordertable.setItems(dataListorder1);

			ordertable.getColumns().addAll(ordercol, del_col, customercol, statuscol, time_col, deliveryTime,
					deliveryDate);

		} catch (ClassNotFoundException | SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		return ordertable;
	}

	/*********************************************************************************************************************************/
	public double getAllOrdersTotalPrice() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub

		String SQL;

		connectDB();
		System.out.println("Connection established");
		ArrayList<Double> Random = new ArrayList<>();
		SQL = "select sum(m.price*om.quantity) from meal m,order2meal om where om.meal_id=m.meal_id;";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);

		while (rs.next())
			Random.add(new Double(Double.parseDouble(rs.getString(1))));

		rs.close();
		stmt.close();

		con.close();
		System.out.println("Connection closed");
		return Random.get(0) * 2.5;

	}

	public double getNumberOfTrips() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub

		String SQL;

		connectDB();
		System.out.println("Connection established");
		ArrayList<Double> Random = new ArrayList<>();
		SQL = "select sum(E.month_salary) from employee E;";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);

		while (rs.next())
			Random.add(new Double(Double.parseDouble(rs.getString(1))));

		rs.close();
		stmt.close();

		con.close();
		System.out.println("Connection closed");
		return Random.get(0) * 2.5;

	}

	public double getTotalMonthlySalaryEmployee() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub

		String SQL;

		connectDB();
		System.out.println("Connection established");
		ArrayList<Double> Random = new ArrayList<>();
		SQL = " select sum(e.month_salary) from employee e;";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);

		while (rs.next())
			Random.add(new Double(Double.parseDouble(rs.getString(1))));

		rs.close();
		stmt.close();

		con.close();
		System.out.println("Connection closed");
		return Random.get(0);

	}

	public ArrayList<Cheff> getcheffonumoforder() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ArrayList<Cheff> array = new ArrayList<>();
		String SQL;

		connectDB();
		System.out.println("Connection established");

		SQL = "SELECT finalize.cheff_id, COUNT(order_id) FROM finalize GROUP BY cheff_id ORDER BY COUNT(order_id) DESC limit 1;";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);

		while (rs.next())
			array.add(new Cheff(Integer.parseInt(rs.getString(1)), Integer.parseInt(rs.getString(2))));

		rs.close();
		stmt.close();

		con.close();
		System.out.println("Connection closed");
		return array;

	}
}
