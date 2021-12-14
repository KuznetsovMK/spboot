package ru.gb.sbboot;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.gb.sbboot.entity.Product;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;

@Component
@Scope("prototype")
public class Cart implements Consumer<Product> {

    private final ConcurrentHashMap<Product, Integer> productMap = new ConcurrentHashMap<>();

    public void add(Product product) {
        productMap.put(product, productMap.containsKey(product) ? productMap.get(product) + 1 : 1);
    }

    public void deleteByProductId(Integer id) {

        for (Map.Entry<Product, Integer> o : productMap.entrySet()) {
            if (o.getKey().getId().equals(id)) {
                if (o.getValue() > 1) {
                    productMap.put(o.getKey(), o.getValue() - 1);
                } else {
                    productMap.remove(o.getKey());
                }
            }
        }
    }

    public void showProductList() {
        System.out.println(productMap);
    }

    @Override
    public void accept(Product product) {
        add(product);
    }
}
