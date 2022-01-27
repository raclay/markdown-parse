import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testingMarkdownParse() throws IOException{
        Path testingMD = Path.of("test1.md");
        String contents = Files.readString(testingMD);

        assertEquals(List.of("www.google.com", "www.google.com"), MarkdownParse.getLinks(contents));
    }


}
