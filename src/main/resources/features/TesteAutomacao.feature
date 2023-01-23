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
