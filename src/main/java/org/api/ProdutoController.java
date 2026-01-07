package org.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProdutoController {

    @GetMapping("/produtos")
    public List<Produto> listar() {
        produtoDAO dao = new produtoDAO();
        return dao.buscarTodos();
    }
}