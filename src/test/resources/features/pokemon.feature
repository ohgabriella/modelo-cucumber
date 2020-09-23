#language: pt
@AllCenarios
Funcionalidade: Pesquisar pokemons

  Cenario: Listar pokemons
    Dado que o usuario queira pesquisar pokemons
    Quando enviar uma requisicao a api para o path de pokemon
    Entao os pokemons foram listados
