package com.gbs.reserva.api;

import com.gbs.reserva.domain.Reserva;
import com.gbs.reserva.service.ReservaService;
import io.swagger.models.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1")
@RequiredArgsConstructor
public class ReservaController {

    private final ReservaService reservaService;

    @PostMapping("/reserva")
    public ResponseEntity<?> saveReservation(@RequestBody Reserva reserva) {
        return ResponseEntity.ok(reservaService.saveReservation(reserva));
    }

}
