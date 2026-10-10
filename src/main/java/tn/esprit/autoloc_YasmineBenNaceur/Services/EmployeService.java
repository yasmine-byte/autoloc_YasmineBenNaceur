package tn.esprit.autoloc_YasmineBenNaceur.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc_YasmineBenNaceur.Repositories.EmployeRepository;
import tn.esprit.autoloc_YasmineBenNaceur.entity.Employe;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeService implements IEmployeService {
    private EmployeRepository employeRepository;

    @Override
    public Employe addEmploye(Employe obj) {
        return employeRepository.save(obj);
    }

    @Override
    public Employe updateEmploye(Employe obj) {
        return employeRepository.save(obj);
    }

    @Override
    public void supprimerEmploye(Long id) {
        employeRepository.deleteById(id);
    }

    @Override
    public List<Employe> recupererEmployes() {
        return employeRepository.findAll();
    }
}
