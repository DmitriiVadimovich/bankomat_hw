package ru.iteco.behavioral.chain.bancomat.euro;

import ru.iteco.behavioral.chain.bancomat.banknote.BanknoteHandler;

public class TwentyEuroHandler extends EuroHandlerBase{

    protected int value = 20;

    public TwentyEuroHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected int getValue() {
        return value;
    }
}
