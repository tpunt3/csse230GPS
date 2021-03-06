import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;


public class AStar {
	
	private LinkedList<City> allCities;
	private PriorityQueue<City> queue;
	private Graph graph;
	private City start;
	private City end; 
	public Path path;
	
	public AStar(City start, City end, LinkedList allCities, Graph graph) {
		this.graph = graph;
		this.allCities = allCities;	
		this.start = start;
		this.end = end;
		
	}
	
	//need to store
	//object that has path
	//update cost, however far you've traveled so far
	//in order to insert into priority queue, need final F value, cost + heuristic value
	//need path, overall #
	
	public LinkedList<City> shortDist(){
		PriorityQueue<Path> open = new PriorityQueue<Path>();
		LinkedList<City> l = new LinkedList<City>();
		l.add(start);
		Path p = new Path(l,0,graph.ShortestConnection(start,end));
		open.add(p);
		while(!open.isEmpty()){
			
			Path current = open.poll();
			
			
			//get last element of linked list and see if its end
			
			if (current.p.getLast().equals(end)){
				this.path = current;
				return current.p;
			}else{
				ArrayList<City> neighbors = current.p.getLast().Neighbors;
				for(int i=0; i < neighbors.size(); i++){
				}
				
				for (int i =0; i < neighbors.size(); i++){
					City currentNeighbor = neighbors.get(i);
					if (!current.p.contains(currentNeighbor)){
						LinkedList<City> clone = (LinkedList<City>) current.p.clone();
						clone.add(neighbors.get(i));
						double cost = current.cost + current.p.getLast().Distance.get(i);
						double f = cost +  graph.ShortestConnection(currentNeighbor,end);
						Path newPath = new Path(clone, cost, f);
						open.add(newPath);
					}
					//see if its in the path, if in path, do nothing, use contains, implement comparable in city
					//if not contained, clone path, add the current neighbor, update cost with cost+neighbors cost, recalculate F (sum of the cost and geometric distance)
				}
			}
		}	
		return null;
	}
	
	public LinkedList<City> shortTime(){
		PriorityQueue<Path> open = new PriorityQueue<Path>();
		LinkedList<City> l = new LinkedList<City>();
		//System.out.println(start);
		l.add(start);
		//System.out.println(end);
		Path p = new Path(l,0,graph.TimeBetweenPoints(start,end));
		open.add(p);
		while(!open.isEmpty()){
			
			Path current = open.poll();
			
			
			//get last element of linked list and see if its end
			
			if (current.p.getLast().equals(end)){
				this.path = current;
				return current.p;
			}else{
				ArrayList<City> neighbors = current.p.getLast().Neighbors;
				
				
				for (int i =0; i < neighbors.size(); i++){
					City currentNeighbor = neighbors.get(i);
					if (!current.p.contains(currentNeighbor)){
						LinkedList<City> clone = (LinkedList<City>) current.p.clone();
						clone.add(neighbors.get(i));
						double cost = current.cost + current.p.getLast().Distance.get(i)/current.p.getLast().speedLimit;
						double f = cost +  graph.TimeBetweenPoints(currentNeighbor,end);
						Path newPath = new Path(clone, cost, f);
						open.add(newPath);
					}
					//see if its in the path, if in path, do nothing, use contains, implement comparable in city
					//if not contained, clone path, add the current neighbor, update cost with cost+neighbors cost, recalculate F (sum of the cost and geometric distance)
				}
			}
		}	
		return null;
	}
	
	
}
