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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import java.util.ArrayList as ArrayList
import com.kms.katalon.core.testobject.ConditionType as ConditionType

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3001/login')

WebUI.setText(findTestObject('Object Repository/Page_SKT ERP  ERP/Login/input_login_username'), 'devshelly')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_SKT ERP  ERP/Login/input_login_password'), 'bD8Rq1FIAurX2vfab/lFTQ==')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_SKT ERP  ERP/Login/button_login'))

//String noSPKSet = GlobalVariable.noSPKSetBoxPartisi
String noSPKSet = '22013640'

//String noSalesOrder = GlobalVariable.noSalesOrderBoxPartisi
String noSalesOrder = 'dmprts'

//String qtySJ = GlobalVariable.qtySJNBoxPartisi
String qtySJ = '90'
int qtySJN = Integer.parseInt(qtySJ)

//String qtySO = GlobalVariable.qtySalesOrderBoxPartisi
String qtySO = '100'
int qtySalesOrder = Integer.parseInt(qtySO)

String qtyRetur = '50'
int qtySJR = Integer.parseInt(qtyRetur)
GlobalVariable.qtySJRBoxPartisi = qtyRetur

//-----------------------------
int expected_BalanceBox = qtySJR

int expected_BalancePartisi1 = qtySJR * 2

int expected_BalancePartisi2 = qtySJR * 3

//------------------------------
WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Freight/Tab Freight'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Freight/Tab Surat Jalan Delivery Order/Tab Surat Jalan Delivery Order'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Freight/Tab Surat Jalan Delivery Order/Filters'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Freight/Tab Surat Jalan Delivery Order/Filters by No SPK Set'))

WebUI.setText(findTestObject('Page_SKT ERP  ERP/Tab Freight/Tab Surat Jalan Delivery Order/Filters by No SPK Set'), noSPKSet)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Freight/Tab Surat Jalan Delivery Order/Search (Filters)'))

String noSJ = WebUI.getText(findTestObject('Page_SKT ERP  ERP/Tab Freight/Tab Surat Jalan Delivery Order/No SJ'))

WebUI.comment(noSJ)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Freight/Tab Surat Jalan Delivery Order/Filters'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Freight/Tab Surat Jalan Delivery Order/checkbox for SJ'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Freight/Tab Surat Jalan Delivery Order/button Update (for update status SJ)'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Freight/Tab Surat Jalan Delivery Order/Choose Status SJ'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Freight/Tab Surat Jalan Delivery Order/Edit Status SJ to Completed'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Freight/Tab Surat Jalan Delivery Order/button Ya (for change status SJ)'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Freight/Tab Surat Jalan Delivery Order/Add Surat Jalan'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Freight/Tab Surat Jalan Delivery Order/Input Tipe'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Freight/Tab Surat Jalan Delivery Order/Tipe Retur Susulan'))

WebUI.setText(findTestObject('Page_SKT ERP  ERP/Tab Freight/Tab Surat Jalan Delivery Order/Input No SJ Normal'), noSJ)

WebUI.delay(2)

String dynamicId = noSJ

String xpath = ('//li[contains(text(),"' + dynamicId) + '")]'

TestObject to = new TestObject('Page_SKT ERP  ERP/Tab Freight/Tab Surat Jalan Delivery Order/Choose No SJ Normal')

to.addProperty('xpath', ConditionType.EQUALS, xpath)

WebUI.click(to)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Freight/Tab Surat Jalan Delivery Order/Sales Order Line 1'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Freight/Tab Surat Jalan Delivery Order/Add Sales Order Line'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Freight/Tab Surat Jalan Delivery Order/Quantity'))

WebUI.sendKeys(findTestObject('Page_SKT ERP  ERP/Tab Freight/Tab Surat Jalan Delivery Order/Quantity'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Page_SKT ERP  ERP/Tab Freight/Tab Surat Jalan Delivery Order/Quantity'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Page_SKT ERP  ERP/Tab Freight/Tab Surat Jalan Delivery Order/Quantity'), qtyRetur)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Freight/Tab Surat Jalan Delivery Order/Save (Edit Jumlah Pengiriman)'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Freight/Tab Surat Jalan Delivery Order/Save (Edit Berat Teoritis)'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Freight/Tab Surat Jalan Delivery Order/Sales Order Line 2'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Freight/Tab Surat Jalan Delivery Order/Add Sales Order Line'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Freight/Tab Surat Jalan Delivery Order/Quantity'))

WebUI.sendKeys(findTestObject('Page_SKT ERP  ERP/Tab Freight/Tab Surat Jalan Delivery Order/Quantity'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Page_SKT ERP  ERP/Tab Freight/Tab Surat Jalan Delivery Order/Quantity'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Page_SKT ERP  ERP/Tab Freight/Tab Surat Jalan Delivery Order/Quantity'), qtyRetur)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Freight/Tab Surat Jalan Delivery Order/Save (Edit Jumlah Pengiriman)'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Freight/Tab Surat Jalan Delivery Order/Save (Edit Berat Teoritis)'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Freight/Tab Surat Jalan Delivery Order/Next'))

String BeratPerKg = WebUI.getAttribute(findTestObject('Page_SKT ERP  ERP/Tab Freight/Tab Surat Jalan Delivery Order/Berat per Kg'), 
    'value')

WebUI.comment(BeratPerKg)

float actual_beratperkg = Float.parseFloat(BeratPerKg)

String TarifPerKg = WebUI.getAttribute(findTestObject('Page_SKT ERP  ERP/Tab Freight/Tab Surat Jalan Delivery Order/Tarif per Kg'), 
    'value')

WebUI.comment(TarifPerKg)

float actual_tarifperkg = Float.parseFloat(TarifPerKg)

String Subtotal = WebUI.getAttribute(findTestObject('Page_SKT ERP  ERP/Tab Freight/Tab Surat Jalan Delivery Order/Subtotal'), 
    'value')

WebUI.comment(Subtotal)

float actual_subtotal = Float.parseFloat(Subtotal)

float expected_subtotal = (actual_beratperkg * actual_tarifperkg).round(2)

String expectedSubtotal = expected_subtotal

WebUI.comment(expectedSubtotal)

WebUI.verifyMatch(Subtotal, expectedSubtotal, false)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Freight/Tab Surat Jalan Delivery Order/Save (Save Surat Jalan)'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Freight/Tab Freight'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Freight/Tab Surat Jalan Delivery Order Retur Approval/Tab Surat Jalan Delivery Order Retur Approval'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Freight/Tab Surat Jalan Delivery Order Retur Approval/Approve button'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Freight/Tab Surat Jalan Delivery Order Retur Approval/Approve DO Retur'))

//-------------------------------------------------------------------------------------------------------------------------
WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Production/Tab Production'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Production/Work Order (SPK)/Tab Work Order (SPK)'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Production/Work Order (SPK)/button Filters'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Production/Work Order (SPK)/Filters by No SPK Set'))

WebUI.setText(findTestObject('Page_SKT ERP  ERP/Tab Production/Work Order (SPK)/Filters by No SPK Set'), noSPKSet)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Production/Work Order (SPK)/button Search in Filters'))

WebUI.scrollToElement(findTestObject('Page_SKT ERP  ERP/Tab Production/Work Order (SPK)/button Search in Filters'), 30)

WebDriver driver = DriverFactory.getWebDriver()

'To locate table'
WebElement Table = driver.findElement(By.xpath('/html/body/div[1]/div/main/section/div/div[2]/div[2]/div[4]/div/div/div/div/div[1]/div[2]/table'))

List<WebElement> rows_table = Table.findElements(By.tagName('tr'))

int rows_count = rows_table.size()

String actual_status_wo

List<WebElement> statusworkorder = new ArrayList<String>()

'Loop will execute for all the rows of the table'
Loop: for (int row = 0; row < rows_count; row++) {
    'To locate columns(cells) of that specific row'
    List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('td'))

    'status ada dikolom ke 9'
    int column_status = 9

    actual_status_wo = Columns_row.get(column_status).getText()

    WebUI.comment(actual_status_wo)

    statusworkorder.add(actual_status_wo)
}

int array_count = statusworkorder.size()

String expected_status_wo = 'completed'

for (int arr = 0; arr < array_count; arr++) {
    WebUI.verifyMatch(actual_status_wo, expected_status_wo, false)

    WebUI.comment(actual_status_wo)

    WebUI.comment(expected_status_wo)
}

//--------------------------------------------------------------------------------------------------------------
WebUI.click(findTestObject('Object Repository/Page_SKT ERP  ERP/Tab Sales/Tab Sales'))

WebUI.click(findTestObject('Object Repository/Page_SKT ERP  ERP/Tab Sales/Sales Order/Tab Sales Order'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Sales Order/Filters'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Sales Order/Filters by No Sales Order'))

WebUI.setText(findTestObject('Page_SKT ERP  ERP/Tab Sales/Sales Order/Filters by No Sales Order'), noSalesOrder)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Sales Order/button_Search'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Sales Order/a_View'))

'To locate table'
WebElement Table1 = driver.findElement(By.xpath('/html/body/div[1]/div/main/section/div/div[2]/form/div[4]/div[1]/div/div/div/div/div[1]/div[2]/table/tbody'))

List<WebElement> rows_table1 = Table1.findElements(By.tagName('tr'))

int rows_count1 = rows_table1.size()

String actual_status_sol

String actual_outstanding_delivery

List<WebElement> statussalesorderline = new ArrayList<String>()

List<WebElement> outstandingdeliveryqty = new ArrayList<String>()

'Loop will execute for all the rows of the table'
Loop: for (int row1 = 0; row1 < rows_count1; row1++) {
    'To locate columns(cells) of that specific row'
    List<WebElement> Columns_row1 = rows_table1.get(row1).findElements(By.tagName('td'))

    'status ada dikolom ke 1'
    int column_status1 = 1

    actual_status_sol = Columns_row1.get(column_status1).getText()

    WebUI.comment(actual_status_sol)

    statussalesorderline.add(actual_status_sol)

    int colomn_outstandingDelivery = 24

    actual_outstanding_delivery = Columns_row1.get(colomn_outstandingDelivery).getText()

    WebUI.comment(actual_outstanding_delivery)

    outstandingdeliveryqty.add(actual_outstanding_delivery)
}

int array_count1 = statussalesorderline.size()

String expected_status_sol = 'partial-delivery'

int expectedOutstandingDelivery = (qtySalesOrder - qtySJN) + qtySJR

String expected_outstandingDelivery = expectedOutstandingDelivery

for (int arr1 = 0; arr1 < array_count1; arr1++) {
    WebUI.verifyMatch(actual_status_sol, expected_status_sol, false)

    WebUI.comment(actual_status_sol)

    WebUI.comment(expected_status_sol)

    WebUI.verifyMatch(actual_outstanding_delivery, expected_outstandingDelivery, false)

    WebUI.comment(actual_outstanding_delivery)

    WebUI.comment(expected_outstandingDelivery)
}

//------------------------------------------------------------------------------------
WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Freight/Tab Freight'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Freight/Tab Surat Jalan Delivery Order/Tab Surat Jalan Delivery Order'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Freight/Tab Surat Jalan Delivery Order/Filters'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Freight/Tab Surat Jalan Delivery Order/Filters by No SPK Set'))

WebUI.setText(findTestObject('Page_SKT ERP  ERP/Tab Freight/Tab Surat Jalan Delivery Order/Filters by No SPK Set'), noSPKSet)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Freight/Tab Surat Jalan Delivery Order/Search (Filters)'))

String noSJR = WebUI.getText(findTestObject('Page_SKT ERP  ERP/Tab Freight/Tab Surat Jalan Delivery Order/No SJ'))

WebUI.comment(noSJR)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Tab Sales'))

WebUI.scrollToElement(findTestObject('Page_SKT ERP  ERP/Tab Sales/Tab Nota Penjualan/Tab Nota Penjualan'), 30)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Tab Nota Retur Penjualan/Tab Retur'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Tab Nota Retur Penjualan/Tab Nota Retur Penjualan'))

WebUI.verifyTextPresent(noSJR, false)

//-----------------------------------
WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/Tab Warehouse'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/Tab Stock Balance/Tab Stock Balance'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/Tab Stock Balance/Tab Finished Good'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/Tab Stock Balance/Filters'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/Tab Stock Balance/Filters by SKU'))

WebUI.setText(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/Tab Stock Balance/Filters by SKU'), noSPKSet)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/Tab Stock Balance/Filters By Lot'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/Tab Stock Balance/Filters by Lot (Retur Barang Jadi)'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/Tab Stock Balance/button_Search'))

WebUI.scrollToElement(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/Tab Stock Balance/button_Search'), 30)

String Expected_BalanceBox = expected_BalanceBox

String Expected_BalancePartisi1 = expected_BalancePartisi1

String Expected_BalancePartisi2 = expected_BalancePartisi2

String Actual_BalanceBox = WebUI.getText(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/Tab Stock Balance/Stock Balance Pair 0'))

WebUI.comment(Actual_BalanceBox)

WebUI.verifyMatch(Actual_BalanceBox, Expected_BalanceBox, false)

String Actual_BalancePartisi1 = WebUI.getText(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/Tab Stock Balance/Stock Balance Pair 1'))

WebUI.comment(Actual_BalancePartisi1)

WebUI.verifyMatch(Actual_BalancePartisi1, Expected_BalancePartisi1, false)

String Actual_BalancePartisi2 = WebUI.getText(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/Tab Stock Balance/Stock Balance Pair 2'))

WebUI.comment(Actual_BalancePartisi2)

WebUI.verifyMatch(Actual_BalancePartisi2, Expected_BalancePartisi2, false)

WebUI.closeBrowser()

