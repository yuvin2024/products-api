package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service

public class productService {
    private List<Product> products = new ArrayList<>();
    private  Long nextId = 1L;
    public List<Product> getAllProducts() {
        return products;
    }

    public  Product addProduct(Product product){
        product.setId(nextId++);    //use the value, then add one
        products.add(product);
        return product;
    }
    public Optional<Product> getProductById(Long nextId) {
        return products.stream()
                .filter(p ->p.getId().equals(nextId))
                .findFirst();
    }
    public void deleteProduct(Long id) {
        products.removeIf(p-> p.getId().equals(id));

    }
    public List<Product> findByName(String name) {
        return products.stream().filter(p->p.getName().contains(name)).toList();

    }


}
