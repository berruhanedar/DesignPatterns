package com.berruhanedar.Behavioral.ClassPatterns.ChainOfResponsibility;

public class BhShippingCompany {

    public static ShippingCompany getNextShippingCompany() {
        CankiriBranch cankiriBranch = new CankiriBranch();
        AntalyaBranch antalyaBranch = new AntalyaBranch();
        AnkaraBranch ankaraBranch = new AnkaraBranch();
        IstanbulBranch istanbulBranch = new IstanbulBranch();

        ShippingCompany bhShippingCompany = cankiriBranch.
                setNextShippingCompany(ankaraBranch
                        .setNextShippingCompany(istanbulBranch
                                .setNextShippingCompany(antalyaBranch)
                        )
                );
        return bhShippingCompany;
    }
}
