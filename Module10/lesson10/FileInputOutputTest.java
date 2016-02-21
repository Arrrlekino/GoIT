package ua.alla.lesson10;

/**
 * Created by Arlekino on 2/21/2016.
 */
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import static lesson10.files.FileInputOutput.readFromFile;

public class FileInputOutputTest {

    @Test
    public void testReadWriteToFile() throws Exception {
        ArrayList<String> text = new ArrayList<>();
        text.add("testWrite1");
        text.add("testWrite2");

        FileInputOutput.writeToFile("readmeTestWriteToFile.txt", text);

        Assert.assertArrayEquals(text.toArray(), readFromFile("readmeTestWriteToFileEthalone.txt").toArray());

    }
}
