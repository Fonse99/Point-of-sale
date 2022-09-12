package com.nuvisoft.commerce.pos.services.stereotypes;

import java.util.Collection;
import java.util.Optional;

public interface ICrudOperations<Type, Id> {

    public Type create(Type element);

    public Collection<Type> readAll();

    public Optional<Type> readById(Id id);

    public Type edit(Type element);

    public Type delete(Type element);

}
