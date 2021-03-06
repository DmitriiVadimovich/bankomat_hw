package ru.iteco.behavioral.chain.bancomat.ruble;

import ru.iteco.behavioral.chain.bancomat.banknote.BanknoteHandler;

/**
 * TenRubleHandler.
 *
 * @author Ilya_Sukhachev
 */
public class TenRubleHandler extends RubleHandlerBase {

    protected  int value = 10;

    public TenRubleHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected int getValue() {
        return value;
    }
}
