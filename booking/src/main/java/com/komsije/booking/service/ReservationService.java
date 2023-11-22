package com.komsije.booking.service;

import com.komsije.booking.model.Host;
import com.komsije.booking.model.Reservation;
import com.komsije.booking.repository.HostRepository;
import com.komsije.booking.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;

    public Reservation findOne(Long id) {return reservationRepository.findById(id).orElseGet(null);}
    public List<Reservation> findAll() {return reservationRepository.findAll();}
    public Reservation save(Reservation accommodation) {return reservationRepository.save(accommodation);}
    public void remove(Long id) {reservationRepository.deleteById(id);}
}
