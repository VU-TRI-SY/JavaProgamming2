package tut3;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;

public class Ex1 {
    public static void main(String[] args) {
        // program text
        String progText = "class Hello { " + "public static void main(String[] args) { "
                + " System.out.println(\"Hello world!\");" + "} " + "}";
        // parse the program text
        CompilationUnit codeUnit = JavaParser.parse(progText);
        // obtain the generated source code
        System.out.println(codeUnit); //print abstract syntax tree
        System.out.println(progText);
    }
}
