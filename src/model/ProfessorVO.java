/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Rauch
 */
public class ProfessorVO {
    private int professor_id;
    private int RA;
    private String nome;
    private int idade;
    private String endereco;
    private String departamento;
    private String linha_pesquisa;
    private String disciplinas;

    /**
     * @return the professor_id
     */
    public int getProfessor_id() {
        return professor_id;
    }

    /**
     * @param professor_id the professor_id to set
     */
    public void setProfessor_id(int professor_id) {
        this.professor_id = professor_id;
    }

    /**
     * @return the RA
     */
    public int getRA() {
        return RA;
    }

    /**
     * @param RA the RA to set
     */
    public void setRA(int RA) {
        this.RA = RA;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the departamento
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     * @return the linha_pesquisa
     */
    public String getLinha_pesquisa() {
        return linha_pesquisa;
    }

    /**
     * @param linha_pesquisa the linha_pesquisa to set
     */
    public void setLinha_pesquisa(String linha_pesquisa) {
        this.linha_pesquisa = linha_pesquisa;
    }

    /**
     * @return the disciplinas
     */
    public String getDisciplinas() {
        return disciplinas;
    }

    /**
     * @param disciplinas the disciplinas to set
     */
    public void setDisciplinas(String disciplinas) {
        this.disciplinas = disciplinas;
    }
    
}
