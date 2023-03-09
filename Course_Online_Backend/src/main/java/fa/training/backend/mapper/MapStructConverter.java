package fa.training.backend.mapper;


public interface MapStructConverter<Entity, Model> {
    Model toModel(Entity e);

    Entity toEntity(Model o);
}
