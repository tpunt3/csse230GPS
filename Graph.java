import java.util.ArrayList;


public class Graph {
	
	public ArrayList waypoints;
	public CityClass target;
	public CityClass currentCity;
	public int CrowFlyDist;
	
	public Graph(){
		waypoints = new ArrayList();
	}
	
	public void SetCurrentCity(CityClass city) {
		this.currentCity = city;
	}
	
	public void setTarget(CityClass finishPoint) {
		this.target = finishPoint;
	}
	
	public ArrayList ShortestDistanceRoute() {
		// This will be an arrayList of all the cities to travel through
		// to travel the shortest distance between two cities
		
		// xDist = math.abs(Point 2x - Point 1x) ^2
		// yDist = math.abs(Point2y - Point 1y) ^2
		// distance = math.sqrt(xDist^2 + yDist^2)
		
		return null;
	}
	
	public void CalcDistanceRemaining() {
		// calculates the as the crow flies distance remaining
		// xDist = math.abs(currentCity X - target X);
		// yDist = math.abs(currentCity Y - target Y);
		
		//CrowFlyDist = Math.sqrt(xDist^2 + yDist^2);
	}
	
	public int GetDistanceRemaining() {
		// returns CrowFliesDistance
		
		return CrowFlyDist;
	}
	
	public ArrayList ShortestTimeRoute() {
		// This will be an arrayList of all the cities to travel through
		// to travel the shortest distance between two cities
				
		return null;
	}

}
