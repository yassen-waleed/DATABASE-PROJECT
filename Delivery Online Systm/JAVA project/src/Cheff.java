
public class Cheff {
	private String s;
	int cheff_num;
	int employee_id;

	public Cheff(String s, int cheff_num, int employee_id) {
		super();
		this.s = s;
		this.cheff_num = cheff_num;
		this.employee_id = employee_id;
	}

	public Cheff() {
		super();
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public int getCheff_num() {
		return cheff_num;
	}

	public void setCheff_num(int cheff_num) {
		this.cheff_num = cheff_num;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public Cheff(int employee_id, int cheff_num) {

		this.cheff_num = cheff_num;
		this.employee_id = employee_id;
	}
}
