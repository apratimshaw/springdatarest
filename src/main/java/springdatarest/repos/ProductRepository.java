package springdatarest.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import springdatarest.entities.Product;

@RepositoryRestResource(collectionResourceRel = "products", path = "products")
public interface ProductRepository extends CrudRepository<Product, Long> {
    List<Product> findById(long id);
}
