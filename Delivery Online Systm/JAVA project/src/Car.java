
public class Car {
	private int car_id;
	private String car_outlays;
	private int employee_id;

	public Car() {
		super();
	}

	public Car(int car_id, String car_outlays, int employee_id) {
		super();
		this.car_id = car_id;
		this.car_outlays = car_outlays;
		this.employee_id = employee_id;
	}
	public Car( String car_outlays, int employee_id) {
		super();
		
		this.car_outlays = car_outlays;
		this.employee_id = employee_id;
	}
	public int getCar_id() {
		return car_id;
	}

	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}

	public String getCar_outlays() {
		return car_outlays;
	}

	public void setCar_outlays(String car_outlays) {
		this.car_outlays = car_outlays;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	@Override
	public String toString() {
		return "Car [car_id=" + car_id + ", car_outlays=" + car_outlays + ", employee_id=" + employee_id + "]";
	}

}
