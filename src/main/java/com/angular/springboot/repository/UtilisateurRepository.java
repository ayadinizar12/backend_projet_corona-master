package com.angular.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.angular.springboot.model.Utilisateur;

public interface UtilisateurRepository extends CrudRepository<Utilisateur,Long> {



}
