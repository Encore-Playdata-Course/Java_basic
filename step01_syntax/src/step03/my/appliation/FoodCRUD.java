package step03.my.appliation;

public class FoodCRUD {
	Food food;
	
	void save(String name, String tel, String foodType, double distance) {
		food = new Food(name, tel, foodType, distance);
	}
	
	void search() {
		System.out.println(food.toString());
	}
	
	void update(String newefoodType) {
		food.setFoodType(newefoodType);
	}
	
	void delete() {
		food = null;
	}
	public static void main(String[] args) {
		FoodCRUD crud = new FoodCRUD();
		
		crud.save("산쪼메", "02-588-7721", "일식", 7);
		crud.search();
		crud.update("일본식라면");
		crud.search();
		crud.delete();
//		crud.search();
	}

}
