package utils

import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver

object Utils {
    fun executeJsCommand(command: String, driver: WebDriver): String {
        var executor = driver as JavascriptExecutor
        return executor.executeScript(command).toString()
    }
}