package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Driver;

public class TestotomasyonuPage {

    @FindBy(id = "global-search")
    public WebElement aramaKutusu;

    @FindBy (className = "product-count-text")
    public WebElement aramaSonucElementi;

    @FindBy(xpath = "(//*[@class='prod-img'])[1]")
    public WebElement ilkUrunElementi;

    @FindBy(xpath = "//div[@class=' heading-sm mb-4']")
    public WebElement ilkUrunSayfasindakiIsimElementi;


}