package com.angular.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.angular.springboot.model.Nouveaute;
import com.angular.springboot.model.Utilisateur;
import com.angular.springboot.repository.NouveauteRepository;
import com.angular.springboot.repository.UtilisateurRepository;

@Service
@Transactional
public class UtilisateurServiceImpl implements UtilisateurService{

	@Autowired 
	UtilisateurRepository agentUtilisateur ;
	
	@Override
	public List<Utilisateur> getAllUtilisateur() {
		// TODO Auto-generated method stub
		return (List<Utilisateur>) (agentUtilisateur.findAll());
	}

	@Override
	public Utilisateur getUtilisateurById(long id) {
		// TODO Auto-generated method stub
		return (agentUtilisateur.findById(id).get());
	}

	@Override
	public void saveOrUpdate(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		agentUtilisateur.save(utilisateur);
		
	}

	@Override
	public void deleteUtilisateur(long id) {
		// TODO Auto-generated method stub
		agentUtilisateur.deleteById(id);
		
	}

}
