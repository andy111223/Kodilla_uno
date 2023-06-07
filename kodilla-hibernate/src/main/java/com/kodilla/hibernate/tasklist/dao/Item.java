package com.kodilla.hibernate.tasklist.dao;

import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public interface Item extends CrudRepository<Item, Integer> {
}
