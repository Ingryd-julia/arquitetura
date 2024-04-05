package br.edu.iftm.ds.exemplos.arquitetura.domain;

public class produto {

    private Integer codigo;

    private String nome;

    private Double preço;

    private int qntEstoque;

    public produto(Integer codigo, String nome, Double preço, int qntEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.preço = preço;
        this.qntEstoque = qntEstoque;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreço() {
        return preço;
    }

    public int getQntEstoque() {
        return qntEstoque;
    }


}
 