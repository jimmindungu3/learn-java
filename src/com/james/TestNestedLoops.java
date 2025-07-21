package com.james;

public class TestNestedLoops {
    public static void main(int triangleHeight) {
        for (int i = 0; i <= triangleHeight ; i++) {
            for (int j = 0; j < triangleHeight ; j++) {
                System.out.println("*" * i * j);
            }
        }
    }
}
