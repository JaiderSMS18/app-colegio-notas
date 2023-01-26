package com.colegio.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.colegio.entity.Usuario;

@EnableScan
@Repository
public interface IUsuarioRepo extends CrudRepository<Usuario, Integer>{

	/*@Autowired
    private DynamoDBMapper dynamoDBMapper;


    public Usuario save(Usuario usuario) {
        dynamoDBMapper.save(usuario);
        return usuario;
    }
/*
    public Usuario getEmployeeById(Integer usuarioId) {
        return dynamoDBMapper.load(Usuario.class, usuarioId);
    }

    public String delete(Integer usuarioId) {
    	Usuario emp = dynamoDBMapper.load(Usuario.class, usuarioId);
        dynamoDBMapper.delete(emp);
        return "Employee Deleted!";
    }

    public Integer update(Integer usuarioId, Usuario usuario) {
    	String usuarioStrindId = String.valueOf(usuarioId);
        dynamoDBMapper.save(usuario,
                new DynamoDBSaveExpression()
        .withExpectedEntry("usuarioId",
                new ExpectedAttributeValue(
                        new AttributeValue().withS(usuarioStrindId)
                )));
        return usuarioId;
    }
	*/
}
