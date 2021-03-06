package com.seu.ums.Service;

import com.seu.ums.Entity.Phone;
import com.seu.ums.Repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PhoneService {


    @Autowired
    private PhoneRepository phoneRepository;


    public List<Phone> getAllPhone(){
        return (List<Phone>) phoneRepository.findAll();
    }

    public Optional<Phone> getPhone(int id){
        return phoneRepository.findById(id);
    }

    public void addPhone(Phone phone){
        phoneRepository.save(phone);
    }

    public void updatePhone(Phone phone){
        phoneRepository.save(phone);
    }

    public void deletePhone(int id){
        phoneRepository.deleteById(id);
    }
}
