package stepDefinition

import core.SeleniumDSL
import io.cucumber.java.PendingException
import io.cucumber.java.pt.Dado
import io.cucumber.java.pt.Então
import io.cucumber.java.pt.Quando
import pageObject.IndexPageObject


class IndexStepDefinition {

    lateinit var indexPageObject: IndexPageObject

    @Dado("que eu esteja com o navegador aberto")
    fun que_eu_esteja_com_o_navegador_aberto() {
        SeleniumDSL.startBrowser("CHROME")
        indexPageObject = IndexPageObject()
    }

    @Quando("eu acessar o site de teste")
    fun eu_acessar_o_site_de_teste() {
        SeleniumDSL.goToPage()
    }
    @Quando("arrastar o elemento drag para o drop")
    fun arrastar_o_elemento_drag_para_o_drop() {
        indexPageObject.arrastaElemento()
    }

    @Então("devo visualizar o título Automation Testing Practice")
    fun devo_visualizar_o_título_automation_testing_practice() {
        indexPageObject.titleIsOk()
    }

    @Então("devo visualizar os elementos sobrepostos")
    fun devo_visualizar_os_elementos_sobrepostos() {
        indexPageObject.dragAndDropisOk()
    }

    @Dado("clicar no botão Alert click me")
    fun clicar_no_botão_Alert_click_me() {
        indexPageObject.clickAlert()
    }

    @Então("devo visualizar o pop-up e aceit-alo")
    fun devo_visualizar_o_pop_up_e_aceit_alo() {
        indexPageObject.isAlertOk()
    }
    @Então("devo visualizar o pop-up e recusá-lo")
    fun devo_visualizar_o_pop_up_e_recusa_lo() {
        indexPageObject.isAlertCanceled()
    }
}