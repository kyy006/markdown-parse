import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MarkdownParseTest {
    @Test
    public void testFile1() throws IOException {
        String contents= Files.readString(Path.of("./Snippet1.md"));
        List<String> expect = List.of("`google.com", "google.com","ucsd.edu");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }
    @Test
    public void testFile2() throws IOException {
        String contents= Files.readString(Path.of("./Snippet1.md"));
        List<String> expect = List.of("`google.com", "google.com","ucsd.edu");
        assertEquals(MarkdownParse3.getLinks(contents), expect);
    }

    


    @Test
    public void testFile3() throws IOException {
        String contents= Files.readString(Path.of("./Snippet2.md"));
        List<String> expect = List.of("a.com", "a.com(())","example.com");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }
    @Test
    public void testFile4() throws IOException {
        String contents= Files.readString(Path.of("./Snippet2.md"));
        List<String> expect = List.of("a.com", "a.com(())","example.com");
        assertEquals(MarkdownParse3.getLinks(contents), expect);
    }




    @Test
    public void testFile5() throws IOException {
        String contents= Files.readString(Path.of("./Snippet3.md"));
        List<String> expect = List.of("https://www.twitter.com", 
        "https://ucsd-cse15l-w22.github.io/","https://cse.ucsd.edu/");
        assertEquals(MarkdownParse3.getLinks(contents), expect);
    }
    @Test
    public void testFile6() throws IOException {
        String contents= Files.readString(Path.of("./Snippet3.md"));
        List<String> expect = List.of("https://www.twitter.com", 
        "https://ucsd-cse15l-w22.github.io/","https://cse.ucsd.edu/");
        assertEquals(MarkdownParse3.getLinks(contents), expect);
    }







}