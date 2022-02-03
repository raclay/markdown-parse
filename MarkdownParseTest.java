import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
/*
    @Test
    public void testing1() throws IOException{
        Path fileName = Path.of("test1.md");
        String contents = Files.readString(fileName);

        assertEquals(List.of("www.google.com", "www.google.com"), MarkdownParse.getLinks(contents));
    }

    @Test
    public void testing2() throws IOException{
        Path fileName = Path.of("test2.md");
        String contents = Files.readString(fileName);

        assertEquals(List.of("www.google.com", "www.google.com", "www.google.com"), MarkdownParse.getLinks(contents));
    }
    
    @Test
    public void links() throws IOException {

		Path fileName = Path.of("test-file.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List<String> output = List.of("https://something.com", "some-page.html");
        assertEquals(output, links);
    }
*/
   
}
