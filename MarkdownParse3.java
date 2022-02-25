// File reading code from https://howtodoinjava.com/java/io/java-read-file-to-string-examples/
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParse3 {
    public static ArrayList<String> getLinks(String markdown) {
        ArrayList<String> toReturn = new ArrayList<>();
        // find the next [, then find the ], then find the (, then take up to
        // the next )
        int currentIndex = 0;
        int lastClosedParen=markdown.lastIndexOf(")");
        while(currentIndex < markdown.length()) {
            //int nextopenbacktick=markdown.indexOf("`",currentIndex);
            int nextOpenBracket = markdown.indexOf("[", currentIndex);
            int nextOpenCarrot = markdown.indexOf("<", currentIndex);
            int nextCloseBracket = markdown.indexOf("]", nextOpenBracket);
            //int nextCloseCarrot = markdown.indexOf(">", nextOpenCarrot);
            int openParen = markdown.indexOf("(", nextCloseBracket);
            int closeParen = markdown.indexOf(")", openParen);

            //toReturn.add(markdown.substring(openParen + 1, closeParen));
            System.out.println(currentIndex);
            currentIndex = closeParen + 1;
            /*if (nextOpenBracket == -1 || nextCloseBracket == -1 ||
            nextOpenCarrot == -1 || nextCloseCarrot == -1 ||
            openParen == -1 || closeParen == -1||closeParen==lastClosedParen
            ||nextopenbacktick==nextOpenBracket-1){
                break;
            }**/
            if(nextOpenBracket == -1 || nextCloseBracket == -1
            || closeParen == -1 || openParen == -1) {
            return toReturn;
            }
            System.out.println(nextOpenBracket);
            if(nextOpenBracket==0||markdown.charAt(nextOpenBracket-1) != '!'&&
            markdown.charAt(nextOpenBracket-1) != '`'){
                toReturn.add(markdown.substring(openParen + 1, closeParen));
            }
            //String output=markdown.substring(nextOpenCarrot + 1, nextCloseCarrot);
           // System.out.println(output);
           // toReturn.add(output);
            
        }
        
        System.out.println(currentIndex);
        int test = markdown.indexOf("]");
        System.out.println(test);
        return toReturn;
    }
    public static void main(String[] args) throws IOException {
		Path fileName = Path.of(args[0]);
	    String contents = Files.readString(fileName);
        ArrayList<String> links = getLinks(contents);
        System.out.println(links);
    }
}