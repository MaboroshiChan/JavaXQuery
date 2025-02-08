import gen.XPathBaseVisitor;
import gen.XPathLexer;
import gen.XPathParser;
import gen.XPathVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;


public class Example {
    public static void main(String[] args) {
        String input2 = "doc(\"file.xml\")/book[author eq Smith and title = \"Example\"]";
        String input = "doc(\"file.xml\")/book";
        String complex = "doc(\"j_caesar.xml\")//ACT[SCENE [SPEECH/SPEAKER/text() = \"CAESAR\" and SPEECH/SPEAKER/text() = \"BRUTUS\"]] ";
        String complex2 = "doc(\"j_caesar.xml\")//ACT[not .//SPEAKER/text() = \"CAESAR\"]";
        String complex3 = "doc(\"j_caesar.xml\")//ACT[SCENE [SPEECH/SPEAKER/text() = \"CAESAR\"] \n" +
                " [SPEECH/SPEAKER/text() = \"BRUTUS\"]]";

        CharStream inputStream = CharStreams.fromString(input2);

        // create the lexer and parser
        XPathLexer lexer = new XPathLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        XPathParser parser = new XPathParser(tokens);

        try {
            // Parse the input and get the parse tree
            XPathParser.ApContext parseTree = parser.ap();

            // Create a visitor to traverse the parse tree
            XPathVisitor<String> visitor = new XPathBaseVisitor<>() {
                @Override
                public String visitAp(XPathParser.ApContext ctx) {
                    String rs = ctx.FILENAME().getText();
                    return rs + " " +  visitRp(ctx.rp());
                }

                @Override
                public String visitRp(XPathParser.RpContext ctx) {
                    StringBuilder res = new StringBuilder();
                    for (int i = 0; i < ctx.getChildCount(); ++i) {
                        res.append(ctx.getChild(i).getText()).append(">");
                    }
                    return res.toString();
                }

                @Override
                public String visitF(XPathParser.FContext ctx) {
                    StringBuilder res = new StringBuilder();
                    for (int i = 0; i < ctx.getChildCount(); ++i) {
                        res.append(ctx.getChild(i).getText()).append(">>");
                    }
                    return res.toString();
                }
            };

            // Use the visitor to process the parse tree
            String result = visitor.visit(parseTree);

            // Print the result
            System.out.println("Parsed XPath: " + result);
        }
        catch (Exception e) {
            System.out.println("Error parsing XPath: " + e.getMessage());
        }
    }
}
