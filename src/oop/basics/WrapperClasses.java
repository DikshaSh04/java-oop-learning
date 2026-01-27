package oop.basics;

public class WrapperClasses {
    public static void main(String[] args) {
        //wrapper classes allow representation of primitives as objects

        int a=10;
        Integer b=a; //autoboxing: conversion of primitive to wrapper

        System.out.println("Primitive is:"+a);
        System.out.println("Object is:"+b.intValue());

        Character ch='g';
        char c=ch; //unboxing: conversion of wrapper to primitive

        System.out.println("Primitive is:"+c);
        System.out.println("Object is:"+ch.charValue());

//        intValue() and charValue() are wrapper class methods used to
//        explicitly extract the corresponding primitive value from an object


    }

}
