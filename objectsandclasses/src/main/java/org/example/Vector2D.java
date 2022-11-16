package org.example;

public class Vector2D {
    private float x = 0;
    private float y = 0;

    Vector2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public Vector2D add(Vector2D other){
        return new Vector2D(other.getX() + this.getX(), other.getY() + this.getY());
    }

    public float scalarProduct(Vector2D other){
        return this.getX() * other.getX() + this.getY()*other.getY();
    }

    public Vector2D normalise(){
        float newX = this.x/this.magnitude();
        float newY = this.y/this.magnitude();
        return new Vector2D(newX, newY);
    }

    public float magnitude(){
        double a =  Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
        float b = new Float(a);
        return b;
    }


    public float getX(){
        return this.x;
    }
    public float getY(){
        return this.y;
    }

}
