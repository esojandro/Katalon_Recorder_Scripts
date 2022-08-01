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
CSVData data_0 = findTestData("test15_data.csv")
for (def index in (0..data_0.getRowNumbers() - 1)) {
def Comment = data_0.internallyGetValue("Comment", index)

selenium.open("https://katalon-demo-cura.herokuapp.com/")
selenium.click("xpath=//a[@id='menu-toggle']/i")
selenium.click("link=Login")
selenium.click("id=txt-username")
selenium.type("id=txt-username", ("John Doe").toString())
selenium.click("id=txt-password")
selenium.click("xpath=//section[@id='login']/div/div/div[2]/form/div[3]")
selenium.type("id=txt-password", "ThisIsNotAPassword")
selenium.click("xpath=//section[@id='login']/div/div/div[2]/form/div[3]/label")
selenium.click("id=btn-login")
selenium.click("id=txt_visit_date")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Sa'])[1]/following::td[25]")
selenium.click("id=txt_comment")
selenium.type("id=txt_comment", (Comment).toString())
selenium.click("id=btn-book-appointment")
selenium.click("xpath=//a[@id='menu-toggle']/i")
selenium.click("link=Logout")
}