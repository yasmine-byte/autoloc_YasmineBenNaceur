package tn.esprit.autoloc_YasmineBenNaceur.Services;

import tn.esprit.autoloc_YasmineBenNaceur.entity.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation addReservation(Reservation obj);
    Reservation updateReservation(Reservation obj);
    void supprimerReservation(Long id);
    List<Reservation> recupererReservations();
}
