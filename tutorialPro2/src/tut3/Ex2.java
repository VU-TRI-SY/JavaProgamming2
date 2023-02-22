package tut3;

import java.io.FileNotFoundException;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;

import utils.TextIOPlus;

public class Ex2 {
    public static void main(String[] args) throws FileNotFoundException {
        
//        CompilationUnit codeUnit = JavaParser.parse(new File("D:/JavaPro2Coding/tutorialPro2/src/tut3/Hello.j"));
        // obtain the generated source code
    	CompilationUnit codeUnit = JavaParser.parse(TextIOPlus.readTextFileContent(Ex2.class, "Hello.j"));
        System.out.println(codeUnit); //print abstract syntax tree

    }
}
