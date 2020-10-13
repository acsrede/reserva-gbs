package com.gbs.reserva.service;

import com.gbs.reserva.domain.Reserva;
import com.gbs.reserva.domain.model.response.ResponseReserva;
import com.gbs.reserva.repository.ReservaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReservaService {

    private final ReservaRepository reservaRepository;

    public ResponseReserva saveReservation(Reserva reserva) {
        var result = reservaRepository.save(reserva);
        return ResponseReserva.builder().codigo_reserva(result.getCodigo_reserva().toUpperCase()).build();
    }

}
