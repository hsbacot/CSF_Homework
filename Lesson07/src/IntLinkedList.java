
public class IntLinkedList {
    private IntListNode firstNode;

    // IntLinkedList stores a list of unique integers
    public IntLinkedList() {
    }

    public void insert(int value) {
        // TOOD: Add the integer, or take no action if it's already in the list
        // create a new node with the inherited value ready to be added to the linked list
        IntListNode newNode = new IntListNode(value);
        // if no linked list exists create the list and set the first node equal to value
        if(this.firstNode == null) {
            IntListNode node = new IntListNode(value);
            this.firstNode = node;
        } else {
            // if linked list exists begin at the first node
            IntListNode currentNode = firstNode;
            // if the current node is equal to the value of the first node break to prevent duplicate values from being added
            if (currentNode.getValue() == value) {
                return;
            }
            // iterate through list until you reach the end
            while (currentNode.getNextNode() != null) {
                // set next node to current not to progress through the list
                currentNode = currentNode.getNextNode();
                // return if the new node shares the value of another node to prevent duplicates
                if (currentNode.getValue() == newNode.getValue()) {
                    return;
                }
            }
            // add the value the user input to the linked list
            currentNode.setNextNode(newNode);
        };
    }

    public boolean contains(int value) {
        // TODO: Print out if the linked list contains the given integer
        IntListNode currentNode = firstNode;
        // check first node match up
        if (currentNode.getValue() == value) {
            return true;
        }
        while (currentNode.getNextNode() != null) {
            // progress through the linked list
            currentNode = currentNode.getNextNode();

            if (currentNode.getValue() == value) {
                return true;
            }
        }
        return false;
    }

    public void remove(int value) {
        // TODO: Remove the given integer from the list, or take no action if it's not in the list
        IntListNode currentNode = firstNode;
        // check first node match up
        if (currentNode.getValue() == value) {
            firstNode = currentNode.getNextNode();
            currentNode.setNextNode(currentNode.getNextNode().getNextNode());
        }
        while (currentNode.getNextNode() != null) {
            // progress through the linked list

            IntListNode nextNode = currentNode.getNextNode();

            if (nextNode.getValue() == value) {
                if (nextNode.getNextNode() != null) {
                    currentNode.setNextNode(nextNode.getNextNode());
                } else {
                    IntListNode nullNode = nextNode.getNextNode();
                    currentNode.setNextNode(nullNode);
                }
            }
            currentNode = currentNode.getNextNode();
        }
    }

    public void print() {
        IntListNode node = firstNode;
        while (node != null) {
            System.out.print(node.getValue() + " ");
            node = node.getNextNode();
        }
    }
}
