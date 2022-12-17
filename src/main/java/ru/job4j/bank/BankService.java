package ru.job4j.bank;

import java.util.*;
import java.util.Map;

/**
 *  В данном классе находится главный сервис
 */
public class BankService {

    /**
     * Это поле содержит всех пользователей системы с привязанными к ним счетами:
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Этот метод должен добавить пользователя в систему:
     * @param user (пользователь)
     */
    public void addUser(User user) {
            users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Данный метод должен добавить новый счет к пользователю:
     * @param passport (пасспорт)
     * @param account (счет)
     * Первоначально пользователя нужно найти по паспорту. Для этого нужно использовать метод findByPassport.
     * После этого мы получим список всех счетов пользователя и добавим новый счет к ним.
     * В этом методе должна быть проверка, что такого счета у пользователя еще нет.
     */
    public void addAccount(String passport, Account account) {
       Optional<User> user = findByPassport(passport);
       if (user.isPresent()) {
           List<Account> accounts = users.get(user.get());
           if (!accounts.contains(account)) {
               accounts.add(account);
           }
       }
    }

    /**
     * Этот метод ищет пользователя по номеру паспорта
     * Здесь нужно использовать перебор всех элементов через цикл for-earch и метод Map.keySet.
     * Если ничего не найдено - метод должен вернуть null.
     * @param passport (паспорт)
     * @return возращает имя пользователя
     */
    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Следующий метод ищет счет пользователя по реквизитам:
     * Сначала нужно найти пользователя по паспорту с помощью метода findByPassport.
     * Потом получить список счетов этого пользователя и в нем найти нужный счет.
     * Поскольку метод findByPassport может вернуть null, то прежде чем получать список аккаунтов,
     * требуется проверить что метод findByPassport вернул отличное от null значение.
     * @param passport (пасспорт)
     * @param requisite (реквизиты)
     * @return номер счета
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> listAccountsUser = users.get(user.get());
            return users.get(user.get())
                    .stream()
                    .filter(account -> account.getRequisite().equals(requisite))
                    .findFirst();

        }
        return Optional.empty();
    }

    /**
     * Последний метод предназначен для перечисления денег с одного счёта на другой счёт:
     *
     * Если счёт не найден или не хватает денег на счёте srcAccount (с которого переводят),
     * то метод должен вернуть false.
     *
     * @param srcPassport паспорт того, кто переводит
     * @param srcRequisite реквизиты того, кто переводит
     * @param destPassport паспорт того, кому переводят
     * @param destRequisite реквизты того, кому переводят
     * @param amount количество денег
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                              String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Optional<Account> accountFrom = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> accountTo   = findByRequisite(destPassport, destRequisite);
        if (accountFrom.isPresent() && accountTo.isPresent() && accountFrom.get().getBalance() >= amount) {
            accountFrom.get().setBalance(accountFrom.get().getBalance() - amount);
            accountTo.get().setBalance(accountTo.get().getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}