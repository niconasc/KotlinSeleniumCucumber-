package utils

import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver

object Utils {
    fun executeJsCommand(command: String, driver: WebDriver): String {
        return (driver as JavascriptExecutor).executeScript(command).toString()
    }
}