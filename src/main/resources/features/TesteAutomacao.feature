# language: pt
# encoding: utf-8
# author: Nicolai Peixoto

@all
Funcionalidade: Validar página de teste da automação

  Contexto: Acessar o site
    Dado que eu esteja com o navegador aberto
    Quando eu acessar o site de teste

  @pagina-inicial-titulo
  Cenário: Validar título da página inicial
    Então devo visualizar o título Automation Testing Practice

  @drag-and-drop
  Cenário: Validar elemento sendo arrastado
    E arrastar o elemento drag para o drop
    Então devo visualizar os elementos sobrepostos

  @accept-popup
  Cenário: Validar elemento sendo arrastado
    E clicar no botão Alert click me
    Então devo visualizar o pop-up e aceit-alo

  @dismiss-popup
  Cenário: Validar elemento sendo arrastado
    E clicar no botão Alert click me
    Então devo visualizar o pop-up e recusá-lo