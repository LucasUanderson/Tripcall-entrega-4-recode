package com.api.tripcallv.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.tripcallv.model.ClienteModel;

@Repository
public interface ClienteRepository extends CrudRepository<ClienteModel,Long> {

   

}
