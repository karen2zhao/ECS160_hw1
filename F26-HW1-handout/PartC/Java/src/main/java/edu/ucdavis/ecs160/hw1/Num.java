package edu.ucdavis.ecs160.hw1;

public class Num implements Expr {
    private final int value;

    public Num(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public <R> R accept(ExprVisitor<R> visitor) {
        return visitor.visit(this);
    }
}
