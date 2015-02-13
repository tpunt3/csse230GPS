import java.util.ArrayList;


public class City {

	public String CityName;
	public String StateName;
	
	//69.16 * numbers from Trent
	public double Longitude;
	
	//68.707 * numbers from Trent
	public double Latitude;
	public int Population;
	public int Rating;
	public ArrayList Neighbors;
	public int speedLimit;
	
	
	public City(String information) {
		int stateEnd = information.indexOf(',');
		this.StateName = information.substring(0,stateEnd);
		
		information = information.substring(stateEnd+1);
		int cityEnd = information.indexOf(',');
		this.CityName = information.substring(0,cityEnd);
		
		information=information.substring(cityEnd+1);
		int popEnd = information.indexOf(',');
		System.out.println("population as string: "+information.substring(0,popEnd));
		this.Population = Integer.parseInt(information.substring(0,popEnd));
		
		information=information.substring(popEnd+1);
		int ratingEnd=information.indexOf(',');
		this.Rating = Integer.parseInt(information.substring(0,ratingEnd));
		
		information = information.substring(ratingEnd+1);
		int longitudeEnd = information.indexOf(',');
		this.Longitude = Double.parseDouble(information.substring(0,longitudeEnd));
		
		information = information.substring(longitudeEnd+1);
		//int latitudeEnd = information.indexOf(',');
		System.out.println(information);
		System.out.println(information.substring(0));
		this.Latitude = Double.parseDouble(information.substring(0));
		
		System.out.println("this: "+this.CityName+ this.StateName+ this.Longitude+ this.Latitude+ this.Population+ this.Rating);
		
		
		this.Neighbors = null;
	}
	
	public void SetName(String name) {
		this.CityName = name;
	}
	
	public void SetLong(Long value) {
		this.Longitude = value;
	}
	
	public void SetLattitude(Long value) {
		this.Latitude = value;
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
	
	public double GetLong() {
		return this.Longitude;
	}
	
	public double GetLattitude() {
		return this.Latitude;
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
	
	public int GetSpeedLimit() {
		return this.speedLimit;
	}
}