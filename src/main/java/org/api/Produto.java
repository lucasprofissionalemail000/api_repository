package org.api;

    public record Produto(Long id , String produto , Double preco, String link , String descricao , String imagem_url){

    public Produto(String produto , Double preco,String link , String descricao , String imagem_url){
        this(   null,
                produto ,
                preco ,
                link ,
                descricao,
                imagem_url);
    }
}
