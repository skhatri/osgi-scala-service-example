package util.impl;

import util.CashTransaction;

public class CashTransactionImpl implements CashTransaction {
    @Override
    public String findAll() {
        System.out.println("find all cash transactions");
        return "[]";
    }

    @Override
    public String find(String id) {
        System.out.println("find cash transaction " + id);
        return "{}";
    }
}
