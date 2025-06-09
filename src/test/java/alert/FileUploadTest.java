package alert;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTest extends BaseTests {

    @Test
    public void fileUploadTest(){
        var fileTest = homepage.clickFileUpload();
        fileTest.uploadFile("/Users/princejohn/Downloads/s-l1600 (2).webp");
        Assert.assertEquals(fileTest.displayUpload(), "s-l1600 (2).webp", "String message");
    }
}
