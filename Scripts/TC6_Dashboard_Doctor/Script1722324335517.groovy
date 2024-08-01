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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://staffhub-dev.encoremed.io/pah/auth/login')

WebUI.setText(findTestObject('Object Repository/Dashboard Page Objects/Username field'), 'ishlah123')

WebUI.setEncryptedText(findTestObject('Object Repository/Dashboard Page Objects/Password field'), 'E4R6hhCOZnTg7fXxe3fZGQ==')

WebUI.click(findTestObject('Object Repository/Dashboard Page Objects/span_Login'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard Page Objects/span_Doctor'))

WebUI.click(findTestObject('Object Repository/Dashboard Page Objects/span_Doctor'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard Page Objects/span_New Doctor'))

WebUI.closeBrowser()

