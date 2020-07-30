package cr.ac.ulead.Logica;

import cr.ac.ulead.InformacionUsuario.Info_Persona;

public class Node {

	public Info_Persona data;
	public Node leftChild; 
	public Node rightChild; 

	public void displayNode() {
		System.out.print('{');
		System.out.print(data);
		System.out.print("} ");
	}

}
