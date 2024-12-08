package xyz.kuailemao.domain.entity.server;

import lombok.Setter;
import xyz.kuailemao.utils.Arith;

/**
 * CPU相关信息
 * 
 * @author ruoyi
 */
@Setter
public class Cpu
{
    /**
     * 核心数
     */
    private int cpuNum;

    /**
     * CPU总的使用率
     */
    private double total;

    /**
     * CPU系统使用率
     */
    private double sys;

    /**
     * CPU用户使用率
     */
    private double used;

    /**
     * CPU当前等待率
     */
    private double wait;

    /**
     * CPU当前空闲率
     */
    private double free;

    public int getCpuNum()
    {
        return cpuNum;
    }

    public double getTotal()
    {
        return Arith.round(Arith.mul(total, 100), 2);
    }

    public double getSys()
    {
        return Arith.round(Arith.mul(sys / total, 100), 2);
    }

    public double getUsed()
    {
        return Arith.round(Arith.mul(used / total, 100), 2);
    }

    public double getWait()
    {
        return Arith.round(Arith.mul(wait / total, 100), 2);
    }

    public double getFree()
    {
        return Arith.round(Arith.mul(free / total, 100), 2);
    }

}
