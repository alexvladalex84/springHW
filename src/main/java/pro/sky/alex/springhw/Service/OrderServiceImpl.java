package pro.sky.alex.springhw.Service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final Basket basket;

    public OrderServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public List<Integer> addAll(List<Integer> idList) {
       return basket.addItems(idList);

    }

    @Override
    public List<Integer> getAll() {
        return basket.getItems();
    }
}
