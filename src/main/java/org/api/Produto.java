package org.api;

    public record Produto(Long id , String produto , Double preco, String link , String descricao , String img){

    public Produto(String produto , Double preco,String link , String descricao , String img){
        this(   null,
                produto ,
                preco ,
                link ,
                descricao,
                img);
    }
}
