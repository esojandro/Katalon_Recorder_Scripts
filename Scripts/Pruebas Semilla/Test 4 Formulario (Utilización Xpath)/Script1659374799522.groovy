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
selenium.open("https://demoqa.com/")
selenium.click("css=path")
selenium.click("xpath=(//div[contains(@class,'card-up')])[1]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Forms'])[1]/following::span[1]")
selenium.click("id=firstName")
selenium.type("id=firstName", "M")
selenium.click("id=lastName")
selenium.type("id=lastName", "R")
selenium.click("id=userEmail")
selenium.type("id=userEmail", ("no email fail").toString())
selenium.click("xpath=//div[@id='genterWrapper']/div[2]/div[3]/label")
selenium.click("id=userNumber")
selenium.type("id=userNumber", "lestters")
selenium.click("id=dateOfBirthInput")
selenium.click("xpath=//div[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[5]")
selenium.click("xpath=//div[@id='subjectsContainer']/div/div")
selenium.type("id=subjectsInput", "karkarta")
selenium.click("xpath=//div[@id='hobbiesWrapper']/div[2]/div/label")
selenium.click("xpath=//div[@id='subjectsContainer']/div/div")
selenium.click("id=currentAddress")
selenium.type("id=currentAddress", ("12312312lettes***/*-+").toString())
selenium.click("id=state")
selenium.click("id=react-select-3-option-0")
selenium.click("id=city")
selenium.click("id=react-select-4-option-2")
selenium.click("id=state")
selenium.click("id=react-select-3-option-3")
