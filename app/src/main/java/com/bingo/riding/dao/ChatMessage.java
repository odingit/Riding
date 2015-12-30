package com.bingo.riding.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table CHAT_MESSAGE.
 */
public class ChatMessage {

    private Long id;
    private boolean isRead;
    /** Not-null value. */
    private String content;
    private String clientId;
    /** Not-null value. */
    private String conversationId;
    private String messageId;
    private long timestamp;
    private Long receiptTimestamp;
    private Integer status;
    private int ioType;

    public ChatMessage() {
    }

    public ChatMessage(Long id) {
        this.id = id;
    }

    public ChatMessage(Long id, boolean isRead, String content, String clientId, String conversationId, String messageId, long timestamp, Long receiptTimestamp, Integer status, int ioType) {
        this.id = id;
        this.isRead = isRead;
        this.content = content;
        this.clientId = clientId;
        this.conversationId = conversationId;
        this.messageId = messageId;
        this.timestamp = timestamp;
        this.receiptTimestamp = receiptTimestamp;
        this.status = status;
        this.ioType = ioType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean getIsRead() {
        return isRead;
    }

    public void setIsRead(boolean isRead) {
        this.isRead = isRead;
    }

    /** Not-null value. */
    public String getContent() {
        return content;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setContent(String content) {
        this.content = content;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /** Not-null value. */
    public String getConversationId() {
        return conversationId;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public Long getReceiptTimestamp() {
        return receiptTimestamp;
    }

    public void setReceiptTimestamp(Long receiptTimestamp) {
        this.receiptTimestamp = receiptTimestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public int getIoType() {
        return ioType;
    }

    public void setIoType(int ioType) {
        this.ioType = ioType;
    }

}