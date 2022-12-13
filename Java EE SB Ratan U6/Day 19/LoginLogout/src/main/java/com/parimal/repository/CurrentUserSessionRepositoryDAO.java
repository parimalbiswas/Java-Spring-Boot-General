package com.parimal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parimal.model.CurrentUserSession;

public interface CurrentUserSessionRepositoryDAO extends JpaRepository<CurrentUserSession, Integer>
{

	public CurrentUserSession findByUuid();

}
