/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.br.unijui.jtestactions;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lorij
 */
public class PessoaServiceTest {
        
    
    private PessoaService pessoaService;
    
    @BeforeEach
    public void setUp() {
        pessoaService = new PessoaService();
    }
   

    /**
     * Test of addPessoa method, of class PessoaService.
     */
    @org.junit.jupiter.api.Test
    public void testAddPessoa() {
        System.out.println("addPessoa");
        PessoaModel pessoaModel = PessoaModel.builder().nome("Lori").build();
        
        pessoaService.addPessoa(pessoaModel);
        
        assertEquals(pessoaService.getPessoas().size(), 1);
        assertTrue(pessoaService.getPessoas().get(0).getNome().equals(pessoaModel.getNome()));
    }

    /**
     * Test of getPessoaByNome method, of class PessoaService.
     */
    @org.junit.jupiter.api.Test
    public void testGetPessoaByNome() {
        System.out.println("getPessoaByNome");
        String nome = "Lori";
        
        PessoaModel expResult = PessoaModel.builder().nome("LORI").build();
        pessoaService.addPessoa(expResult);
        
        PessoaModel result = pessoaService.getPessoaByNome(nome);
        assertTrue(result != null);
    }
    
}
