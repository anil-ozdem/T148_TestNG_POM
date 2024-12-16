package tests.day14_testNGFramework_assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TestotomasyonuPage;
import utilities.Driver;

public class C04_PositiveLoginTesti {
    TestotomasyonuPage testotomasyonuPage = new TestotomasyonuPage();

    @Test
    public void positiveLoginTesti() {
        /*
            Testlerimizi DINAMIK yapmak
            ve test datalarina KOLAY ERISMEK icin
            test datalarini configuration.properties dosyasina yazip
            ihtiyacimiz oldugunda oradan almak istiyoruz

            Java ile o bilgilere ulasmak icin
            once dosya yolunu almamiz
            sonra oradaki bilgileri okumamiz
            bilgiler icerisinde ihtiyacimiz olan "toUrl", "toGecerliEmail"
            gibi bilgileri diger bilgilerden ayirip
            alip bu test class'ina getirmemiz tek satirla olabilecek bir islem degildir

            Bu uzun islemi bizim adimiza yapip
            verdigimiz "toUrl", "toGecerliEmail" gibi key'lerin
            karisindaki value'leri alip bize getirecekhazir bir method olusturalim
         */

        //1- https://www.testotomasyonu.com/ anasayfasina gidin
        Driver.getDriver().get("https://www.testotomasyonu.com/");

        //2- account linkine basin
        testotomasyonuPage.accountLinki.click();

        // 3- Kullanici email'i olarak gecerli email girin
        testotomasyonuPage.emailKutusu.sendKeys("wise@gmail.com");

        // 4- Kullanici sifresi olarak gecerli password girin
        testotomasyonuPage.passwordKutusu.sendKeys("12345");

        // 5- Login butonuna basarak login olun
        testotomasyonuPage.loginButonu.click();

        // 6- Basarili olarak giris yapilabildigini test edin
        Assert.assertTrue(testotomasyonuPage.logoutButonu.isDisplayed());

        // logout olun
        testotomasyonuPage.logoutButonu.click();


    }
}
