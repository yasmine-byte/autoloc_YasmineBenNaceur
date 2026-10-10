package tn.esprit.autoloc_YasmineBenNaceur.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc_YasmineBenNaceur.Repositories.ReservationRepository;
import tn.esprit.autoloc_YasmineBenNaceur.entity.Reservation;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationService implements IReservationService {
    private ReservationRepository reservationRepository;

    @Override
    public Reservation addReservation(Reservation obj) {
        return reservationRepository.save(obj);
    }

    @Override
    public Reservation updateReservation(Reservation obj) {
        return reservationRepository.save(obj);
    }

    @Override
    public void supprimerReservation(Long id) {
        reservationRepository.deleteById(id);
    }

    @Override
    public List<Reservation> recupererReservations() {
        return reservationRepository.findAll();
    }
}
