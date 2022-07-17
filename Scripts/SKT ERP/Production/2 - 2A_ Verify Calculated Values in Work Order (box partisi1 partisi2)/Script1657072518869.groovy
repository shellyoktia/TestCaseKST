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

WebDriver driver = DriverFactory.getWebDriver()

WebUI.click(findTestObject('Object Repository/Page_SKT ERP  ERP/Login/button_login'))

//String noSalesOrder = GlobalVariable.noSalesOrderBoxPartisi
String noSalesOrder = 'tesround'

//String qtySalesOrder = GlobalVariable.qtySalesOrderBoxPartisi
//float newQty = Float.parseFloat(qtySalesOrder)
float newQty = 100

WebUI.click(findTestObject('Object Repository/Page_SKT ERP  ERP/Tab Sales/Tab Sales'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Release Sales Order/Tab Release Sales Order'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Release Sales Order/Button Filters'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Release Sales Order/Filters by No SO'))

WebUI.setText(findTestObject('Page_SKT ERP  ERP/Tab Sales/Release Sales Order/Filters by No SO'), noSalesOrder)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Release Sales Order/button Search in Filters'))

WebUI.scrollToElement(findTestObject('Page_SKT ERP  ERP/Tab Sales/Release Sales Order/button Search in Filters'), 30)

WebUI.delay(3)

WebElement Table = driver.findElement(By.xpath('/html[1]/body[1]/div[1]/div[1]/main[1]/section[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]'))

List<WebElement> rows_table = Table.findElements(By.tagName('tr'))

int rows_count = rows_table.size()

String isiTable

String outkrts

String corr

String beratbox

String beratorder

String berattrim

String BeratSubstance1

String BeratSubstance2

String BeratSubstance3

String BeratSubstance4

String BeratSubstance5

List<WebElement> noSPKperItem = new ArrayList<String>()

'Loop will execute for all the rows of the table'
Loop: for (int row = 0; row < rows_count; row++) {
    'To locate columns(cells) of that specific row'
    List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('td'))

    'no spk item ada dikolom ke 4'
    int column_no_spk_item = 4

    isiTable = Columns_row.get(column_no_spk_item).getText()

    WebUI.comment(isiTable)

    noSPKperItem.add(isiTable)
}

List<WebElement> allValues = new ArrayList<String>()

int array_count = noSPKperItem.size()

for (int arr = 0; arr < array_count; arr++) {
    String out = noSPKperItem[arr]

    WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Production/Tab Production'))

    WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Production/Work Order (SPK)/Tab Work Order (SPK)'))

    WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Production/Work Order (SPK)/button Filters'))

    WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Production/Work Order (SPK)/Filters by No SPK (per item)'))

    WebUI.setText(findTestObject('Page_SKT ERP  ERP/Tab Production/Work Order (SPK)/Filters by No SPK (per item)'), out)

    WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Production/Work Order (SPK)/button Search in Filters'))

    WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Production/Work Order (SPK)/View Work Order'))

    WebUI.delay(5)

    String noSPK = WebUI.getAttribute(findTestObject('Page_SKT ERP  ERP/Tab Production/Work Order (SPK)/No SPK Set coloumn (in view page)'), 'value')

	GlobalVariable.noSPKSetBoxPartisi = noSPK
    
	outkrts = WebUI.getAttribute(findTestObject('Page_SKT ERP  ERP/Tab Production/Work Order (SPK)/Work order Values (box)/Out Kertas Values'), 
            'value')

	WebUI.comment(outkrts)

	corr = WebUI.getAttribute(findTestObject('Page_SKT ERP  ERP/Tab Production/Work Order (SPK)/Work order Values (box)/Corr Values'), 
            'value')

	WebUI.comment(corr)

	beratbox = WebUI.getAttribute(findTestObject('Page_SKT ERP  ERP/Tab Production/Work Order (SPK)/Work order Values (box)/Berat at Box (gram)'), 
            'value')

	WebUI.comment(beratbox)

	beratorder = WebUI.getAttribute(findTestObject('Page_SKT ERP  ERP/Tab Production/Work Order (SPK)/Work order Values (box)/Berat Order (Kg)'), 
            'value')

	WebUI.comment(beratorder)

	berattrim = WebUI.getAttribute(findTestObject('Page_SKT ERP  ERP/Tab Production/Work Order (SPK)/Work order Values (box)/Berat Trim (Kg)'), 
            'value')

	WebUI.comment(berattrim)

	BeratSubstance1 = WebUI.getAttribute(findTestObject('Page_SKT ERP  ERP/Tab Production/Work Order (SPK)/Work order Values (box)/Berat Substance 1'), 
            'value')

	WebUI.comment(BeratSubstance1)

	BeratSubstance2 = WebUI.getAttribute(findTestObject('Page_SKT ERP  ERP/Tab Production/Work Order (SPK)/Work order Values (box)/Berat Substance 2'), 
            'value')

	WebUI.comment(BeratSubstance2)

	BeratSubstance3 = WebUI.getAttribute(findTestObject('Page_SKT ERP  ERP/Tab Production/Work Order (SPK)/Work order Values (box)/Berat Substance 3'), 
            'value')

	WebUI.comment(BeratSubstance3)

	BeratSubstance4 = WebUI.getAttribute(findTestObject('Page_SKT ERP  ERP/Tab Production/Work Order (SPK)/Work order Values (box)/Berat Substance 4'), 
            'value')

	WebUI.comment(BeratSubstance4)

	BeratSubstance5 = WebUI.getAttribute(findTestObject('Page_SKT ERP  ERP/Tab Production/Work Order (SPK)/Work order Values (box)/Berat Substance 5'), 
            'value')

	WebUI.comment(BeratSubstance5)
    
    WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Production/Work Order (SPK)/button back (from view work order)'))

    allValues.add(outkrts)

    allValues.add(corr)

    allValues.add(beratbox)

    allValues.add(beratorder)

    allValues.add(berattrim)

    allValues.add(BeratSubstance1)

    allValues.add(BeratSubstance2)

    allValues.add(BeratSubstance3)

    allValues.add(BeratSubstance4)

    allValues.add(BeratSubstance5)
}



float qty = newQty

//calculate out kertas box
int lebarKertasMinimum_box = 1500

int width_box = 366

//int outkertas_box = Math.floor(lebarKertasMinimum_box / width_box)
//out dengan nilai lebarkertasminumim terbesar (dataase mcsheet)
int outkertas_box = 4

String expected_outkrts_box = outkertas_box
String actual_otkrts_box = allValues[0]
WebUI.verifyMatch(actual_otkrts_box, expected_outkrts_box, false)

//calculate corr box
int constantDoubleJoint_box = 1
int out_box = outkertas_box
int outKnife_box = 1
int corrBox = constantDoubleJoint_box * Math.floor((newQty / out_box) / outKnife_box)
String expected_corr_box = corrBox
String actual_corr_box = allValues[1]
WebUI.verifyMatch(actual_corr_box, expected_corr_box, false)

//calculate weight box
float weightSheetNettoGram_box = 133.08
float weight_box = (constantDoubleJoint_box * (weightSheetNettoGram_box * newQty)) / 1000

//calculate berat box box
float beratBoxBox = Math.ceil(((weight_box / qty) * 1000) * 100) / 100
String expected_beratbox_box = beratBoxBox
String actual_beratbox_box = allValues[2]
WebUI.verifyMatch(actual_beratbox_box, expected_beratbox_box, false)

//calculate berat order box
float beratOrderBox = Math.ceil(weight_box * 100) / 100
String expected_beratorder_box = beratOrderBox
String actual_beratorder_box = allValues[3]
WebUI.verifyMatch(actual_beratorder_box, expected_beratorder_box, false)

//calculate berat trim box
float trimWasteGram_box = 13.09
float beratTrimBox = ((qty / out_box) * trimWasteGram_box) / 1000
String expected_berattrim_box = beratTrimBox
String actual_berattrim_box = allValues[4]
WebUI.verifyMatch(actual_berattrim_box, expected_berattrim_box, false)

//calculate substance 1 box
int qValuebox1 = 150
int sheetLengthBox1 = 824
int minLebarMmSheetBox1 = 1500
float identifierBox1 = 1
float beratSubstanceBox1 = ((((((qValuebox1 / 1000) * sheetLengthBox1) / 1000) * minLebarMmSheetBox1) / 1000) * identifierBox1) * 
corrBox
String expected_beratsubstance1_box = beratSubstanceBox1.round(2)
String actual_beratsubstance1_box = allValues[5]
WebUI.verifyMatch(actual_beratsubstance1_box, expected_beratsubstance1_box, false)

//calculate substance 2 box
int qValuebox2 = 125
int sheetLengthBox2 = 824
int minLebarMmSheetBox2 = 1500
float identifierBox2 = 1.33
float beratSubstanceBox2 = ((((((qValuebox2 / 1000) * sheetLengthBox2) / 1000) * minLebarMmSheetBox2) / 1000) * identifierBox2) * 
corrBox
String expected_beratsubstance2_box = beratSubstanceBox2.round(2)
String actual_beratsubstance2_box = allValues[6]
WebUI.verifyMatch(actual_beratsubstance2_box, expected_beratsubstance2_box, false)

//calculate substance 3 box
int qValuebox3 = 125
int sheetLengthBox3 = 824
int minLebarMmSheetBox3 = 1500
float identifierBox3 = 1
float beratSubstanceBox3 = ((((((qValuebox3 / 1000) * sheetLengthBox3) / 1000) * minLebarMmSheetBox3) / 1000) * identifierBox3) * 
corrBox
String expected_beratsubstance3_box = beratSubstanceBox3.round(2)
String actual_beratsubstance3_box = allValues[7]
WebUI.verifyMatch(actual_beratsubstance3_box, expected_beratsubstance3_box, false)

//calculate substance 4 box
int qValuebox4 = 0
int sheetLengthBox4 = 824
int minLebarMmSheetBox4 = 1500
float identifierBox4 = 1.42
float beratSubstanceBox4 = ((((((qValuebox4 / 1000) * sheetLengthBox4) / 1000) * minLebarMmSheetBox4) / 1000) * identifierBox4) * 
corrBox
String expected_beratsubstance4_box = beratSubstanceBox4.round(2)
String actual_beratsubstance4_box = allValues[8]
WebUI.verifyMatch(actual_beratsubstance4_box, expected_beratsubstance4_box, false)

//calculate substance 5 box
int qValuebox5 = 0
int sheetLengthBox5 = 824
int minLebarMmSheetBox5 = 1500
float identifierBox5 = 1
float beratSubstanceBox5 = ((((((qValuebox5 / 1000) * sheetLengthBox5) / 1000) * minLebarMmSheetBox5) / 1000) * identifierBox5) * 
corrBox
String expected_beratsubstance5_box = beratSubstanceBox5.round(2)
String actual_beratsubstance5_box = allValues[9]
WebUI.verifyMatch(actual_beratsubstance5_box, expected_beratsubstance5_box, false)

//---------------------------------------partisi---------------------------------------
//calculate out kertas partisi
int lebarKertasMinimum_partisi = 1150

int width_partisi = 140

//int outkertas_partisi = Math.floor(lebarKertasMinimum_partisi / width_partisi)
//out dengan nilai lebarkertasminumim terbesar (dataase mcsheet)
int outkertas_partisi = 5
String expected_outkrts_partisi = outkertas_partisi
String actual_outkrts_partisi = allValues[10]
WebUI.verifyMatch(actual_outkrts_partisi, expected_outkrts_partisi, false)


//calculate corr partisi
int constantDoubleJoint_partisi = 1
int out_partisi = outkertas_partisi
int outKnife_partisi = 1
int corrPartisi = constantDoubleJoint_partisi * Math.floor((newQty / out_partisi) / outKnife_partisi)
String expected_corr_partisi = corrPartisi
String actual_corr_partisi = allValues[11]
WebUI.verifyMatch(actual_corr_partisi, expected_corr_partisi, false)

//calculate weight partisi
float weightSheetNettoGram_partisi = 53.5
float weight_partisi = (constantDoubleJoint_partisi * (weightSheetNettoGram_partisi * newQty)) / 1000

//calculate berat box partisi
float beratBoxPartisi = Math.ceil(((weight_partisi / qty) * 1000) * 100) / 100
String expected_beratbox_partisi = beratBoxPartisi
String actual_beratbox_partisi = allValues[12]
WebUI.verifyMatch(actual_beratbox_partisi, expected_beratbox_partisi, false)

//calculate berat order partisi
float beratOrderPartisi = Math.ceil(weight_partisi * 100) / 100
String expected_beratorder_partisi = beratOrderPartisi
String actual_beratorder_partisi = allValues[13]
WebUI.verifyMatch(actual_beratorder_partisi, expected_beratorder_partisi, false)

//calculate berat trim partisi
float trimWasteGram_partisi = 18.91
float lengthPartisi = 918
float lebarKertasPartisi = 50
//float gsmPartisi = (125 + (125 * 1.36)) + 125
float gsmPartisi = 416.25

//float beratTrimPartisi = qty / out_partisi * trimWasteGram_partisi / 1000
float beratTrimPartisi = Math.ceil((corrPartisi * lengthPartisi / 1000 * lebarKertasPartisi / 1000 * gsmPartisi / 1000) * 100)/100
String expected_berattrim_partisi = beratTrimPartisi
String actual_berattrim_partisi = allValues[14]
WebUI.verifyMatch(actual_berattrim_partisi, expected_berattrim_partisi, false)

//calculate substance 1 partisi
int qValuepartisi1 = 125
int sheetLengthPartisi1 = 918
int minLebarMmSheetPartisi1 = 750
float identifierPartisi1 = 1
float beratSubstancePartisi1 = ((((((qValuepartisi1 / 1000) * sheetLengthPartisi1) / 1000) * minLebarMmSheetPartisi1) / 
1000) * identifierPartisi1) * corrPartisi
String expected_beratsubstance1_partisi = beratSubstancePartisi1.round(2)
String actual_beratsubstance1_partisi = allValues[15]
WebUI.verifyMatch(actual_beratsubstance1_partisi, expected_beratsubstance1_partisi, false)

//calculate substance 2 partisi
int qValuepartisi2 = 125
int sheetLengthPartisi2 = 918
int minLebarMmSheetPartisi2 = 750
float identifierPartisi2 = 1.33
float beratSubstancePartisi2 = ((((((qValuepartisi2 / 1000) * sheetLengthPartisi2) / 1000) * minLebarMmSheetPartisi2) / 
1000) * identifierPartisi2) * corrPartisi
String expected_beratsubstance2_partisi = beratSubstancePartisi2.round(2)
String actual_beratsubstance2_partisi = allValues[16]
WebUI.verifyMatch(actual_beratsubstance2_partisi, expected_beratsubstance2_partisi, false)

//calculate substance 3 partisi
int qValuepartisi3 = 125
int sheetLengthPartisi3 = 918
int minLebarMmSheetPartisi3 = 750
float identifierPartisi3 = 1
float beratSubstancePartisi3 = ((((((qValuepartisi3 / 1000) * sheetLengthPartisi3) / 1000) * minLebarMmSheetPartisi3) / 
1000) * identifierPartisi3) * corrPartisi
String expected_beratsubstance3_partisi = beratSubstancePartisi3.round(2)
String actual_beratsubstance3_partisi = allValues[17]
WebUI.verifyMatch(actual_beratsubstance3_partisi, expected_beratsubstance3_partisi, false)

//calculate substance 4 partisi
int qValuepartisi4 = 0
int sheetLengthPartisi4 = 918
int minLebarMmSheetPartisi4 = 750
float identifierPartisi4 = 1.42
float beratSubstancePartisi4 = ((((((qValuepartisi4 / 1000) * sheetLengthPartisi4) / 1000) * minLebarMmSheetPartisi4) / 
1000) * identifierPartisi4) * corrPartisi
String expected_beratsubstance4_partisi = beratSubstancePartisi4.round(2)
String actual_beratsubstance4_partisi = allValues[18]
WebUI.verifyMatch(actual_beratsubstance4_partisi, expected_beratsubstance4_partisi, false)

//calculate substance 5 partisi
int qValuepartisi5 = 0
int sheetLengthPartisi5 = 918
int minLebarMmSheetPartisi5 = 750
float identifierPartisi5 = 1
float beratSubstancePartisi5 = ((((((qValuepartisi5 / 1000) * sheetLengthPartisi5) / 1000) * minLebarMmSheetPartisi5) / 
1000) * identifierPartisi5) * corrPartisi
String expected_beratsubstance5_partisi = beratSubstancePartisi5.round(2)
String actual_beratsubstance5_partisi = allValues[19]
WebUI.verifyMatch(actual_beratsubstance5_partisi, expected_beratsubstance5_partisi, false)

//bikin array
//List<WebElement> expectedValue = new ArrayList<String>()

//masukin ke arry
//expectedValue.add(outkrts_box)
//
//expectedValue.add(corr_box)
//
//expectedValue.add(beratbox_box)
//
//expectedValue.add(beratorder_box)
//
//expectedValue.add(berattrim_box)
//
//expectedValue.add(beratsubstance1_box)
//
//expectedValue.add(beratsubstance2_box)
//
//expectedValue.add(beratsubstance3_box)
//
//expectedValue.add(beratsubstance4_box)
//
//expectedValue.add(beratsubstance5_box)
//
//expectedValue.add(outkrts_partisi)
//
//expectedValue.add(corr_partisi)
//
//expectedValue.add(beratbox_partisi)
//
//expectedValue.add(beratorder_partisi)
//
//expectedValue.add(berattrim_partisi)
//
//expectedValue.add(beratsubstance1_partisi)
//
//expectedValue.add(beratsubstance2_partisi)
//
//expectedValue.add(beratsubstance3_partisi)
//
//expectedValue.add(beratsubstance4_partisi)
//
//expectedValue.add(beratsubstance5_partisi)
//
//int array_count_isi = allValues.size()
//
//for (int arr1 = 0; arr1 < array_count_isi; arr1++) {
//    String all_values = allValues[arr1]
//
//    WebUI.comment(all_values)
//
//    String expected_Value = expectedValue[arr1]
//
//    WebUI.comment(expected_Value)
//
//    String a = allValues[arr1]
//
//    String b = expectedValue[arr1]
//
//    WebUI.verifyMatch(a, b, false)
//}

WebUI.closeBrowser()

