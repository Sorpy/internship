package business.converter.order;

import data.entity.Order;

public class OrderResultConverterImpl implements OrderResultConverter {
    @Override
    public OrderResult convert(Order param) {
        OrderResult orderResult = new OrderResult();
        orderResult.setCode(param.getCode());
        orderResult.setName(param.getName());
        orderResult.setDescription(param.getDescription());
        orderResult.setID(param.getID());
        orderResult.setAccountClientId(param.getAccountClient().getID());
        orderResult.setAccountLibrarianId(param.getAccountLibrarian().getID());
        orderResult.setBookId(param.getBook().getID());
        orderResult.setAccountClientName(param.getAccountClient().getFirstName() + " " + param.getAccountClient().getLastName());
        orderResult.setAccountLibrarianName(param.getAccountLibrarian().getFirstName() + " " + param.getAccountLibrarian().getLastName());
        orderResult.setBookName(param.getBook().getBookName());
        orderResult.setDate(param.getDate());
        return orderResult;
    }
}
