package com.parimal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parimal.model.CurrentUserSession;

@Repository
public interface CurrentUserSessionRepositoryDAO extends JpaRepository<CurrentUserSession, Integer>
{

	public CurrentUserSession findByUuid(String uuid);

}
