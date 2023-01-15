package pl.edu.wszib.lab4.orderItem;

import pl.edu.wszib.lab4.CommandHandler;
import pl.edu.wszib.lab4.order.OrderCreateCommand;


public class OrderItemAddCommandHandler implements CommandHandler<OrderCreateCommand> {
    @Override
    public void handle(OrderCreateCommand command) {

        System.out.println("Real impl for command = " + command);
    }
}

