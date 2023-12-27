package text_block;

import java.util.ArrayList;
import java.util.List;

public class ValidateUserLimit {

    public static void main(String []args){
        final List<RoleLimit> roleLimits = new ArrayList<>();
        roleLimits.add(new RoleLimit("SUPERVISOR", 0D, 10000000D, 0D, 3D));
        roleLimits.add(new RoleLimit("MANAGER", 0D, 10000000D, 0D, 5D));
        roleLimits.add(new RoleLimit("PIMPINAN BAGIAN", 10000000D, 50000000D, 6D, 7D));
        roleLimits.add(new RoleLimit("PIMPINAN DIVISI", 50000000D, 0D, 6D, 0D));

        final Double amount = 5000000D;
        final Double rate = 3D;

        // Loop roleLimits here
        for (RoleLimit roleLimit : roleLimits) {
            System.out.println(roleLimit.isValidLimit(amount, rate));
        }
    }
}

class RoleLimit {

    private String role;
    private double minAmount;
    private double maxAmount;

    private double minRate;
    private double maxRate;

    public RoleLimit(String role, double minAmount, double maxAmount, double minRate, double maxRate) {
        this.role = role;
        this.minAmount = minAmount;
        this.maxAmount = maxAmount;
        this.minRate = minRate;
        this.maxRate = maxRate;
    }

    public boolean isValidLimit(double amount, double rate) {
        // return (amount >= this.minAmount) && (amount <= this.maxAmount) && (rate >= this.minRate) && (rate <= this.maxRate);
        return (this.minAmount <= amount) && (this.maxAmount >= amount  ) && (this.minRate <= rate) && (this.maxRate >= rate);
    }

}
