package kz.edu.nu.cs.exercise;

public class State1 extends State {

    public State1(StateContext sc) {
        this.sc = sc;
    }

    @Override
    public void actionA() {
        sc.setCurrentState(sc.state2);
    }

    public void actionB() {
        sc.setCurrentState(sc.state1);
    }

    @Override
    public boolean isAccept() {
        return false;
    }
}
