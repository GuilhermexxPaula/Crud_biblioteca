package br.com.senai.teste.model;

import jakarta.persistence.Entity;  
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;  
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="livros")
public class Livro{
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
    private  int id;
 private String titulo;
 private String autor ;
    private int  anoPublicacao;


public Livro(){

}

public Livro (String titulo, String autor, int anoPublicacao){

    this.titulo= titulo;
    this.autor=autor ;
    this.anoPublicacao=anoPublicacao;
}

public int getid(){
    return id;
}

public String gettitulo(){
    return titulo;
}

public void settitulo(String titulo){
    this.titulo=titulo;
}


public String getautor(){
    return autor;
}

public void setautor(String autor){
    this.autor=autor;
}

public int getanoPublicacao(){
    return anoPublicacao; 
}

public void setanoPublicacao(int anoPublicacao){
    this.anoPublicacao=anoPublicacao;
}




}