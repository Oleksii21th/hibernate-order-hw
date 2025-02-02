package mate.academy.dao;

import java.util.List;
import mate.academy.model.Order;
import mate.academy.model.User;

public interface OrderDao {
    Order save(Order order);

    List<Order> getByUser(User user);
}
