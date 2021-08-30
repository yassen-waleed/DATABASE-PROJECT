
public class delivery_guy {
	private int delivery_num;
	private int employee_id;
	private String password;

	public delivery_guy() {
		super();
	}

	public delivery_guy(int delivery_num, int employee_id, String password) {
		super();
		this.delivery_num = delivery_num;
		this.employee_id = employee_id;
		this.password = password;
	}

	public int getDelivery_num() {
		return delivery_num;
	}

	public void setDelivery_num(int delivery_num) {
		this.delivery_num = delivery_num;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "delivery_guy [delivery_num=" + delivery_num + ", employee_id=" + employee_id + ", password=" + password
				+ "]";
	}

}
