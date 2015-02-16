import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;


public class AStar {
	
	private LinkedList<City> allCities;
	private PriorityQueue<City> queue;
	private Graph graph;
	
	public AStar(City start, City end, LinkedList allCities) {
		
		this.allCities = allCities;	
		
	}
	
	//need to store
	//object that has path
	//update cost, however far youve traveled so far
	//in order to insert into priority queue, need final F value, cost + heuristic value
	//need path, overall #
	
	public LinkedList<City> shortDist(City start, City end, LinkedList allCities, Graph graph){
		this.graph = graph;
		PriorityQueue<Path> open = new PriorityQueue<Path>();
		LinkedList<City> l = new LinkedList<City>();
		l.add(start);
		Path p = new Path(l,0,graph.ShortestConnection(start,end));
		while(!open.isEmpty()){
			
			Path current = open.poll();
			
			//get last element of linked list and see if its end
			
			if (current.p.getLast().equals(end)){
				return current.p;
			}else{
				ArrayList<City> neighbors = current.p.getLast().Neighbors;
				
				for (int i =0; i < neighbors.size(); i++){
					City currentNeighbor = neighbors.get(i);
					if (!current.p.contains(currentNeighbor)){
						current.p.clone();
						current.p.add(neighbors.get(i));
						current.cost = current.cost+currentNeighbor.f;
						current.f = current.cost + graph.ShortestConnection(currentNeighbor, end);
					}
					//see if its in the path, if in path, do nothing, use contains, implement comparable in city
					//if not contained, clone path, add the current neighbor, update cost with cost+neighbors cost, recalculate F (sum of the cost and geometric distance)
				}
				
			}
		}	
		return null;
	}
}
