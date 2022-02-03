import static org.junit.Assert.*;

import java.nio.file.Files;
import java.nio.file.Path;

import javax.swing.text.AttributeSet.ParagraphAttribute;

import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    @Test
    public void checkContent(){
        //boolean contain=false;

        //List.of("https://something.com","some-page.html")

        try {
            Path filePath=Path.of("empty.md");
            String content=Files.readString(filePath);
            assertEquals("",content);
            System.out.println(content);
        } catch (Exception e) {
            System.out.println(e.toString());
            //contain=true;
        }
    }
    @Test
    public void jTestPlat() {
     
        try {
            Path filePath = Path.of("test-file3.md");
            String contents = Files.readString(filePath);
         
        } catch(Exception e) {
             System.out.println(e.toString());
        }
    }
    
}