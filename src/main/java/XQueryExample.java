import gen.XQueryBaseVisitor;
import gen.XQueryLexer;
import gen.XQueryParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class XQueryExample {
    public static void main(String[] args) {
        String input = "for $b in doc(\"bookstore.xml\")/bookstore/book\n" +
                "where $b/price > 30\n" +
                "return $b/title";
        CharStream inputStream = CharStreams.fromString(input);

        // create the lexer and parser
        XQueryLexer lexer = new XQueryLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        XQueryParser parser = new XQueryParser(tokens);

        try {
            // Parse the input and get the parse tree
            XQueryParser.XqContext parseTree = parser.xq();

            // Create a visitor to traverse the parse tree
            XQueryBaseVisitor<String> visitor = new XQueryBaseVisitor<>() {
                @Override
                public String visitXq(XQueryParser.XqContext ctx) {
                    StringBuilder res = new StringBuilder();
                    for (int i = 0; i < ctx.getChildCount(); ++i) {
                        res.append(ctx.getChild(i).getText()).append(" ");
                    }
                    return res.toString();
                }
            };

            // Use the visitor to process the parse tree
            String result = visitor.visit(parseTree);

            // Print the result
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
