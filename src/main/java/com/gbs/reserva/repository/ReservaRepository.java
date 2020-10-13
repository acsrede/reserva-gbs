package com.gbs.reserva.repository;

import com.gbs.reserva.domain.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {}
