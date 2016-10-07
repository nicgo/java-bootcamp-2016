package builder;

import domain.Wind;

/**
 * Created by Nico on 6/10/2016.
 */
public class Wind_Builder {
    private float direction;
    private float velocity;

    public Wind create(){
        Wind wind=new Wind(direction,velocity);
        return wind;
    }

    public Wind_Builder create_Default(){
        this.direction=50;
        this.velocity=100;
        return this;
    }

    public Wind_Builder with_direction(){
        this.direction=50;
        return this;
    }

    public Wind_Builder with_velocity(){
        this.velocity=100;
    return this;}
}
