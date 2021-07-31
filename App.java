/*
 * Copyright (C) 2007-2014 by Brett Alistair Kromkamp <brett@perfectlearn.com>.
 * Code modified with Makes of Cars
 * William Chapman
 * CPT 307 Data Structures & Algorithms
 * Michael Hayden
 * 7-22-2019
 */
package com.quesucede.tree;
import java.util.Iterator;
public class App {
    public static void main(String[] args) {

        Tree tree = new Tree();

        /*
         * The second parameter for the addNode method is the identifier
         * for the node's parent. In the case of the root node, either
         * null is provided or no second parameter is provided.
         * Names within the tree are Makes of Cars
         */
        tree.addNode("Ford");
        tree.addNode("Chevrolet", "Ford");
        tree.addNode("Dodge", "Ford");
        tree.addNode("BMW", "Chevrolet");
        tree.addNode("Audi", "Chevrolet");
        tree.addNode("Jaguar", "Audi");
        tree.addNode("Toyota", "Audi");
        tree.addNode("Kia", "Jaguar");
        tree.addNode("Subaru", "Kia");
        tree.addNode("Nissan", "Dodge");
        tree.addNode("Ferrari", "Chevrolet");

        tree.display("Ford");

        System.out.println("n***** DEPTH-FIRST ITERATION *****");

        // Default traversal strategy is 'depth-first'
        Iterator<Node> depthIterator = tree.iterator("F");

        while (depthIterator.hasNext()) {
            Node node = depthIterator.next();
            System.out.println(node.getIdentifier());
        }

        System.out.println("n***** BREADTH-FIRST ITERATION *****");

        Iterator<Node> breadthIterator = tree.iterator("Ford", TraversalStrategy.BREADTH_FIRST);

        while (breadthIterator.hasNext()) {
            Node node = breadthIterator.next();
            System.out.println(node.getIdentifier());
        }
    }
}