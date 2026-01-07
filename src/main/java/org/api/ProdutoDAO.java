package org.api;

import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
@Repository
public class ProdutoDAO {
    public void salvar(Produto produto) {

        String sql = """
            INSERT INTO produtos (produto, preco, link, descricao ,imagem_url)
            VALUES (?, ?, ?, ? ,?)
        """;

        try (
                var conexao = Conexao.connection();
                var stmt = conexao.prepareStatement(sql)
        ) {

            stmt.setString(1, produto.produto());
            stmt.setDouble(2, produto.preco());
            stmt.setString(3, produto.link());
            stmt.setString(4, produto.descricao());

            stmt.executeUpdate();

        } catch (Exception e) {
            throw new RuntimeException("Erro ao salvar produto", e);
        }
    }

    public List<Produto> buscarTodos() {

        List<Produto> produtos = new ArrayList<>();

        String sql = """
            SELECT id, produto, preco, link, descricao ,imagem_url
            FROM produtos
        """;

        try (
                var conexao = Conexao.connection();
                var stmt = conexao.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()
        ) {

            while (rs.next()) {
                Produto produto = new Produto(
                        rs.getLong("id"),
                        rs.getString("produto"),
                        rs.getDouble("preco"),
                        rs.getString("link"),
                        rs.getString("descricao"),
                        rs.getString("img")
                );
                produtos.add(produto);
            }

        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar produtos", e);
        }

        return produtos;
    }
    public void excluir(Long id) {

        String sql = "DELETE FROM produtos WHERE id = ?";

        try (
                var conexao = Conexao.connection();
                var stmt = conexao.prepareStatement(sql)
        ) {

            stmt.setLong(1, id);
            stmt.executeUpdate();

        } catch (Exception e) {
            throw new RuntimeException("Erro ao excluir produto", e);
        }
    }

}
