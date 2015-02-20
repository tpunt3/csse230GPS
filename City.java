import java.util.ArrayList;
import java.util.HashMap;


public class City {

	public String CityName;
	public String StateName;
	
	//69.16 * numbers from Trent
	public double Longitude;
	
	//68.707 * numbers from Trent
	public double Latitude;
	public int Population;
	public int Rating;
	public ArrayList<City> Neighbors = new ArrayList<City>();
	public ArrayList<Double> Distance = new ArrayList<Double>();
	public ArrayList<String> neighborString = new ArrayList<String>();
	public int speedLimit;
	public String poi1;
	public String poi2;
	public String poi3;
	public String poi1r;
	public String poi2r;
	public String poi3r;
	
	
	public City(String information, String poi) {
		int stateEnd = information.indexOf(',');
		this.StateName = information.substring(0,stateEnd);
		
		information = information.substring(stateEnd+1);
		int cityEnd = information.indexOf(',');
		this.CityName = information.substring(0,cityEnd);
		
		information=information.substring(cityEnd+1);
		int popEnd = information.indexOf(',');
		this.Population = Integer.parseInt(information.substring(0,popEnd));
		
		information=information.substring(popEnd+1);
		int ratingEnd=information.indexOf(',');
		this.Rating = Integer.parseInt(information.substring(0,ratingEnd));
		
		information = information.substring(ratingEnd+1);
		int longitudeEnd = information.indexOf(',');
		this.Longitude = Double.parseDouble(information.substring(0,longitudeEnd));
		
		information = information.substring(longitudeEnd+1);
		int latitudeEnd = information.indexOf(',');
		this.Latitude = Double.parseDouble(information.substring(0,latitudeEnd));
		
		information = information.substring(latitudeEnd+1);
		int speedEnd = information.indexOf(',');
		this.speedLimit=Integer.parseInt(information.substring(0,speedEnd));
		
		int neighborEnd=-1;
		int distEnd = -1;
		information=information.substring(speedEnd+1);
		while(information.contains(",")){
			neighborEnd = information.indexOf(',');
			this.neighborString.add(information.substring(0,neighborEnd));
			information=information.substring(neighborEnd+1);
			distEnd = information.indexOf(',');
			this.Distance.add(Double.parseDouble(information.substring(0,distEnd)));
			information = information.substring(distEnd+1);
		}
		int lastNeighborEnd = information.indexOf(';');
		neighborString.add(information.substring(0,lastNeighborEnd));
		information = information.substring(lastNeighborEnd+1);
		
		distEnd = information.indexOf(';');
		Distance.add(Double.parseDouble(information.substring(0,distEnd)));
	
		//set POI
		int capitalEnd = poi.indexOf(',');
		poi=poi.substring(capitalEnd+1);
		
		int poi1end = poi.indexOf(',');
		this.poi1=poi.substring(0,poi1end);
		
		poi=poi.substring(poi1end+1);
		int poi1rend = poi.indexOf(',');
		this.poi1r =poi.substring(0,poi1rend);
		
		poi=poi.substring(poi1rend+1);
		int poi2end=poi.indexOf(',');
		this.poi2=poi.substring(0,poi2end);
		
		poi=poi.substring(poi2end+1);
		int poi2rend=poi.indexOf(',');
		this.poi2r=poi.substring(0,poi2rend);
		
		poi=poi.substring(poi2rend+1);
		int poi3end=poi.indexOf(',');
		this.poi3=poi.substring(0,poi3end);
		
		poi=poi.substring(poi3end+1);
		int poi3rend=poi.indexOf(';');
		this.poi3r=poi.substring(0,poi3rend);
			
		
		
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
	
	public ArrayList GetNeighbors(City current){
		return current.Neighbors;
	}
	
	public int GetSpeedLimit() {
		return this.speedLimit;
	}
	
}