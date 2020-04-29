package com.codygym.demo.repo;

        import com.codygym.demo.entity.model.Customer;
        import org.springframework.data.domain.Page;
        import org.springframework.data.domain.Pageable;
        import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepository extends PagingAndSortingRepository<Customer,Long> {

        Page<Customer> findByFullNameContaining(String fullName, Pageable pageable);
}
