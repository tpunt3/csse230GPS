import java.util.ArrayList;


public class Graph {
	
	public ArrayList waypoints;
	public City target;
	public City currentCity;
	public City nextCity;
	public ArrayList currentRoute;
	public ArrayList bestRoute;
	public double CrowFlyDist;
	public double totalDistance;
	public double xDist;
	public double yDist;
	public double PTPDistance;
	
	public Graph(){
		waypoints = new ArrayList();
		this.xDist = 0;
		this.yDist = 0;
		this.PTPDistance = 0;
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
		this.xDist = 0;
		this.yDist = 0;
		this.PTPDistance = 0;
		
		this.xDist = (Math.abs(currentCity.GetLong()) - Math.abs(nextCity.GetLong()));
		this.yDist = (Math.abs(currentCity.GetLattitude()) - Math.abs(nextCity.GetLattitude()));
		this.PTPDistance = Math.sqrt(this.xDist*this.xDist + this.yDist*this.yDist);
		
		return PTPDistance;
	}
	
	public double CalcDistanceRemaining() {
		// calculates the as the crow flies distance remaining
		
		this.xDist = 0;
		this.yDist = 0;
		this.CrowFlyDist = 0;
		
		xDist = (Math.abs(currentCity.GetLong()) - Math.abs(nextCity.GetLong()));
		yDist = (Math.abs(currentCity.GetLattitude()) - Math.abs(nextCity.GetLattitude()));
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
	
	public int TimeBetweenPoints() {
		this.xDist = 0;
		this.yDist = 0;
		this.PTPDistance = 0;
		
		this.xDist = (Math.abs(currentCity.GetLong()) - Math.abs(nextCity.GetLong()));
		this.yDist = (Math.abs(currentCity.GetLattitude()) - Math.abs(nextCity.GetLattitude()));
		this.PTPDistance = Math.sqrt(this.xDist*this.xDist + this.yDist*this.yDist);
		
		return this.PTPDistance/currentCity.speedLimit();
	}
	
	public ArrayList ShortestDistanceRoute() {
		this.bestRoute = null;
		
		// This should get the shortest distance route from the A* stuff
		
		return this.bestRoute;
	}

}
