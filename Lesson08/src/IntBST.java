import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.LinkedList;


public class IntBST {
    private IntBSTNode rootNode;

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

//       throw new NotImplementedException();
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


//       throw new NotImplementedException();
    }

    public boolean search(int value) {
        // TODO: Return whether the tree contains a given value
        throw new NotImplementedException();
    }

    public void remove(int value) {
        // TODO: Optional Challenge question
        // To remove, first examine the find the node, then:
        // 1) Node N has no children? Just remove N
        // 2) Node N has one child? Just remove N and replace with the child
        // 3) Node N has two children? A little harder. Either take the in-order successor or predecessor R, swap the values of N and R, then delete R
        throw new NotImplementedException();
    }
}
