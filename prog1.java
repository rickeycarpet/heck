import java.io.*;
import java.lang.*;
import java.util.*;
 
public class prog1{
 
// Function to check if the given
// string is a comment or not
static void isComment(String S)
{
    char line[] = S.toCharArray();
 
    // If two continuous slashes
    // precedes the comment
    if (line[0] == '/' && line[1] == '/' )
    {
        System.out.println(
            "It is a single-line comment");
        return;
    }
 
    if (line[0]=='/' && line[1]=='*' && line[line.length - 2] == '*' &&
        line[line.length - 1] == '/')
    {
        System.out.println(
            "It is a multi-line comment");
        return;
    }
 
    System.out.println("It is not a comment");
}
 
// Driver Code
public static void main(String[] args)
{
	
	Scanner input = new Scanner(System.in);
	
	String str = input.nextLine();
     
    // Given string
    String line = "/*GeeksForGeeks GeeksForGeeks*/";
 
    // Function call to check whether then
    // given string is a comment or not
    isComment(line);
}
}