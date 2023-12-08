/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.map1;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import java.util.List;

/**
 *
 * @author safda
 */
@Entity
public class Project {
    @Id
    private int pid;
    @Column(name = "project_name")
    private String projectName;
    @ManyToMany(mappedBy = "projects")
    private List<Emp> employes;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<Emp> getEmployes() {
        return employes;
    }

    public void setEmployes(List<Emp> employes) {
        this.employes = employes;
    }

    public Project() {
    }

    public Project(int pid, String projectName, List<Emp> employes) {
        this.pid = pid;
        this.projectName = projectName;
        this.employes = employes;
    }
    
    
}
