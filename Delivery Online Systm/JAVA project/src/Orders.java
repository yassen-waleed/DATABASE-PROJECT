
public class Orders {
	private int order_id;
	private int customer_id;
	private int delivery_id;
	private String status;
	private String order_time;
	private String delivery_time;
	private String delivery_date;

	public Orders() {
		super();
	}

	public Orders( int customer_id, int delivery_id, String status, String order_time,
			String delivery_time, String delivery_date) {
		super();
		
		this.customer_id = customer_id;
		this.delivery_id = delivery_id;
		this.status = status;
		this.order_time = order_time;
		this.delivery_time = delivery_time;
		this.delivery_date = delivery_date;
	}
	public Orders(int order_id, int customer_id, int delivery_id, String status, String order_time,
			String delivery_time, String delivery_date) {
		super();
		this.order_id = order_id;
		this.customer_id = customer_id;
		this.delivery_id = delivery_id;
		this.status = status;
		this.order_time = order_time;
		this.delivery_time = delivery_time;
		this.delivery_date = delivery_date;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public int getDelivery_id() {
		return delivery_id;
	}

	public void setDelivery_id(int delivery_id) {
		this.delivery_id = delivery_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOrder_time() {
		return order_time;
	}

	public void setOrder_time(String order_time) {
		this.order_time = order_time;
	}

	public String getDelivery_time() {
		return delivery_time;
	}

	public void setDelivery_time(String delivery_time) {
		this.delivery_time = delivery_time;
	}

	public String getDelivery_date() {
		return delivery_date;
	}

	public void setDelivery_date(String delivery_date) {
		this.delivery_date = delivery_date;
	}

}
