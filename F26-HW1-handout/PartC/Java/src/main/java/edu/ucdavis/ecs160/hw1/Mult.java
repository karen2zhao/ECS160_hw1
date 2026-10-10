package edu.ucdavis.ecs160.hw1;

public class Mult extends BinaryExpr {
    public Mult(Expr left, Expr right) {
        super(left, right);
    }

    @Override
    public <R> R accept(ExprVisitor<R> visitor) {
        return visitor.visit(this);
    }
}
