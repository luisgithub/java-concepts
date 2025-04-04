package com.lugarsoft.java_concepts.solid.interfaceseg;


import com.lugarsoft.java_concepts.domain.Entity;

public interface PersistenceService <T extends Entity> {
     public T save(T t );
     public T get(Long id);
     public void delete(Long id);
}
