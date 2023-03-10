package tut3;

import java.util.Scanner;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;

public class Ex4 {

    public static void main(String[] args) {
    	//create constant String "TEMPLATE"
        final String TEMPLATE = "public class _ClassName_ {" +
                "    public static void main(String[] args) {" +
                "        System.out.println(\"_Greeting_\");" +
                "    }" +
                "}";
        System.out.println("Template code: \n" + TEMPLATE);
        Scanner sc = new Scanner(System.in);
        String templateString = TEMPLATE;
        
        String className;
        String greetingMsg;
        System.out.print("Enter class name: "); 
        className = sc.nextLine();
        
        System.out.print("Enter greeting message: "); 
        greetingMsg = sc.nextLine();
        System.out.println("Generated code: ");
        templateString = templateString.replace("_ClassName_", className);
        templateString = templateString.replace("_Greeting_", greetingMsg);
        
        CompilationUnit codeUnit = JavaParser.parse(templateString);
        System.out.println(codeUnit); 
        sc.close();
    }
}

