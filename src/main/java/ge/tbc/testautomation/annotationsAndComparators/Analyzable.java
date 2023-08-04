package ge.tbc.testautomation.annotationsAndComparators;
public class Analyzable {
    @VariableNameAnnotation(name = "IntVar")
    private int intVar;

    @VariableNameAnnotation(name = "DoubleVar")
    private double doubleVar;

    @VariableNameAnnotation(name = "BooleanVar")
    private boolean booleanVar;

    @VariableNameAnnotation(name = "StringVar")
    private String stringVar;

    @VariableNameAnnotation(name = "CharArray")
    private char[] charArray;

    @VariableNameAnnotation(name = "FloatVar")
    private float floatVar;

    @VariableNameAnnotation(name = "LongVar")
    private long longVar;

    // ერთი ცვლადის ანოტაციაში არ გადასცეთ name
    @VariableNameAnnotation
    private short shortVar;

    @VariableNameAnnotation(name = "ByteVar")
    private byte byteVar;

    //ერთშიც რამე სხვა ჩაწერეთ, გარდა ცვლადის სახელისა.
    @VariableNameAnnotation(name = "ObjectVar I LOVE TURTLES")
    private Object objectVar;
}
