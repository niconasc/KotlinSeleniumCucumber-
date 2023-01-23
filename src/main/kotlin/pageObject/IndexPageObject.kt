package pageObject

import core.SeleniumDSL
import org.junit.Assert.*
import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

class IndexPageObject {
    init {
        PageFactory.initElements(SeleniumDSL.driver, this)
    }

    @FindBy(css = "h1.title")
    private lateinit var title: WebElement

    @FindBy(id = "draggable")
    private lateinit var draggable: WebElement

    @FindBy(id = "droppable")
    private lateinit var droppable: WebElement

    @FindBy(xpath = "//h2[(text()= 'Alert')]/../descendant::button")
    private lateinit var alertButton: WebElement


    fun titleIsOk(){
        assertEquals(title.text, "Automation Testing Practice")
    }

    fun arrastaElemento() {
        SeleniumDSL.dragAndDrop(draggable, droppable)
    }

    fun dragAndDropisOk(){
        assertEquals(droppable.text, "Dropped!")
    }

    fun clickAlert(){
        alertButton.click()
    }
    fun isAlertOk(){
        SeleniumDSL.acceptPopUp()
        alertButton.findElement(
            By.xpath("../p")).also {
            assertEquals(it.text, "You pressed OK!")
        }
    }

    fun isAlertCanceled(){
        SeleniumDSL.dismissPopUp()
        alertButton.findElement(
            By.xpath("../p")).also {
            assertEquals(it.text, "You pressed Cancel!")
        }
    }
}