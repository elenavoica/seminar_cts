package ro.ase.csie.cts.g1088.dp.testtest.A8;

import java.util.ArrayList;

public class Departament implements Node {
	ArrayList<Node> nodes;
	String name;
	
	public Departament(ArrayList<Node> nodes, String name) {
		super();
		this.nodes = nodes;
		this.name = name;
	}

	public Departament(String name) {
		nodes = new ArrayList<Node>();
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
	public void addNode(Node n) {
		nodes.add(n);
	}

	@Override
	public void print(String tabs) {
		System.out.println(tabs + name);
		for(Node node : nodes) {
			node.print(tabs + "\t");
		}
	}
}
