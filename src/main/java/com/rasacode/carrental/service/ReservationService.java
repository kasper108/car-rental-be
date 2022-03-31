package com.rasacode.carrental.service;

import com.rasacode.carrental.exception.ReservationNotFoundException;
import com.rasacode.carrental.model.Reservation;
import com.rasacode.carrental.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ReservationService {
    private final ReservationRepository reservationRepository;

    @Autowired
    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public Reservation addReservation(Reservation reservation){
        return reservationRepository.save(reservation);
    }

    public List<Reservation> findAllReservations(){
        return reservationRepository.findAll();
    }

    public Reservation updateReservation(Reservation reservation){
        return reservationRepository.save(reservation);
    }

    public void deleteReservation(Long id){
        reservationRepository.deleteReservationById(id);
    }

    public Reservation findReservationById(Long id){
        return reservationRepository.findReservationById(id).
                orElseThrow(() -> new ReservationNotFoundException("Reservation by id " + id + " was not found" ));
    }
}
