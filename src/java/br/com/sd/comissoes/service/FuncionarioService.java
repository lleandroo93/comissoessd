package br.com.sd.comissoes.service;

import br.com.sd.comissoes.dominio.Funcionario;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioService {

    private static List<Funcionario> funcionarios = new ArrayList<>();
    
    static {
        FuncaoService funcaoService = new FuncaoService();
        
        Funcionario bianca = new Funcionario();
        bianca.setId(1l);
        bianca.setNome("BIANCA");
        bianca.setFuncao(funcaoService.selecionarPorNome("GERENTE"));
        
        funcionarios.add(bianca);
    }
    
    public List<Funcionario> listar() {
        return funcionarios;
    }
    
    public void salvar(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public Funcionario selecionar(long id) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getId().equals(id)) {
                return funcionario;
            }
        }
        return null;
    }
}
