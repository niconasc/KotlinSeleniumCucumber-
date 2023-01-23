package hooks

import core.SeleniumDSL
import io.cucumber.java.After

class SeleniumHook {

    @After
    fun afterTest() {
        SeleniumDSL.quitDriver()
    }
}