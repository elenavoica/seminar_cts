package ro.ase.csie.cts.g1088.dp.testtest1;

import java.util.ArrayList;

public class Box implements Node {
	ArrayList<Node> nodes;
	
	public Box(ArrayList<Node> nodes) {
		super();
		this.nodes = nodes;
	}

	public Box() {
		nodes = new ArrayList<Node>();
	}

	@Override
	public int getPrice() {
		int p = 0;
		for(Node node : nodes) {
			p = p + node.getPrice();
		}
		return p;
	} 
	
	public void addNode(Node n) {
		nodes.add(n);
	}
}
