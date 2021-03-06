package com.cehome.tiebaobei.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.cehome.tiebaobei.dao.CategoryFilter;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "CATEGORY_FILTER".
*/
public class CategoryFilterDao extends AbstractDao<CategoryFilter, Void> {

    public static final String TABLENAME = "CATEGORY_FILTER";

    /**
     * Properties of entity CategoryFilter.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property FilterId = new Property(0, Integer.class, "filterId", false, "FILTER_ID");
        public final static Property CategoryId = new Property(1, Integer.class, "categoryId", false, "CATEGORY_ID");
    };


    public CategoryFilterDao(DaoConfig config) {
        super(config);
    }
    
    public CategoryFilterDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"CATEGORY_FILTER\" (" + //
                "\"FILTER_ID\" INTEGER," + // 0: filterId
                "\"CATEGORY_ID\" INTEGER);"); // 1: categoryId
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"CATEGORY_FILTER\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, CategoryFilter entity) {
        stmt.clearBindings();
 
        Integer filterId = entity.getFilterId();
        if (filterId != null) {
            stmt.bindLong(1, filterId);
        }
 
        Integer categoryId = entity.getCategoryId();
        if (categoryId != null) {
            stmt.bindLong(2, categoryId);
        }
    }

    /** @inheritdoc */
    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    /** @inheritdoc */
    @Override
    public CategoryFilter readEntity(Cursor cursor, int offset) {
        CategoryFilter entity = new CategoryFilter( //
            cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0), // filterId
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1) // categoryId
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, CategoryFilter entity, int offset) {
        entity.setFilterId(cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0));
        entity.setCategoryId(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
     }
    
    /** @inheritdoc */
    @Override
    protected Void updateKeyAfterInsert(CategoryFilter entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    /** @inheritdoc */
    @Override
    public Void getKey(CategoryFilter entity) {
        return null;
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
