package br.implementations.factorymethod;

public class PolygonFactory {
    public static Polygon createPolygon(int numberOfSides){
        switch(numberOfSides){
            case 3:
                return new Triangle();
            case 4:
                return new Square();
            case 5:
                return new Pentagon();
            default:
                return null;
        }
    }
}
