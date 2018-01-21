import java.util.ArrayList;

public class Node {
    ArrayList<Node> child ;
    String val ;
    String type ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name ;

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

    public void push_child(Node node){
        child.add(node);
    }

    public Node get_child(int i){
        return child.get(i);
    }


}
