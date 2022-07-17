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

WebUI.click(findTestObject('Page_SKT ERP  ERP/Login/button_login'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/Tab Warehouse'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/STB Hasil Produksi/Tab STB Hasil Produksi'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/STB Hasil Produksi/Add STB Hasil Produksi'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/STB Hasil Produksi/Input No SPK Set'))

//String noSPKSet = GlobalVariable.noSPKSetBoxPartisi
String noSPKSet = '22013640'

//String jumlahDiterimaBox = GlobalVariable.qtySalesOrderBoxPartisi
String jumlahDiterimaBox = '100'
GlobalVariable.qtySTBHasilBox = jumlahDiterimaBox

//float newQty = Float.parseFloat(jumlahDiterimaBox)
//float qtyPartisi1 = newQty * 2
//String jumlahDiterimaPartisi1 = qtyPartisi1
String jumlahDiterimaPartisi1 = '200'
GlobalVariable.qtySTBHasilPartisi1 = jumlahDiterimaPartisi1

//float qtyPartisi2 = newQty * 3
//String jumlahDiterimaPartisi2 = qtyPartisi2
String jumlahDiterimaPartisi2 = '300'
GlobalVariable.qtySTBHasilPartisi2 = jumlahDiterimaPartisi2

WebUI.setText(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/STB Hasil Produksi/Input No SPK Set'), noSPKSet)

WebUI.delay(5)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/STB Hasil Produksi/button_Next'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/STB Hasil Produksi/NO SPK (per Item)'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Production/Perpindahan WIP/SPK per Item list/Option - BOX - BOX USG 250CC (K0173)'))

WebUI.setText(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/STB Hasil Produksi/Jumlah Diterima'), jumlahDiterimaBox)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/STB Hasil Produksi/Lot Tujuan'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/STB Hasil Produksi/Lot Tujuan List/FG 1'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/STB Hasil Produksi/Penerima'))

WebUI.setText(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/STB Hasil Produksi/Penerima'), 'alex')

WebUI.click(findTestObject('Page_SKT ERP  ERP/Constant/Sales/157 - Alex Kristiyanto'))

WebUI.setText(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/STB Hasil Produksi/Penyerah'), 'sujadi')

WebUI.click(findTestObject('Page_SKT ERP  ERP/Constant/Sales/303 - Sujadi'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/STB Hasil Produksi/button_Save'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/STB Hasil Produksi/button_Yes (Save)'))

//------------------------------------------------------------------------------------------------------------------
WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/STB Hasil Produksi/Add STB Hasil Produksi'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/STB Hasil Produksi/Input No SPK Set'))

WebUI.setText(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/STB Hasil Produksi/Input No SPK Set'), noSPKSet)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/STB Hasil Produksi/button_Next'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/STB Hasil Produksi/NO SPK (per Item)'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Production/Perpindahan WIP/SPK per Item list/Option - PARTISI - BOX USG 250CC (K0173)'))

WebUI.setText(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/STB Hasil Produksi/Jumlah Diterima'), jumlahDiterimaPartisi1)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/STB Hasil Produksi/Lot Tujuan'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/STB Hasil Produksi/Lot Tujuan List/FG 1'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/STB Hasil Produksi/Penerima'))

WebUI.setText(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/STB Hasil Produksi/Penerima'), 'alex')

WebUI.click(findTestObject('Page_SKT ERP  ERP/Constant/Sales/157 - Alex Kristiyanto'))

WebUI.setText(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/STB Hasil Produksi/Penyerah'), 'sujadi')

WebUI.click(findTestObject('Page_SKT ERP  ERP/Constant/Sales/303 - Sujadi'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/STB Hasil Produksi/button_Save'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/STB Hasil Produksi/button_Yes (Save)'))

//-----------------------------------------------------------------------------------------------------------------------------
WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/STB Hasil Produksi/Add STB Hasil Produksi'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/STB Hasil Produksi/Input No SPK Set'))

WebUI.setText(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/STB Hasil Produksi/Input No SPK Set'), noSPKSet)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/STB Hasil Produksi/button_Next'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/STB Hasil Produksi/NO SPK (per Item)'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Production/Perpindahan WIP/SPK per Item list/Option - PARTISI - BOX USG 250CC (K0173)'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/STB Hasil Produksi/Pilih Finished Good'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/STB Hasil Produksi/Finished Good list/PARTISI - BOX USG 250CC (K0173) - 2'))

WebUI.setText(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/STB Hasil Produksi/Jumlah Diterima'), jumlahDiterimaPartisi2)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/STB Hasil Produksi/Lot Tujuan'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/STB Hasil Produksi/Lot Tujuan List/FG 1'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/STB Hasil Produksi/Penerima'))

WebUI.setText(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/STB Hasil Produksi/Penerima'), 'alex')

WebUI.click(findTestObject('Page_SKT ERP  ERP/Constant/Sales/157 - Alex Kristiyanto'))

WebUI.setText(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/STB Hasil Produksi/Penyerah'), 'sujadi')

WebUI.click(findTestObject('Page_SKT ERP  ERP/Constant/Sales/303 - Sujadi'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/STB Hasil Produksi/button_Save'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/STB Hasil Produksi/button_Yes (Save)'))

//------------------------------------------------------------------------------------------------------
WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/Tab Warehouse'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/Tab Stock Balance/Tab Stock Balance'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/Tab Stock Balance/Tab Finished Good'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/Tab Stock Balance/Filters'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/Tab Stock Balance/Filters by SKU'))

WebUI.setText(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/Tab Stock Balance/Filters by SKU'), noSPKSet)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/Tab Stock Balance/Filters By Lot'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/Tab Stock Balance/Filters by Lot (FG 1)'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/Tab Stock Balance/button_Search'))

WebUI.scrollToElement(findTestObject('Page_SKT ERP  ERP/Tab Warehouse/Tab Stock Balance/button_Search'), 30)

String Expected_BalanceBox = jumlahDiterimaBox

String Expected_BalancePartisi1 = jumlahDiterimaPartisi1

String Expected_BalancePartisi2 = jumlahDiterimaPartisi2

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

