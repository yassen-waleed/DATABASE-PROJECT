
public class Meal {
	private int meal_id;
	private int num_of_meal;
	private float price;
	private String meal_type;
	private String category;

	public Meal() {
		super();
	}

	public Meal(int meal_id, int num_of_meal, float price, String meal_type, String category) {
		super();
		this.meal_id = meal_id;
		this.num_of_meal = num_of_meal;
		this.price = price;
		this.meal_type = meal_type;
		this.category = category;
	}

	public Meal(int num_of_meal, float price, String meal_type, String category) {

		this.num_of_meal = num_of_meal;
		this.price = price;
		this.meal_type = meal_type;
		this.category = category;
	}

	public int getMeal_id() {
		return meal_id;
	}

	public void setMeal_id(int meal_id) {
		this.meal_id = meal_id;
	}

	public int getNum_of_meal() {
		return num_of_meal;
	}

	public void setNum_of_meal(int num_of_meal) {
		this.num_of_meal = num_of_meal;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getMeal_type() {
		return meal_type;
	}

	public void setMeal_type(String meal_type) {
		this.meal_type = meal_type;
	}

	public String getCategory() {
		return category;
	}

	public void setcategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Meal [meal_id=" + meal_id + ", num_of_meal=" + num_of_meal + ", price=" + price + ", meal_type="
				+ meal_type + ", category=" + category + "]";
	}

}
