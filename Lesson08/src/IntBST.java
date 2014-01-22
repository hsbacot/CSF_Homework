import java.util.LinkedList;


import java.util.LinkedList;


public class IntBST {
<<<<<<< HEAD
    private IntBSTNode rootNode;
=======
    private IntNode rootNode;
>>>>>>> 9ce7065aaadd2dee8eb5762a4250211953caba7a

    public String bfsRepresentation() {
        // TODO: Return a string representation of a breadth-first search of this tree.
        // Nodes are space-delimited, e.g. "1 2 4 5"
        // Hint: Use a queue and, starting with the root node, then enqueue its left and right children.
        // Hint: The StringBuilder class is useful for constructing strings that are constantly appended to
        LinkedList<IntBSTNode> q = new LinkedList();
        q.add(rootNode);
        while (!q.isEmpty()) {
            IntBSTNode n = q.poll();
            System.out.print(n.getValue() + " ");
            q.add(n.getLeftNode());
            q.add(n.getRightNode());
        }

<<<<<<< HEAD
//       throw new NotImplementedException();
=======
        // Sample solution, remove prior to class
        StringBuilder stringBuilder = new StringBuilder();

        LinkedList<IntNode> queue = new LinkedList<IntNode>();
        if (rootNode != null) {
            queue.add(rootNode);
        }

        while(!queue.isEmpty()) {
            IntNode node = queue.remove();
            stringBuilder.append(node.getValue() + " ");

            if (node.getLeftChild() != null)
                queue.add(node.getLeftChild());
            if (node.getRightChild() != null)
                queue.add(node.getRightChild());
        }
        return stringBuilder.toString().trim();
>>>>>>> 9ce7065aaadd2dee8eb5762a4250211953caba7a
    }

    public void insertValue(int value) {
        // TODO: Insert a value into the tree, maintaining the 'binary' property of the tree.
        if (rootNode == null) {
            rootNode = new IntBSTNode(value);
        }
        IntBSTNode node = rootNode;
        while (node.getValue() != value){

            if (value < node.getValue()) {
                if (node.getLeftNode().getValue() != value) {
                    node.setLeftNode(new IntBSTNode(value));
                    node = node.getLeftNode();
                } else if (value > node.getRightNode().getValue()) {
                    node.setRightNode(new IntBSTNode(value));
                    node = node.getRightNode();
                } else {
                    return;
                }
            }
        }


<<<<<<< HEAD
//       throw new NotImplementedException();
=======
        // Sample soln, remove prior to class

        if (rootNode == null) {
            rootNode = new IntNode(value);
        }
        else {
            IntNode currentNode = rootNode;

            while (currentNode.getValue() != value) {
                if (value > currentNode.getValue()) { // Right child path
                    if (currentNode.getRightChild() == null) {
                        currentNode.setRightChild(new IntNode(value));
                    }
                    currentNode = currentNode.getRightChild();
                }
                else { // Left child path
                    if (currentNode.getLeftChild() == null) {
                        currentNode.setLeftChild(new IntNode(value));
                    }
                    currentNode = currentNode.getLeftChild();
                }
            }
        }
>>>>>>> 9ce7065aaadd2dee8eb5762a4250211953caba7a
    }

    public boolean search(int value) {
        // TODO: Return whether the tree contains a given value

        // Sample soln, remove prior to class
        IntNode currentNode = rootNode;

        while(currentNode != null && (currentNode.getValue() != value)) {
            if (value > currentNode.getValue()) { // Continue down the right child path
                currentNode = currentNode.getRightChild();
            }
            else { // Continue down the left child path
                currentNode = currentNode.getLeftChild();
            }
        }
        // If the current node exists and its value is equal to the input, return true, else return false
        return currentNode != null && (currentNode.getValue() == value);
    }
}
