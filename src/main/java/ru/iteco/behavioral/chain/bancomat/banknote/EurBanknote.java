package ru.iteco.behavioral.chain.bancomat.banknote;

public class EurBanknote extends Banknote{
    public EurBanknote(String value) {
        super(CurrencyType.EUR, value);
    }
}
