I'll generate 15 XPath examples that cover various corner cases and interesting scenarios, organized by type:

## Basic Navigation Examples:
```xpath
doc("library.xml")/books/book[1]  // First book element
doc("library.xml")//book[last()]  // Last book in the entire document
doc("library.xml")//*[@id]        // Any element with an ID attribute
```

## Complex Filtering:
```xpath
doc("data.xml")//person[age > 30 and city = "New York"]  // Complex boolean filter
doc("inventory.xml")//product[not(contains(name, "discontinued"))]  // Negation with text search
doc("users.xml")//user[self::admin or self::superuser]  // Self-axis with OR condition
```

## Positional and Structural Queries:
```xpath
doc("chapters.xml")//chapter[position() <= 3]  // First three chapters
doc("nested.xml")//*[count(child::*) > 5]       // Elements with more than 5 children
doc("complex.xml")//section[author/name = preceding-sibling::section/author/name]  // Sections with same author type
```

## Text and Attribute Comparisons:
```xpath
doc("books.xml")//book[starts-with(title, "The")]  // Books starting with "The"
doc("products.xml")//item[@price > 100 and @category = "electronics"]  // Attribute-based complex filter
doc("records.xml")//record[string-length(notes) > 100]  // Elements with long notes
```

## Advanced and Corner Case Scenarios:
```xpath
doc("mixed.xml")//*[not(*) and text()]  // Leaf nodes with text content
doc("recursive.xml")//node()[self::* or self::text()]  // All element and text nodes
doc("cross-ref.xml")//element[. = following-sibling::*]  // Elements equal to their following siblings
```
## Comprehensive example
```xpath
doc("library.xml")//book[author/name = "Smith" and .//chapter[text() = "XPath"]]/*[not(self::price)]

```

Key Observations:
- These examples demonstrate the versatility of XPath in navigating XML documents
- They showcase different types of filters: boolean, positional, textual
- Some explore less common axes like preceding-sibling, self
- Corner cases include empty result sets, complex nested conditions
- Demonstrates use of functions like position(), last(), contains(), string-length()

Additional Semantic Notes:
- Some queries might return empty lists depending on document structure
- Comparisons can be value-based (=, eq) or identity-based (==, is)
- Functions and axes provide powerful querying capabilities

Potential Practical Applications:
- Data extraction from complex XML documents
- Validation of document structures
- Searching and filtering large XML datasets

Would you like me to elaborate on any of these examples or explain the semantic rules behind them in more detail?