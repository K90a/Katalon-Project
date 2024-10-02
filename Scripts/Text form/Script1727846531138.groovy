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

WebUI.navigateToUrl('https://demo.guru99.com/insurance/v1/register.php')

WebUI.click(findTestObject('Object Repository/Page_Insurance Broker System - Register/input_First name_firstname'))

WebUI.setText(findTestObject('Object Repository/Page_Insurance Broker System - Register/input_First name_firstname'), FirstName)

WebUI.click(findTestObject('Object Repository/Page_Insurance Broker System - Register/input_Surname_lastname'))

WebUI.setText(findTestObject('Object Repository/Page_Insurance Broker System - Register/input_Surname_lastname'), LastName)

WebUI.click(findTestObject('Object Repository/Page_Insurance Broker System - Register/input_Phone_phone'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Insurance Broker System - Register/input_Phone_phone'), Phone)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Insurance Broker System - Register/select_193519361937193819391940194119421943_425311'), 
    '1945', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Insurance Broker System - Register/select_JanuaryFebruaryMarchAprilMayJuneJuly_566629'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Insurance Broker System - Register/select_123456789101112131415161718192021222_566da4'), 
    '17', true)

WebUI.click(findTestObject('Object Repository/Page_Insurance Broker System - Register/input_Date of Birth_licencetype'))

WebUI.click(findTestObject('Object Repository/Page_Insurance Broker System - Register/input_Street_street'))

WebUI.setText(findTestObject('Object Repository/Page_Insurance Broker System - Register/input_Street_street'), Street)

WebUI.click(findTestObject('Object Repository/Page_Insurance Broker System - Register/input_City_city'))

WebUI.setText(findTestObject('Object Repository/Page_Insurance Broker System - Register/input_City_city'), City)

WebUI.click(findTestObject('Object Repository/Page_Insurance Broker System - Register/input_County_county'))

WebUI.setText(findTestObject('Object Repository/Page_Insurance Broker System - Register/input_County_county'), County)

WebUI.click(findTestObject('Object Repository/Page_Insurance Broker System - Register/input_Post code_post_code'))

WebUI.setText(findTestObject('Object Repository/Page_Insurance Broker System - Register/input_Post code_post_code'), PostCode)

WebUI.setText(findTestObject('Object Repository/Page_Insurance Broker System - Register/input_Email_email'), email)

WebUI.click(findTestObject('Object Repository/Page_Insurance Broker System - Register/input_Password_password'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Insurance Broker System - Register/input_Password_password'), password)

WebUI.click(findTestObject('Object Repository/Page_Insurance Broker System - Register/input_Confirm password_c_password'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Insurance Broker System - Register/input_Confirm password_c_password'), 
    confrim)

WebUI.click(findTestObject('Object Repository/Page_Insurance Broker System - Register/input_Confirm password_submit'))

WebUI.closeBrowser()

