#language: pt
@AllCenarios
Funcionalidade: Pesquisar pokemons

  Cenario: Listar todos os pokemons
    Dado que o usuario queira listar todos os pokemons
    Quando enviar uma requisicao a api para o path de pokemon
    Entao os pokemons foram listados

  Cenario: Pesquisar pokemon por id
    Dado que o usuario queira pesquisar um pokemon por id
    Quando enviar uma requisicao a api para o path de pokemon/{id}
    Entao o pokemon foi listado

  Cenario: Pesquisar pokemon por areas
    Dado que o usuario queira pesquisar um pokemon por area
    Quando enviar uma requisicao a api para o path de pokemon/{id}/encounters
    Entao o pokemon foi pesquisado por area