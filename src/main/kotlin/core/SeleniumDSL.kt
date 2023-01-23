package core

import io.github.bonigarcia.wdm.WebDriverManager
import io.github.bonigarcia.wdm.config.DriverManagerType
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.edge.EdgeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.interactions.Actions
import utils.Utils
import java.time.Duration

object SeleniumDSL {
    lateinit var driver: WebDriver
    private val defaultUrlTest = "https://testautomationpractice.blogspot.com/"

    fun startBrowser(browser: String, url: String? = null) {
        driver = when (browser) {
            "CHROME" -> {
                WebDriverManager.getInstance(DriverManagerType.CHROME).setup()
                ChromeDriver()
            }

            "FIREFOX" -> {
                WebDriverManager.getInstance(DriverManagerType.FIREFOX).setup()
                FirefoxDriver()
            }

            "EDGE" -> {
                WebDriverManager.getInstance(DriverManagerType.EDGE).setup()
                EdgeDriver()
            }

            "HEADLESS" -> {
                var options = ChromeOptions().apply {
                    addArguments("--headless")
                }
                WebDriverManager.getInstance(DriverManagerType.CHROME).setup()
                ChromeDriver(options)
            }
            else -> {
                WebDriverManager.getInstance(DriverManagerType.CHROME).setup()
                ChromeDriver()
            }
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10))
        driver.manage().window().maximize()
        if (!url.isNullOrBlank()) {
            driver.get(url)
            waitToPageLoad()
        }
    }

    fun goToPage(url: String = defaultUrlTest) {
        driver.get(url)
        waitToPageLoad()
    }

    fun waitToPageLoad() {
        while (Utils.executeJsCommand("return document.readyState", driver) != "complete") {
            println(
                "Aguardando página carregar, status atual ${
                    Utils.executeJsCommand(
                        "return document.readyState",
                        driver
                    )
                }"
            )
        }
    }

    fun dragAndDrop(draggable: WebElement, droppable: WebElement) {
        Actions(driver).also { 7
            it.dragAndDrop(draggable, droppable).build().perform()
        }
    }

    fun quitDriver() {
        driver.quit()
    }
}