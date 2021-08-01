package dio.productCaralog.productCatalog.repository;

import dio.productCaralog.productCatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface productRepository extends CrudRepository<Product,Integer> {
}
