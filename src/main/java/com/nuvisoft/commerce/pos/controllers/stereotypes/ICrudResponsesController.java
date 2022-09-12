package com.nuvisoft.commerce.pos.controllers.stereotypes;

import java.util.Collection;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface ICrudResponsesController<Type> {

    @PostMapping("/add")
    public ResponseEntity<Type> create(@RequestBody Type type);

    @GetMapping("/readAll")
    public ResponseEntity<Collection<Type>> readAll();

    @PutMapping("/edit")
    public ResponseEntity<Type> edit(@RequestBody Type element);

    @DeleteMapping("/remove")
    public ResponseEntity<Type> delete(@RequestBody Type element);

}
