package com.senac.projetoIntegrador.badge.repository;

import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;

import com.senac.projetoIntegrador.badge.dto.BadgeDto;

public interface IBadgeRepository {
	public List<BadgeDto> getLatestBadgesByUsuarioId(String usuarioId) throws EmptyResultDataAccessException;
}
