package ru.iteco.behavioral.chain.bancomat.dollar;

import ru.iteco.behavioral.chain.bancomat.banknote.Banknote;
import ru.iteco.behavioral.chain.bancomat.banknote.BanknoteHandler;
import ru.iteco.behavioral.chain.bancomat.banknote.CurrencyType;
import ru.iteco.behavioral.chain.bancomat.banknote.UsdBanknote;

/**
 * TenRubleHandler.
 *
 * @author Ilya_Sukhachev
 */
public abstract class DollarHandlerBase extends BanknoteHandler {
    protected DollarHandlerBase(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public boolean validate(Banknote banknote) {
        if (banknote.getValue().equals(String.valueOf(getValue()))
        &&banknote.getCurrency().equals(CurrencyType.USD)) {
            return true;
        }
        return super.validate(banknote);
    }

    @Override
    public boolean cash(Banknote banknote) {
        if (banknote.getCurrency().equals(CurrencyType.USD)) {
            int issue = getValue();
            int entrance = Integer.parseInt(banknote.getValue());
            if(entrance/issue == 0) {
                return super.cash(banknote);
            } else {
                System.out.println("Выдано: " + entrance/issue + "*" + issue);
                if (entrance%issue == 0) {
                    return true;
                } else {
                    return super.cash(new UsdBanknote(String.valueOf(entrance%issue)));
                }
            }
        }
        return super.cash(banknote);
    }
}
