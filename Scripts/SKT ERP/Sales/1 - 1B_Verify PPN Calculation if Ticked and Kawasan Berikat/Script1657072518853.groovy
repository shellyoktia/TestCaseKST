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

WebUI.click(findTestObject('Object Repository/Page_SKT ERP  ERP/Tab Sales/Sales Order/Tab Sales Order'))

WebUI.click(findTestObject('Object Repository/Page_SKT ERP  ERP/Tab Sales/Sales Order/Add New Sales Order'))

WebUI.setText(findTestObject('Page_SKT ERP  ERP/Tab Sales/Sales Order/Input No Sales Order'), 'kawasan berikat')

WebUI.setText(findTestObject('Object Repository/Page_SKT ERP  ERP/Tab Sales/Sales Order/Input Sales Person'), 'sujadi')

WebUI.delay(3)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Constant/Sales/303 - Sujadi'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Sales Order/Customer Field'))

WebUI.setText(findTestObject('Page_SKT ERP  ERP/Tab Sales/Sales Order/Input Customer'), 'sukajadi')

WebUI.delay(3)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Constant/Customer/PT SUKAJADI SAWIT MEKAR'))

WebUI.verifyElementChecked(findTestObject('Page_SKT ERP  ERP/Tab Sales/Sales Order/Kawasan Berikat Checkbox'), 30)

WebUI.scrollToElement(findTestObject('Page_SKT ERP  ERP/Tab Sales/Sales Order/Billing Address Field'), 3)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Sales Order/Billing Address Field'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Constant/Address/Billing Address PT Sukajadi Sawit Mekar (SPRING TOWER. 06-62 JL TANJUNG MULIA MEDAN DELI, M)'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Sales Order/Shipping Address Field'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Constant/Address/Shipping Address PT Sukajadi Sawit Mekar'))

WebUI.click(findTestObject('Object Repository/Page_SKT ERP  ERP/Tab Sales/Sales Order/i_tambah item'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Sales Order/Type Field'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Sales Order/Tipe Box'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Sales Order/MasterCard Field'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Constant/Mastercard/PT Sukajadi Sawit Mekar (9102 - 006087-R1 - CARTON M M 1L (SNI-VITAMIN A)'))

WebUI.setText(findTestObject('Page_SKT ERP  ERP/Tab Sales/Sales Order/Min Tolerance'), '5')

WebUI.setText(findTestObject('Page_SKT ERP  ERP/Tab Sales/Sales Order/Max tolerance'), '5')

String qty = '59'

WebUI.setText(findTestObject('Page_SKT ERP  ERP/Tab Sales/Sales Order/Input Quantity'), qty)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Sales Order/Unit Field'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Sales Order/Unit Pcs'))

String price = '190000'

WebUI.setText(findTestObject('Page_SKT ERP  ERP/Tab Sales/Sales Order/Input Harga'), price)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Sales Order/Input Tanggal Kirim'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Sales Order/Tanggal 30'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Sales Order/Save Sales Order Line'))

String ppn = WebUI.getAttribute(findTestObject('Page_SKT ERP  ERP/Tab Sales/Sales Order/PPN Values'), 'value')

String expected_ppn = '0'

int expectedPpn = Integer.parseInt(qty)
WebUI.comment('actual ppn = ' + ppn)
WebUI.comment('expected ppn = ' + expected_ppn)

WebUI.verifyMatch(ppn, expected_ppn, false)

//String subtotal = WebUI.getAttribute(findTestObject('Page_SKT ERP  ERP/Tab Sales/Sales Order/Subtotal Values'), 'value')
//
//int quantity = Integer.parseInt(qty)
//
//int harga = Integer.parseInt(price)
//
//int expected_subtotal = (quantity * harga)
//
//String expectedSubtotal = expected_subtotal
//WebUI.comment('actual subtotal = ' + subtotal)
//WebUI.comment('expected subtotal = ' + expectedSubtotal)
//WebUI.verifyMatch(subtotal, expectedSubtotal, false)
//
//String JumlahTotal = WebUI.getText(findTestObject('Page_SKT ERP  ERP/Tab Sales/Sales Order/Jumlah Total Values')).replace(
//	'.', '')
//
//String jumlah = JumlahTotal.substring(15)
//
//int expected_jumlah = expected_subtotal + expectedPpn
//
//String expectedJumlah = expected_jumlah
//WebUI.comment('actual jumalh = ' + jumlah)
//WebUI.comment('expected jumlah = ' + expectedJumlah)
//WebUI.verifyMatch(jumlah, expectedJumlah, false)

WebUI.closeBrowser()

