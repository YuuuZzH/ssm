package com.yuuu.ssm.pojo;

/**
 * @BelongsProject:ssm
 * @BelongsPackage:com.yuuu.ssm.pojo
 * @Author:Yuuu。
 * @CreateTime:2022-12-28 23:09
 * @Description:
 * @Version:1.0
 */
public class Room {
    private Integer bId;
    private Integer bNum;
    private Integer bTot;
    private Double bCost;
    private Integer rNum;
    private String rAre;
    private String rContents;

    public Room() {
    }

    public Room(Integer bId, Integer bNum, Integer bTot, Double bCost, Integer rNum, String rAre, String rContents) {
        this.bId = bId;
        this.bNum = bNum;
        this.bTot = bTot;
        this.bCost = bCost;
        this.rNum = rNum;
        this.rAre = rAre;
        this.rContents = rContents;
    }

    public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
        this.bId = bId;
    }

    public Integer getbNum() {
        return bNum;
    }

    public void setbNum(Integer bNum) {
        this.bNum = bNum;
    }

    public Integer getbTot() {
        return bTot;
    }

    public void setbTot(Integer bTot) {
        this.bTot = bTot;
    }

    public Double getbCost() {
        return bCost;
    }

    public void setbCost(Double bCost) {
        this.bCost = bCost;
    }

    public Integer getrNum() {
        return rNum;
    }

    public void setrNum(Integer rNum) {
        this.rNum = rNum;
    }

    public String getrAre() {
        return rAre;
    }

    public void setrAre(String rAre) {
        this.rAre = rAre;
    }

    public String getrContents() {
        return rContents;
    }

    public void setrContents(String rContents) {
        this.rContents = rContents;
    }

    @Override
    public String toString() {
        return "Room{" +
                "bId=" + bId +
                ", bNum=" + bNum +
                ", bTot=" + bTot +
                ", bCost=" + bCost +
                ", rNum=" + rNum +
                ", rAre='" + rAre + '\'' +
                ", rContents='" + rContents + '\'' +
                '}';
    }
}
