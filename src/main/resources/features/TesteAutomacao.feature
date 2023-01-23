# language: pt
# encoding: utf-8
# author: Nicolai Peixoto

@all
Funcionalidade: Validar página de teste da automação

  @pagina-inicial-titulo
  Cenário: Validar título da página inicial
    Dado que eu esteja com o navegador aberto
    Quando eu acessar o site de teste
    Então devo visualizar o título Automation Testing Practice

  @drag-and-drop
  Cenário: Validar elemento sendo arrastado
    Dado que eu esteja com o navegador aberto
    Quando eu acessar o site de teste
    E arrastar o elemento drag para o drop
    Então devo visualizar os elementos sobrepostos