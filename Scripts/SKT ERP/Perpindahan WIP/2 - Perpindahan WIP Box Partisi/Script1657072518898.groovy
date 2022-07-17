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

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Production/Tab Production'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Production/Perpindahan WIP/Tab Perpindahan WIP'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Production/Perpindahan WIP/Add Perpindahan WIP'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Production/Perpindahan WIP/Tanggal Transaksi'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Production/Perpindahan WIP/Tanggal 30'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Production/Perpindahan WIP/Input No SPK Set'))

WebUI.setText(findTestObject('Page_SKT ERP  ERP/Tab Production/Perpindahan WIP/Input No SPK Set'), noSPKSet)

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Page_SKT ERP  ERP/Tab Production/Perpindahan WIP/Input No SPK Set'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Production/Perpindahan WIP/button_Next'))

WebUI.scrollToElement(findTestObject('Page_SKT ERP  ERP/Tab Production/Perpindahan WIP/Input No SPK per Item'), 30)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Production/Perpindahan WIP/Input No SPK per Item'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Production/Perpindahan WIP/SPK per Item list/Option - PARTISI - BOX USG 250CC (K0173)'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Production/Perpindahan WIP/SPK per Item list/Option - BOX - BOX USG 250CC (K0173)'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Production/Perpindahan WIP/Input Raw Material'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Production/Perpindahan WIP/Raw Material list/8 - M150 - A - PA69 - MPKA'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Production/Perpindahan WIP/Select Stock Balance'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Production/Perpindahan WIP/Bagi Sisa Balance'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Production/Perpindahan WIP/Assign'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Production/Perpindahan WIP/Submit'))

WebUI.click(findTestObject('Page_SKT ERP  ERP/Tab Production/Perpindahan WIP/button_Yes (Submit)'))

WebUI.closeBrowser()

