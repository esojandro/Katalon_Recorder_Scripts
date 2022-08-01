import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.testobject.SelectorMethod

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join
import org.testng.asserts.SoftAssert
import com.kms.katalon.core.testdata.CSVData
import org.openqa.selenium.Keys as Keys

SoftAssert softAssertion = new SoftAssert();
WebUI.openBrowser('https://www.google.com/')
def driver = DriverFactory.getWebDriver()
String baseUrl = "https://www.google.com/"
selenium = new WebDriverBackedSelenium(driver, baseUrl)
selenium.open("http://opencart.abstracta.us/index.php?route=common/home")
selenium.click("link=My Account")
selenium.click("link=Login")
selenium.open("https://opencart.abstracta.us/index.php?route=account/login")
selenium.click("id=input-email")
selenium.type("id=input-email", ("mail@email.com").toString())
selenium.click("id=input-password")
selenium.type("id=input-password", "pass123")
selenium.click("xpath=//input[@value='Login']")
selenium.click("xpath=//div[@id='top-links']/ul/li[2]/a/span[2]")
selenium.click("link=Register")
selenium.open("https://opencart.abstracta.us/index.php?route=account/register")
selenium.click("id=input-firstname")
selenium.type("id=input-firstname", "Brand")
selenium.click("id=input-lastname")
selenium.type("id=input-lastname", "Dovarn")
selenium.click("id=input-email")
selenium.type("id=input-email", ("mail@email.com").toString())
selenium.click("id=input-telephone")
selenium.type("id=input-telephone", "96857423")
selenium.click("id=input-password")
selenium.type("id=input-password", "pas123")
selenium.click("id=input-confirm")
selenium.type("id=input-confirm", "pas123")
selenium.click("name=newsletter")
selenium.click("name=agree")
selenium.click("xpath=//input[@value='Continue']")
selenium.open("http://opencart.abstracta.us/index.php?route=account/success")
selenium.click("link=Continue")
selenium.open("https://opencart.abstracta.us/index.php?route=account/account")
selenium.click("link=My Account")
selenium.click("link=Logout")
selenium.open("https://opencart.abstracta.us/index.php?route=account/logout")
selenium.click("link=Continue")
selenium.open("http://opencart.abstracta.us/index.php?route=common/home")
selenium.click("xpath=//div[@id='top-links']/ul/li[2]/a/span")
selenium.click("link=Login")
selenium.open("https://opencart.abstracta.us/index.php?route=account/login")
selenium.click("id=input-email")
selenium.type("id=input-email", ("mail@email.com").toString())
selenium.click("id=input-password")
selenium.type("id=input-password", "pas123")
selenium.click("xpath=//input[@value='Login']")
selenium.open("https://opencart.abstracta.us/index.php?route=account/account")
selenium.click("link=Monitors (2)")
selenium.open("http://opencart.abstracta.us/index.php?route=product/category&path=25_28")
selenium.click("xpath=//div[@id='content']/div[3]/div/div/div[2]/div[2]/button/span")
selenium.open("http://opencart.abstracta.us/index.php?route=product/product&product_id=42")
selenium.click("xpath=//div[@id='content']/div/div[2]/div/button/i")
selenium.click("xpath=//div[@id='top-links']/ul/li[4]/a/span")
selenium.open("http://opencart.abstracta.us/index.php?route=checkout/cart")
selenium.open("http://opencart.abstracta.us/index.php?route=checkout/cart")
selenium.click("xpath=//div[@id='top-links']/ul/li[2]")
selenium.click("link=My Account")
selenium.click("link=Logout")
selenium.open("https://opencart.abstracta.us/index.php?route=account/logout")
selenium.click("link=Continue")
selenium.open("http://opencart.abstracta.us/index.php?route=common/home")
