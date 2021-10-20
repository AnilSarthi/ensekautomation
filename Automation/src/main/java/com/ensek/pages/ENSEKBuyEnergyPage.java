package com.ensek.pages;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class ENSEKBuyEnergyPage {
    // *************************  Locators


    // Reset Button on Buy Energy Page
    private final By RESET_BUTTON = By.cssSelector("[name='Reset']");

    // Discount message
    private final By DISCOUNT_MSG = By.cssSelector(".well h3");

    //To verify Headers in following sequence [Energy Type, Price, Quanity of Units Available, Number of Units Required,]
    private final By TABLE_HEADER = By.xpath("//table//th");

    // Energy  Prices
    private final By GAS_PRICE = By.xpath("//td[.='Gas']//following-sibling::td[1]");
    private final By NUCLEAR_PRICE = By.xpath("//td[.='Nuclear']//following-sibling::td[1]");
    private final By ELECTRICITY_PRICE = By.xpath("//td[.='Electricity']//following-sibling::td[1]");
    private final By OIL_PRICE = By.xpath("//td[.='Oil']//following-sibling::td[1]");

    // Energy  Available Quantity
    private final By GAS_AVAILABLE_QUANTITY = By.xpath("//td[.='Gas']//following-sibling::td[2]");
    private final By NUCLEAR_AVAILABLE_QUANTITY = By.xpath("//td[.='Nuclear']//following-sibling::td[2]");
    private final By ELECTRICITY_AVAILABLE_QUANTITY = By.xpath("//td[.='Electricity']//following-sibling::td[2]");
    private final By OIL_AVAILABLE_QUANTITY = By.xpath("//td[.='Oil']//following-sibling::td[2]");

    // Energy  Number of Units Required
    private final By GAS_NO_OF_UNIT_INPUT_TEXT = By.xpath("//td[.='Gas']//following-sibling::td//input[@type='submit']");
    private final By NUCLEAR_NO_OF_UNIT_INPUT_TEXT = By.xpath("//td[.='Nuclear']//following-sibling::td//input[@type='submit']");
    private final By ELECTRICITY_NO_OF_UNIT_INPUT_TEXT = By.xpath("//td[.='Electricity']//following-sibling::td//input[@type='submit']");
    private final By OIL_NO_OF_UNIT_INPUT_TEXT = By.xpath("//td[.='Oil']//following-sibling::td//input[@type='submit']");

    // Energy Buy Buttons
    private final By GAS_BUY_BUTTON = By.xpath("//td[.='Gas']//following-sibling::td//input[@type='submit']");
    private final By NUCLEAR_BUY_BUTTON = By.xpath("//td[.='Nuclear']//following-sibling::td//input[@type='submit']");
    private final By ELECTRICITY_BUY_BUTTON = By.xpath("//td[.='Electricity']//following-sibling::td//input[@type='submit']");
    private final By OIL_BUY_BUTTON = By.xpath("//td[.='Oil']//following-sibling::td//input[@type='submit']");


}
