package no.hvl.dat108.enhetstesting;

public interface Stabel<T> {
	void push(T e);
	T pop();
	T peek();
}
