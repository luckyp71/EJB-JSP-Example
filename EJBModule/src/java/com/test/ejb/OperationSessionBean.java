package com.test.ejb;

import javax.ejb.Stateless;

@Stateless
public class OperationSessionBean implements OperationSessionBeanRemote {

    @Override
    public double currentRatio(double currentAssets, double currentLiabilities) {
        return currentAssets / currentLiabilities;
    }

    @Override
    public double workingCapital(double currentAssets, double currentLiabilities) {
        return currentAssets - currentLiabilities;
    }
}
