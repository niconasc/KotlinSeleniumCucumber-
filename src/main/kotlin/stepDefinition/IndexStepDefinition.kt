package stepDefinition

import core.SeleniumDSL
import io.cucumber.java.pt.Dado
import io.cucumber.java.pt.Então
import io.cucumber.java.pt.Quando
import pageObject.IndexPageObject


class IndexStepDefinition {

    lateinit var indexPageObject: IndexPageObject

    @Dado("que eu esteja com o navegador aberto")
    fun que_eu_esteja_com_o_navegador_aberto() {
        SeleniumDSL.startBrowser("CHROME")
    }

    @Quando("eu acessar o site de teste")
    fun eu_acessar_o_site_de_teste() {
        SeleniumDSL.goToPage()
    }

    @Então("devo visualizar o título Automation Testing Practice")
    fun devo_visualizar_o_título_automation_testing_practice() {
        indexPageObject = IndexPageObject()
        indexPageObject.titleIsOk()
    }
}