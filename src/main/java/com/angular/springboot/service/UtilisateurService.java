package com.angular.springboot.service;

import java.util.List;

import com.angular.springboot.model.Utilisateur;

public interface UtilisateurService {
	public List<Utilisateur> getAllUtilisateur();
	public Utilisateur getUtilisateurById(long id);
	public void saveOrUpdate (Utilisateur utilisateur);
	public void deleteUtilisateur(long id);
}
