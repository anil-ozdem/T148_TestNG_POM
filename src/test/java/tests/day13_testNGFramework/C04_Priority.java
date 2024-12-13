package tests.day13_testNGFramework;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C04_Priority {

    // uc farkli test method'u olusturun
    // testotomasyonu, wisequarter ve bestbuy sitelerine gidip
    // url'in bu kelimeleri icerdigini test edin
    // ve windowlari kapatin

    /*
        TestNG biz bir sey soylemediysek
        test method'larini alfabetik siraya uygun olarak calistirir

        1- biz test method'larina priority tanimlarsak
           priority degerlerini kucukten buyuge dogru calistirir
     */

    @Test(priority = 1)
    public void testotomasyonuTest() {

        Driver.getDriver().get("https://www.testotomasyonu.com");

        String expectedUrlIcerik = "testotomasyonu";
        String actualUrl = Driver.driver.getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedUrlIcerik));
        Driver.quitDriver();

    }

    @Test(priority = 2)
    public void wisequarterTest() {

        Driver.getDriver().get("https://www.wisequarter.com");

        String expectedUrlIcerik = "wisequarter";
        String actualUrl = Driver.driver.getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedUrlIcerik));
        Driver.quitDriver();


    }

    @Test(priority = 3)
    public void bestbuy() {

        Driver.getDriver().get("https://www.bestbuy.com");

        String expectedUrlIcerik = "bestbuy";
        String actualUrl = Driver.driver.getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedUrlIcerik));
        Driver.quitDriver();
    }

}
