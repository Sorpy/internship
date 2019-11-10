package business.converter.bookstatus;

import data.entity.BookStatus;

public class BookStatusParamConverterImpl implements BookStatusParamConverter {


        @Override
        public BookStatus convert(BookStatusParam param, BookStatus oldEntity) {
            BookStatus entity = null;
            if (oldEntity != null) {
                entity = oldEntity;
            } else {
                entity = new BookStatus();
                entity.setCode(param.getCode());
                entity.setId(param.getId());
            }
            entity.setName(param.getName());
            entity.setDescription(param.getDescription());
            return entity;
        }
}
