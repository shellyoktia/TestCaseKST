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

WebUI.setText(findTestObject('Page_SKT ERP  ERP/Tab Sales/Sales Order/Input No Sales Order'), '11% box')

WebUI.setText(findTestObject('Object Repository/Page_SKT ERP  ERP/Tab Sales/Sales Order/Input Sales Person'), 'sujadi')

WebUI.delay(5)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Constant/Sales/303 - Sujadi'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Sales Order/Customer Field'))

WebUI.setText(findTestObject('Page_SKT ERP  ERP/Tab Sales/Sales Order/Input Customer'), 'beauty')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_SKT ERP  ERP/Constant/Customer/PT BEAUTY KASATAMA INDONESIA'))

WebUI.scrollToElement(findTestObject('Page_SKT ERP  ERP/Tab Sales/Sales Order/Billing Address Field'), 3)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Sales Order/Billing Address Field'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Constant/Address/Billing Address PT Beauty Kasatama Indonesia (JL.RAYA DARMO NO 54-56, Surabaya, Jawa Timur)'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Sales Order/Shipping Address Field'))

WebUI.click(findTestObject('Object Repository/Page_SKT ERP  ERP/Constant/Address/Shipping Address PT Beauty Kasatama (PERGUDANGAN ROMOKALISARI BLOK A-5 GRESIK_064dca)'))

WebUI.click(findTestObject('Object Repository/Page_SKT ERP  ERP/Tab Sales/Sales Order/i_tambah item'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Sales Order/Type Field'))

WebUI.click(findTestObject('Object Repository/Page_SKT ERP  ERP/Tab Sales/Sales Order/Tipe Box'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Sales Order/MasterCard Field'))

WebUI.click(findTestObject('Object Repository/Page_SKT ERP  ERP/Constant/Mastercard/PT Beauty Kasatama (5157 - 003944 - BOX VIO PRINTING BARU (3_037960)'))

String qty = '600'

WebUI.setText(findTestObject('Object Repository/Page_SKT ERP  ERP/Tab Sales/Sales Order/Input Quantity'), qty)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Sales Order/Unit Field'))

WebUI.click(findTestObject('Object Repository/Page_SKT ERP  ERP/Tab Sales/Sales Order/Unit Pcs'))

String price = '9250'

WebUI.setText(findTestObject('Object Repository/Page_SKT ERP  ERP/Tab Sales/Sales Order/Input Harga'), price)

WebUI.click(findTestObject('Object Repository/Page_SKT ERP  ERP/Tab Sales/Sales Order/Input Tanggal Kirim'))

WebUI.click(findTestObject('Object Repository/Page_SKT ERP  ERP/Tab Sales/Sales Order/Tanggal 30'))

WebUI.click(findTestObject('Object Repository/Page_SKT ERP  ERP/Tab Sales/Sales Order/Save Sales Order Line'))

String subtotal = WebUI.getAttribute(findTestObject('Page_SKT ERP  ERP/Tab Sales/Sales Order/Subtotal Values'), 'value')

WebUI.comment('actual subtotal = ' + subtotal)

int quantity = Integer.parseInt(qty)

int harga = Integer.parseInt(price)

int expected_subtotal = quantity * harga

String expectedSubtotal = expected_subtotal

WebUI.comment('expected subtotal = ' + expectedSubtotal)

WebUI.verifyMatch(subtotal, expectedSubtotal, false)

String ppn = WebUI.getAttribute(findTestObject('Page_SKT ERP  ERP/Tab Sales/Sales Order/PPN Values'), 'value')

WebUI.comment('actual ppn = ' + ppn)

int expected_ppn = (expected_subtotal * 11) / 100

String expectedPpn = expected_ppn

WebUI.comment('expected ppn = ' + expectedPpn)

WebUI.verifyMatch(ppn, expectedPpn, false)

String JumlahTotal = WebUI.getText(findTestObject('Page_SKT ERP  ERP/Tab Sales/Sales Order/Jumlah Total Values')).replace('.', '')

String jumlah = JumlahTotal.substring(15)

WebUI.comment('actual jumlah total = ' + jumlah)

int expected_jumlah = expected_subtotal + expected_ppn

String expectedJumlah = expected_jumlah

WebUI.comment('expected jumlah total = ' + expectedJumlah)

WebUI.verifyMatch(jumlah, expectedJumlah, false)

WebUI.closeBrowser()

