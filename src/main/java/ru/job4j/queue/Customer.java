package ru.job4j.queue;

import java.util.Objects;

/**
 * У Вас есть следующая модель данных, которая описывает клиента магазина:
 */
public record Customer(String name, int amount) {

    public Customer {
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int amount() {
        return amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Customer customer = (Customer) o;
        return amount == customer.amount && Objects.equals(name, customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, amount);
    }

    @Override
    public String toString() {
        return "Customer{" + "name='" + name + '\'' + ", amount=" + amount + '}';
    }
}