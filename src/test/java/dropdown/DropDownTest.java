package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDownTest extends BaseTests {

    @Test
    public void testSelectOption(){
        var dropDownPage = homepage.clickDropDown();
        String option = "Option 1";
        dropDownPage.selectDropDown(option);
        var selectOptions = dropDownPage.getSelectedOptions();
        assertEquals(selectOptions.size(), 1,
                "Incorrect number of selection");
        assertTrue(selectOptions.contains(option), "Option not selected");
    }

}
