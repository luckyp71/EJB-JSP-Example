package com.test.ejb;

import javax.ejb.Remote;

@Remote
public interface OperationSessionBeanRemote {
    double currentRatio(double currentAssets, double currentLiabilities);
    double workingCapital(double currentAssets, double currentLiabilities);
}
