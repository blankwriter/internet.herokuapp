package horizontalslider;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HorizontalSliderTest extends BaseTests {

    @Test
    public void testHorizontalSlider() {
        var horizontalPage = homepage.clickHorizontalSlider();
//        horizontalPage.ClickSlider();
        horizontalPage.setSliderTo(3.5);
        Assert.assertEquals(horizontalPage.getSliderValue(), "3.5", "Incorrect test");
    }
}
