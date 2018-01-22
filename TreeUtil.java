import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

/**
 * Created by kosar on 1/22/18.
 */
public class TreeUtil {

    public static void main(String[] args) throws IOException {
        String input = "c1 = one()";
        printDrink(input);
    }
    public static void printDrink(String drinkSentence) throws IOException {
        // Get our lexer
        InputStream stream = new ByteArrayInputStream(drinkSentence.getBytes(StandardCharsets.UTF_8));
        contractGrammarLexer lexer = new contractGrammarLexer(CharStreams.fromStream(stream, StandardCharsets.UTF_8));

        // Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Pass the tokens to the parser
        contractGrammarParser parser = new contractGrammarParser(tokens);

        // Specify our entry point
        contractGrammarParser.RContext rContext = parser.r();

        // Walk it and attach our listener
        ParseTreeWalker walker = new ParseTreeWalker();
        contractListener listener = new contractListener();
        walker.walk(listener, rContext);
        Node root = listener.nodes.get(listener.rootHash);
        System.out.println(root.walk());
    }
}

class contractListener extends contractGrammarBaseListener {
    HashMap<String, Node> nodes = new HashMap<>();
    String rootHash;
    @Override
    public void enterR(contractGrammarParser.RContext ctx) {
        Node node = new Node("r");
        nodes.put(String.valueOf(ctx.hashCode()), node);
        rootHash = String.valueOf(ctx.hashCode());
//        System.out.println("enterR: " + ctx.getText());
//        System.out.println("toString: " + ctx.hashCode());
    }

    @Override
    public void enterVa(contractGrammarParser.VaContext ctx) {
        Node node = new Node("va");
        nodes.put(String.valueOf(ctx.hashCode()), node);
        Node parent = nodes.get(String.valueOf(ctx.getParent().hashCode()));
        if (parent != null) {
            parent.child.add(node);
        }
//        System.out.println("enterVa: " + ctx.getText());
//        System.out.println("toString: " + ctx.hashCode());

    }

    @Override
    public void enterDf(contractGrammarParser.DfContext ctx) {
        Node node = new Node("df");
        nodes.put(String.valueOf(ctx.hashCode()), node);
        Node parent = nodes.get(String.valueOf(ctx.getParent().hashCode()));
        if (parent != null) {
            parent.child.add(node);
        }
//        System.out.println("enterDf: " + ctx.getText());
//        System.out.println("toString: " + ctx.hashCode());

    }

    @Override
    public void enterVb(contractGrammarParser.VbContext ctx) {
        Node node = new Node("vb");
        nodes.put(String.valueOf(ctx.hashCode()), node);
        Node parent = nodes.get(String.valueOf(ctx.getParent().hashCode()));
        if (parent != null) {
            parent.child.add(node);
        }
//        System.out.println("enterVb: " + ctx.getText());
//        System.out.println("toString: " + ctx.hashCode());

    }

    @Override
    public void enterVj(contractGrammarParser.VjContext ctx) {
        Node node = new Node("vj");
        nodes.put(String.valueOf(ctx.hashCode()), node);
        Node parent = nodes.get(String.valueOf(ctx.getParent().hashCode()));
        if (parent != null) {
            parent.child.add(node);
        }
//        System.out.println("enterVj: " + ctx.getText());
//        System.out.println("toString: " + ctx.hashCode());

    }

    @Override
    public void enterVe(contractGrammarParser.VeContext ctx) {
        Node node = new Node("ve");
        nodes.put(String.valueOf(ctx.hashCode()), node);
        Node parent = nodes.get(String.valueOf(ctx.getParent().hashCode()));
        if (parent != null) {
            parent.child.add(node);
        }
//        System.out.println("enterVe: " + ctx.getText());
//        System.out.println("toString: " + ctx.hashCode());

    }

    @Override
    public void enterAr(contractGrammarParser.ArContext ctx) {
        Node node = new Node("ar");
        nodes.put(String.valueOf(ctx.hashCode()), node);
        Node parent = nodes.get(String.valueOf(ctx.getParent().hashCode()));
        if (parent != null) {
            parent.child.add(node);
        }
//        System.out.println("enterAr: " + ctx.getText());
//        System.out.println("toString: " + ctx.hashCode());

    }

    @Override
    public void enterArs(contractGrammarParser.ArsContext ctx) {
        Node node = new Node("ars");
        nodes.put(String.valueOf(ctx.hashCode()), node);
        Node parent = nodes.get(String.valueOf(ctx.getParent().hashCode()));
        if (parent != null) {
            parent.child.add(node);
        }
//        System.out.println("enterArs: " + ctx.getText());
//        System.out.println("toString: " + ctx.hashCode());

    }

    @Override
    public void enterVd(contractGrammarParser.VdContext ctx) {
        Node node = new Node("vd");
        nodes.put(String.valueOf(ctx.hashCode()), node);
        Node parent = nodes.get(String.valueOf(ctx.getParent().hashCode()));
        if (parent != null) {
            parent.child.add(node);
        }
//        System.out.println("enterVd: " + ctx.getText());
//        System.out.println("toString: " + ctx.hashCode());

    }

    @Override
    public void enterVf(contractGrammarParser.VfContext ctx) {
        Node node = new Node("vf");
        nodes.put(String.valueOf(ctx.hashCode()), node);
        Node parent = nodes.get(String.valueOf(ctx.getParent().hashCode()));
        if (parent != null) {
            parent.child.add(node);
        }
//        System.out.println("enterVf: " + ctx.getText());
//        System.out.println("toString: " + ctx.hashCode());

    }

    @Override
    public void enterVc(contractGrammarParser.VcContext ctx) {
        Node node = new Node("vc");
        nodes.put(String.valueOf(ctx.hashCode()), node);
        Node parent = nodes.get(String.valueOf(ctx.getParent().hashCode()));
        if (parent != null) {
            parent.child.add(node);
        }
//        System.out.println("enterVc: " + ctx.getText());
//        System.out.println("toString: " + ctx.hashCode());

    }

    @Override
    public void enterB(contractGrammarParser.BContext ctx) {
        Node node = new Node("b");
        nodes.put(String.valueOf(ctx.hashCode()), node);
        Node parent = nodes.get(String.valueOf(ctx.getParent().hashCode()));
        if (parent != null) {
            parent.child.add(node);
        }
//        System.out.println("enterB: " + ctx.getText());
//        System.out.println("toString: " + ctx.hashCode());

    }

    @Override
    public void enterEx(contractGrammarParser.ExContext ctx) {
        Node node = new Node("ex");
        nodes.put(String.valueOf(ctx.hashCode()), node);
        Node parent = nodes.get(String.valueOf(ctx.getParent().hashCode()));
        if (parent != null) {
            parent.child.add(node);
        }
//        System.out.println("enterEx: " + ctx.getText());
//        System.out.println("toString: " + ctx.hashCode());

    }

    @Override
    public void enterVg(contractGrammarParser.VgContext ctx) {
        Node node = new Node("vg");
        nodes.put(String.valueOf(ctx.hashCode()), node);
        Node parent = nodes.get(String.valueOf(ctx.getParent().hashCode()));
        if (parent != null) {
            parent.child.add(node);
        }
//        System.out.println("enterVg: " + ctx.getText());
//        System.out.println("toString: " + ctx.hashCode());

    }

    @Override
    public void exitR(contractGrammarParser.RContext ctx) {
//        System.out.println("exitR: " + ctx.getText());
    }

    @Override
    public void exitVa(contractGrammarParser.VaContext ctx) {
//        System.out.println("exitVa: " + ctx.getText());
    }

    @Override
    public void exitDf(contractGrammarParser.DfContext ctx) {
//        System.out.println("exitDf: " + ctx.getText());
    }

    @Override
    public void exitVb(contractGrammarParser.VbContext ctx) {
//        System.out.println("exitVb: " + ctx.getText());
    }

    @Override
    public void exitVj(contractGrammarParser.VjContext ctx) {
//        System.out.println("exitVj: " + ctx.getText());
    }

    @Override
    public void exitVe(contractGrammarParser.VeContext ctx) {
//        System.out.println("exitVe: " + ctx.getText());
    }

    @Override
    public void exitAr(contractGrammarParser.ArContext ctx) {
//        System.out.println("exitAr: " + ctx.getText());
    }

    @Override
    public void exitArs(contractGrammarParser.ArsContext ctx) {
//        System.out.println("exitArs: " + ctx.getText());
    }

    @Override
    public void exitVd(contractGrammarParser.VdContext ctx) {
//        System.out.println("exitVd: " + ctx.getText());
    }

    @Override
    public void exitVf(contractGrammarParser.VfContext ctx) {
//        System.out.println("exitVf: " + ctx.getText());
    }

    @Override
    public void exitVc(contractGrammarParser.VcContext ctx) {
//        System.out.println("exitVc: " + ctx.getText());
    }

    @Override
    public void exitB(contractGrammarParser.BContext ctx) {
//        System.out.println("exitB: " + ctx.getText());
    }

    @Override
    public void exitEx(contractGrammarParser.ExContext ctx) {
//        System.out.println("exitEx: " + ctx.getText());
    }

    @Override
    public void exitVg(contractGrammarParser.VgContext ctx) {
//        System.out.println("exitVg: " + ctx.getText());
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        Node myNode = new Node(node.getText());
        nodes.put(String.valueOf(node.hashCode()), myNode);
        Node parent = nodes.get(String.valueOf(node.getParent().hashCode()));
        if (parent != null) {
            parent.child.add(myNode);
        }
//        System.out.println(node.getText());
    }
}
