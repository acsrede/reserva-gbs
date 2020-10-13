package com.gbs.reserva.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "reserva")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String codigo_reserva;

    @Temporal(TemporalType.TIMESTAMP)
    private Date data_reserva;

    private String request_id;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "reserva")
    private List<ReservaPrograma> reservaProgramaList;

}
