package pl.edu.wszib.lab4.orderItem;

import pl.edu.wszib.lab4.Command;

public record OrderItemAddCommand(
        String orderId,
        String productId,
        Integer quantity
) implements Command {

}

