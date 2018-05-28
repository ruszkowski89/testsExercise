package michal.ruszkowski89;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import java.io.File;
import java.util.ArrayList;

@RunWith(JUnit4.class)
public class FileParserTest {
    private FileParser fileParser = new FileParser();
    private String filePath = "";

    @Before
    public void setUp(){
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("testfile.txt").getFile());
        filePath = file.getAbsolutePath();
    }

    @Test
    public void parseFileShouldReturnPopulatedArrayList(){
        ArrayList<String[]> textLines = fileParser.parseFile(filePath);

        assertEquals(textLines.size() ,5);
    }

    @Test
    public void parseFileReturnsCorrectOperationLines(){
        ArrayList<String[]> textLines = fileParser.parseFile(filePath);

        assertEquals("add", (textLines.get(1))[0]);
        assertEquals("10", (textLines.get(1))[1]);
        assertEquals("apply", (textLines.get(4))[0]);
        assertEquals("20", (textLines.get(4))[1]);
    }

    @Test
    public void splitLineShouldReturnTwoStrings(){
        String lineToSplit = "add 10";

        assertEquals("add", fileParser.splitLine(lineToSplit)[0]);
        assertEquals("10", fileParser.splitLine(lineToSplit)[1]);
    }

}