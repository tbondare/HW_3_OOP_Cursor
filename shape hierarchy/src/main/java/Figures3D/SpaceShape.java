package Figures3D;

import AbstractClasses.Shape;
import Interfaces.AreaMeasurable;
import Interfaces.VolumeMeasurable;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {
    @Override
    protected String getParameters() {
        return "Area: " + getArea() + " Volume: " + getVolume();
    }

    @Override
    protected abstract String getType();

    @Override
    public abstract double getArea();

    @Override
    public abstract double getVolume();
}