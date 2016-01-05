package com.bingo.riding.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.bingo.riding.dao.Conversation;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table CONVERSATION.
*/
public class ConversationDao extends AbstractDao<Conversation, String> {

    public static final String TABLENAME = "CONVERSATION";

    /**
     * Properties of entity Conversation.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property ConversationId = new Property(0, String.class, "conversationId", true, "CONVERSATION_ID");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property Members = new Property(2, String.class, "members", false, "MEMBERS");
        public final static Property Creator = new Property(3, String.class, "creator", false, "CREATOR");
        public final static Property Attributes = new Property(4, String.class, "attributes", false, "ATTRIBUTES");
        public final static Property LastMessageAt = new Property(5, String.class, "lastMessageAt", false, "LAST_MESSAGE_AT");
        public final static Property UnReadNum = new Property(6, Integer.class, "unReadNum", false, "UN_READ_NUM");
    };


    public ConversationDao(DaoConfig config) {
        super(config);
    }
    
    public ConversationDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'CONVERSATION' (" + //
                "'CONVERSATION_ID' TEXT PRIMARY KEY NOT NULL ," + // 0: conversationId
                "'NAME' TEXT," + // 1: name
                "'MEMBERS' TEXT," + // 2: members
                "'CREATOR' TEXT," + // 3: creator
                "'ATTRIBUTES' TEXT," + // 4: attributes
                "'LAST_MESSAGE_AT' TEXT," + // 5: lastMessageAt
                "'UN_READ_NUM' INTEGER);"); // 6: unReadNum
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'CONVERSATION'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Conversation entity) {
        stmt.clearBindings();
 
        String conversationId = entity.getConversationId();
        if (conversationId != null) {
            stmt.bindString(1, conversationId);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
 
        String members = entity.getMembers();
        if (members != null) {
            stmt.bindString(3, members);
        }
 
        String creator = entity.getCreator();
        if (creator != null) {
            stmt.bindString(4, creator);
        }
 
        String attributes = entity.getAttributes();
        if (attributes != null) {
            stmt.bindString(5, attributes);
        }
 
        String lastMessageAt = entity.getLastMessageAt();
        if (lastMessageAt != null) {
            stmt.bindString(6, lastMessageAt);
        }
 
        Integer unReadNum = entity.getUnReadNum();
        if (unReadNum != null) {
            stmt.bindLong(7, unReadNum);
        }
    }

    /** @inheritdoc */
    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Conversation readEntity(Cursor cursor, int offset) {
        Conversation entity = new Conversation( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // conversationId
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // name
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // members
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // creator
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // attributes
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // lastMessageAt
            cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6) // unReadNum
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Conversation entity, int offset) {
        entity.setConversationId(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setMembers(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setCreator(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setAttributes(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setLastMessageAt(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setUnReadNum(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
     }
    
    /** @inheritdoc */
    @Override
    protected String updateKeyAfterInsert(Conversation entity, long rowId) {
        return entity.getConversationId();
    }
    
    /** @inheritdoc */
    @Override
    public String getKey(Conversation entity) {
        if(entity != null) {
            return entity.getConversationId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
