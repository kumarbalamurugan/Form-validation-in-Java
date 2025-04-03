package com.example.form.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.form.dao.FormDAO;
import com.example.form.entity.Forms;

@Service
public class Formservice {

    @Autowired
    private FormDAO formdao;

    public void saveform(Forms f) {
        formdao.save(f);
    }

    public Forms update(int id) {
        return formdao.findById(id).get();
    }

    public void deleteform(int id) {
        formdao.deleteById(id);
    }

    public List<Forms> retrive() {
        return formdao.findAll();
    }
}
