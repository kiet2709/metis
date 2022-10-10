package com.metis.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.metis.book.model.user.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
