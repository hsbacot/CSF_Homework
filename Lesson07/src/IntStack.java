
public class IntStack {
    IntListNode firstNode;

    public IntStack() {
    }

    public void push(int value) {
        // TODO: Add a value to the top of the stack
        // create a new node with the inherited value ready to be added to the linked list
        IntListNode newNode = new IntListNode(value);
        // if no linked list exists create the list and set the first node equal to value
        if(this.firstNode == null) {
            IntListNode node = new IntListNode(value);
            this.firstNode = node;
        } else {
            // if linked list exists begin at the first node
            IntListNode currentNode = firstNode;
            // iterate through list until you reach the end
            while (currentNode.getNextNode() != null) {
                // set next node to current not to progress through the list
                currentNode = currentNode.getNextNode();
            }
            // add the value the user input to the linked list
            currentNode.setNextNode(newNode);
        };
    }

    public int pop() {
        // TODO: Pop the first value off the stack
        IntListNode currentNode = firstNode;
        int popVal;
        int dropVal;

        while (currentNode.getNextNode().getNextNode() != null) {
            // progress through the linked list

            IntListNode lastNode = currentNode.getNextNode().getNextNode();
            IntListNode dropNode = currentNode.getNextNode();
            dropVal = dropNode.getValue();
            popVal = lastNode.getValue();
            currentNode = currentNode.getNextNode();
        }
        return 0;
    }

    public int size() {
        // TODO: Fill out this method
        int counter = 1;
        IntListNode currentNode = firstNode;
        while (currentNode.getNextNode() != null) {
            // set next node to current not to progress through the list
            currentNode = currentNode.getNextNode();
            counter++;
        }
        return counter;
    }
}
