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

Mobile.startApplication('C:\\Users\\skyne\\Documents\\1. BRI\\Bootcampt\\Automation\\mobile\\Solodroid_E-CommerceApp Demo_3.2.0.apk', 
    true)

Mobile.tap(findTestObject('Object Repository/Change Username/android.widget.FrameLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Change Username/android.widget.FrameLayout (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Change Username/android.widget.RelativeLayout'), 0)

Mobile.setText(findTestObject('Object Repository/Change Username/android.widget.EditText - Rhayhan'), 'Budi', 0)

Mobile.tap(findTestObject('Object Repository/Change Username/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/Change Username/android.widget.ImageButton'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Change Username/android.widget.TextView - Budi'), 'Budi')

Mobile.closeApplication()

