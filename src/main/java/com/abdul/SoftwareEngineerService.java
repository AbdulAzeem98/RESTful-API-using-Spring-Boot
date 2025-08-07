package com.abdul;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftwareEngineerService {

    private final SoftwareEngineerRepository softwareEngineerRepository;

    public SoftwareEngineerService(SoftwareEngineerRepository softwareEngineerRepository) {
        this.softwareEngineerRepository = softwareEngineerRepository;
    }

    public List<SoftwareEngineer> getAllSoftwareEngineers() {
        return softwareEngineerRepository.findAll();
    }

    public void insertSoftwareEngineer(SoftwareEngineer softwareEngineer) {
        softwareEngineerRepository.save(softwareEngineer);
    }

    public SoftwareEngineer getSoftwareEngineerById(Integer id) {
        return softwareEngineerRepository.findById(id).orElseThrow(()-> new IllegalStateException(id + " not found"));
    }

    public void deleteSoftwareEngineerById(Integer id) {
        softwareEngineerRepository.deleteById(id);
    }

    @Transactional
    public void updateSoftwareEngineerById(Integer id, SoftwareEngineer updatedSoftwareEngineer) {
        SoftwareEngineer existingEngineer = softwareEngineerRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("SoftwareEngineer with id " + id + " not found"));
        // Update fields - you can customize as needed
        existingEngineer.setName(updatedSoftwareEngineer.getName());
        existingEngineer.setTechStack(updatedSoftwareEngineer.getTechStack());

        // Save updated entity; since existingEngineer is managed by JPA due to transactional context,
        // this save will perform an update (merge).
        softwareEngineerRepository.save(existingEngineer);
    }
}
