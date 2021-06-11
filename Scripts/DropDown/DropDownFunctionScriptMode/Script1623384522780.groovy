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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('http://localhost:5001/')

WebUI.delay(GlobalVariable.delayTime)

WebUI.click(findTestObject('Bugzilla/HomePage/FileBugLink'))

WebUI.delay(GlobalVariable.delayTime)

WebUI.sendKeys(findTestObject('Bugzilla/LoginPage/UsernameTxtBox'), 'ridhan.fadhilah@sg-edts.com')

WebUI.sendKeys(findTestObject('Bugzilla/LoginPage/PasswordTxtBox'), 'bugzilla')

WebUI.click(findTestObject('Bugzilla/LoginPage/LoginBtn'))

WebUI.delay(GlobalVariable.delayTime)

WebUI.selectOptionByIndex(findTestObject('Bugzilla/EnterBugDetailScreen/Severity'), 5)

WebUI.selectOptionByLabel(findTestObject('Bugzilla/EnterBugDetailScreen/Component'), 'TestComponent', false)

WebUI.selectOptionByValue(findTestObject('Bugzilla/EnterBugDetailScreen/Hardware'), 'PC', false)

int a = WebUI.getNumberOfTotalOption(findTestObject('Object Repository/Bugzilla/EnterBugDetailScreen/Severity'))

String path = WebUI.takeScreenshot()

WebUI.takeScreenshot('D:/TMT-Q1-QA/week10 - Katalon/KatalonProjects/SeleniumAutomation/Screenshots/screenshot.png')

WebUI.delay(3)

WebUI.click(findTestObject('Bugzilla/HomePage/LogoutBtn'))

WebUI.delay(3)

WebUI.closeBrowser()

