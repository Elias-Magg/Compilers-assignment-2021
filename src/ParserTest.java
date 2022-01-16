import java.io.*;
import minipython.lexer.Lexer;
import minipython.parser.Parser;
import minipython.node.*;
import java.util.*;

public class ParserTest
{
  public static void main(String[] args)
  {
    try
    {
      Parser parser =
        new Parser(
        new Lexer(
        new PushbackReader(
        new FileReader(args[0].toString()), 1024)));

     Hashtable<String, List<FunctionArgs>> funtable =  new Hashtable<>();
     Hashtable<String, Type> vars = new Hashtable<>();
     Start ast = parser.parse();
     ast.apply(new myvisitor(funtable, vars));
     for(Map.Entry<String, List<FunctionArgs>> function: funtable.entrySet()){
         System.out.println(function.getKey());
         for(FunctionArgs arg: function.getValue()){
             System.out.println(arg);
         }
     }
    }
    catch (Exception e)
    {
      System.err.println(e);
    }
  }
}

