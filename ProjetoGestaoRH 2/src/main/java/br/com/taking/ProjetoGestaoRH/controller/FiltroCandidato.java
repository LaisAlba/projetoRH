package br.com.taking.ProjetoGestaoRH.controller;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class FiltroCandidato {



    private String role;

    private String companyName;

    private String activitiesPerformed;

    public String getRole() {
        return role;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getActivitiesPerformed() {
        return activitiesPerformed;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setActivitiesPerformed(String activitiesPerformed) {
        this.activitiesPerformed = activitiesPerformed;
    }

}

