package ru.iteco.behavioral.chain.bancomat;

import ru.iteco.behavioral.chain.bancomat.banknote.Banknote;
import ru.iteco.behavioral.chain.bancomat.banknote.EurBanknote;
import ru.iteco.behavioral.chain.bancomat.banknote.RubBanknote;
import ru.iteco.behavioral.chain.bancomat.banknote.UsdBanknote;

/**
 * Main.
 *
 * @author Ilya_Sukhachev
 */
public class Main {

    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat();
        Banknote rub = new RubBanknote("10");
        Banknote usd = new UsdBanknote("156");
        Banknote eur = new EurBanknote("50");
        System.out.println(bankomat.cash(usd));
        System.out.println(bankomat.cash(rub));
        System.out.println(bankomat.cash(eur));

        System.out.println(bankomat.validate(rub));
        System.out.println(bankomat.validate(usd));
        System.out.println(bankomat.validate(eur));

    }
}
