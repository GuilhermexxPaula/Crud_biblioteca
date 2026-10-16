package br.com.senai.teste.dto;

import java.time.LocalDate;

public class EmprestimoRequest {
    private Integer livroId;
    private Integer alunoId;
    private LocalDate dataPrevistaDevolucao;

    public EmprestimoRequest() {
    }

    public Integer getLivroId() {
        return livroId;
    }
    public void setIdLivro(Integer livroId) {
        this.livroId = livroId;
    }
    public Integer getAlunoId() {
        return alunoId;
    }
    public void setIdAluno(Integer idAluno) {
        this.alunoId = alunoId;
    }
    public LocalDate getDataPrevistaDevolucao() {
        return dataPrevistaDevolucao;
    }
    public void setDataPrevistaDevolucao(LocalDate dataPrevistaDevolucao) {
        this.dataPrevistaDevolucao = dataPrevistaDevolucao;
    }



}
