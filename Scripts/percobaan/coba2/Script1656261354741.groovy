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

String noSalesOrder = 'dhhd'
WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3001/login')

WebUI.setText(findTestObject('Object Repository/Page_SKT ERP  ERP/Login/input_login_username'), 'devshelly')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_SKT ERP  ERP/Login/input_login_password'), 'bD8Rq1FIAurX2vfab/lFTQ==')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_SKT ERP  ERP/Login/button_login'))

WebUI.click(findTestObject('Object Repository/Page_SKT ERP  ERP/Tab Sales/Tab Sales'))

WebUI.click(findTestObject('Object Repository/Page_SKT ERP  ERP/Tab Sales/Sales Order/Tab Sales Order'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Sales Order/Filters'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Sales Order/Filters by No Sales Order'))

WebUI.setText(findTestObject('Page_SKT ERP  ERP/Tab Sales/Sales Order/Filters by No Sales Order'), noSalesOrder)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Sales Order/button_Search'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Sales Order/a_View'))
WebDriver driver = DriverFactory.getWebDriver()
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

int  expectedOutstandingDelivery = qtySalesOrder - qtySJN + qtySJR
String expected_outstandingDelivery = expectedOutstandingDelivery

for (int arr1 = 0; arr1 < array_count1; arr1++) {
    WebUI.verifyMatch(actual_status_sol, expected_status_sol, false)

    WebUI.comment(actual_status_sol)

    WebUI.comment(expected_status_sol)
	
	WebUI.verifyMatch(actual_outstanding_delivery, expected_outstandingDelivery, false)
	
	WebUI.comment(actual_outstanding_delivery)
	
	WebUI.comment(expected_outstandingDelivery)
}
