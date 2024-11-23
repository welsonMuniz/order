package com.welsonmuniz.order.services;

import com.welsonmuniz.order.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public Double shipment(Order order){
        if (order.getBasic() < 100 ){
            return 20.0;
        }
        if (order.getBasic() < 199 ){
            return 12.0;
        }
        return 0.0;
    }
}
