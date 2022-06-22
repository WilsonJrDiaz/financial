import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable

import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.WebElement as Keys



WebUI.openBrowser("")
WebUI.maximizeWindow()
WebUI.navigateToUrl('https://www.demoblaze.com/')
WebDriver driver = DriverFactory.getWebDriver()
//WebUI.delay(2)
WebUI.waitForElementPresent(findTestObject('Object Repository/btnLogin'), 3)


WebUI.click(findTestObject('Object Repository/btnLogin'))

WebUI.setText(findTestObject('Object Repository/inputUser'), user)
WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/inputPassword'), pass)
WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/btnToLogin'))
WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/categoriesMonitors'))


boolean m1 = WebUI.verifyElementPresent(findTestObject("monitor_1"), 1, FailureHandling.OPTIONAL)
WebUI.comment("Monitor 1=${m1}")
println '${m1} existe'

boolean m2 = WebUI.verifyElementPresent(findTestObject("monitor_2"), 1, FailureHandling.OPTIONAL)
WebUI.comment("Monitor 2=${m2}")
println '${m2} existe'


boolean exist = m1 || m2
WebUI.comment("there are two elements?=${exist}")


WebUI.click(findTestObject('Object Repository/categoriesPhones'))
WebUI.delay(2)


//List<WebElement> cels = driver.findElements(By.xPath("/html/body/div[5]/div/div[2]/div/div/div//h4/a"))
//
//println(cels.size())
//
//for (WebElement el : cels) {
//	println(el.getText())
//}  


WebUI.click(findTestObject('Object Repository/btnToLogout'))
WebUI.delay(2)


WebUI.closeBrowser()
//
//WebUI.waitForElementPresent(findTestObject('Object Repository/inputPassword'), 3)
//
//WebUI.click(findTestObject('Object Repository/inputPassword'))
//
//WebUI.delay(2)
//
//WebUI.waitForElementPresent(findTestObject('Object Repository/btnToLogin'), 3)
//
//
//println 'Objectc is Present'
//
//WebUI.click(findTestObject('Object Repository/categoriesMonitors'))
//WebUI.delay(10)
//
//WebUI.closeBrowser()