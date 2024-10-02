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

WebUI.navigateToUrl('https://demo.guru99.com/telecom/addcustomer.php')

WebUI.click(findTestObject('Object Repository/Page_Guru99 Telecom Add Customer/label_Pending'))

WebUI.setText(findTestObject('Object Repository/Page_Guru99 Telecom Add Customer/input_Billing address_fname'), fname)

WebUI.setText(findTestObject('Object Repository/Page_Guru99 Telecom Add Customer/input_Billing address_lname'), lname)

WebUI.setText(findTestObject('Object Repository/Page_Guru99 Telecom Add Customer/input_Billing address_emailid'), email)

WebUI.setText(findTestObject('Object Repository/Page_Guru99 Telecom Add Customer/textarea_Email-ID is not valid_addr'), 
    addr)

WebUI.setText(findTestObject('Object Repository/Page_Guru99 Telecom Add Customer/input_Email-ID is not valid_telephoneno'), 
    phone)

WebUI.click(findTestObject('Object Repository/Page_Guru99 Telecom Add Customer/input_Email-ID is not valid_submit'))

WebUI.getText(findTestObject('Page_Guru99 telecom/custid text'))

WebUI.click(findTestObject('Object Repository/Page_Guru99 telecom/a_Home'))

WebUI.closeBrowser()

