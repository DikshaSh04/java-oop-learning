package oop.basics;

public class WrapperClasses {
    public static void main(String[] args) {
        //wrapper classes allow representation of primitives as objects

        int a=10; //a is primitive datatype
        Integer b=a; //autoboxing: conversion of primitive to wrapper

        System.out.println("Primitive is:"+a);
        System.out.println("Object is:"+b);

        Character ch='g'; //ch is object of type Character
        char c=ch; //unboxing: conversion of wrapper to primitive


    }

}
