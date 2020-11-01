package ru.iteco.behavioral.chain.bancomat;

import ru.iteco.behavioral.chain.bancomat.banknote.Banknote;
import ru.iteco.behavioral.chain.bancomat.banknote.BanknoteHandler;
import ru.iteco.behavioral.chain.bancomat.dollar.*;
import ru.iteco.behavioral.chain.bancomat.euro.FiftyEuroHandler;
import ru.iteco.behavioral.chain.bancomat.euro.HundredEuroHandler;
import ru.iteco.behavioral.chain.bancomat.euro.TenEuroHandler;
import ru.iteco.behavioral.chain.bancomat.euro.TwentyEuroHandler;
import ru.iteco.behavioral.chain.bancomat.ruble.*;

/**
 * Bancomat.
 *
 * @author Ilya_Sukhachev
 */
public class Bankomat {
    private BanknoteHandler handler;

    public Bankomat() {
        handler = new TenRubleHandler(null);
        handler = new FiftyRubleHandler(handler);
        handler = new HundredRubleHandler(handler);
        handler = new FiveHundredRubleHandler(handler);
        handler = new ThousandRubleHandler(handler);
        handler = new TenEuroHandler(handler);
        handler = new TwentyEuroHandler(handler);
        handler = new FiftyEuroHandler(handler);
        handler = new HundredEuroHandler(handler);
        handler = new FiveDollarHandler(handler);
        handler = new TenDollarHandler(handler);
        handler = new TwentyDollarHandler(handler);
        handler = new FiftyDollarHandler(handler);
        handler = new HundredDollarHandler(handler);
    }

    public boolean validate(Banknote banknote) {
        return handler.validate(banknote);
    }

    public boolean cash(Banknote banknote) {
        return handler.cash(banknote);
    }

}
