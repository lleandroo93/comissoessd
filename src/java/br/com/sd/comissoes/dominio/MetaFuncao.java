package br.com.sd.comissoes.dominio;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@IdClass(MetaFuncao.MetaFuncaoID.class)
public class MetaFuncao implements Serializable {

    private Meta meta;
    private Funcao funcao;

    @Id
    @ManyToOne
    @JoinColumn("meta_id")
    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    @Id
    @ManyToOne
    @JoinColumn("funcao_id")
    public Funcao getFuncao() {
        return funcao;
    }

    public void setFuncao(Funcao funcao) {
        this.funcao = funcao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.meta);
        hash = 59 * hash + Objects.hashCode(this.funcao);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MetaFuncao other = (MetaFuncao) obj;
        if (!Objects.equals(this.meta, other.meta)) {
            return false;
        }
        if (!Objects.equals(this.funcao, other.funcao)) {
            return false;
        }
        return true;
    }

    public class MetaFuncaoID implements Serializable {

        private Long meta;
        private Long funcao;

        public Long getMeta() {
            return meta;
        }

        public void setMeta(Long meta) {
            this.meta = meta;
        }

        public Long getFuncao() {
            return funcao;
        }

        public void setFuncao(Long funcao) {
            this.funcao = funcao;
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 97 * hash + Objects.hashCode(this.meta);
            hash = 97 * hash + Objects.hashCode(this.funcao);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final MetaFuncaoID other = (MetaFuncaoID) obj;
            if (!Objects.equals(this.meta, other.meta)) {
                return false;
            }
            if (!Objects.equals(this.funcao, other.funcao)) {
                return false;
            }
            return true;
        }
        
    }

}
