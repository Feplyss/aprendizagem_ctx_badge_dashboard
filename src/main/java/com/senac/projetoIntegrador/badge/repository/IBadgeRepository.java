package com.senac.projetoIntegrador.badge.repository;

import java.util.List;

import com.senac.projetoIntegrador.badge.dto.BadgeDto;
import com.senac.projetoIntegrador.badge.exceptions.UserNotFoundException;

public interface IBadgeRepository {
	public List<BadgeDto> getLatestBadgesByUsuarioId(String usuarioId) throws UserNotFoundException;
}
