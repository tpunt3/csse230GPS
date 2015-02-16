import java.util.LinkedList;


public class Path implements Comparable<Path>{
	
	LinkedList<City> p;
	double cost;
	double f;
	
	public Path(LinkedList<City> path, double cost, double f){
		this.p = path;
		this.cost = cost;
		this.f = f;
	}

	@Override
	public int compareTo(Path p) {
		if(f<p.f) return -1;
		if(f>p.f) return 1;
		return 0;
	}
	
	public void setCost(double cost){
		this.cost = cost;
	}
	
	public void setF(double Fnum){
		this.f = Fnum;
	}
	
	

}
