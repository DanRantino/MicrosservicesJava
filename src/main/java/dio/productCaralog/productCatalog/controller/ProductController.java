package dio.productCaralog.productCatalog.controller;

import dio.productCaralog.productCatalog.model.Product;
import dio.productCaralog.productCatalog.repository.productRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private productRepository productRepository;

    @RequestMapping(method = RequestMethod.POST)
    Product createProduct(@RequestBody Product product)
    {
        return productRepository.save(product);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    Optional<Product> findById(@PathVariable Integer id)
    {
        return productRepository.findById(id);
    }
}
