package hover;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoverTest extends BaseTests {

    @Test
    public void testHoverUser1(){
        var hoverPage = homepage.clickHoverlink();
        var caption = hoverPage.hoverOverFigure(1);
        Assert.assertTrue(caption.isCaptionDisplayed(), "Caption not displayed");
        Assert.assertEquals(caption.getTitle(), "name: user1", " Caption title not correct");
        Assert.assertEquals(caption.getLinkText(), "View profile", "Link text not correct");
        Assert.assertTrue(caption.getlink().endsWith("/users/1"), "Link not correct");
    }
}
