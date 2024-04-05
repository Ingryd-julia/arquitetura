package br.edu.iftm.ds.exemplos.arquitetura.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import br.edu.iftm.ds.exemplos.arquitetura.domain.produto;

@Component
public class protudodao {

    private List<produto> produtos = Arrays.asList(
       new produto(1, "Caneta Marcador para Colorir Desenho Professional, Pontas Duplas, Codificados por Cores, Segurança Garantida, Caixa de Bônus marcadores artisticos de Arte para Estudantes Adultos Artistas Desenho Colorir Desenho 80 cores", 124.90, 25),
       new produto(2, "Aquarela à Base de Água Pentel Arts 24 Cores", 90.30, 50)
    );

    public List<produto> getProdutos() {
        return produtos;  
    }

}
