package umc.devapp.crud_produtos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import umc.devapp.crud_produtos.entity.Produto;
import umc.devapp.crud_produtos.repository.ProdutoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    @Autowired
    ProdutoRepository produtoRepository;

    public List<Produto> getAllProductsService() {
        List<Produto> produtos = produtoRepository.findAll();
        return produtos;
    }

    public Optional<Produto> getProductService(Integer id) {
        Optional<Produto> produto = produtoRepository.findById(id);
        if (produto.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "não foi encontrado");
        } else {
            return produto;
        }
    }

    public Produto insertProductService(Produto produto) {
        return produtoRepository.save(produto);
    }

    public void deleteProductByIdService(Integer id){
        produtoRepository.deleteById(id);
    }

    public Produto updateProductService(Produto produto) {
        Produto updatedProduct = produtoRepository.findById(produto.getId()).get();
        updatedProduct = produto;
        return produtoRepository.save(updatedProduct);
    }
}
