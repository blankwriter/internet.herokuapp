package frames;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FrameTests extends BaseTests {

    @Test
    public void testWysiwy(){
        var Wysiwy = homepage.clickWYSIWYGEditor();
        Wysiwy.clearTextArea();
        Wysiwy.setTextArea("Hello");
        Wysiwy.decreaseIndention();
        Wysiwy.setTextArea("World");
        Assert.assertEquals(Wysiwy.getTextArea(), "Hello World", "Test failed thus error");
    }
}
