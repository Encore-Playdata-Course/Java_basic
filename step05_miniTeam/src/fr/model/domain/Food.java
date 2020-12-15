package fr.model.domain;

public class Food {
	public String name;
	public String type;
	public String feature;
	public int distance;
	
	Food(){}
	
	public Food(String name, String type, String feature, int distance){
		this.name = name;
		this.type = type;
		this.feature = feature;
		this.distance = distance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", type=" + type + ", feature=" + feature + ", distance=" + distance + "]";
	}
	
}
