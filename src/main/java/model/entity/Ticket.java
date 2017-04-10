package model.entity;

/**
 * Created by lenovo on 2017/4/10.
 * 电影票信息
 */
public class Ticket {
    private Integer ticketId;
    private Integer ticketPlay;
    private Integer ticketMember;
    private String ticketCode;
    private Integer ticketSeat;
    private Double ticketPrice;
    private Integer ticketFlag;

    public Ticket() {
    }

    public Ticket(Integer ticketPlay, Integer ticketMember, String ticketCode, Integer ticketSeat, Double ticketPrice, Integer ticketFlag) {
        this.ticketPlay = ticketPlay;
        this.ticketMember = ticketMember;
        this.ticketCode = ticketCode;
        this.ticketSeat = ticketSeat;
        this.ticketPrice = ticketPrice;
        this.ticketFlag = ticketFlag;
    }

    public Ticket(Integer ticketId, Integer ticketPlay, Integer ticketMember, String ticketCode, Integer ticketSeat, Double ticketPrice, Integer ticketFlag) {
        this.ticketId = ticketId;
        this.ticketPlay = ticketPlay;
        this.ticketMember = ticketMember;
        this.ticketCode = ticketCode;
        this.ticketSeat = ticketSeat;
        this.ticketPrice = ticketPrice;
        this.ticketFlag = ticketFlag;
    }

    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    public Integer getTicketPlay() {
        return ticketPlay;
    }

    public void setTicketPlay(Integer ticketPlay) {
        this.ticketPlay = ticketPlay;
    }

    public Integer getTicketMember() {
        return ticketMember;
    }

    public void setTicketMember(Integer ticketMember) {
        this.ticketMember = ticketMember;
    }

    public String getTicketCode() {
        return ticketCode;
    }

    public void setTicketCode(String ticketCode) {
        this.ticketCode = ticketCode;
    }

    public Integer getTicketSeat() {
        return ticketSeat;
    }

    public void setTicketSeat(Integer ticketSeat) {
        this.ticketSeat = ticketSeat;
    }

    public Double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(Double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public Integer getTicketFlag() {
        return ticketFlag;
    }

    public void setTicketFlag(Integer ticketFlag) {
        this.ticketFlag = ticketFlag;
    }
}
