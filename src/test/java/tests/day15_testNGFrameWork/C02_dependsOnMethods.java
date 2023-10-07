package tests.day15_testNGFrameWork;

import com.fasterxml.jackson.databind.deser.DataFormatReaders;
import org.testng.annotations.Test;
import utilities.Driver;

public class C02_dependsOnMethods {
    @Test
    public void amazonTest() {
        Driver.getDriver().get("https://www.amazon.com");

    }
}
