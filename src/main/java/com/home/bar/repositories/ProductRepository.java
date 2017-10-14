package com.home.bar.repositories;

import com.home.bar.models.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Repository that allows to perform various operations involving {@link Product} objects.
 * It gets these operations by extending the {@link PagingAndSortingRepository} interface defined in Spring Data Commons.
 * <p>
 * At runtime, Spring Data REST will create an implementation of this interface automatically.
 */
public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {
}
