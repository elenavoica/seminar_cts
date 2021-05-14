package ro.ase.csie.cts.g1088.dp.testtest.A8;

import java.util.ArrayList;

public class Departament implements Node {
	ArrayList<Node> nodes;
	
	public Departament(ArrayList<Node> nodes) {
		super();
		this.nodes = nodes;
	}

	public Departament() {
		nodes = new ArrayList<Node>();
	}

	@Override
	public String getName() {
		String n = null;
		for(Node node : nodes) {
			n = node.getName();
		}
		return n;
	}
	public void addNode(Node n) {
		nodes.add(n);
	}
}
