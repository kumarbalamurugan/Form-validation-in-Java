package com.example.form.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.form.entity.Forms;

public interface FormDAO extends JpaRepository<Forms, Integer>{

}
