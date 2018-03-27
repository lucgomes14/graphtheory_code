package graph.interfaces;

import graph.Vertice;

import java.util.Set;


public interface IGrafo {

    //Retorna um conjunto com todos os adjancetes de um vértice
    public Set<Vertice> getAdjacentes(Vertice v);

    //Retorna True se o grafo é Conexo e False caso contrário
    public boolean ehConexo();

    // Executa a busca em Largura
    public void buscaLargura();

    //Executa a busca em profundidade
    public void buscaProfundidade();

    /*
          Retorna uma string que representa o grafo na forma:

          v2 [ v1 v3 ]
          v1 [ v2 v3 ]
          v3 [ v2 v1 ]

          Por exemplo, nesse caso V2 é adjacente a v1 e v3.

    */
    public String toString();



}
