package br.com.sd.comissoes.dominio;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@IdClass(MetaFuncionario.MetaFuncionarioID.class)
public class MetaFuncionario implements Serializable {

    private Meta meta;
    private Funcionario funcionario;

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
    @JoinColumn("funcionario_id")
    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.meta);
        hash = 53 * hash + Objects.hashCode(this.funcionario);
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
        final MetaFuncionario other = (MetaFuncionario) obj;
        if (!Objects.equals(this.meta, other.meta)) {
            return false;
        }
        if (!Objects.equals(this.funcionario, other.funcionario)) {
            return false;
        }
        return true;
    }
    
    public class MetaFuncionarioID implements Serializable{
        private Long meta;
        private Long funcionario;

        public Long getMeta() {
            return meta;
        }

        public void setMeta(Long meta) {
            this.meta = meta;
        }

        public Long getFuncionario() {
            return funcionario;
        }

        public void setFuncionario(Long funcionario) {
            this.funcionario = funcionario;
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 17 * hash + Objects.hashCode(this.meta);
            hash = 17 * hash + Objects.hashCode(this.funcionario);
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
            final MetaFuncionarioID other = (MetaFuncionarioID) obj;
            if (!Objects.equals(this.meta, other.meta)) {
                return false;
            }
            if (!Objects.equals(this.funcionario, other.funcionario)) {
                return false;
            }
            return true;
        }
        
    }
    
}
