test: MarkdownParseTest.class MarkdownParse.class
	java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest

MarkdownParse.class: MardownParse.java
	javac MarkdownParse.java

MarkdownParseTest.class: MarkdownParseTest.java MarkdownParse.class 
	javac -cp .:lib/junit-4.13.2jar;lib/hamcrest-core-1.3.jar MarkdownParseTest.java MarkdownParse.java