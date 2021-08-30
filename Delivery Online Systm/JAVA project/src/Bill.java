
public class Bill {
	private int bill_id;
	private Double total_price;
	private int employee_id;
	private int customer_id;

	public Bill() {
		super();
	}
	public Bill( Double total_price, int employee_id, int customer_id) {
		

		this.total_price = total_price;
		this.employee_id = employee_id;
		this.customer_id = customer_id;
	}
	public Bill(int bill_id, Double total_price, int employee_id, int customer_id) {
		super();
		this.bill_id = bill_id;
		this.total_price = total_price;
		this.employee_id = employee_id;
		this.customer_id = customer_id;
	}

	public int getBill_id() {
		return bill_id;
	}

	public void setBill_id(int bill_id) {
		this.bill_id = bill_id;
	}

	public Double getTotal_price() {
		return total_price;
	}

	public void setTotal_price(Double total_price) {
		this.total_price = total_price;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	@Override
	public String toString() {
		return "Bill [bill_id=" + bill_id + ", total_price=" + total_price + ", employee_id=" + employee_id
				+ ", customer_id=" + customer_id + "]";
	}

}
