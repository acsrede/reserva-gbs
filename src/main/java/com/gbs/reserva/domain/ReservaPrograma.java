package com.gbs.reserva.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "reserva_programa")
public class ReservaPrograma {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String id_programa;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reserva_id")
    private Reserva reserva;

    private Integer quantidade;

    private Integer tempo;

    @Temporal(TemporalType.TIMESTAMP)
    private Date data_exibicao;

}
