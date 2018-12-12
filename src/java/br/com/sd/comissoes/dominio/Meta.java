package br.com.sd.comissoes.dominio;

import java.io.Serializable;
import java.math.BigDecimal;

public class Meta implements Serializable {
    
    private Long id;
    private String nome;
    private Integer quantidadeMinima;
    private BigDecimal porcentagemComissao;

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

    public Integer getQuantidadeMinima() {
        return quantidadeMinima;
    }

    public void setQuantidadeMinima(Integer quantidadeMinima) {
        this.quantidadeMinima = quantidadeMinima;
    }

    public BigDecimal getPorcentagemComissao() {
        return porcentagemComissao;
    }

    public void setPorcentagemComissao(BigDecimal porcentagemComissao) {
        this.porcentagemComissao = porcentagemComissao;
    }

    @Override
    public String toString() {
        return getNome();
    }
    
}
