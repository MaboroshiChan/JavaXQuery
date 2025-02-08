# CSE232B-DatabaseSystemImplementation

The course explores theinternal structure ofdatabase systems via a project that takes studentsfrom specifcation of the grammar and semantics olthe query language to implementing an evaluationengine for it, then building in optimizations.
We use as vehicle the W3C Standard XML querylanguage XQuery.
The course project is structured in 3 milestones:

* I-implementing an XPath evaluator [30% of grade]
* Il-implementing a XQuery evaluator [35% of grade]
* Ill-improving the evaluator from Milestone ll by adding join optimizations [35% of grade].
  
For the development, students will start from scratch, using Java.
We will use the Antlr4 tool for Java parser

* **Milestones 1** and **2 (NaiveEvaluation)** [due Feb 7 by 11:59pm and Feb 21, respectively]: A straightforward query execution engine receives the simplifed XQuery and aninput XML file and evaluates the quer using a recursive evaluation routine which, given an XOuery expression
path,concatenation,element creation.etc and a list of input nodes, produces a list of output nodes.For the XQuery parser, were commend generating it
using the ANTLR 4 parser generator
Provided with a grammar, ANTLR
generates a compiler which
automatically constructs abstract
syntax trees of its input expressions
Milestone 1 delivers a **naive
evaluator** for XPath (see Section 1in this note for syntax and
semantics of the XPath fragment we will implement)
Milestone 2 extends it to XQuery(see Section 2 in this note.)
* **Milestones 3** 
