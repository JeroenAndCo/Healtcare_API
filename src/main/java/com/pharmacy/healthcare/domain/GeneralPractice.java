package com.pharmacy.healthcare.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "generalPractice")
public class GeneralPractice extends MedicalCompany {

//    @OneToOne(mappedBy = "medicalCompany", fetch = FetchType.EAGER)
//    private MedicalCompany medicalCompany;

    public GeneralPractice(Long id, String name, String street, String city, String number, String telNumber) {
        super(id, name, street, city, number, telNumber);
    }
}
