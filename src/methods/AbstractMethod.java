package methods;

public abstract class AbstractMethod {
	float lambda;
	float mu;
	float ro;
	
	public abstract float getW();
	public abstract float getWq();
	public abstract float getL();
	public abstract float getLq();
	public abstract float getPo();
	public abstract float getPn();
	
	public AbstractMethod(){}
	public float getLambda(){return this.lambda;}
	public float getRo(){return this.ro;}
	public float getMu(){return this.mu;}
	public void setLambda(float l){this.lambda=l;}
	public void setRo(float ro){this.ro=ro;}
	public void setMu(float m){this.mu=m;}
}