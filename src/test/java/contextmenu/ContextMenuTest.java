package contextmenu;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenuTest extends BaseTests {

    @Test
    public void contextTest(){
        var contextMenu = homepage.clickContextMenu();
        contextMenu.rightClickBox();
        Assert.assertEquals(contextMenu.displayMessage(), "You selected a context menu",
                "Did not view context menu");
        contextMenu.pressOk();
    }
}
