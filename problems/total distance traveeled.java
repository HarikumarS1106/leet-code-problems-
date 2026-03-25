class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int bonus = Math.min((mainTank - 1) / 4, additionalTank);
        return (mainTank + bonus) * 10;
    }
}