package tests.day13_testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TestotomasyonuPage;
import utilities.Driver;

public class C06_PageClassKullanimi {

    public class C05_DependsOnMethods {

        // 3 farkli test methodu olusturup, asagidaki gorevleri yapin
        // 1- testotomasyonu anasayfaya gidip url'in testotomasyonu icerdigini test edin
        // 2- phone icin arama yapip urun bulunabildigini test edin
        // 3- ilk urunu tiklayip, urun isminde case sensitive olmadan "phone" bulundugunu test edin
        TestotomasyonuPage testotomasyonuPage = new TestotomasyonuPage();

        @Test
        public void anasayfaTesti() {

            // 1- testotomasyonu anasayfaya gidip
            Driver.getDriver().get("https://www.testotomasyonu.com");

            // url'in testotomasyonu icerdigini test edin
            String expectedUrlIcerik = "testotomasyonu";
            String actualUrlIcerik = Driver.getDriver().getCurrentUrl();

            Assert.assertTrue(actualUrlIcerik.contains(expectedUrlIcerik));

        }

        @Test(dependsOnMethods = "anasayfaTesti")
        public void phoneAramaTesti(){
            // 2- phone icin arama yapip

            testotomasyonuPage.aramaKutusu.sendKeys("phone"+ Keys.ENTER);


            // urun bulunabildigini test edin

            String unExpectedSonuc = "0 Products Found";
            String actualSonuc = testotomasyonuPage.aramaSonucElementi.getText();

            Assert.assertNotEquals(actualSonuc, unExpectedSonuc);


        }

        @Test(dependsOnMethods = "phoneAramaTesti")
        public void ilkurunIsimTesti(){
            // 3- ilk urunu tiklayip,
            testotomasyonuPage.ilkUrunElementi
                    .click();


            // urun isminde case sensitive olmadan "phone" bulundugunu test edin

            String expectedIsimIcerik = "phone";
            String actualUrunIsmi = testotomasyonuPage.ilkUrunSayfasindakiIsimElementi
                    .getText()
                    .toLowerCase();

            Assert.assertTrue(actualUrunIsmi.contains(expectedIsimIcerik));

            Driver.quitDriver();

        }
    }
}