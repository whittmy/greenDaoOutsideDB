package com.cehome.tiebaobei.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.cehome.tiebaobei.dao.Category;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "CATEGORY".
*/
public class CategoryDao extends AbstractDao<Category, Long> {

    public static final String TABLENAME = "CATEGORY";

    /**
     * Properties of entity Category.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, long.class, "id", true, "_id");
        public final static Property ParentId = new Property(1, Integer.class, "parentId", false, "PARENT_ID");
        public final static Property Name = new Property(2, String.class, "name", false, "NAME");
        public final static Property EnFirstChar = new Property(3, String.class, "enFirstChar", false, "EN_FIRST_CHAR");
        public final static Property Weight = new Property(4, Integer.class, "weight", false, "WEIGHT");
        public final static Property Hot = new Property(5, String.class, "hot", false, "HOT");
    };


    public CategoryDao(DaoConfig config) {
        super(config);
    }
    
    public CategoryDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"CATEGORY\" (" + //
                "\"_id\" INTEGER PRIMARY KEY NOT NULL ," + // 0: id
                "\"PARENT_ID\" INTEGER," + // 1: parentId
                "\"NAME\" TEXT," + // 2: name
                "\"EN_FIRST_CHAR\" TEXT," + // 3: enFirstChar
                "\"WEIGHT\" INTEGER," + // 4: weight
                "\"HOT\" TEXT);"); // 5: hot
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"CATEGORY\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Category entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
 
        Integer parentId = entity.getParentId();
        if (parentId != null) {
            stmt.bindLong(2, parentId);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }
 
        String enFirstChar = entity.getEnFirstChar();
        if (enFirstChar != null) {
            stmt.bindString(4, enFirstChar);
        }
 
        Integer weight = entity.getWeight();
        if (weight != null) {
            stmt.bindLong(5, weight);
        }
 
        String hot = entity.getHot();
        if (hot != null) {
            stmt.bindString(6, hot);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Category readEntity(Cursor cursor, int offset) {
        Category entity = new Category( //
            cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // parentId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // name
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // enFirstChar
            cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4), // weight
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5) // hot
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Category entity, int offset) {
        entity.setId(cursor.getLong(offset + 0));
        entity.setParentId(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setEnFirstChar(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setWeight(cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4));
        entity.setHot(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Category entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Category entity) {
        if(entity != null) {
            return entity.getId();
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
