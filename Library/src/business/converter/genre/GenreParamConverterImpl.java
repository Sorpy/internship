package business.converter.genre;

import data.entity.Genre;
import dataaccess.dao.genredao.GenreDao;
import dataaccess.dao.genredao.GenreDaoImpl;

public class GenreParamConverterImpl implements GenreParamConverter {

    @Override
    public Genre convert(GenreParam param, Genre oldEntity) {
        Genre entity = null;
        if (oldEntity != null) {
            entity = oldEntity;
        } else {
            entity = new Genre();
            entity.setCode(param.getCode());
            entity.setID(param.getID());
        }
        entity.setName(param.getName());
        entity.setDescription(param.getDescription());
        return entity;
    }
}
