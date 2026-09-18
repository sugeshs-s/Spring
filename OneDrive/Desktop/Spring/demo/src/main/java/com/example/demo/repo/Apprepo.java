package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.AppModel;

@Repository
public interface AppRepo extends JpaRepository<AppModel, Long> {

}