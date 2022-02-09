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

WebUI.navigateToUrl('http://localhost:3001/login?expired=1')

WebUI.setText(findTestObject('Object Repository/Page_SKT ERP  ERP/input_login_username'), 'devshelly')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_SKT ERP  ERP/input_login_password'), 'bD8Rq1FIAurX2vfab/lFTQ==')

WebUI.click(findTestObject('Object Repository/Page_SKT ERP  ERP/button_login'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_SKT ERP  ERP/div_Sales'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/a_Release Sales Order - Approval'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Approve the latest SO Button'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/button_Ya'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/div_Production'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/a_Work Order (SPK)'))

String value = WebUI.getText(findTestObject('Page_SKT ERP  ERP/ValueOfWorkOrderFirstRow'))

WebUI.comment(value)

WebUI.verifyMatch(value, 'scheduled', true)

