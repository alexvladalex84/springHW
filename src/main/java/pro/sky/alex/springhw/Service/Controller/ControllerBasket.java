package pro.sky.alex.springhw.Service.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.alex.springhw.Service.OrderService;

import java.util.List;

@RestController
@RequestMapping("/Order")
public class ControllerBasket {
    private final OrderService orderService;

    public ControllerBasket(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/add")
    public List<Integer> addAll(@RequestParam List<Integer> idList){
        return orderService.addAll(idList);
    }
    @GetMapping("/get")
    public List<Integer> getAll(){
        return orderService.getAll();
    }
}
