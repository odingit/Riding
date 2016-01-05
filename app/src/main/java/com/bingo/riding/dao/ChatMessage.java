package com.bingo.riding.dao;

import com.bingo.riding.dao.DaoSession;
import de.greenrobot.dao.DaoException;

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
    private String messageId;
    private long timestamp;
    private Long receiptTimestamp;
    private Integer status;
    private int ioType;
    private String conversationId;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient ChatMessageDao myDao;

    private Conversation conversation;
    private String conversation__resolvedKey;


    public ChatMessage() {
    }

    public ChatMessage(Long id) {
        this.id = id;
    }

    public ChatMessage(Long id, boolean isRead, String content, String clientId, String messageId, long timestamp, Long receiptTimestamp, Integer status, int ioType, String conversationId) {
        this.id = id;
        this.isRead = isRead;
        this.content = content;
        this.clientId = clientId;
        this.messageId = messageId;
        this.timestamp = timestamp;
        this.receiptTimestamp = receiptTimestamp;
        this.status = status;
        this.ioType = ioType;
        this.conversationId = conversationId;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getChatMessageDao() : null;
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

    public String getConversationId() {
        return conversationId;
    }

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    /** To-one relationship, resolved on first access. */
    public Conversation getConversation() {
        String __key = this.conversationId;
        if (conversation__resolvedKey == null || conversation__resolvedKey != __key) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            ConversationDao targetDao = daoSession.getConversationDao();
            Conversation conversationNew = targetDao.load(__key);
            synchronized (this) {
                conversation = conversationNew;
            	conversation__resolvedKey = __key;
            }
        }
        return conversation;
    }

    public void setConversation(Conversation conversation) {
        synchronized (this) {
            this.conversation = conversation;
            conversationId = conversation == null ? null : conversation.getConversationId();
            conversation__resolvedKey = conversationId;
        }
    }

    /** Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context. */
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.delete(this);
    }

    /** Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context. */
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.update(this);
    }

    /** Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context. */
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.refresh(this);
    }

}
