package br.com.senai.teste.dto;

public class EmprestimoRequest {
    private Integer idLivro;
    private Integer idAluno;

    public EmprestimoRequest() {
    }

    public Integer getIdLivro() {
        return idLivro;
    }
    public void setIdLivro(Integer idLivro) {
        this.idLivro = idLivro;
    }
    public Integer getIdAluno() {
        return idAluno;
    }
    public void setIdAluno(Integer idAluno) {
        this.idAluno = idAluno;
    }

}
