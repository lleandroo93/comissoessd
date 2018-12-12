package br.com.sd.comissoes.dominio;

import java.io.Serializable;
import java.math.BigDecimal;

public class Produto implements Serializable{   
    
    private Long id;
    private String nome;
    private BigDecimal preco;
    private Long estoque;
    
    private Long saida;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
    
    public Long getEstoque() {
        return estoque;
    }

    public void setEstoque(Long estoque) {
        this.estoque = estoque;
    }

    public Long getSaida() {
        return saida;
    }

    public void setSaida(Long saida) {
        this.saida = saida;
    }
}
