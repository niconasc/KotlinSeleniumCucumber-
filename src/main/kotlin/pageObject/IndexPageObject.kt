package pageObject

import core.SeleniumDSL
import org.junit.Assert.*
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


    fun titleIsOk(){
        assertEquals(title.text, "Automation Testing Practice")
    }

    fun arrastaElemento() {
        SeleniumDSL.dragAndDrop(draggable, droppable)
    }

    fun dragAndDropisOk(){
        assertEquals(droppable.text, "Dropped!")
    }
}