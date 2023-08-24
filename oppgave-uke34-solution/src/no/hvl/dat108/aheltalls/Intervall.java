package no.hvl.dat108.aheltalls;

public interface Intervall {
	int getMin();
	int getMax();
	boolean inneholder(int tall);
	boolean overlapper(Intervall other);
}
