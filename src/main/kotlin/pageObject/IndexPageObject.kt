package pageObject

import core.SeleniumDSL
import org.junit.Assert
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

class IndexPageObject {
    init {
        PageFactory.initElements(SeleniumDSL.driver, this)
    }

    @FindBy(css = "h1.title")
    lateinit var title: WebElement


    fun titleIsOk(){
        Assert.assertEquals(title.text, "Automation Testing Practice")
    }
}