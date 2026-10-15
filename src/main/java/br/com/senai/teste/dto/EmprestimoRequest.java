package br.com.senai.teste.dto;

public class EmprestimoRequest {
    private Integer livroId;
    private Integer alunoId;

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

}
