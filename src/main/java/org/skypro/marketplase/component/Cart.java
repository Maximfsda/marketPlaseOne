package org.skypro.marketplase.component;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class Cart {

    private final List<Integer> userCart = new ArrayList<>();



    public void addToCart(List<Integer> idsToAdd){
        userCart.addAll(idsToAdd);

    }

    public List<Integer> getCartContent(){
        return Collections.unmodifiableList(userCart);

    }
}
