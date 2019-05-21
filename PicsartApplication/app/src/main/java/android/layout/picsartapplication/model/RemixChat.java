package android.layout.picsartapplication.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class RemixChat {
    int messageId;
    User senderId;
    User receiverId;
    LocalDateTime dateTime;
    ArrayList<String> text;
    boolean isSeen;

    public RemixChat(int messageId, User senderId, User receiverId, LocalDateTime dateTime, ArrayList<String> text, boolean isSeen) {
        this.messageId = messageId;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.dateTime = dateTime;
        this.text = text;
        this.isSeen = isSeen;
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public User getSenderId() {
        return senderId;
    }

    public void setSenderId(User senderId) {
        this.senderId = senderId;
    }

    public User getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(User receiverId) {
        this.receiverId = receiverId;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public ArrayList<String> getText() {
        return text;
    }

    public void setText(ArrayList<String> text) {
        this.text = text;
    }

    public boolean isSeen() {
        return isSeen;
    }

    public void setSeen(boolean seen) {
        isSeen = seen;
    }
}
