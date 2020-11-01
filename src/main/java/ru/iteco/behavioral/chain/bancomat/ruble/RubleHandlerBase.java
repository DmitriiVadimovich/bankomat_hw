package ru.iteco.behavioral.chain.bancomat.ruble;

import ru.iteco.behavioral.chain.bancomat.banknote.*;

public abstract class RubleHandlerBase extends BanknoteHandler {
    protected RubleHandlerBase(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public boolean validate(Banknote banknote) {
        if (banknote.getValue().equals(String.valueOf(getValue()))
                && banknote.getCurrency().equals(CurrencyType.RUB)) {
            return true;
        }
        return super.validate(banknote);
    }

    @Override
    public boolean cash(Banknote banknote) {
        if (banknote.getCurrency().equals(CurrencyType.RUB)) {
            int issue = getValue();
            int entrance = Integer.parseInt(banknote.getValue());
            if(entrance/issue == 0) {
                return super.cash(banknote);
            } else {
                System.out.println("Выдано: " + entrance/issue + "*" + issue);
                if (entrance%issue == 0) {
                    return true;
                } else {
                    return super.cash(new RubBanknote(String.valueOf(entrance%issue)));
                }
            }
        }
        return super.cash(banknote);
    }

    protected abstract int getValue();
}
