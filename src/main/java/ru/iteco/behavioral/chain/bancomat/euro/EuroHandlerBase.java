package ru.iteco.behavioral.chain.bancomat.euro;

import ru.iteco.behavioral.chain.bancomat.banknote.*;

public abstract class EuroHandlerBase extends BanknoteHandler {
    protected EuroHandlerBase(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public boolean validate(Banknote banknote) {
        if (banknote.getValue().equals(String.valueOf(getValue()))
                &&banknote.getCurrency().equals(CurrencyType.EUR)) {
            return true;
        }
        return super.validate(banknote);
    }

    @Override
    public boolean cash(Banknote banknote) {
        if (banknote.getCurrency().equals(CurrencyType.EUR)) {
            int issue = getValue();
            int entrance = Integer.parseInt(banknote.getValue());
            if(entrance/issue == 0) {
                return super.cash(banknote);
            } else {
                System.out.println("Выдано: " + entrance/issue + "*" + issue);
                if (entrance%issue == 0) {
                    return true;
                } else {
                    return super.cash(new EurBanknote(String.valueOf(entrance%issue)));
                }
            }
        }
        return super.cash(banknote);
    }
}
