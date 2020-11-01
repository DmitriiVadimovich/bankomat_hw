package ru.iteco.behavioral.chain.bancomat.dollar;

import ru.iteco.behavioral.chain.bancomat.banknote.BanknoteHandler;

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
    public boolean validate(String banknote) {
        if (banknote.equals(String.valueOf(getValue()))) {
            return true;
        }
        return super.validate(banknote);
    }

    protected abstract int getValue();
}
