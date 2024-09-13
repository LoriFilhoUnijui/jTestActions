/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.br.unijui.jtestactions;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lorij
 */
public class PessoaService {
    
    private List<PessoaModel> pessoas;
    
    public PessoaService(){
        pessoas = new ArrayList<>();
    }
    
    public void addPessoa(PessoaModel pessoaModel){
        this.pessoas.add(pessoaModel);
    }
    
    public List<PessoaModel> getPessoas(){
        return this.pessoas;
    }
    
    public PessoaModel getPessoaByNome(String nome){
        return this.pessoas.stream()
                .filter((p) -> p.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElse(null);
    }
}
