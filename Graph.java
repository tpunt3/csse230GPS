import java.util.ArrayList;


public class Graph {
	
	public ArrayList waypoints;
	public CityClass target;
	public CityClass currentCity;
	public CityClass nextCity;
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
	
	public void SetCurrentCity(CityClass city) {
		this.currentCity = city;
	}
	
	public void setTarget(CityClass finishPoint) {
		this.target = finishPoint;
	}
	
	public double ShortestConnection() {
		// This will be an arrayList of all the cities to travel through
		// to travel the shortest distance between two cities
		int xDist = 0;
		int yDist = 0;
		double distance = 0;
		
		xDist = (Math.abs(currentCity.getX()) - Math.abs(nextCity.getX()));
		yDist = (Math.abs(currentCity.getY()) - Math.abs(nextCity.getY()));
		distance = Math.sqrt(xDist^2 + yDist^2);
		
		// xDist = math.abs(Point 2x - Point 1x) ^2
		// yDist = math.abs(Point2y - Point 1y) ^2
		// distance = math.sqrt(xDist^2 + yDist^2)
		
		
		return distance;
	}
	
	public double CalcDistanceRemaining() {
		// calculates the as the crow flies distance remaining
		// xDist = math.abs(currentCity X - target X);
		// yDist = math.abs(currentCity Y - target Y);
		
		//CrowFlyDist = Math.sqrt(xDist^2 + yDist^2);
		
		int xDist = 0;
		int yDist = 0;
		double CrowFlyDistance = 0;
		
		xDist = (Math.abs(currentCity.getX()) - Math.abs(nextCity.getX()));
		yDist = (Math.abs(currentCity.getY()) - Math.abs(nextCity.getY()));
		CrowFlyDistance = Math.sqrt(xDist^2 + yDist^2);
		
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
				
		return null;
	}

}
