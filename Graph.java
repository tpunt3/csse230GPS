import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;


public class Graph {
	
	public ArrayList waypoints;
	public ArrayList currentRoute;
	public ArrayList bestRoute;
	public double CrowFlyDist;
	public double totalDistance;
	public double xDist;
	public double yDist;
	public double PTPDistance;
	public City startCity;
	public City endCity;
	public HashMap<String, City> cityHash = new HashMap<String, City>();
	public ArrayList<City> cities = new ArrayList<City>();
	public LinkedList<City> linkedCities = new LinkedList<City>();
	public Graph(String[] cityInfo, String[] poiInfo) throws IOException{
		
		waypoints = new ArrayList();
		this.xDist = 0;
		this.yDist = 0;
		this.PTPDistance = 0;
		for(int i = 0; i<cityInfo.length; i++){
			City currentCity = new City(cityInfo[i],poiInfo[i]);
			cityHash.put(currentCity.CityName, currentCity);
			cities.add(currentCity);
		}
		
		for (int i = 0; i < cities.size(); i++){
			linkedCities.add(cities.get(i));
		}
		
		//set all the neighbors
		for(int i =0; i<cities.size(); i++){
			for(int j=0;j<cities.get(i).neighborString.size();j++){
				cities.get(i).Neighbors.add(cityHash.get(cities.get(i).neighborString.get(j)));
			}
		}
		
		
		CCFrame newFrame = new CCFrame(cities, this);
		newFrame.setVisible(true);
		newFrame.setTitle("CrossCountryTouring");
	}
	
	public double ShortestConnection(City currentCity, City nextCity) {
		// This will be an arrayList of all the cities to travel through
		// to travel the shortest distance between two cities
		this.xDist = 0;
		this.yDist = 0;
		this.PTPDistance = 0;

		this.xDist = (Math.abs(currentCity.GetLong()) - Math.abs(nextCity.GetLong()));
		this.yDist = (Math.abs(currentCity.GetLattitude()) - Math.abs(nextCity.GetLattitude()));
		this.PTPDistance = Math.sqrt(this.xDist*this.xDist + this.yDist*this.yDist);
		
		return PTPDistance;
	}
	
	public double CalcDistanceRemaining(City currentCity, City target) {
		// calculates the as the crow flies distance remaining
		
		this.xDist = 0;
		this.yDist = 0;
		this.CrowFlyDist = 0;
		
		xDist = (Math.abs(currentCity.GetLong()) - Math.abs(target.GetLong()));
		yDist = (Math.abs(currentCity.GetLattitude()) - Math.abs(target.GetLattitude()));
		CrowFlyDist = Math.sqrt(this.xDist*this.xDist + this.yDist*this.yDist);
		
		return CrowFlyDist;
	}
	
	public ArrayList ShortestTimeRoute() {
		// This will be an arrayList of all the cities to travel through
		// to travel the shortest distance between two cities
		
		// This will call the A* stuff and then set the shortest route to the route the A* returns
		this.bestRoute = null;
		
		return this.bestRoute;
	}
	
	public double TimeBetweenPoints(City currentCity, City nextCity) {
		this.xDist = 0;
		this.yDist = 0;
		this.PTPDistance = 0;
		
		this.xDist = (Math.abs(currentCity.GetLong()) - Math.abs(nextCity.GetLong()));
		this.yDist = (Math.abs(currentCity.GetLattitude()) - Math.abs(nextCity.GetLattitude()));
		this.PTPDistance = Math.sqrt(this.xDist*this.xDist + this.yDist*this.yDist);
		
		return this.PTPDistance/currentCity.GetSpeedLimit();
	}
	
	public ArrayList ShortestDistanceRoute() {
		this.bestRoute = null;
		
		// This should get the shortest distance route from the A* stuff
		
		return this.bestRoute;
	}
	
	public void setStart(City startCity){
		this.startCity = startCity;
	}
	
	public void setEnd(City endCity){
		this.endCity = endCity;
	}

}
