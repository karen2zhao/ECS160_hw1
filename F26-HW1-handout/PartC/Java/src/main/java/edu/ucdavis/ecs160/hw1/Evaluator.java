package edu.ucdavis.ecs160.hw1;

public class Evaluator implements ExprVisitor<Integer> {
    @Override
    public Integer visit(Num num) {
        return num.getValue();
    }

    @Override 
    public Integer visit(Add add) {
        return add.getLeft().accept(this) + add.getRight().accept(this);
    }

    @Override 
    public Integer visit(Sub sub) {
        return sub.getLeft().accept(this) - sub.getRight().accept(this);
    }

    @Override 
    public Integer visit(Mult mult) {
        return mult.getLeft().accept(this) * mult.getRight().accept(this);
    }

    @Override 
    public Integer visit(Div div) {
        return div.getLeft().accept(this) / div.getRight().accept(this);
    }
}