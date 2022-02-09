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

WebUI.click(findTestObject('Object Repository/Page_SKT ERP  ERP/div_Sales'))

WebUI.click(findTestObject('Object Repository/Page_SKT ERP  ERP/a_Sales Order'))

WebUI.click(findTestObject('Object Repository/Page_SKT ERP  ERP/button_Add'))

WebUI.setText(findTestObject('Object Repository/Page_SKT ERP  ERP/input_No Sales Order_noSalesorder'), '0165/PO/BKI/II/22')

WebUI.setText(findTestObject('Page_SKT ERP  ERP/Sales Person Field'), 'sujadi')

WebUI.delay(10)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Select Sales Person'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Customer Field'))

WebUI.setText(findTestObject('Page_SKT ERP  ERP/Input Customer Field'), 'beauty')

WebUI.delay(5)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Select Customer'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Billing Address Field'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Select Billing Address'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Default Shipping Address'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Select Default Shipping Address'))

WebUI.verifyElementChecked(findTestObject('Page_SKT ERP  ERP/PPN Checkbox'), 30)

WebUI.click(findTestObject('Page_SKT ERP  ERP/i_tambah item'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Type Field'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Select Type'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Master Card Field'))

WebUI.setText(findTestObject('Page_SKT ERP  ERP/Input Master Card'), '5157')

WebUI.delay(5)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Select Master Card'))

WebUI.setText(findTestObject('Page_SKT ERP  ERP/input_Min Tolerance ()_ant-input-number-input'), '5')

WebUI.setText(findTestObject('Page_SKT ERP  ERP/input_Max Tolerance ()_ant-input-number-input'), '5')

WebUI.setText(findTestObject('Page_SKT ERP  ERP/Input Quantity'), '5')

WebUI.click(findTestObject('Page_SKT ERP  ERP/Unit Field'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Select Unit'))

WebUI.setText(findTestObject('Page_SKT ERP  ERP/input_Harga_ant-input-number-input'), '7300')

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tanggal Kirim Field'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Select Tanggal Kirim'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/button_Save'))

String subtotal = WebUI.getAttribute(findTestObject('Page_SKT ERP  ERP/Subtotal Value'), 'value')

WebUI.comment(subtotal)

String ppn = WebUI.getAttribute(findTestObject('Page_SKT ERP  ERP/PPN Value'), 'value')

WebUI.comment(ppn)

Double numberSubtotal = Double.parseDouble(subtotal)

Double numberPPN = Double.parseDouble(ppn)

Double hasilPPN = (numberSubtotal * 10) / 100

if (WebUI.verifyElementChecked(findTestObject('Page_SKT ERP  ERP/PPN Checkbox'), 30)) {
    if (hasilPPN == numberPPN) {
        WebUI.comment('sama')
    } else {
        WebUI.comment('tidak sama')
    }
}

WebUI.takeFullPageScreenshot()

