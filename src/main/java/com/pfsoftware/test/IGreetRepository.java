package com.pfsoftware.test;

import org.springframework.data.repository.CrudRepository;

public interface IGreetRepository extends CrudRepository<Greeting, Long> {
}