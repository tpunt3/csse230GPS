import java.util.ArrayList;


public class Graph {
	
	public ArrayList waypoints;
	public City target;
	public City currentCity;
	public City nextCity;
	public ArrayList currentRoute;
	public ArrayList bestRoute;
	public int CrowFlyDist;
	int xDist;
	int yDist;
	double distance;
	
	public Graph(){
		waypoints = new ArrayList();
		int xDist = 0;
		int yDist = 0;
		double distance = 0;
	}
	
	public void SetCurrentCity(City setCity) {
		this.currentCity = setCity;
	}
	
	public void setTarget(City finishPoint) {
		this.target = finishPoint;
	}
	
	public double ShortestConnection() {
		// This will be an arrayList of all the cities to travel through
		// to travel the shortest distance between two cities
		double xDist = 0;
		double yDist = 0;
		double distance = 0;
		
		xDist = (Math.abs(currentCity.GetLong()) - Math.abs(nextCity.GetLong()));
		yDist = (Math.abs(currentCity.GetLattitude()) - Math.abs(nextCity.GetLattitude()));
		distance = Math.sqrt(xDist*xDist + yDist*yDist);
		
		return distance;
	}
	
	public double CalcDistanceRemaining() {
		// calculates the as the crow flies distance remaining
		
		double xDist = 0;
		double yDist = 0;
		double CrowFlyDistance = 0;
		
		xDist = (Math.abs(currentCity.GetLong()) - Math.abs(nextCity.GetLong()));
		yDist = (Math.abs(currentCity.GetLattitude()) - Math.abs(nextCity.GetLattitude()));
		CrowFlyDistance = Math.sqrt(xDist*xDist + yDist*yDist);
		
		return CrowFlyDistance;
	}
	
//	public int GetDistanceRemaining() {
//		// returns CrowFliesDistance
//		
//		return CrowFlyDist;
//	}
	
	public ArrayList ShortestTimeRoute() {
		// This will be an arrayList of all the cities to travel through
		// to travel the shortest distance between two cities
		
		// This will call the A* stuff and then set the shortest route to the route the A* returns
		this.bestRoute = null;
		
				
		return this.bestRoute;
	}
	
	public ArrayList ShortestDistanceRoute() {
		this.bestRoute = null;
		
		// This should get the shortest distance route from the A* stuff
		
		return this.bestRoute;
	}

}
