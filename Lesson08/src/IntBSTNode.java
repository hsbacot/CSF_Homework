/**
 * Created by hsbacot on 1/13/14.
 */
public class IntBSTNode {
    private IntBSTNode leftNode;
    private IntBSTNode rightNode;
    private int value;

    public IntBSTNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public IntBSTNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(IntBSTNode leftNode) {
        this.leftNode = leftNode;
    }

    public IntBSTNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(IntBSTNode rightNode) {
        this.rightNode = rightNode;
    }
}
