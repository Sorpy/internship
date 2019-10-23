package business.processor.orderprocessor;

import business.converter.order.OrderParam;
import business.converter.order.OrderResult;

import java.util.List;

public interface OrderProcessor {
    OrderResult create(OrderParam param);
    List<OrderResult> create(List<OrderParam> param);

    void update(long id,OrderParam param);
    void update(List<OrderParam> param);

    void delete(long id);
    void delete(List<Long> idList);

    OrderResult find(long id);
    List<OrderResult> find();
}
