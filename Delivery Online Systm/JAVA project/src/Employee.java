

public class Employee {
	
	private int employee_id;
	private float month_salary;
	private String first_name;
	private String last_name;
	private String phone_num;
	private String firstwork_date;
	private String endwork_date;

	
	public Employee() {
		super();
	}



	public Employee(int employee_id, float month_salary, String first_name, String last_name, String phone_num,
			String firstwork_date, String endwork_date) {
		super();
		this.employee_id = employee_id;
		this.month_salary = month_salary;
		this.first_name = first_name;
		this.last_name = last_name;
		this.phone_num = phone_num;
		this.firstwork_date = firstwork_date;
		this.endwork_date = endwork_date;
	}

	public Employee  ( float month_salary, String first_name, String last_name, String phone_num,
			String firstwork_date, String endwork_date) {
		
	
		this.month_salary = month_salary;
		this.first_name = first_name;
		this.last_name = last_name;
		this.phone_num = phone_num;
		this.firstwork_date = firstwork_date;
		this.endwork_date = endwork_date;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public float getMonth_salary() {
		return month_salary;
	}

	public void setMonth_salary(float month_salary) {
		this.month_salary = month_salary;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getPhone_num() {
		return phone_num;
	}

	public void setPhone_num(String phone_num) {
		this.phone_num = phone_num;
	}

	public String getFirstwork_date() {
		return firstwork_date;
	}

	public void setFirstwork_date(String firstwork_date) {
		this.firstwork_date = firstwork_date;
	}

	public String getEndwork_date() {
		return endwork_date;
	}

	public void setEndwork_date(String endwork_date) {
		this.endwork_date = endwork_date;
	}



	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", month_salary=" + month_salary + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", phone_num=" + phone_num + ", firstwork_date=" + firstwork_date
				+ ", endwork_date=" + endwork_date + "]";
	}

}