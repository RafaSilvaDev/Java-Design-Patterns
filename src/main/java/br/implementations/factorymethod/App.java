package br.implementations.factorymethod;

public class App {
    public static void main(String[] args) {
        Polygon triangle = PolygonFactory.createPolygon(3);
        System.out.println("With 3 sides, we can draw a " + triangle.getDescription());

        Polygon square = PolygonFactory.createPolygon(4);
        System.out.println("With 4 sides, we can draw a " + square.getDescription());

        Polygon pentagon = PolygonFactory.createPolygon(5);
        System.out.println("With 5 sides, we can draw a " + pentagon.getDescription());
    }
}
