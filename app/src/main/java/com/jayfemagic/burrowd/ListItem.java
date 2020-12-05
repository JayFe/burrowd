package com.jayfemagic.burrowd;

import java.util.Date;

public class ListItem {

    private String name;
    private Type itemType;
    private String debtorName;

    private Date startDate;
    private Date deadline;

    public ListItem(Type itemType, String name, String debtorName){
        this.itemType = itemType;
        this.name = name;
        this.debtorName = debtorName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getItemType() {
        return itemType;
    }

    public void setItemType(Type itemType) {
        this.itemType = itemType;
    }

    public String getDebtorName() {
        return debtorName;
    }

    public void setDebtorName(String debtorName) {
        this.debtorName = debtorName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }
}
