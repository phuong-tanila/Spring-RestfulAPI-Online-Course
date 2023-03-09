package fa.training.backend.mapper;

import fa.training.backend.entities.BaseEntity;
import org.mapstruct.Mapper;


public interface MapStructConverter<Entity, Model> {
    Model toModel(Entity e);

    Entity toEntity(Model o);
}
