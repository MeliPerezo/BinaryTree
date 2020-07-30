package cr.ac.ulead.Logica;
import cr.ac.ulead.InformacionUsuario.Info_Persona;

import java.util.Scanner;
import java.util.Stack;

public class Tree {
	Help H = new Help();
	private static Scanner input = new Scanner(System.in);
	private Node root; // first node of tree


	public Tree() {
		root = null;
	}


		public void insert(Info_Persona newData ) {
			Node newNode = new Node();
			newNode.data = newData;
			if (root == null)
				root = newNode;
			else {
				int compare = newData.getFecha_nacimiento().compareTo(root.data.getFecha_nacimiento());
				if (compare > 0) {
					H.posicionDerecha(newNode, root);
				} else if (compare < 0) {
					H.posicionIzquierda(newNode, root);
				} else {
					if (Integer.parseInt(newData.getCedula()) > ( Integer.parseInt(root.data.getCedula()) )) {
						H.posicionDerecha(newNode, root);
					} else {
						H.posicionIzquierda(newNode, root);
					}

				}
			}
		}
	public void traverse(int traverseType) {
		switch (traverseType) {
		case 1:
			System.out.print("\n Recorrido Preorder: ");
			preOrder(root);
			break;
		case 2:
			System.out.print("\n Recorrido Inorder:  ");
			inOrder(root);
			break;
		case 3:
			System.out.print("\n Recorrido Postorder: ");
			postOrder(root);
			break;
		}
		System.out.println();
	}

	
	public void preOrder(Node localRoot) {
		if (localRoot != null) {
			System.out.print(localRoot.data + " ");
			preOrder(localRoot.leftChild);
			preOrder(localRoot.rightChild);
		}
	}

	
	public void inOrder(Node localRoot) {
		if (localRoot != null) {
			inOrder(localRoot.leftChild);
			System.out.print(localRoot.data + " ");
			inOrder(localRoot.rightChild);
		}
	}

	
	public void postOrder(Node localRoot) {
		if (localRoot != null) {
			postOrder(localRoot.leftChild);
			postOrder(localRoot.rightChild);
			System.out.print(localRoot.data + " ");
		}
	}

	
	public void displayTree() {
		Stack globalStack = new Stack();
		globalStack.push(root);
		int nBlanks = 32;
		boolean isRowEmpty = false;
		System.out.println(".....................................................................");
		while (isRowEmpty == false) {
			Stack localStack = new Stack();
			isRowEmpty = true;

			for (int j = 0; j < nBlanks; j++)
				System.out.print(' ');

			while (globalStack.isEmpty() == false) {
				Node temp = (Node) globalStack.pop();
				if (temp != null) {
					System.out.print(temp.data);
					localStack.push(temp.leftChild);
					localStack.push(temp.rightChild);

					if (temp.leftChild != null || temp.rightChild != null)
						isRowEmpty = false;
				} else {
					System.out.print(" No hay elemetos para mostras");
					localStack.push(null);
					localStack.push(null);
				}
				for (int j = 0; j < nBlanks * 2 - 2; j++)
					System.out.print(' ');
			}
			System.out.println();
			nBlanks /= 2;
			while (localStack.isEmpty() == false)
				globalStack.push(localStack.pop());
		}
		System.out.println(".....................................................................");
	}
}
