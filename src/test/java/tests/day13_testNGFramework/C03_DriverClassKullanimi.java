package tests.day13_testNGFramework;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C03_DriverClassKullanimi {

    // uc farkli test method'u olusturun
    // testotomasyonu, wisequarter ve bestbuy sitelerine gidip
    // url'in bu kelimeleri icerdigini test edin
    // ve windowlari kapatin

    @Test
    public void testotomasyonuTest() {

        Driver.getDriver().get("https://www.testotomasyonu.com");

        String expectedUrlIcerik = "testotomasyonu";
        String actualUrl = Driver.driver.getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedUrlIcerik));
        Driver.quitDriver();

    }

    @Test
    public void wisequarterTest() {

        Driver.getDriver().get("https://www.wisequarter.com");

        String expectedUrlIcerik = "wisequarter";
        String actualUrl = Driver.driver.getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedUrlIcerik));
        Driver.quitDriver();


    }

    @Test
    public void bestbuy() {

        Driver.getDriver().get("https://www.bestbuy.com");

        String expectedUrlIcerik = "bestbuy";
        String actualUrl = Driver.driver.getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedUrlIcerik));
        Driver.quitDriver();
    }
}