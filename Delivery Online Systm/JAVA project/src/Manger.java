
public class Manger {
private String userName;
private String password;
private int emp_id;



public Manger(String userName, String password, int emp_id) {
	super();
	this.userName = userName;
	this.password = password;
	this.emp_id=emp_id;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}
public int getEmp_id() {
	return emp_id;
}

public void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
}

@Override
public String toString() {
	return "Manegar [userName=" + userName + ", password=" + password + ", emp_id=" + emp_id + "]";
}


}
