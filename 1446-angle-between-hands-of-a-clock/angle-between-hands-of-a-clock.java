class Solution {
    public double angleClock(int hour, int minutes) {
        double hrHand=30*hour;
        double minHand=5.5*minutes;
        double angle=Math.abs(hrHand-minHand);
        return Math.min(angle,360-angle);
    }
}