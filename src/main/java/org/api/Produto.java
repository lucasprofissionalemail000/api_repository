package org.api;

    public record Produto(Long id , String produto , Double preco, String link , String descricao){

    public Produto(String produto , Double preco,String link , String descricao){
        this(   null,
                produto ,
                preco ,
                link ,
                descricao);
    }
}
