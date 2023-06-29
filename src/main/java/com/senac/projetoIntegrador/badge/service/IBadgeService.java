package com.senac.projetoIntegrador.badge.service;

import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;

import com.senac.projetoIntegrador.badge.dto.BadgeDto;

public interface IBadgeService {
	public List<BadgeDto> getLatestBadgesByUsuarioId(String usuarioId) throws EmptyResultDataAccessException;
}
