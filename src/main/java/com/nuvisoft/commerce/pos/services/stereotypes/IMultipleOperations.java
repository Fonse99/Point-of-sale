package com.nuvisoft.commerce.pos.services.stereotypes;

import java.util.Collection;

public interface IMultipleOperations <Type, Id> {
    
    public Collection<Type> deleteAll(Collection<Type> elements);
    public Collection<Type> addAll(Collection<Type> elements);
}
