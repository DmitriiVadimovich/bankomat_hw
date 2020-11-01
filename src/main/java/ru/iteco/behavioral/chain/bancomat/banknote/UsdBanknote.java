package ru.iteco.behavioral.chain.bancomat.banknote;

public class UsdBanknote extends Banknote{
    public UsdBanknote(String value) {
        super(CurrencyType.USD, value);
    }
}
