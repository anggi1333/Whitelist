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

WebUI.openBrowser('http://goaml.southeastasia.cloudapp.azure.com/goaml/Default.aspx')

WebUI.navigateToUrl('http://goaml.southeastasia.cloudapp.azure.com/goaml/Default.aspx')

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.setText(findTestObject('99 All/username'), 'anggi1')

WebUI.setEncryptedText(findTestObject('99 All/password'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('99 All/sign In'))

WebUI.delay(2)

WebUI.setText(findTestObject('99 All/filter'), 'PROLI')

WebUI.delay(2)

WebUI.click(findTestObject('View/5'))

WebUI.delay(2)

WebUI.uploadFile(findTestObject('Upload/1 Browse'), 'D:\\WL\\DTTOTOJK.xlsx')

WebUI.click(findTestObject('Upload/3 Inport'))

