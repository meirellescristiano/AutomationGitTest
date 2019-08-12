import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('http://vw12hml03:6060/jsp_login')

WebUI.setText(findTestObject('Page_Sistema TOTVS - Financeira BRB/input__frmj_id72cdUsu'), 'tb')

WebUI.setText(findTestObject('Page_Sistema TOTVS - Financeira BRB/input__frmj_id86j_id93'), 'tb')

WebUI.click(findTestObject('Page_Sistema TOTVS - Financeira BRB/input_Trocar Senha_frmj_id117'))

WebUI.verifyElementText(findTestObject('Page_Sistema TOTVS - Financeira BRB/p_UsurioTB'), 'TB')

