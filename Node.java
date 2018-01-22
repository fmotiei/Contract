import org.antlr.runtime.tree.Tree;

import java.util.ArrayList;

public class Node {
    ArrayList<Node> child;
    String val;
    String type;

    public Node(String name) {
        this.name = name;
        this.child = new ArrayList<>();
    }

    public Node() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void push_child(Node node) {
        child.add(node);
    }

    public Node get_child(int i) {
        return child.get(i);
    }

    public int child_size() {
        return child.size();
    }

    public String walk() {
        if (this.child != null && !this.child.isEmpty()) {
            StringBuilder buf = new StringBuilder();

            buf.append("(");
            buf.append(this.getName());
            buf.append(' ');


            for (int i = 0; this.child != null && i < this.child.size(); ++i) {
                Node n = this.child.get(i);
                if (i > 0) {
                    buf.append(' ');
                }

                buf.append(n.walk());
            }

            buf.append(")");
            return buf.toString();
        } else {
            return this.getName();
        }
    }


}
