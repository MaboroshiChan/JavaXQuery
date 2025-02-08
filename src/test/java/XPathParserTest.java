import gen.XPathBaseVisitor;
import gen.XPathLexer;
import gen.XPathParser;
import gen.XPathVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class XPathUtil {
    public static String evaluateXPath(String xml, String xpathExpression) {
        if (xpathExpression.equals("/root/element")) {
            return "testValue";
        }
        return null;
    }
}


public class XPathParserTest {

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

    private XPathParser.ApContext parseXPath(String xpath) {
        CharStream inputStream = CharStreams.fromString(xpath);

        // create the lexer and parser
        XPathLexer lexer = new XPathLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        XPathParser parser = new XPathParser(tokens);

        // Parse the input and get the parse tree

        // Create a visitor to traverse the parse tree

        // Use the visitor to process the parse tree
        return parser.ap();
    }

    @Test
    public void testSimpleXPath() {
        String xpath = "doc(\"file.xml\")/book";
        var parse_result = parseXPath(xpath);

        assertEquals("doc(\"file.xml\")", parse_result.FILENAME().getText());
        assertEquals("book",parse_result.rp().getChild(0).getText());
    }

    @Test
    public void testXPathf() {
        String xpath = "doc(\"file.xml\")/book[author eq Smith and title = \"Example\"]";
        var parse_result = parseXPath(xpath);

        String author = parse_result.rp().f().getChild(0).getChild(0).getText();
        assertEquals("author", author);

        String eq = parse_result.rp().f().getChild(0).getChild(1).getText();
        assertEquals("eq", eq.trim());
    }

}
