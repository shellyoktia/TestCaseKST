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

WebUI.navigateToUrl('http://localhost:3001/login')

WebUI.setText(findTestObject('Object Repository/Page_SKT ERP  ERP/Login/input_login_username'), 'devshelly')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_SKT ERP  ERP/Login/input_login_password'), 'bD8Rq1FIAurX2vfab/lFTQ==')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_SKT ERP  ERP/Login/button_login'))

WebUI.click(findTestObject('Object Repository/Page_SKT ERP  ERP/Tab Sales/Tab Sales'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Release Sales Order/Tab Release Sales Order'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Release Sales Order/Button Filters'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Release Sales Order/Filters by No SO'))

//String noSalesOrder = GlobalVariable.noSalesOrderBoxLayer

String noSalesOrder = 'dkdkkdkdlmlwkkw'

String whitelist = 'Tidak bisa release so line, karena ada pembayaran telat'
String approval = 'Request telah berhasil dibuat. Silahkan tunggu approval'
String expense = 'expense per kg < benchmark, pls ask selling price appro'

WebUI.setText(findTestObject('Page_SKT ERP  ERP/Tab Sales/Release Sales Order/Filters by No SO'), noSalesOrder)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Release Sales Order/button Search in Filters'))

WebUI.scrollToElement(findTestObject('Page_SKT ERP  ERP/Tab Sales/Release Sales Order/button Search in Filters'), 30)

WebUI.delay(5)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Release Sales Order/Release'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Release Sales Order/button Ya for Release Sales Order'))

WebUI.scrollToElement(findTestObject('Page_SKT ERP  ERP/Tab Sales/Release Sales Order/Assign'), 30)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Release Sales Order/Assign'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Release Sales Order/button_Ya'))

WebUI.delay(3)

String alert = WebUI.getText(findTestObject('percobaan/alert')).substring(0,55)

WebUI.comment(alert)

if(alert == whitelist){
	WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Tab Sales'))
	
	WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Whitelist Release SPK (bypass payment delay)/Tab Whitelist Release SPK (bypass payment delay)'))
	
	WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Whitelist Release SPK (bypass payment delay)/Approve'))
	
	WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Whitelist Release SPK (bypass payment delay)/button Ya for Approve'))
}else if (alert == approval){
	WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Release Sales Order - Approval/Tab Release Sales Order - Approval'))
	
	WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Release Sales Order - Approval/Approve'))
	
	WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Release Sales Order - Approval/button Ya for Approve'))
}
WebUI.delay(15)

WebUI.closeBrowser()

