package umc.devapp.crud_produtos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import umc.devapp.crud_produtos.entity.Produto;
import umc.devapp.crud_produtos.service.ProdutoService;

import java.util.List;
import java.util.Optional;

@RequestMapping("/produto")
@RestController
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    //retorna lista de produtos
    @GetMapping
    public ResponseEntity<List<Produto>> getAllProducts() {
        List<Produto> produtos = produtoService.getAllProductsService();
        return ResponseEntity.ok(produtos);
    }

    //retorna dados de um produto quando a id é fornecida
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Produto>> getProductService(@PathVariable Integer id) {
        Optional<Produto> produto = produtoService.getProductService(id);
        return ResponseEntity.ok(produto);
    }

    //insere um produto no database
    @PostMapping("/add")
    public ResponseEntity<Produto> addProduct(@RequestBody Produto produto) {
        Produto newProduct = produtoService.insertProductService(produto);
        return new ResponseEntity<>(newProduct, HttpStatus.CREATED);
    }

    //Atualiza um produto no database
    @PutMapping("/update")
    public ResponseEntity<Produto> updateProduct(@RequestBody Produto produto){
        Produto updatedProduct = produtoService.updateProductService(produto);
        return ResponseEntity.ok(updatedProduct);
    }

    //deleta os dados de um produto quando a id é fornecida
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Integer id) {
        produtoService.deleteProductByIdService(id);
        return ResponseEntity.noContent().build();
    }
}
