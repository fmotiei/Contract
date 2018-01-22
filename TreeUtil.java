import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by kosar on 1/22/18.
 */
public class TreeUtil {

    public static void main(String[] args) throws IOException {
        String input = "c1 = one()";
        getParseTree(input);
    }

    public static Node getParseTree(String input) throws IOException {
        // Get our lexer
        InputStream stream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
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
        return listener.nodes.get(listener.rootHash);
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
    }

    @Override
    public void enterVa(contractGrammarParser.VaContext ctx) {
        Node node = new Node("va");
        nodes.put(String.valueOf(ctx.hashCode()), node);
        Node parent = nodes.get(String.valueOf(ctx.getParent().hashCode()));
        if (parent != null) {
            parent.child.add(node);
        }
    }

    @Override
    public void enterDf(contractGrammarParser.DfContext ctx) {
        Node node = new Node("df");
        nodes.put(String.valueOf(ctx.hashCode()), node);
        Node parent = nodes.get(String.valueOf(ctx.getParent().hashCode()));
        if (parent != null) {
            parent.child.add(node);
        }
    }

    @Override
    public void enterVb(contractGrammarParser.VbContext ctx) {
        Node node = new Node("vb");
        nodes.put(String.valueOf(ctx.hashCode()), node);
        Node parent = nodes.get(String.valueOf(ctx.getParent().hashCode()));
        if (parent != null) {
            parent.child.add(node);
        }
    }

    @Override
    public void enterVj(contractGrammarParser.VjContext ctx) {
        Node node = new Node("vj");
        nodes.put(String.valueOf(ctx.hashCode()), node);
        Node parent = nodes.get(String.valueOf(ctx.getParent().hashCode()));
        if (parent != null) {
            parent.child.add(node);
        }
    }

    @Override
    public void enterVe(contractGrammarParser.VeContext ctx) {
        Node node = new Node("ve");
        nodes.put(String.valueOf(ctx.hashCode()), node);
        Node parent = nodes.get(String.valueOf(ctx.getParent().hashCode()));
        if (parent != null) {
            parent.child.add(node);
        }
    }

    @Override
    public void enterAr(contractGrammarParser.ArContext ctx) {
        Node node = new Node("ar");
        nodes.put(String.valueOf(ctx.hashCode()), node);
        Node parent = nodes.get(String.valueOf(ctx.getParent().hashCode()));
        if (parent != null) {
            parent.child.add(node);
        }
    }

    @Override
    public void enterArs(contractGrammarParser.ArsContext ctx) {
        Node node = new Node("ars");
        nodes.put(String.valueOf(ctx.hashCode()), node);
        Node parent = nodes.get(String.valueOf(ctx.getParent().hashCode()));
        if (parent != null) {
            parent.child.add(node);
        }
    }

    @Override
    public void enterVd(contractGrammarParser.VdContext ctx) {
        Node node = new Node("vd");
        nodes.put(String.valueOf(ctx.hashCode()), node);
        Node parent = nodes.get(String.valueOf(ctx.getParent().hashCode()));
        if (parent != null) {
            parent.child.add(node);
        }
    }

    @Override
    public void enterVf(contractGrammarParser.VfContext ctx) {
        Node node = new Node("vf");
        nodes.put(String.valueOf(ctx.hashCode()), node);
        Node parent = nodes.get(String.valueOf(ctx.getParent().hashCode()));
        if (parent != null) {
            parent.child.add(node);
        }
    }

    @Override
    public void enterVc(contractGrammarParser.VcContext ctx) {
        Node node = new Node("vc");
        nodes.put(String.valueOf(ctx.hashCode()), node);
        Node parent = nodes.get(String.valueOf(ctx.getParent().hashCode()));
        if (parent != null) {
            parent.child.add(node);
        }
    }

    @Override
    public void enterB(contractGrammarParser.BContext ctx) {
        Node node = new Node("b");
        nodes.put(String.valueOf(ctx.hashCode()), node);
        Node parent = nodes.get(String.valueOf(ctx.getParent().hashCode()));
        if (parent != null) {
            parent.child.add(node);
        }
    }

    @Override
    public void enterEx(contractGrammarParser.ExContext ctx) {
        Node node = new Node("ex");
        nodes.put(String.valueOf(ctx.hashCode()), node);
        Node parent = nodes.get(String.valueOf(ctx.getParent().hashCode()));
        if (parent != null) {
            parent.child.add(node);
        }
    }

    @Override
    public void enterVg(contractGrammarParser.VgContext ctx) {
        Node node = new Node("vg");
        nodes.put(String.valueOf(ctx.hashCode()), node);
        Node parent = nodes.get(String.valueOf(ctx.getParent().hashCode()));
        if (parent != null) {
            parent.child.add(node);
        }
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        Node myNode = new Node(node.getText());
        nodes.put(String.valueOf(node.hashCode()), myNode);
        Node parent = nodes.get(String.valueOf(node.getParent().hashCode()));
        if (parent != null) {
            parent.child.add(myNode);
        }
    }
}
