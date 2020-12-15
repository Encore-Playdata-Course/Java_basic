package food.domain;

public class Food {
	public String name;
	String tel;
	String foodType;
	private double distance;

	Food() {
	};

	public Food(String n, String t, String f, double d) {
		name = n;
		tel = t;
		foodType = f;
		setDistance(d);
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		if (distance <= 6) {
			this.distance = distance;
		} else {
			System.out.println("도보 불가");
			this.distance = distance;
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public String toString() {
		return "가게이름: " + name + "\n" + "전화번호: " + tel + "\n" + "종류: " + foodType + "\n" + "거리: " + distance + "km";
	}
}
