package uap.bases;

import uap.interfaces.*;

public abstract class Shape implements ThreeDimensional, MassCalculable, MassConverter, ShippingCostCalculator, PIRequired {
    protected static final double DENSITY = 8.0; // gram/cm3
    protected static final double THICKNESS = 0.5; // cm
    public abstract void printInfo();
}
