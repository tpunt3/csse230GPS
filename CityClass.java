import java.util.ArrayList;


public class CityClass {
	
	public String CityName;
	public Long Longitude;
	public Long Lattitude;
	public int Population;
	public int Rating;
	public ArrayList Neighbors;
	
	public CityClass() {
		this.CityName = null;
		this.Longitude = null;
		this.Lattitude = null;
		this.Population = 0;
		this.Rating = 0;
		this.Neighbors = null;
	}
	
	public void SetName(String name) {
		this.CityName = name;
	}
	
	public void SetLong(Long value) {
		this.Longitude = value;
	}
	
	public void SetLattitude(Long value) {
		this.Lattitude = value;
	}
	
	public void SetPopulation(int value) {
		this.Population = value;
	}
	
	public void SetRating(int value) {
		this.Rating = value;
	}
	
	public void SetNeighbors(ArrayList elements) {
		this.Neighbors = elements;
	}
	
	public String GetName() {
		return this.CityName;
	}
	
	public Long GetLong() {
		return this.Longitude;
	}
	
	public Long GetLattitude() {
		return this.Lattitude;
	}
	
	public int GetPopulation() {
		return this.Population;
	}
	
	public int GetRating() {
		return this.Rating;
	}
	
	public ArrayList GetNeighbors() {
		return this.Neighbors;
	}
}
