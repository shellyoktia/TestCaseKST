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

WebUI.click(findTestObject('Object Repository/Page_SKT ERP  ERP/Tab Sales/Tab Sales'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Release Sales Order/Tab Release Sales Order'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Release Sales Order/Button Filters'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Sales/Release Sales Order/Filters by No SO'))

//String noSalesOrder = GlobalVariable.noSalesOrderBoxLayer
String noSalesOrder = 'kjdbj'

//String qtySalesOrder = GlobalVariable.qtySalesOrderBoxLayer
//float newQty = Float.parseFloat(qtySalesOrder)
float newQty = 100

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

//-------------------------box-----------------------------------

//calculate out kertas box
int lebarKertasMinimum_box = 1450
int width_box = 470
//int outkertas_box = Math.floor(lebarKertasMinimum_box / width_box)
//out dengan nilai lebarkertasminumim terbesar (dataase mcsheet)
int outkertas_box = 3
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
float weightSheetNettoGram_box = 344.72
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
float trimWasteGram_box = 29.34 //trimWasteGram yang punya min_lebar_mm paling gede di database mcsheet
float beratTrimBox = ((qty / out_box) * trimWasteGram_box) / 1000
String expected_berattrim_box = beratTrimBox
String actual_berattrim_box = allValues[4]
WebUI.verifyMatch(actual_berattrim_box, expected_berattrim_box, false)

//calculate substance 1 box
int qValuebox1 = 150
int sheetLengthBox1 = 1536 //database mastercard yang size sheet bruto l mm
int minLebarMmSheetBox1 = 1450 //database mcsheet
float identifierBox1 = 1
float beratSubstanceBox1 = ((((((qValuebox1 / 1000) * sheetLengthBox1) / 1000) * minLebarMmSheetBox1) / 1000) * identifierBox1) *
corrBox
String expected_beratsubstance1_box = beratSubstanceBox1.round(2)
String actual_beratsubstance1_box = allValues[5]
WebUI.verifyMatch(actual_beratsubstance1_box, expected_beratsubstance1_box, false)

//calculate substance 2 box
int qValuebox2 = 0
int sheetLengthBox2 = 1536
int minLebarMmSheetBox2 = 1450
float identifierBox2 = 1.33
float beratSubstanceBox2 = ((((((qValuebox2 / 1000) * sheetLengthBox2) / 1000) * minLebarMmSheetBox2) / 1000) * identifierBox2) *
corrBox
String expected_beratsubstance2_box = beratSubstanceBox2.round(2)
String actual_beratsubstance2_box = allValues[6]
WebUI.verifyMatch(actual_beratsubstance2_box, expected_beratsubstance2_box, false)

//calculate substance 3 box
int qValuebox3 = 0
int sheetLengthBox3 = 1536
int minLebarMmSheetBox3 = 1450
float identifierBox3 = 1
float beratSubstanceBox3 = ((((((qValuebox3 / 1000) * sheetLengthBox3) / 1000) * minLebarMmSheetBox3) / 1000) * identifierBox3) *
corrBox
String expected_beratsubstance3_box = beratSubstanceBox3.round(2)
String actual_beratsubstance3_box = allValues[7]
WebUI.verifyMatch(actual_beratsubstance3_box, expected_beratsubstance3_box, false)

//calculate substance 4 box
int qValuebox4 = 125
int sheetLengthBox4 = 1536
int minLebarMmSheetBox4 = 1450
float identifierBox4 = 1.42
float beratSubstanceBox4 = ((((((qValuebox4 / 1000) * sheetLengthBox4) / 1000) * minLebarMmSheetBox4) / 1000) * identifierBox4) *
corrBox
String expected_beratsubstance4_box = beratSubstanceBox4.round(2)
String actual_beratsubstance4_box = allValues[8]
WebUI.verifyMatch(actual_beratsubstance4_box, expected_beratsubstance4_box, false)

//calculate substance 5 box
int qValuebox5 = 150
int sheetLengthBox5 = 1536
int minLebarMmSheetBox5 = 1450
float identifierBox5 = 1
float beratSubstanceBox5 = ((((((qValuebox5 / 1000) * sheetLengthBox5) / 1000) * minLebarMmSheetBox5) / 1000) * identifierBox5) *
corrBox
String expected_beratsubstance5_box = beratSubstanceBox5.round(2)
String actual_beratsubstance5_box = allValues[9]
WebUI.verifyMatch(actual_beratsubstance5_box, expected_beratsubstance5_box, false)

//-------------------------layer1-----------------------------------
//calculate out kertas layer1
int lebarKertasMinimum_layer1 = 1500
int width_layer1 = 470
//int outkertas_layer1 = Math.floor(lebarKertasMinimum_partisi / width_partisi)
//out dengan nilai lebarkertasminumim terbesar (dataase mcsheet)
int outkertas_layer1 = 5
String expected_outkrts_layer1 = outkertas_layer1
String actual_outkrts_layer1 = allValues[10]
WebUI.verifyMatch(actual_outkrts_layer1, expected_outkrts_layer1, false)

//calculate corr layer1
int constantDoubleJoint_layer1 = 1
int out_layer1 = outkertas_layer1
int outKnife_layer1 = 1
int corrLayer1 = constantDoubleJoint_layer1 * Math.floor((newQty / out_layer1) / outKnife_layer1)
String expected_corr_layer1 = corrLayer1
String actual_corr_layer1 = allValues[11]
WebUI.verifyMatch(actual_corr_layer1, expected_corr_layer1, false)

//calculate weight layer1
float weightSheetNettoGram_layer1 = 54.65
float weight_layer1 = (constantDoubleJoint_layer1 * (weightSheetNettoGram_layer1 * newQty)) / 1000

//calculate berat box layer1
float beratBoxLayer1 = Math.ceil(((weight_layer1 / qty) * 1000) * 100) / 100
String expected_beratbox_layer1 = beratBoxLayer1
String actual_beratbox_layer1 = allValues[12]
WebUI.verifyMatch(actual_beratbox_layer1, expected_beratbox_layer1, false)

//calculate berat order layer1
float beratOrderLayer1 = Math.ceil(weight_layer1 * 100) / 100
String expected_beratorder_layer1 = beratOrderLayer1
String actual_beratorder_layer1 = allValues[13]
WebUI.verifyMatch(actual_beratorder_layer1, expected_beratorder_layer1, false)

//calculate berat trim layer1
float trimWasteGram_layer1 = 4.64
float length_layer1 = 445
//lebar kertas = minLebarmm(mcsheet) - (width * out) = 1500 - (295 * 5)
float lebarKertas_layer1 = 25
float gsm_layer1 = (125 + (125 * 1.36)) + 125
//float beratTrimLayer1 = qty / out_layer1 * trimWasteGram_layer1 / 1000
float beratTrimLayer1 = Math.ceil((corrLayer1 * length_layer1 / 1000 * lebarKertas_layer1 / 1000 * gsm_layer1 / 1000) * 100)/100
String expected_berattrim_layer1 = beratTrimLayer1
String actual_berattrim_layer1 = allValues[14]
WebUI.verifyMatch(actual_berattrim_layer1, expected_berattrim_layer1, false)

//calculate substance 1 layer1
int qValuelayer1_1 = 125
int sheetLengthLayer1_1 = 445
int minLebarMmSheetLayer1_1 = 1500
float identifierLayer1_1 = 1
float beratSubstanceLayer1_1 = ((((((qValuelayer1_1 / 1000) * sheetLengthLayer1_1) / 1000) * minLebarMmSheetLayer1_1) /
1000) * identifierLayer1_1) * corrLayer1
String expected_beratsubstance1_layer1 = beratSubstanceLayer1_1.round(2)
String actual_beratsubstance1_layer1 = allValues[15]
WebUI.verifyMatch(actual_beratsubstance1_layer1, expected_beratsubstance1_layer1, false)

//calculate substance 2 layer1
int qValuelayer1_2 = 125
int sheetLengthLayer1_2 = 445
int minLebarMmSheetLayer1_2 = 1500
float identifierLayer1_2 = 1.33
float beratSubstanceLayer1_2 = ((((((qValuelayer1_2 / 1000) * sheetLengthLayer1_2) / 1000) * minLebarMmSheetLayer1_2) /
1000) * identifierLayer1_2) * corrLayer1
String expected_beratsubstance2_layer1 = beratSubstanceLayer1_2.round(2)
String actual_beratsubstance2_layer1 = allValues[16]
WebUI.verifyMatch(actual_beratsubstance2_layer1, expected_beratsubstance2_layer1, false)

//calculate substance 3 layer1
int qValuelayer1_3 = 125
int sheetLengthLayer1_3 = 445
int minLebarMmSheetLayer1_3 = 1500
float identifierLayer1_3 = 1
float beratSubstanceLayer1_3 = ((((((qValuelayer1_3 / 1000) * sheetLengthLayer1_3) / 1000) * minLebarMmSheetLayer1_3) /
1000) * identifierLayer1_3) * corrLayer1
String expected_beratsubstance3_layer1 = beratSubstanceLayer1_3.round(2)
String actual_beratsubstance3_layer1 = allValues[17]
WebUI.verifyMatch(actual_beratsubstance3_layer1, expected_beratsubstance3_layer1, false)

//calculate substance 4 layer1
int qValuelayer1_4 = 0
int sheetLengthLayer1_4 = 445
int minLebarMmSheetLayer1_4 = 1500
float identifierLayer1_4 = 1.42
float beratSubstanceLayer1_4 = ((((((qValuelayer1_4 / 1000) * sheetLengthLayer1_4) / 1000) * minLebarMmSheetLayer1_4) /
1000) * identifierLayer1_4) * corrLayer1
String expected_beratsubstance4_layer1 = beratSubstanceLayer1_4.round(2)
String actual_beratsubstance4_layer1 = allValues[18]
WebUI.verifyMatch(actual_beratsubstance4_layer1, expected_beratsubstance4_layer1, false)

//calculate substance 5 layer1
int qValuelayer1_5 = 0
int sheetLengthLayer1_5 = 445
int minLebarMmSheetLayer1_5 = 1500
float identifierLayer1_5 = 1
float beratSubstanceLayer1_5 = ((((((qValuelayer1_5 / 1000) * sheetLengthLayer1_5) / 1000) * minLebarMmSheetLayer1_5) /
1000) * identifierLayer1_5) * corrLayer1
String expected_beratsubstance5_layer1 = beratSubstanceLayer1_5.round(2)
String actual_beratsubstance5_layer1 = allValues[19]
WebUI.verifyMatch(actual_beratsubstance5_layer1, expected_beratsubstance5_layer1, false)

//-------------------------layer2-----------------------------------
//calculate out kertas layer2
int lebarKertasMinimum_layer2 = 1500
int width_layer2 = 295
//int outkertas_layer1 = Math.floor(lebarKertasMinimum_partisi / width_partisi)
//out dengan nilai lebarkertasminumim terbesar (dataase mcsheet)
int outkertas_layer2 = 5
String expected_outkrts_layer2 = outkertas_layer2
String actual_outkrts_layer2 = allValues[20]
WebUI.verifyMatch(actual_outkrts_layer2, expected_outkrts_layer2, false)

//calculate corr layer2
int constantDoubleJoint_layer2 = 1
int out_layer2 = outkertas_layer2
int outKnife_layer2 = 1
int corrLayer2 = constantDoubleJoint_layer2 * Math.floor((newQty / out_layer2) / outKnife_layer2)
String expected_corr_layer2 = corrLayer2
String actual_corr_layer2 = allValues[21]
WebUI.verifyMatch(actual_corr_layer2, expected_corr_layer2, false)

//calculate weight layer2
float weightSheetNettoGram_layer2 = 18.42
float weight_layer2 = (constantDoubleJoint_layer2 * (weightSheetNettoGram_layer2 * newQty)) / 1000

//calculate berat box layer2
float beratBoxLayer2 = Math.ceil(((weight_layer2 / qty) * 1000) * 100) / 100
String expected_beratbox_layer2 = beratBoxLayer2
String actual_beratbox_layer2 = allValues[22]
WebUI.verifyMatch(actual_beratbox_layer2, expected_beratbox_layer2, false)

//calculate berat order layer2
float beratOrderLayer2 = Math.ceil(weight_layer2 * 100) / 100
String expected_beratorder_layer2 = beratOrderLayer2
String actual_beratorder_layer2 = allValues[23]
WebUI.verifyMatch(actual_beratorder_layer2, expected_beratorder_layer2, false)

//calculate berat trim layer2
float trimWasteGram_layer2 = 0.79
float length_layer2 = 150
//lebar kertas = minLebarmm(mcsheet) - (width * out) = 1500 - (295 * 5)
float lebarKertas_layer2 = 25
float gsm_layer2 = (125 + (125 * 1.36)) + 125
//float beratTrimLayer2 = qty / out_layer2 * trimWasteGram_layer2 / 1000
float beratTrimLayer2 = Math.ceil((corrLayer2 * length_layer2 / 1000 * lebarKertas_layer2 / 1000 * gsm_layer2 / 1000) * 100)/100
String expected_berattrim_layer2 = beratTrimLayer2
String actual_berattrim_layer2 = allValues[24]
WebUI.verifyMatch(actual_berattrim_layer2, expected_berattrim_layer2, false)

//calculate substance 1 layer2
int qValuelayer2_1 = 125
int sheetLengthLayer2_1 = 150
int minLebarMmSheetLayer2_1 = 1500
float identifierLayer2_1 = 1
float beratSubstanceLayer2_1 = ((((((qValuelayer2_1 / 1000) * sheetLengthLayer2_1) / 1000) * minLebarMmSheetLayer2_1) /
1000) * identifierLayer2_1) * corrLayer2
String expected_beratsubstance1_layer2 = beratSubstanceLayer2_1.round(2)
String actual_beratsubstance1_layer2 = allValues[25]
WebUI.verifyMatch(actual_beratsubstance1_layer2, expected_beratsubstance1_layer2, false)

//calculate substance 2 layer2
int qValuelayer2_2 = 125
int sheetLengthLayer2_2 = 150
int minLebarMmSheetLayer2_2 = 1500
float identifierLayer2_2 = 1.33
float beratSubstanceLayer2_2 = ((((((qValuelayer2_2 / 1000) * sheetLengthLayer2_2) / 1000) * minLebarMmSheetLayer2_2) /
1000) * identifierLayer2_2) * corrLayer2
String expected_beratsubstance2_layer2 = beratSubstanceLayer2_2.round(2)
String actual_beratsubstance2_layer2 = allValues[26]
WebUI.verifyMatch(actual_beratsubstance2_layer2, expected_beratsubstance2_layer2, false)

//calculate substance 3 layer2
int qValuelayer2_3 = 125
int sheetLengthLayer2_3 = 150
int minLebarMmSheetLayer2_3 = 1500
float identifierLayer2_3 = 1
float beratSubstanceLayer2_3 = ((((((qValuelayer2_3 / 1000) * sheetLengthLayer2_3) / 1000) * minLebarMmSheetLayer2_3) /
1000) * identifierLayer2_3) * corrLayer2
String expected_beratsubstance3_layer2 = beratSubstanceLayer2_3.round(2)
String actual_beratsubstance3_layer2 = allValues[27]
WebUI.verifyMatch(actual_beratsubstance3_layer2, expected_beratsubstance3_layer2, false)

//calculate substance 4 layer2
int qValuelayer2_4 = 0
int sheetLengthLayer2_4 = 150
int minLebarMmSheetLayer2_4 = 1500
float identifierLayer2_4 = 1.42
float beratSubstanceLayer2_4 = ((((((qValuelayer2_4 / 1000) * sheetLengthLayer2_4) / 1000) * minLebarMmSheetLayer2_4) /
1000) * identifierLayer2_4) * corrLayer2
String expected_beratsubstance4_layer2 = beratSubstanceLayer2_4.round(2)
String actual_beratsubstance4_layer2 = allValues[28]
WebUI.verifyMatch(actual_beratsubstance4_layer2, expected_beratsubstance4_layer2, false)

//calculate substance 5 layer2
int qValuelayer2_5 = 0
int sheetLengthLayer2_5 = 150
int minLebarMmSheetLayer2_5 = 1500
float identifierLayer2_5 = 1
float beratSubstanceLayer2_5 = ((((((qValuelayer2_5 / 1000) * sheetLengthLayer2_5) / 1000) * minLebarMmSheetLayer2_5) /
1000) * identifierLayer2_5) * corrLayer2
String expected_beratsubstance5_layer2 = beratSubstanceLayer2_5.round(2)
String actual_beratsubstance5_layer2 = allValues[29]
WebUI.verifyMatch(actual_beratsubstance5_layer2, expected_beratsubstance5_layer2, false)

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
//expectedValue.add(outkrts_layer1)
//
//expectedValue.add(corr_layer1)
//
//expectedValue.add(beratbox_layer1)
//
//expectedValue.add(beratorder_layer1)
//
//expectedValue.add(berattrim_layer1)
//
//expectedValue.add(beratsubstance1_layer1)
//
//expectedValue.add(beratsubstance2_layer1)
//
//expectedValue.add(beratsubstance3_layer1)
//
//expectedValue.add(beratsubstance4_layer1)
//
//expectedValue.add(beratsubstance5_layer1)
//
//expectedValue.add(outkrts_layer2)
//
//expectedValue.add(corr_layer2)
//
//expectedValue.add(beratbox_layer2)
//
//expectedValue.add(beratorder_layer2)
//
//expectedValue.add(berattrim_layer2)
//
//expectedValue.add(beratsubstance1_layer2)
//
//expectedValue.add(beratsubstance2_layer2)
//
//expectedValue.add(beratsubstance3_layer2)
//
//expectedValue.add(beratsubstance4_layer2)
//
//expectedValue.add(beratsubstance5_layer2)
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
//	String a = allValues[arr1]
//	
//	String b = expectedValue[arr1]
	//WebUI.verifyMatch(a, b, false)
//}

WebUI.closeBrowser()