// Last updated: 14/8/2025, 4:26:23 pm
class Solution {
    public double[] convertTemperature(double celsius) {
        double res[]= new double[2];
        res[0]= celsius + 273.15;
        res[1] = celsius * 1.80 + 32.00;
        return res;
    }
}