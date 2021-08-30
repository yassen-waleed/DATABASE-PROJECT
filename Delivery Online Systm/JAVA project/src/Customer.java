
public class Customer {
	private int customer_id;
    private String first_name;
    private String  last_name;
    private String city;
    private String  street;
    private int house_num;
    private String phonenumber;
   

   

	public Customer(int customer_id, String first_name, String last_name, String city, String street, int house_num,
			String phonenumber) {
	
		this.customer_id = customer_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.city = city;
		this.street = street;
		this.house_num = house_num;
		this.phonenumber = phonenumber;
	}



	public Customer(String first_name, String last_name, String city, String street, int house_num, String phonenumber) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.city = city;
        this.street = street;
        this.house_num = house_num;
        this.phonenumber = phonenumber;
     
        
    }

  

	public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse_num() {
        return house_num;
    }

    public void setHouse_num(int house_num) {
        this.house_num = house_num;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    
    @Override
    public String toString() {
        return "Customer{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house_num=" + house_num +
                ", phonenumber='" + phonenumber + '\'' +
                ", customer_id=" + customer_id +
                '}';
    }
}
